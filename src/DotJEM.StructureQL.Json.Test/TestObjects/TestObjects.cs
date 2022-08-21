using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Linq;

namespace DotJEM.StructureQL.Json.Test.TestObjects
{
    // Source: https://github.com/jdorfman/awesome-json-datasets
    internal class TestObjects
    {
        private static readonly IAssemblyResourceLoader loader = new AssemblyResourceLoader();

        public static T Load<T>(string resourceName) where T: JToken
        {
            return (T)JToken.Parse(loader.LoadString("DotJEM.StructureQL.Json.Test.TestObjects." + resourceName));
        }
    }

    public interface IAssemblyResourceLoader
    {
        string LoadString(string resourceName);
    }

    public class AssemblyResourceLoader : IAssemblyResourceLoader
    {
        private static readonly Assembly assembly = Assembly.GetExecutingAssembly();

        public string LoadString(string resourceName)
        {
            using Stream? resourceStream = assembly.GetManifestResourceStream(resourceName);
            if (resourceStream == null)
                throw new FileNotFoundException();

            using StreamReader reader = new(resourceStream);
            return reader.ReadToEnd();
        }
    }

}
