namespace DotJEM.StructureQL.Rules;

public interface IStructureQuery
{
    string Explain();
    IStructureQuery For(string propertyName, bool isPrimitive);
    bool Include(bool isPrimitive);
    bool IncludeIndex(int i);
}