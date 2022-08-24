# StructureQL

Structure QL, not to be confused with Structured Query Language (SQL) (Could not come up with a better name for now). Is a small frame work targeted at enabling REST/HTTP framworks to ease implementation of partial returns based on structured data, currently aimed specifically at JSON.

# Examples

Given the following JSON:

```json
{
    "id": "GPL-2.0",
    "identifiers": [
      {
        "identifier": "GPL-2.0",
        "scheme": "DEP5"
      },
      {
        "identifier": "GPL-2.0",
        "scheme": "SPDX"
      },
      {
        "identifier": "License :: OSI Approved :: GNU General Public License v2 (GPLv2)",
        "scheme": "Trove"
      }
    ],
    "links": [
      {
        "note": "tl;dr legal",
        "url": "https://tldrlegal.com/license/gnu-general-public-license-v2"
      },
      {
        "note": "Wikipedia page",
        "url": "https://en.wikipedia.org/wiki/GNU_General_Public_License"
      },
      {
        "note": "OSI Page",
        "url": "https://opensource.org/licenses/GPL-2.0"
      }
    ],
    "name": "GNU General Public License, Version 2.0",
    "other_names": [],
    "superseded_by": "GPL-3.0",
    "keywords": [
      "osi-approved",
      "popular",
      "copyleft"
    ],
    "text": [
      {
        "media_type": "text/plain",
        "title": "Plain Text",
        "url": "https://www.gnu.org/licenses/gpl-2.0.txt"
      },
      {
        "media_type": "text/html",
        "title": "HTML",
        "url": "https://www.gnu.org/licenses/gpl-2.0-standalone.html"
      }
    ]
}
```


----
Using DotJEM.StructureQL.Json, we can query into the document with the following queries:

**Return the entire document: **  
`**` or `{**}`

----

**Return only top level primitive fields:**  
`*` or `{*}`

Code
```CSharp
JObject result = json.Query("*");
```

Result:
```json
{
    "id": "GPL-2.0",
    "name": "GNU General Public License, Version 2.0",
    "superseded_by": "GPL-3.0"
}
```

----

**Return specific named properties:**  
`{id,name}`

Code
```CSharp
JObject result = json.Query("{id,name}");
```

Result:
```json
{
    "id": "GPL-2.0",
    "name": "GNU General Public License, Version 2.0"
}
```

----

**Return id, name and all identifiers:**  
`{id,name,identifiers:*}`, `{id,name,identifiers:**}`, `{id,name,identifiers:{*}}` or `{id,name,identifiers:{**}}`  
Because each of the identifier objects only has top level promitives, both `*` and `**` works the same here, if there was nested properties and we wanted the full identifier objects we either need to use `**`/`{**}` or query specifically for properties and child properties of the object.

Code
```CSharp
JObject result = json.Query("{id,name,identifiers:*}");
```

Result:
```json
{
    "id": "GPL-2.0",
    "name": "GNU General Public License, Version 2.0",
    "identifiers": [
      {
        "identifier": "GPL-2.0",
        "scheme": "DEP5"
      },
      {
        "identifier": "GPL-2.0",
        "scheme": "SPDX"
      },
      {
        "identifier": "License :: OSI Approved :: GNU General Public License v2 (GPLv2)",
        "scheme": "Trove"
      }
    ]
}
```

----

**Return id, name and a range of identifiers:**  
`{id,name,identifiers:[0..1]*}`, `{id,name,identifiers:[0..1]**}`, `{id,name,identifiers:[0..1]{*}}` or `{id,name,identifiers:[0..1]{**}}`  
If we know a property is an array, we can add `[<from>..<to>]` in front of the query on that object to select only a number of items in the array.
Both from and to are optional, where `[1..]` selects elements from index 1 and up, `[..1]` selects element 0 and 1 and `[..]` means all and is redundant to just leaving it out.

Code
```CSharp
JObject result = json.Query("{id,name,identifiers:[0..1]*}");
```

Result:
```json
{
    "id": "GPL-2.0",
    "name": "GNU General Public License, Version 2.0",
    "identifiers": [
      {
        "identifier": "GPL-2.0",
        "scheme": "DEP5"
      },
      {
        "identifier": "GPL-2.0",
        "scheme": "SPDX"
      }
    ]
}
```

----

**Return id, name and links with only the url property**  
`{id,name,links:{url} }`

Code
```CSharp
JObject result = json.Query("{id,name,links:{url} }");
```

Result:
```json
{
    "id": "GPL-2.0",
    "name": "GNU General Public License, Version 2.0",
    "links": [
      {
        "url": "https://tldrlegal.com/license/gnu-general-public-license-v2"
      },
      {
        "url": "https://en.wikipedia.org/wiki/GNU_General_Public_License"
      },
      {
        "url": "https://opensource.org/licenses/GPL-2.0"
      }
    ]
}
```

----

All the above queries the objects via an extension method, when querying multiple objects its worth reusing the parsed query so it's not parsed over and over again:


Code
```CSharp
IStructureQuery query = StructureQL.Parse("{id,name,links:{url} }");
var result = listOfJObjects.Select(json => json.Query(query));
```















