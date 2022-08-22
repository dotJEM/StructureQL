using System;
using Antlr4.Runtime;
using DotJEM.StructureQL.Generated.Parser;
using DotJEM.StructureQL.Parser;
using DotJEM.StructureQL.Rules;

namespace DotJEM.StructureQL
{
    public interface IStructureQL
    {
        IStructureQuery Parse(string selector);
    }

    public class StructureQL : IStructureQL
    {
        public IStructureQuery Parse(string selector)
        {
            if (selector == null) throw new ArgumentNullException(nameof(selector));

            ICharStream inputStream = new AntlrInputStream(selector);
            StructureQLLexer lexer = new StructureQLLexer(inputStream);
            ITokenStream tokenStream = new CommonTokenStream(lexer);
            StructureQLParser parser = new StructureQLParser(tokenStream);

            CommonParserErrorListener errorCollector = new CommonParserErrorListener();
            lexer.RemoveErrorListeners();
            lexer.AddErrorListener(errorCollector);

            parser.RemoveErrorListeners();
            parser.AddErrorListener(errorCollector);

            if (!errorCollector.IsValid)
                throw new ArgumentException(errorCollector.ErrorMessage);

            return parser.query().Accept(new StructureQlVisitor());
        }
    }
}