using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Tree;
using DotJEM.StructureQL.Generated.Parser;
using DotJEM.StructureQL.Rules;

namespace DotJEM.StructureQL.Parser;

public class StructureQlVisitor : StructureQLBaseVisitor<IStructureQuery>
{
    public override IStructureQuery VisitQuery(StructureQLParser.QueryContext context)
    {
        IStructureQuery structureQuery = base.VisitQuery(context);
        if (structureQuery is not ObjectStructureQuery)
            structureQuery = new ObjectStructureQuery(structureQuery);
        return structureQuery;
    }

    public override IStructureQuery VisitObject(StructureQLParser.ObjectContext context)
    {
        return new ObjectStructureQuery(Visit(context.children));
    }
    public override IStructureQuery VisitProperty(StructureQLParser.PropertyContext context)
    {
        string name = context.STRING().GetText();
        IStructureQuery structureQuery = base.VisitProperty(context);
        if (structureQuery is null)
            structureQuery = IncludeRule.SharedInstance;
        else if (structureQuery is not ObjectStructureQuery)
            structureQuery = new ObjectStructureQuery(structureQuery);
        return new PropertyStructureQuery(name, structureQuery);
    }

    public override IStructureQuery VisitRecursiveMatchAll(StructureQLParser.RecursiveMatchAllContext context) => RecursiveIncludeAllRule.SharedInstance;
    public override IStructureQuery VisitSimpleMatchAll(StructureQLParser.SimpleMatchAllContext context) => IncludeAllPrimitivesRule.SharedInstance;
    private IStructureQuery[] Visit(IList<IParseTree> items) => items
        .Select(Visit)
        .Where(ast => ast != null)
        .ToArray();
}