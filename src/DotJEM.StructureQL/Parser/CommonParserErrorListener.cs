using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Dfa;
using Antlr4.Runtime.Sharpen;

namespace DotJEM.StructureQL.Parser;

public class CommonParserErrorListener : BaseErrorListener, IAntlrErrorListener<int>
{
    public bool IsValid { get; private set; } = true;
    public int ErrorLocation { get; private set; } = -1;
    public string ErrorMessage { get; private set; }

    public override void ReportAmbiguity(Antlr4.Runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, bool exact, BitSet ambigAlts, ATNConfigSet configs)
    {
        IsValid = false;
    }

    public override void ReportAttemptingFullContext(Antlr4.Runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, SimulatorState conflictState)
    {
        IsValid = false;
    }

    public override void ReportContextSensitivity(Antlr4.Runtime.Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, SimulatorState acceptState)
    {
        IsValid = false;
    }

    public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        IsValid = false;
        ErrorLocation = ErrorLocation == -1 ? charPositionInLine : ErrorLocation;
        ErrorMessage = msg;
    }

    public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        IsValid = false;
        ErrorLocation = ErrorLocation == -1 ? charPositionInLine : ErrorLocation;
        ErrorMessage = msg;
    }
}