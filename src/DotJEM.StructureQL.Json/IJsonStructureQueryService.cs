using System;
using DotJEM.StructureQL.Rules;
using Newtonsoft.Json.Linq;

namespace DotJEM.StructureQL.Json;

public interface IJsonStructureQueryService
{
    JObject Query(JObject json, IStructureQuery query);
}

public class JsonStructureQueryService : IJsonStructureQueryService
{
    public JObject Query(JObject json, IStructureQuery query)
    {
        JObject filtered = new JObject();
        foreach (JProperty property in json.Properties())
            CopyPropertyInto(property, filtered, query.For(property.Name, property.Value is JValue));
        return filtered;
    }

    private void CopyPropertyInto(JProperty property, JObject filtered, IStructureQuery query)
    {
        if(!query.Include(property.Value is JValue))
            return;

        switch (property.Value)
        {
            case JArray jArray:
                filtered.Add(property.Name, FilterArray(jArray, query));
                break;
            case JObject jObject:
                filtered.Add(property.Name, Query(jObject, query));
                break;
            case JValue jValue:
                filtered.Add(property.Name, jValue);
                break;
            default:
                throw new ArgumentOutOfRangeException();
        }
    }

    private JArray FilterArray(JArray array, IStructureQuery query)
    {
        JArray filteredArray = new JArray();
        for (int i = 0; i < array.Count; i++)
        {
            if(!query.IncludeIndex(i))
                continue;
            
            switch (array[i])
            {
                case JArray jArray:
                    filteredArray.Add(FilterArray(jArray, query));
                    break;
                case JObject jObject:
                    filteredArray.Add(Query(jObject, query));
                    break;
                case JValue jValue:
                    filteredArray.Add(jValue);
                    break;
                default:
                    throw new ArgumentOutOfRangeException();
            }
        }

        return filteredArray;
    }
}