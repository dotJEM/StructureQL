using DotJEM.StructureQL.Rules;
using Microsoft.VisualStudio.TestPlatform.ObjectModel;
using Newtonsoft.Json.Linq;
using NUnit.Framework;

namespace DotJEM.StructureQL.Json.Test
{
    [TestFixture]
    public class FilterTests
    {
        [Test]
        public void TestMe()
        {
            IStructureQuery result = new StructureQL().Parse("{ *, val: { *, crew: ** } }")!;

            Console.WriteLine(result.Explain());

            JObject testObj = JObject.Parse("{ name: 'foo', val: { id: 42, crew: { item: { id: 1 }, keep: { error: true } }, remove: { error: true } }, remove: { error: true } }");

            JObject filtered = testObj.Query(result);
            Console.WriteLine(filtered);
        }
    }

    public class FilteringTests
    {
        [TestCase("*")]
        [TestCase("**")]
        [TestCase("{ * }")]
        [TestCase("{ name }")]
        [TestCase("{ name, age, val }")]
        [TestCase("{ name, age, arr:[1..9] }")]
        public void TestMe(string selector)
        {
            JObject testObj = JObject.Parse("{ name: 'foo', age: 43, val: { id: 42, crew: { item: { id: 1 }, keep: { error: true } }, remove: { error: true } }, remove: { error: true } }");
            JObject filtered = testObj.Query(selector);
            Console.WriteLine(filtered);
        }
    }

    public class OpenSourceLucenses_CopyLeft_Tests
    {
        [TestCase("*")]
        [TestCase("**")]
        [TestCase("{ * }")]
        [TestCase("{ id, name, superseded_by, text:** }")]
        [TestCase("{ id, name, superseded_by, links: { note } }")]
        public void TestMe(string selector)
        {
            JArray list = TestObjects.TestObjects.Load<JArray>("OpenSourceLicenses_Copyleft.json");
            JObject first = (JObject)list.First();

            JObject filtered = first.Query(selector);
            Console.WriteLine(filtered);
        }

    }
}