using DotJEM.StructureQL.Rules;
using Newtonsoft.Json.Linq;
using NUnit.Framework;

namespace DotJEM.StructureQL.Json.Test
{

    /*
     * select: {*,person:{*,crew:**}}
     *    *    = all values here
     *    **   = all values recursively
     *
     *
     * select: {*,person:*,person.crew:**}
     *
     */
    [TestFixture]
    public class FilterTests
    {
        [Test]
        public void TestMe()
        {
            IStructureQuery result = new StructureQL().Parse("{ *, val: { *, crew: ** } }")!;

            Console.WriteLine(result.Explain());

            JObject testObj = JObject.Parse("{ name: 'foo', val: { id: 42, crew: { item: { id: 1 }, keep: { error: true } }, remove: { error: true } }, remove: { error: true } }");

            JObject filtered = testObj.Filter(result);
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
        public void TestMe(string selector)
        {
            JObject testObj = JObject.Parse("{ name: 'foo', age: 43, val: { id: 42, crew: { item: { id: 1 }, keep: { error: true } }, remove: { error: true } }, remove: { error: true } }");
            JObject filtered = testObj.Filter(selector);
            Console.WriteLine(filtered);
        }

    }
}