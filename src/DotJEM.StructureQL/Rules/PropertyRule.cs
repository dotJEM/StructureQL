using System;

namespace DotJEM.StructureQL.Rules;

public class PropertyStructureQuery : IStructureQuery
{
    public string Name { get; }
    public IStructureQuery StructureQuery { get; }

    public PropertyStructureQuery(string name, IStructureQuery structureQuery)
    {
        Name = name;
        StructureQuery = structureQuery;
    }

    // Note: PropertyRule is an intermediate rule during parsing, it should never exist in the final rule tree.
    //       So we throw on all paths below.
    public string Explain() => throw new NotImplementedException();
    public IStructureQuery For(string propertyName, bool isPrimitive) => throw new NotImplementedException();
    public bool Include(bool isPrimitive) => throw new NotImplementedException();
}