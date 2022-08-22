namespace DotJEM.StructureQL.Rules;

public class IncludeAllPrimitivesRule : IStructureQuery
{
    public static IStructureQuery SharedInstance { get; } = new IncludeAllPrimitivesRule();
    public string Explain() => "INCLUDE(*)";
    public IStructureQuery For(string propertyName, bool isPrimitive) => ExcludeStructureQuery.SharedInstance;
    public bool Include(bool isPrimitive) => isPrimitive;
    public bool IncludeIndex(int i) => true;
}