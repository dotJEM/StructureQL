using DotJEM.StructureQL.Rules;
using Newtonsoft.Json.Linq;

namespace DotJEM.StructureQL.Json;

public static class JObjectStructureQLExtensions
{
    private static readonly IJsonStructureQueryService service = new JsonStructureQueryService();
    private static readonly IStructureQL parser = new StructureQL();

    public static JObject Query(this JObject json, IStructureQuery query)
    {
        return service.Query(json, query);
    }
    public static JObject Query(this JObject json, string select)
    {
        return service.Query(json, parser.Parse(select));
    }

}