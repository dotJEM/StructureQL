namespace DotJEM.StructureQL.Rules;

public class RecursiveIncludeAllRule : IStructureQuery
{
    public static IStructureQuery SharedInstance { get; } = new RecursiveIncludeAllRule();
    public string Explain() => "RECURSIVE(*)";
    public IStructureQuery For(string propertyName, bool isPrimitive)=> this;
    public bool Include(bool isPrimitive) => true;
}