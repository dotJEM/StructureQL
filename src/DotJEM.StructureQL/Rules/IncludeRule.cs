namespace DotJEM.StructureQL.Rules;

public class IncludeRule : IStructureQuery
{
    public static IStructureQuery SharedInstance { get; } = new IncludeRule();
    public string Explain() => "INCLUDE()";

    public IStructureQuery For(string propertyName, bool isPrimitive) => ExcludeStructureQuery.SharedInstance;

    public bool Include(bool isPrimitive) => true;
}