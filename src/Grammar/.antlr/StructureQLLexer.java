// Generated from g:\Workspace\GITHUB\StructureQL\src\Grammar\StructureQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructureQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRING=12, INTEGER=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "STRING", "INTEGER", "ESC", "CHAR", "UNICODE", "HEX", 
			"SAFECODEPOINT", "NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'['", "'..'", "']'", "'[..'", "'..]'", "':'", 
			"'**'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "INTEGER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public StructureQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StructureQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\6\rI\n\r\r\r\16\rJ\3\16\6\16N\n\16\r\16\16\16O\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\2)\20\3\2\6\r\2\13\f\17\17"+
		"\"\",,..<<]]__}}\177\177\u3002\u3002\5\2\62;CHch\5\2\2!$$^^\6\2\13\f\17"+
		"\17\"\"\u3002\u3002\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2"+
		"\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\66\3\2\2\2\178\3\2"+
		"\2\2\21<\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27E\3\2\2\2\31H\3\2\2\2\33M\3"+
		"\2\2\2\35Q\3\2\2\2\37T\3\2\2\2!V\3\2\2\2#\\\3\2\2\2%^\3\2\2\2\'`\3\2\2"+
		"\2)b\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7.\2\2.\6\3\2\2\2/\60\7\177\2\2\60"+
		"\b\3\2\2\2\61\62\7]\2\2\62\n\3\2\2\2\63\64\7\60\2\2\64\65\7\60\2\2\65"+
		"\f\3\2\2\2\66\67\7_\2\2\67\16\3\2\2\289\7]\2\29:\7\60\2\2:;\7\60\2\2;"+
		"\20\3\2\2\2<=\7\60\2\2=>\7\60\2\2>?\7_\2\2?\22\3\2\2\2@A\7<\2\2A\24\3"+
		"\2\2\2BC\7,\2\2CD\7,\2\2D\26\3\2\2\2EF\7,\2\2F\30\3\2\2\2GI\5\37\20\2"+
		"HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\32\3\2\2\2LN\5\'\24\2ML\3\2"+
		"\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\34\3\2\2\2QR\7^\2\2RS\13\2\2\2S\36"+
		"\3\2\2\2TU\n\2\2\2U \3\2\2\2VW\7w\2\2WX\5#\22\2XY\5#\22\2YZ\5#\22\2Z["+
		"\5#\22\2[\"\3\2\2\2\\]\t\3\2\2]$\3\2\2\2^_\n\4\2\2_&\3\2\2\2`a\4\62;\2"+
		"a(\3\2\2\2bc\t\5\2\2cd\3\2\2\2de\b\25\2\2e*\3\2\2\2\5\2JO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}