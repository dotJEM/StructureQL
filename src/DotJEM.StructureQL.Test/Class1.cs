using DotJEM.StructureQL.Rules;
using NUnit.Framework;
// ReSharper disable InconsistentNaming

namespace DotJEM.StructureQL.Test
{
    [TestFixture]
    public class StructureQLTests
    {
        [TestCaseSource(nameof(Parse_QueryInput_ReturnsExpected_Sources))]
        public void Parse_QueryInput_ReturnsExpected(string query, string expected)
        {
            Assert.That(new StructureQL().Parse(query)!.Explain(),
                Is.EqualTo(expected));
        }

        static IEnumerable<string[]> Parse_QueryInput_ReturnsExpected_Sources {
            get
            {
                yield return Case(
                    "*",
                    "OBJECT(SIMPLE(*))");

                yield return Case(
                    "**", 
                    "OBJECT(RECURSIVE(*))");

                yield return Case(
                    "{ * }", "OBJECT(SIMPLE(*))");

                yield return Case(
                    "{ ** }", "OBJECT(RECURSIVE(*))");

                yield return Case(
                    "{name}",
                    "OBJECT(name=INCLUDE())");

                yield return Case(
                    "{ name }",
                    "OBJECT(name=INCLUDE())");

                yield return Case(
                    "{ name, age, val }",
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),val=INCLUDE())");
                
                yield return Case(
                    "{ name, age, arr:[1..9]* }",
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),arr=ARRAY(1,9,OBJECT(SIMPLE(*))))");
                
                yield return Case(
                    "{ name, age, arr:[..9]* }",
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),arr=ARRAY(0,9,OBJECT(SIMPLE(*))))");
                
                yield return Case(
                    "{ name, age, arr:[1..]* }",
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),arr=ARRAY(1,2147483647,OBJECT(SIMPLE(*))))");

                yield return Case(
                    "{ name, age, arr:[ 1 .. 9 ]* }", 
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),arr=ARRAY(1,9,OBJECT(SIMPLE(*))))");

                yield return Case(
                    "{ name, age, arr:[100..900]** }", 
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),arr=ARRAY(100,900,OBJECT(RECURSIVE(*))))");
                

                yield return Case(
                    "{ name, age, arr:[0..5]{ property } }", 
                    "OBJECT(name=INCLUDE(),age=INCLUDE(),arr=ARRAY(0,5,OBJECT(property=INCLUDE())))");

                string[] Case(string query, string expected) {
                    return new[] {query, expected};
                }
            }
        }

    }
}