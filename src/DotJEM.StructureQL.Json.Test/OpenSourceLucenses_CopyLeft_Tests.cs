using DotJEM.StructureQL.Rules;
using Microsoft.VisualStudio.TestPlatform.ObjectModel;
using Newtonsoft.Json.Linq;
using NUnit.Framework;
// ReSharper disable InconsistentNaming

namespace DotJEM.StructureQL.Json.Test
{

    public class OpenSourceLucenses_CopyLeft_Tests
    {
        [TestCase("*")]
        [TestCase("**")]
        [TestCase("{ * }")]
        [TestCase("{ id, name, superseded_by, text:** }")]
        [TestCase("{ id, name, superseded_by, links: { note } }")]
        [TestCase("{ id, name, superseded_by, links: [0..1] { note } }")]
        [TestCase("{ id, name, superseded_by, links: [..1] { note } }")]
        [TestCase("{ id, name, superseded_by, links: [0..] { note } }")]
        [TestCase("{ id, name, superseded_by, links: [..] { note } }")]
        public void Query_Document_ReturnsExpected(string selector)
        {
            JArray list = TestObjects.TestObjects.Load<JArray>("OpenSourceLicenses_Copyleft.json");
            JObject first = (JObject)list.First();

            JObject filtered = first.Query(selector);
            Console.WriteLine(filtered);
        }

    }
}