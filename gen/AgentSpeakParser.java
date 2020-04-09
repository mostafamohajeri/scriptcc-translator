// Generated from /home/msotafa/IdeaProjects/antr4grammars/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AgentSpeakParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOGICALVALUE=1, NUMBER=2, CONSTANTNUMBER=3, STRING=4, STRONGNEGATION=5, 
		DEFAULTNEGATION=6, ASSIGNOPERATOR=7, RELATIONALOPERATOR=8, LOGICALOPERATOR1=9, 
		LOGICALOPERATOR2=10, LOGICALOPERATOR3=11, ARITHMETICOPERATOR1=12, ARITHMETICOPERATOR2=13, 
		ARITHMETICOPERATOR3=14, UNARYOPERATOR=15, ANNOTATION=16, ANNOTATION_STRING=17, 
		ANNOTATION_VARIABLEDESCRIPTION=18, ANNOTATION_CONSTANT=19, VARIABLEATOM=20, 
		ATOM=21, EXCLAMATIONMARK=22, COMMA=23, DOUBLEEXCLAMATIONMARK=24, QUESTIONMARK=25, 
		DOLLAR=26, VLINE=27, HASH=28, LEFTARROW=29, RIGHTARROW=30, RIGHTARROWDOUBLE=31, 
		RULEOPERATOR=32, AT=33, COLON=34, SEMICOLON=35, DOT=36, UNDERSCORE=37, 
		SLASH=38, LEFTSHIFT=39, RIGHTSHIFT=40, LEFTROUNDBRACKET=41, RIGHTROUNDBRACKET=42, 
		LEFTANGULARBRACKET=43, RIGHTANGULARBRACKET=44, LEFTCURVEDBRACKET=45, RIGHTCURVEDBRACKET=46, 
		DECONSTRUCT=47, WHITESPACE=48, LINECOMMENT=49, BLOCKCOMMENT=50;
	public static final int
		RULE_belief = 0, RULE_initialgoal = 1, RULE_initialachievegoal = 2, RULE_initialmaintenancegoal = 3, 
		RULE_plan = 4, RULE_plantrigger = 5, RULE_plandefinition = 6, RULE_body = 7, 
		RULE_bodyformula = 8, RULE_expression = 9, RULE_beliefaction = 10, RULE_testgoal = 11, 
		RULE_achievementgoal = 12, RULE_maintenancegoal = 13, RULE_primitiveaction = 14, 
		RULE_term = 15, RULE_termvalue = 16, RULE_literal = 17, RULE_termlist = 18, 
		RULE_variable = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"belief", "initialgoal", "initialachievegoal", "initialmaintenancegoal", 
			"plan", "plantrigger", "plandefinition", "body", "bodyformula", "expression", 
			"beliefaction", "testgoal", "achievementgoal", "maintenancegoal", "primitiveaction", 
			"term", "termvalue", "literal", "termlist", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'~'", "'not'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'!'", 
			"','", "'!!'", "'?'", "'$'", "'|'", "'#'", "'<-'", "'->'", "'=>'", "':-'", 
			"'@'", "':'", "';'", "'.'", "'_'", "'/'", "'<<'", "'>>'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'=..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOGICALVALUE", "NUMBER", "CONSTANTNUMBER", "STRING", "STRONGNEGATION", 
			"DEFAULTNEGATION", "ASSIGNOPERATOR", "RELATIONALOPERATOR", "LOGICALOPERATOR1", 
			"LOGICALOPERATOR2", "LOGICALOPERATOR3", "ARITHMETICOPERATOR1", "ARITHMETICOPERATOR2", 
			"ARITHMETICOPERATOR3", "UNARYOPERATOR", "ANNOTATION", "ANNOTATION_STRING", 
			"ANNOTATION_VARIABLEDESCRIPTION", "ANNOTATION_CONSTANT", "VARIABLEATOM", 
			"ATOM", "EXCLAMATIONMARK", "COMMA", "DOUBLEEXCLAMATIONMARK", "QUESTIONMARK", 
			"DOLLAR", "VLINE", "HASH", "LEFTARROW", "RIGHTARROW", "RIGHTARROWDOUBLE", 
			"RULEOPERATOR", "AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "SLASH", 
			"LEFTSHIFT", "RIGHTSHIFT", "LEFTROUNDBRACKET", "RIGHTROUNDBRACKET", "LEFTANGULARBRACKET", 
			"RIGHTANGULARBRACKET", "LEFTCURVEDBRACKET", "RIGHTCURVEDBRACKET", "DECONSTRUCT", 
			"WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT"
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
	public String getGrammarFileName() { return "AgentSpeak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AgentSpeakParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BeliefContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AgentSpeakParser.DOT, 0); }
		public BeliefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belief; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitBelief(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitBelief(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefContext belief() throws RecognitionException {
		BeliefContext _localctx = new BeliefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_belief);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			literal();
			setState(41);
			match(DOT);
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

	public static class InitialgoalContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AgentSpeakParser.DOT, 0); }
		public AchievementgoalContext achievementgoal() {
			return getRuleContext(AchievementgoalContext.class,0);
		}
		public MaintenancegoalContext maintenancegoal() {
			return getRuleContext(MaintenancegoalContext.class,0);
		}
		public InitialgoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialgoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterInitialgoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitInitialgoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitInitialgoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialgoalContext initialgoal() throws RecognitionException {
		InitialgoalContext _localctx = new InitialgoalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initialgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATIONMARK:
				{
				setState(43);
				achievementgoal();
				}
				break;
			case DOUBLEEXCLAMATIONMARK:
				{
				setState(44);
				maintenancegoal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(47);
			match(DOT);
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

	public static class InitialachievegoalContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AgentSpeakParser.DOT, 0); }
		public TerminalNode EXCLAMATIONMARK() { return getToken(AgentSpeakParser.EXCLAMATIONMARK, 0); }
		public InitialachievegoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialachievegoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterInitialachievegoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitInitialachievegoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitInitialachievegoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialachievegoalContext initialachievegoal() throws RecognitionException {
		InitialachievegoalContext _localctx = new InitialachievegoalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initialachievegoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			match(EXCLAMATIONMARK);
			}
			setState(50);
			literal();
			setState(51);
			match(DOT);
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

	public static class InitialmaintenancegoalContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AgentSpeakParser.DOT, 0); }
		public TerminalNode DOUBLEEXCLAMATIONMARK() { return getToken(AgentSpeakParser.DOUBLEEXCLAMATIONMARK, 0); }
		public InitialmaintenancegoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialmaintenancegoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterInitialmaintenancegoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitInitialmaintenancegoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitInitialmaintenancegoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialmaintenancegoalContext initialmaintenancegoal() throws RecognitionException {
		InitialmaintenancegoalContext _localctx = new InitialmaintenancegoalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initialmaintenancegoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(53);
			match(DOUBLEEXCLAMATIONMARK);
			}
			setState(54);
			literal();
			setState(55);
			match(DOT);
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

	public static class PlanContext extends ParserRuleContext {
		public ExpressionContext condition;
		public PlantriggerContext plantrigger() {
			return getRuleContext(PlantriggerContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PlandefinitionContext plandefinition() {
			return getRuleContext(PlandefinitionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AgentSpeakParser.DOT, 0); }
		public List<TerminalNode> ANNOTATION() { return getTokens(AgentSpeakParser.ANNOTATION); }
		public TerminalNode ANNOTATION(int i) {
			return getToken(AgentSpeakParser.ANNOTATION, i);
		}
		public TerminalNode COLON() { return getToken(AgentSpeakParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterPlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitPlan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitPlan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanContext plan() throws RecognitionException {
		PlanContext _localctx = new PlanContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION) {
				{
				{
				setState(57);
				match(ANNOTATION);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			plantrigger();
			setState(64);
			literal();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(65);
				match(COLON);
				setState(66);
				((PlanContext)_localctx).condition = expression(0);
				}
			}

			setState(69);
			plandefinition();
			setState(70);
			match(DOT);
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

	public static class PlantriggerContext extends ParserRuleContext {
		public TerminalNode ARITHMETICOPERATOR3() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR3, 0); }
		public TerminalNode QUESTIONMARK() { return getToken(AgentSpeakParser.QUESTIONMARK, 0); }
		public TerminalNode EXCLAMATIONMARK() { return getToken(AgentSpeakParser.EXCLAMATIONMARK, 0); }
		public TerminalNode DOUBLEEXCLAMATIONMARK() { return getToken(AgentSpeakParser.DOUBLEEXCLAMATIONMARK, 0); }
		public PlantriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plantrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterPlantrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitPlantrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitPlantrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlantriggerContext plantrigger() throws RecognitionException {
		PlantriggerContext _localctx = new PlantriggerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_plantrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(72);
			match(ARITHMETICOPERATOR3);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATIONMARK) | (1L << DOUBLEEXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				setState(73);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATIONMARK) | (1L << DOUBLEEXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

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

	public static class PlandefinitionContext extends ParserRuleContext {
		public TerminalNode RIGHTARROWDOUBLE() { return getToken(AgentSpeakParser.RIGHTARROWDOUBLE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public PlandefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plandefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterPlandefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitPlandefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitPlandefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlandefinitionContext plandefinition() throws RecognitionException {
		PlandefinitionContext _localctx = new PlandefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_plandefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(RIGHTARROWDOUBLE);
			setState(77);
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public List<BodyformulaContext> bodyformula() {
			return getRuleContexts(BodyformulaContext.class);
		}
		public BodyformulaContext bodyformula(int i) {
			return getRuleContext(BodyformulaContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AgentSpeakParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AgentSpeakParser.SEMICOLON, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			bodyformula();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(80);
				match(SEMICOLON);
				setState(81);
				bodyformula();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class BodyformulaContext extends ParserRuleContext {
		public BeliefactionContext beliefaction() {
			return getRuleContext(BeliefactionContext.class,0);
		}
		public TestgoalContext testgoal() {
			return getRuleContext(TestgoalContext.class,0);
		}
		public AchievementgoalContext achievementgoal() {
			return getRuleContext(AchievementgoalContext.class,0);
		}
		public PrimitiveactionContext primitiveaction() {
			return getRuleContext(PrimitiveactionContext.class,0);
		}
		public BodyformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterBodyformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitBodyformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitBodyformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyformulaContext bodyformula() throws RecognitionException {
		BodyformulaContext _localctx = new BodyformulaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bodyformula);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARITHMETICOPERATOR3:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				beliefaction();
				}
				break;
			case QUESTIONMARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				testgoal();
				}
				break;
			case EXCLAMATIONMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				achievementgoal();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				primitiveaction();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext lhs;
		public ExpressionContext single;
		public Token binaryoperator;
		public ExpressionContext rhs;
		public TerminalNode DEFAULTNEGATION() { return getToken(AgentSpeakParser.DEFAULTNEGATION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEFTROUNDBRACKET() { return getToken(AgentSpeakParser.LEFTROUNDBRACKET, 0); }
		public TerminalNode RIGHTROUNDBRACKET() { return getToken(AgentSpeakParser.RIGHTROUNDBRACKET, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ARITHMETICOPERATOR1() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR1, 0); }
		public TerminalNode ARITHMETICOPERATOR2() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR2, 0); }
		public TerminalNode ARITHMETICOPERATOR3() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR3, 0); }
		public TerminalNode RELATIONALOPERATOR() { return getToken(AgentSpeakParser.RELATIONALOPERATOR, 0); }
		public TerminalNode LOGICALOPERATOR1() { return getToken(AgentSpeakParser.LOGICALOPERATOR1, 0); }
		public TerminalNode LOGICALOPERATOR2() { return getToken(AgentSpeakParser.LOGICALOPERATOR2, 0); }
		public TerminalNode LOGICALOPERATOR3() { return getToken(AgentSpeakParser.LOGICALOPERATOR3, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULTNEGATION:
				{
				setState(94);
				match(DEFAULTNEGATION);
				setState(95);
				((ExpressionContext)_localctx).single = expression(10);
				}
				break;
			case LEFTROUNDBRACKET:
				{
				setState(96);
				match(LEFTROUNDBRACKET);
				setState(97);
				((ExpressionContext)_localctx).single = expression(0);
				setState(98);
				match(RIGHTROUNDBRACKET);
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
			case STRONGNEGATION:
			case VARIABLEATOM:
			case ATOM:
				{
				setState(100);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(104);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR1);
						setState(105);
						((ExpressionContext)_localctx).rhs = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(107);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR2);
						setState(108);
						((ExpressionContext)_localctx).rhs = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(110);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR3);
						setState(111);
						((ExpressionContext)_localctx).rhs = expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(113);
						((ExpressionContext)_localctx).binaryoperator = match(RELATIONALOPERATOR);
						setState(114);
						((ExpressionContext)_localctx).rhs = expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(116);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR1);
						setState(117);
						((ExpressionContext)_localctx).rhs = expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR2);
						setState(120);
						((ExpressionContext)_localctx).rhs = expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR3);
						setState(123);
						((ExpressionContext)_localctx).rhs = expression(3);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BeliefactionContext extends ParserRuleContext {
		public TerminalNode ARITHMETICOPERATOR3() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR3, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BeliefactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beliefaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterBeliefaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitBeliefaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitBeliefaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefactionContext beliefaction() throws RecognitionException {
		BeliefactionContext _localctx = new BeliefactionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_beliefaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ARITHMETICOPERATOR3);
			setState(130);
			literal();
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

	public static class TestgoalContext extends ParserRuleContext {
		public TerminalNode QUESTIONMARK() { return getToken(AgentSpeakParser.QUESTIONMARK, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TestgoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testgoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterTestgoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitTestgoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitTestgoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestgoalContext testgoal() throws RecognitionException {
		TestgoalContext _localctx = new TestgoalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_testgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			match(QUESTIONMARK);
			}
			{
			setState(133);
			literal();
			}
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

	public static class AchievementgoalContext extends ParserRuleContext {
		public TerminalNode EXCLAMATIONMARK() { return getToken(AgentSpeakParser.EXCLAMATIONMARK, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AchievementgoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_achievementgoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterAchievementgoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitAchievementgoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitAchievementgoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AchievementgoalContext achievementgoal() throws RecognitionException {
		AchievementgoalContext _localctx = new AchievementgoalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_achievementgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			match(EXCLAMATIONMARK);
			}
			{
			setState(136);
			literal();
			}
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

	public static class MaintenancegoalContext extends ParserRuleContext {
		public TerminalNode DOUBLEEXCLAMATIONMARK() { return getToken(AgentSpeakParser.DOUBLEEXCLAMATIONMARK, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MaintenancegoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maintenancegoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterMaintenancegoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitMaintenancegoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitMaintenancegoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaintenancegoalContext maintenancegoal() throws RecognitionException {
		MaintenancegoalContext _localctx = new MaintenancegoalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_maintenancegoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			match(DOUBLEEXCLAMATIONMARK);
			}
			{
			setState(139);
			literal();
			}
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

	public static class PrimitiveactionContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(AgentSpeakParser.HASH, 0); }
		public TerminalNode ATOM() { return getToken(AgentSpeakParser.ATOM, 0); }
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public PrimitiveactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterPrimitiveaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitPrimitiveaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitPrimitiveaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveactionContext primitiveaction() throws RecognitionException {
		PrimitiveactionContext _localctx = new PrimitiveactionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			match(HASH);
			}
			{
			setState(142);
			match(ATOM);
			}
			{
			setState(143);
			termlist();
			}
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

	public static class TermContext extends ParserRuleContext {
		public TermvalueContext termvalue() {
			return getRuleContext(TermvalueContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				termvalue();
				}
				break;
			case VARIABLEATOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				variable();
				}
				break;
			case STRONGNEGATION:
			case ATOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				literal();
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

	public static class TermvalueContext extends ParserRuleContext {
		public TerminalNode LOGICALVALUE() { return getToken(AgentSpeakParser.LOGICALVALUE, 0); }
		public TerminalNode NUMBER() { return getToken(AgentSpeakParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AgentSpeakParser.STRING, 0); }
		public TermvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterTermvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitTermvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitTermvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermvalueContext termvalue() throws RecognitionException {
		TermvalueContext _localctx = new TermvalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICALVALUE) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(AgentSpeakParser.ATOM, 0); }
		public TerminalNode STRONGNEGATION() { return getToken(AgentSpeakParser.STRONGNEGATION, 0); }
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONGNEGATION) {
				{
				setState(152);
				match(STRONGNEGATION);
				}
			}

			setState(155);
			match(ATOM);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				termlist();
				}
				break;
			}
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

	public static class TermlistContext extends ParserRuleContext {
		public TerminalNode LEFTROUNDBRACKET() { return getToken(AgentSpeakParser.LEFTROUNDBRACKET, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode RIGHTROUNDBRACKET() { return getToken(AgentSpeakParser.RIGHTROUNDBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AgentSpeakParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AgentSpeakParser.COMMA, i);
		}
		public TermlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterTermlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitTermlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitTermlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermlistContext termlist() throws RecognitionException {
		TermlistContext _localctx = new TermlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LEFTROUNDBRACKET);
			setState(160);
			term();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				term();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RIGHTROUNDBRACKET);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLEATOM() { return getToken(AgentSpeakParser.VARIABLEATOM, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(VARIABLEATOM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\5\3\60\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3"+
		"\6\3\6\5\6F\n\6\3\6\3\6\3\6\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\t\3\t\3\t\7"+
		"\tU\n\t\f\t\16\tX\13\t\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13h\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\177\n\13\f\13\16\13\u0082\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0097\n\21\3\22"+
		"\3\22\3\23\5\23\u009c\n\23\3\23\3\23\5\23\u00a0\n\23\3\24\3\24\3\24\3"+
		"\24\7\24\u00a6\n\24\f\24\16\24\u00a9\13\24\3\24\3\24\3\25\3\25\3\25\2"+
		"\3\24\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\4\2\30\30\32"+
		"\33\4\2\3\4\6\6\2\u00b0\2*\3\2\2\2\4/\3\2\2\2\6\63\3\2\2\2\b\67\3\2\2"+
		"\2\n>\3\2\2\2\fJ\3\2\2\2\16N\3\2\2\2\20Q\3\2\2\2\22]\3\2\2\2\24g\3\2\2"+
		"\2\26\u0083\3\2\2\2\30\u0086\3\2\2\2\32\u0089\3\2\2\2\34\u008c\3\2\2\2"+
		"\36\u008f\3\2\2\2 \u0096\3\2\2\2\"\u0098\3\2\2\2$\u009b\3\2\2\2&\u00a1"+
		"\3\2\2\2(\u00ac\3\2\2\2*+\5$\23\2+,\7&\2\2,\3\3\2\2\2-\60\5\32\16\2.\60"+
		"\5\34\17\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61\62\7&\2\2\62\5\3\2\2\2"+
		"\63\64\7\30\2\2\64\65\5$\23\2\65\66\7&\2\2\66\7\3\2\2\2\678\7\32\2\28"+
		"9\5$\23\29:\7&\2\2:\t\3\2\2\2;=\7\22\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\5\f\7\2BE\5$\23\2CD\7$\2\2DF\5\24\13"+
		"\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\16\b\2HI\7&\2\2I\13\3\2\2\2JL\7\20"+
		"\2\2KM\t\2\2\2LK\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NO\7!\2\2OP\5\20\t\2P\17"+
		"\3\2\2\2QV\5\22\n\2RS\7%\2\2SU\5\22\n\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2W\21\3\2\2\2XV\3\2\2\2Y^\5\26\f\2Z^\5\30\r\2[^\5\32\16\2\\^"+
		"\5\36\20\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\23\3\2\2\2_`\b\13"+
		"\1\2`a\7\b\2\2ah\5\24\13\fbc\7+\2\2cd\5\24\13\2de\7,\2\2eh\3\2\2\2fh\5"+
		" \21\2g_\3\2\2\2gb\3\2\2\2gf\3\2\2\2h\u0080\3\2\2\2ij\f\n\2\2jk\7\16\2"+
		"\2k\177\5\24\13\13lm\f\t\2\2mn\7\17\2\2n\177\5\24\13\nop\f\b\2\2pq\7\20"+
		"\2\2q\177\5\24\13\trs\f\7\2\2st\7\n\2\2t\177\5\24\13\buv\f\6\2\2vw\7\13"+
		"\2\2w\177\5\24\13\7xy\f\5\2\2yz\7\f\2\2z\177\5\24\13\6{|\f\4\2\2|}\7\r"+
		"\2\2}\177\5\24\13\5~i\3\2\2\2~l\3\2\2\2~o\3\2\2\2~r\3\2\2\2~u\3\2\2\2"+
		"~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\25\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0085"+
		"\5$\23\2\u0085\27\3\2\2\2\u0086\u0087\7\33\2\2\u0087\u0088\5$\23\2\u0088"+
		"\31\3\2\2\2\u0089\u008a\7\30\2\2\u008a\u008b\5$\23\2\u008b\33\3\2\2\2"+
		"\u008c\u008d\7\32\2\2\u008d\u008e\5$\23\2\u008e\35\3\2\2\2\u008f\u0090"+
		"\7\36\2\2\u0090\u0091\7\27\2\2\u0091\u0092\5&\24\2\u0092\37\3\2\2\2\u0093"+
		"\u0097\5\"\22\2\u0094\u0097\5(\25\2\u0095\u0097\5$\23\2\u0096\u0093\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097!\3\2\2\2\u0098\u0099"+
		"\t\3\2\2\u0099#\3\2\2\2\u009a\u009c\7\7\2\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\27\2\2\u009e\u00a0\5"+
		"&\24\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00a2"+
		"\7+\2\2\u00a2\u00a7\5 \21\2\u00a3\u00a4\7\31\2\2\u00a4\u00a6\5 \21\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab"+
		"\'\3\2\2\2\u00ac\u00ad\7\26\2\2\u00ad)\3\2\2\2\17/>ELV]g~\u0080\u0096"+
		"\u009b\u009f\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}