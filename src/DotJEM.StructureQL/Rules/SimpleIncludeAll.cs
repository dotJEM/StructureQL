namespace DotJEM.StructureQL.Rules;

public class IncludeAllPrimitivesRule : IStructureQuery
{
    public static IStructureQuery SharedInstance { get; } = new IncludeAllPrimitivesRule();
    public string Explain() => "INCLUDE(*)";

    public IStructureQuery For(string propertyName, bool isPrimitive)
    {
        return ExcludeStructureQuery.SharedInstance;
    }

    public bool Include(bool isPrimitive)
    {
        return isPrimitive;
    }
}