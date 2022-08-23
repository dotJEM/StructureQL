using System.Collections;
using System.Collections.Generic;
using System.Linq;
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

    public static JObject Query(this JObject json, string query)
    {
        return service.Query(json, parser.Parse(query));
    }

    public static IEnumerable<JObject> Query(this IEnumerable<JObject> json, IStructureQuery query)
    {
        return json.Select(x => x.Query(query));
    }

    public static IEnumerable<JObject> Query(this IEnumerable<JObject> json, string query)
    {
        return json.Select(x => x.Query(query));
    }

}