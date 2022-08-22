namespace DotJEM.StructureQL.Rules;

public class ArrayStructureQuery : IStructureQuery
{
    private readonly int lower;
    private readonly int upper;
    private readonly IStructureQuery elementQuery;

    public ArrayStructureQuery(int lower, int upper, IStructureQuery elementQuery)
    {
        this.lower = lower;
        this.upper = upper;
        this.elementQuery = elementQuery;
    }

    public IStructureQuery For(string propertyName, bool isPrimitive) => elementQuery.For(propertyName, isPrimitive);

    public bool Include(bool isPrimitive) => elementQuery.Include(isPrimitive);

    public bool IncludeIndex(int i) => i >= lower && i <= upper;

    public string Explain() => $"ARRAY({lower},{upper},{elementQuery.Explain()})";
}