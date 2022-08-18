﻿using System;
using DotJEM.StructureQL.Rules;
using Newtonsoft.Json.Linq;

namespace DotJEM.StructureQL.Json;

public interface IJsonStructureQueryService
{
    JObject Filter(JObject json, IStructureQuery query);
}

public class JsonStructureQueryService : IJsonStructureQueryService
{
    public JObject Filter(JObject json, IStructureQuery query)
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
                filtered.Add(property.Name, Filter(jObject, query));
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
        foreach (JToken token in array)
        {
            switch (token)
            {
                case JArray jArray:
                    filteredArray.Add(FilterArray(jArray, query));
                    break;
                case JObject jObject:
                    filteredArray.Add(Filter(jObject, query));
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