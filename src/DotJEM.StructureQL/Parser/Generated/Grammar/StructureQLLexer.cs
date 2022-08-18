//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.10.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Grammar\StructureQL.g4 by ANTLR 4.10.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace DotJEM.StructureQL.Generated.Parser {
using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.10.1")]
[System.CLSCompliant(false)]
public partial class StructureQLLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, WS=8;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STRING", "ESC", "CHAR", 
		"UNICODE", "HEX", "SAFECODEPOINT", "WS"
	};


	public StructureQLLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public StructureQLLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'{'", "','", "'}'", "':'", "'**'", "'*'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, "STRING", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "StructureQL.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static StructureQLLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,8,64,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,
		2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,1,0,1,0,1,1,1,1,
		1,2,1,2,1,3,1,3,1,4,1,4,1,4,1,5,1,5,1,6,4,6,42,8,6,11,6,12,6,43,1,7,1,
		7,1,7,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,
		12,1,12,0,0,13,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,0,17,0,19,0,21,0,23,0,
		25,8,1,0,4,9,0,9,10,13,13,32,32,42,42,44,44,58,58,123,123,125,125,12288,
		12288,3,0,48,57,65,70,97,102,3,0,0,31,34,34,92,92,4,0,9,10,13,13,32,32,
		12288,12288,59,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,
		0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,25,1,0,0,0,1,27,1,0,0,0,3,29,1,0,0,0,5,
		31,1,0,0,0,7,33,1,0,0,0,9,35,1,0,0,0,11,38,1,0,0,0,13,41,1,0,0,0,15,45,
		1,0,0,0,17,48,1,0,0,0,19,50,1,0,0,0,21,56,1,0,0,0,23,58,1,0,0,0,25,60,
		1,0,0,0,27,28,5,123,0,0,28,2,1,0,0,0,29,30,5,44,0,0,30,4,1,0,0,0,31,32,
		5,125,0,0,32,6,1,0,0,0,33,34,5,58,0,0,34,8,1,0,0,0,35,36,5,42,0,0,36,37,
		5,42,0,0,37,10,1,0,0,0,38,39,5,42,0,0,39,12,1,0,0,0,40,42,3,17,8,0,41,
		40,1,0,0,0,42,43,1,0,0,0,43,41,1,0,0,0,43,44,1,0,0,0,44,14,1,0,0,0,45,
		46,5,92,0,0,46,47,9,0,0,0,47,16,1,0,0,0,48,49,8,0,0,0,49,18,1,0,0,0,50,
		51,5,117,0,0,51,52,3,21,10,0,52,53,3,21,10,0,53,54,3,21,10,0,54,55,3,21,
		10,0,55,20,1,0,0,0,56,57,7,1,0,0,57,22,1,0,0,0,58,59,8,2,0,0,59,24,1,0,
		0,0,60,61,7,3,0,0,61,62,1,0,0,0,62,63,6,12,0,0,63,26,1,0,0,0,2,0,43,1,
		6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
} // namespace DotJEM.StructureQL.Generated.Parser
