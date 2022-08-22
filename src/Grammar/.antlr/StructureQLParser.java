// Generated from g:\Workspace\GITHUB\StructureQL\src\Grammar\StructureQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructureQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, INTEGER=11, STRING=12;
	public static final int
		RULE_query = 0, RULE_array = 1, RULE_object = 2, RULE_property = 3, RULE_part = 4, 
		RULE_match = 5, RULE_recursiveMatchAll = 6, RULE_simpleMatchAll = 7, RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "array", "object", "property", "part", "match", "recursiveMatchAll", 
			"simpleMatchAll", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "'..'", "']'", "'{'", "','", "'}'", "':'", "'**'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "INTEGER", 
			"STRING"
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

	@Override
	public String getGrammarFileName() { return "StructureQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StructureQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public NumberContext lower;
		public NumberContext upper;
		public PartContext elementQuery;
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(23);
				((ArrayContext)_localctx).lower = number();
				}
			}

			setState(26);
			match(T__1);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(27);
				((ArrayContext)_localctx).upper = number();
				}
			}

			setState(30);
			match(T__2);
			setState(31);
			((ArrayContext)_localctx).elementQuery = part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<MatchContext> match() {
			return getRuleContexts(MatchContext.class);
		}
		public MatchContext match(int i) {
			return getRuleContext(MatchContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__3);
			setState(34);
			match();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(35);
				match(T__4);
				setState(36);
				match();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StructureQLParser.STRING, 0); }
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_property);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(STRING);
				setState(46);
				match(T__6);
				setState(47);
				part();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public RecursiveMatchAllContext recursiveMatchAll() {
			return getRuleContext(RecursiveMatchAllContext.class,0);
		}
		public SimpleMatchAllContext simpleMatchAll() {
			return getRuleContext(SimpleMatchAllContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_part);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				recursiveMatchAll();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				simpleMatchAll();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				array();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchContext extends ParserRuleContext {
		public RecursiveMatchAllContext recursiveMatchAll() {
			return getRuleContext(RecursiveMatchAllContext.class,0);
		}
		public SimpleMatchAllContext simpleMatchAll() {
			return getRuleContext(SimpleMatchAllContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_match);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				recursiveMatchAll();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				simpleMatchAll();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				property();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursiveMatchAllContext extends ParserRuleContext {
		public RecursiveMatchAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursiveMatchAll; }
	}

	public final RecursiveMatchAllContext recursiveMatchAll() throws RecognitionException {
		RecursiveMatchAllContext _localctx = new RecursiveMatchAllContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recursiveMatchAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleMatchAllContext extends ParserRuleContext {
		public SimpleMatchAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleMatchAll; }
	}

	public final SimpleMatchAllContext simpleMatchAll() throws RecognitionException {
		SimpleMatchAllContext _localctx = new SimpleMatchAllContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleMatchAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(StructureQLParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\5\2"+
		"\27\n\2\3\3\3\3\5\3\33\n\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3"+
		"\6\3\6\3\6\5\69\n\6\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2"+
		"\2\13\2\4\6\b\n\f\16\20\22\2\2\2F\2\26\3\2\2\2\4\30\3\2\2\2\6#\3\2\2\2"+
		"\b\62\3\2\2\2\n8\3\2\2\2\f=\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22C\3\2\2"+
		"\2\24\27\5\f\7\2\25\27\5\6\4\2\26\24\3\2\2\2\26\25\3\2\2\2\27\3\3\2\2"+
		"\2\30\32\7\3\2\2\31\33\5\22\n\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2"+
		"\2\2\34\36\7\4\2\2\35\37\5\22\n\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2"+
		"\2\2 !\7\5\2\2!\"\5\n\6\2\"\5\3\2\2\2#$\7\6\2\2$)\5\f\7\2%&\7\7\2\2&("+
		"\5\f\7\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2"+
		",-\7\b\2\2-\7\3\2\2\2.\63\7\16\2\2/\60\7\16\2\2\60\61\7\t\2\2\61\63\5"+
		"\n\6\2\62.\3\2\2\2\62/\3\2\2\2\63\t\3\2\2\2\649\5\16\b\2\659\5\20\t\2"+
		"\669\5\4\3\2\679\5\6\4\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2"+
		"\29\13\3\2\2\2:>\5\16\b\2;>\5\20\t\2<>\5\b\5\2=:\3\2\2\2=;\3\2\2\2=<\3"+
		"\2\2\2>\r\3\2\2\2?@\7\n\2\2@\17\3\2\2\2AB\7\13\2\2B\21\3\2\2\2CD\7\r\2"+
		"\2D\23\3\2\2\2\t\26\32\36)\628=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}