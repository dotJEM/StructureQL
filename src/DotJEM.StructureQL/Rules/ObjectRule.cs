using System;
using System.Collections.Generic;
using System.Text;

namespace DotJEM.StructureQL.Rules;

public class ObjectStructureQuery : IStructureQuery
{
    private readonly IncludeAllPrimitivesRule simpleIncludeAll;
    private readonly RecursiveIncludeAllRule recursiveIncludeAll;
    private readonly Dictionary<string, IStructureQuery> properties = new();

    public ObjectStructureQuery(params IStructureQuery[] filters)
    {
        foreach (IStructureQuery filter in filters)
        {
            switch (filter)
            {
                case PropertyStructureQuery property:
                    properties.Add(property.Name, property.StructureQuery);
                    break;
                    
                case RecursiveIncludeAllRule recursive:
                    recursiveIncludeAll = recursive;
                    break;

                case IncludeAllPrimitivesRule simple:
                    simpleIncludeAll = simple;
                    break;

                default:
                    throw new InvalidOperationException();
            }
        }
    }
    
    public string Explain()
    {
        if(recursiveIncludeAll != null)
            return "OBJECT(RECURSIVE(*))";

        StringBuilder explain = new("OBJECT(");
        bool mark = false;
        if (simpleIncludeAll != null)
        {
            explain.Append("SIMPLE(*)");
            mark=true;
        }

        foreach (KeyValuePair<string, IStructureQuery> kv in properties)
        {
            if (mark) explain.Append(",");
            explain.Append(kv.Key);
            explain.Append("=");
            explain.Append(kv.Value.Explain());
            mark=true;
        }

        explain.Append(")");
        return explain.ToString();
    }

    public IStructureQuery For(string propertyName, bool isPrimitive)
    {
        if (recursiveIncludeAll != null)
            return recursiveIncludeAll;
        
        if (simpleIncludeAll != null && isPrimitive)
            return simpleIncludeAll;

        if (properties.TryGetValue(propertyName, out IStructureQuery rule))
            return rule;


        return ExcludeStructureQuery.SharedInstance;
    }

    public bool Include(bool isPrimitive) => true;
    public bool IncludeIndex(int i) => false;
}