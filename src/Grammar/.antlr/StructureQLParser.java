// Generated from m:\Proto\DotJEM.StructureQL\src\Grammar\StructureQL.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, WS=8;
	public static final int
		RULE_query = 0, RULE_object = 1, RULE_property = 2, RULE_match = 3, RULE_recursiveMatchAll = 4, 
		RULE_simpleMatchAll = 5;
	public static final String[] ruleNames = {
		"query", "object", "property", "match", "recursiveMatchAll", "simpleMatchAll"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'**'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "STRING", "WS"
	};
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
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
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
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			match();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(18);
				match(T__1);
				setState(19);
				match();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(T__2);
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
		public RecursiveMatchAllContext recursiveMatchAll() {
			return getRuleContext(RecursiveMatchAllContext.class,0);
		}
		public SimpleMatchAllContext simpleMatchAll() {
			return getRuleContext(SimpleMatchAllContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_property);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(STRING);
				setState(29);
				match(T__3);
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(30);
					recursiveMatchAll();
					}
					break;
				case T__5:
					{
					setState(31);
					simpleMatchAll();
					}
					break;
				case T__0:
					{
					setState(32);
					object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 6, RULE_match);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				recursiveMatchAll();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				simpleMatchAll();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
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
		enterRule(_localctx, 8, RULE_recursiveMatchAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__4);
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
		enterRule(_localctx, 10, RULE_simpleMatchAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3"+
		"\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n"+
		"\4\5\4&\n\4\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f"+
		"\2\2\2\61\2\20\3\2\2\2\4\22\3\2\2\2\6%\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f"+
		".\3\2\2\2\16\21\5\b\5\2\17\21\5\4\3\2\20\16\3\2\2\2\20\17\3\2\2\2\21\3"+
		"\3\2\2\2\22\23\7\3\2\2\23\30\5\b\5\2\24\25\7\4\2\2\25\27\5\b\5\2\26\24"+
		"\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30"+
		"\3\2\2\2\33\34\7\5\2\2\34\5\3\2\2\2\35&\7\t\2\2\36\37\7\t\2\2\37#\7\6"+
		"\2\2 $\5\n\6\2!$\5\f\7\2\"$\5\4\3\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$&\3"+
		"\2\2\2%\35\3\2\2\2%\36\3\2\2\2&\7\3\2\2\2\'+\5\n\6\2(+\5\f\7\2)+\5\6\4"+
		"\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,-\7\7\2\2-\13\3\2\2\2./\7"+
		"\b\2\2/\r\3\2\2\2\7\20\30#%*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}