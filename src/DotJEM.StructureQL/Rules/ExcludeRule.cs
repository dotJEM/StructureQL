namespace DotJEM.StructureQL.Rules;

public class ExcludeStructureQuery : IStructureQuery
{
    public static IStructureQuery SharedInstance { get; } = new ExcludeStructureQuery();
    public string Explain() => "EXCLUDE(*)";
    public IStructureQuery For(string propertyName, bool isPrimitive) => this;
    public bool Include(bool isPrimitive) => false;
    public bool IncludeIndex(int i) => false;
}