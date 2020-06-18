// Generated from /home/mostafa/IdeaProjects/antr4grammars/parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
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
		FOR=1, LOGICALVALUE=2, NUMBER=3, CONSTANTNUMBER=4, STRING=5, STRONGNEGATION=6, 
		DEFAULTNEGATION=7, RELATIONALOPERATOR=8, LOGICALOPERATOR1=9, LOGICALOPERATOR2=10, 
		LOGICALOPERATOR3=11, ARITHMETICOPERATOR1=12, ARITHMETICOPERATOR2=13, ARITHMETICOPERATOR3=14, 
		UNARYOPERATOR=15, ANNOTATION=16, ANNOTATION_STRING=17, ANNOTATION_VARIABLEDESCRIPTION=18, 
		ANNOTATION_CONSTANT=19, VARIABLEATOM=20, ATOM=21, REFERENCEATOM=22, EXCLAMATIONMARK=23, 
		COMMA=24, DOUBLEEXCLAMATIONMARK=25, QUESTIONMARK=26, DOLLAR=27, VLINE=28, 
		HASH=29, LEFTARROW=30, RIGHTARROW=31, RIGHTARROWDOUBLE=32, RULEOPERATOR=33, 
		AT=34, COLON=35, SEMICOLON=36, DOT=37, UNDERSCORE=38, SLASH=39, LEFTSHIFT=40, 
		RIGHTSHIFT=41, LEFTROUNDBRACKET=42, RIGHTROUNDBRACKET=43, LEFTANGULARBRACKET=44, 
		RIGHTANGULARBRACKET=45, LEFTCURVEDBRACKET=46, RIGHTCURVEDBRACKET=47, DECONSTRUCT=48, 
		WHITESPACE=49, LINECOMMENT=50, BLOCKCOMMENT=51;
	public static final int
		RULE_belief = 0, RULE_initialgoal = 1, RULE_initialachievegoal = 2, RULE_initialmaintenancegoal = 3, 
		RULE_plan = 4, RULE_plantrigger = 5, RULE_beliefactiontrigger = 6, RULE_plandefinition = 7, 
		RULE_body = 8, RULE_bodyformula = 9, RULE_expression = 10, RULE_beliefaction = 11, 
		RULE_testgoal = 12, RULE_achievementgoal = 13, RULE_maintenancegoal = 14, 
		RULE_primitiveaction = 15, RULE_term = 16, RULE_termvalue = 17, RULE_literal = 18, 
		RULE_termlist = 19, RULE_variable = 20, RULE_for_loop = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"belief", "initialgoal", "initialachievegoal", "initialmaintenancegoal", 
			"plan", "plantrigger", "beliefactiontrigger", "plandefinition", "body", 
			"bodyformula", "expression", "beliefaction", "testgoal", "achievementgoal", 
			"maintenancegoal", "primitiveaction", "term", "termvalue", "literal", 
			"termlist", "variable", "for_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", null, null, null, null, "'~'", "'not'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'!'", "','", "'!!'", "'?'", "'$'", "'|'", "'#'", "'<-'", "'->'", "'=>'", 
			"':-'", "'@'", "':'", "';'", "'.'", "'_'", "'/'", "'<<'", "'>>'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'=..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "LOGICALVALUE", "NUMBER", "CONSTANTNUMBER", "STRING", "STRONGNEGATION", 
			"DEFAULTNEGATION", "RELATIONALOPERATOR", "LOGICALOPERATOR1", "LOGICALOPERATOR2", 
			"LOGICALOPERATOR3", "ARITHMETICOPERATOR1", "ARITHMETICOPERATOR2", "ARITHMETICOPERATOR3", 
			"UNARYOPERATOR", "ANNOTATION", "ANNOTATION_STRING", "ANNOTATION_VARIABLEDESCRIPTION", 
			"ANNOTATION_CONSTANT", "VARIABLEATOM", "ATOM", "REFERENCEATOM", "EXCLAMATIONMARK", 
			"COMMA", "DOUBLEEXCLAMATIONMARK", "QUESTIONMARK", "DOLLAR", "VLINE", 
			"HASH", "LEFTARROW", "RIGHTARROW", "RIGHTARROWDOUBLE", "RULEOPERATOR", 
			"AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "SLASH", "LEFTSHIFT", 
			"RIGHTSHIFT", "LEFTROUNDBRACKET", "RIGHTROUNDBRACKET", "LEFTANGULARBRACKET", 
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
			setState(44);
			literal();
			setState(45);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATIONMARK:
				{
				setState(47);
				achievementgoal();
				}
				break;
			case DOUBLEEXCLAMATIONMARK:
				{
				setState(48);
				maintenancegoal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			setState(53);
			match(EXCLAMATIONMARK);
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
			setState(57);
			match(DOUBLEEXCLAMATIONMARK);
			}
			setState(58);
			literal();
			setState(59);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION) {
				{
				{
				setState(61);
				match(ANNOTATION);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			plantrigger();
			setState(68);
			literal();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(69);
				match(COLON);
				setState(70);
				((PlanContext)_localctx).condition = expression(0);
				}
			}

			setState(73);
			plandefinition();
			setState(74);
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
			setState(76);
			match(ARITHMETICOPERATOR3);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATIONMARK) | (1L << DOUBLEEXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				setState(77);
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

	public static class BeliefactiontriggerContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public List<TerminalNode> ARITHMETICOPERATOR3() { return getTokens(AgentSpeakParser.ARITHMETICOPERATOR3); }
		public TerminalNode ARITHMETICOPERATOR3(int i) {
			return getToken(AgentSpeakParser.ARITHMETICOPERATOR3, i);
		}
		public BeliefactiontriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beliefactiontrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterBeliefactiontrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitBeliefactiontrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitBeliefactiontrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefactiontriggerContext beliefactiontrigger() throws RecognitionException {
		BeliefactiontriggerContext _localctx = new BeliefactiontriggerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_beliefactiontrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((BeliefactiontriggerContext)_localctx).first = match(ARITHMETICOPERATOR3);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETICOPERATOR3) {
				{
				setState(81);
				((BeliefactiontriggerContext)_localctx).second = match(ARITHMETICOPERATOR3);
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
		enterRule(_localctx, 14, RULE_plandefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(RIGHTARROWDOUBLE);
			setState(85);
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
		enterRule(_localctx, 16, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					bodyformula();
					setState(88);
					match(SEMICOLON);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(95);
			bodyformula();
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
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_bodyformula);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				for_loop();
				}
				break;
			case ARITHMETICOPERATOR3:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				beliefaction();
				}
				break;
			case QUESTIONMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				testgoal();
				}
				break;
			case EXCLAMATIONMARK:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				achievementgoal();
				}
				break;
			case REFERENCEATOM:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULTNEGATION:
				{
				setState(105);
				match(DEFAULTNEGATION);
				setState(106);
				((ExpressionContext)_localctx).single = expression(6);
				}
				break;
			case LEFTROUNDBRACKET:
				{
				setState(107);
				match(LEFTROUNDBRACKET);
				setState(108);
				((ExpressionContext)_localctx).single = expression(0);
				setState(109);
				match(RIGHTROUNDBRACKET);
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
			case STRONGNEGATION:
			case VARIABLEATOM:
			case ATOM:
			case REFERENCEATOM:
				{
				setState(111);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR1);
						setState(116);
						((ExpressionContext)_localctx).rhs = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR2);
						setState(119);
						((ExpressionContext)_localctx).rhs = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR3);
						setState(122);
						((ExpressionContext)_localctx).rhs = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						((ExpressionContext)_localctx).binaryoperator = match(RELATIONALOPERATOR);
						setState(125);
						((ExpressionContext)_localctx).rhs = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR1);
						setState(128);
						((ExpressionContext)_localctx).rhs = expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(130);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR2);
						setState(131);
						((ExpressionContext)_localctx).rhs = expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR3);
						setState(134);
						((ExpressionContext)_localctx).rhs = expression(4);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public BeliefactiontriggerContext beliefactiontrigger() {
			return getRuleContext(BeliefactiontriggerContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_beliefaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			beliefactiontrigger();
			setState(141);
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
		enterRule(_localctx, 24, RULE_testgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			match(QUESTIONMARK);
			}
			{
			setState(144);
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
		enterRule(_localctx, 26, RULE_achievementgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			match(EXCLAMATIONMARK);
			}
			{
			setState(147);
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
		enterRule(_localctx, 28, RULE_maintenancegoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149);
			match(DOUBLEEXCLAMATIONMARK);
			}
			{
			setState(150);
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
		public TerminalNode REFERENCEATOM() { return getToken(AgentSpeakParser.REFERENCEATOM, 0); }
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
		enterRule(_localctx, 30, RULE_primitiveaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			match(REFERENCEATOM);
			}
			{
			setState(153);
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
		public PrimitiveactionContext primitiveaction() {
			return getRuleContext(PrimitiveactionContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFERENCEATOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				primitiveaction();
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				termvalue();
				}
				break;
			case VARIABLEATOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				variable();
				}
				break;
			case STRONGNEGATION:
			case ATOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
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
		enterRule(_localctx, 34, RULE_termvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONGNEGATION) {
				{
				setState(163);
				match(STRONGNEGATION);
				}
			}

			setState(166);
			match(ATOM);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(167);
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
		enterRule(_localctx, 38, RULE_termlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LEFTROUNDBRACKET);
			setState(171);
			term();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				term();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AgentSpeakParser.FOR, 0); }
		public TerminalNode LEFTROUNDBRACKET() { return getToken(AgentSpeakParser.LEFTROUNDBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTROUNDBRACKET() { return getToken(AgentSpeakParser.RIGHTROUNDBRACKET, 0); }
		public TerminalNode LEFTCURVEDBRACKET() { return getToken(AgentSpeakParser.LEFTCURVEDBRACKET, 0); }
		public TerminalNode RIGHTCURVEDBRACKET() { return getToken(AgentSpeakParser.RIGHTCURVEDBRACKET, 0); }
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
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FOR);
			setState(184);
			match(LEFTROUNDBRACKET);
			setState(185);
			expression(0);
			setState(186);
			match(RIGHTROUNDBRACKET);
			setState(187);
			match(LEFTCURVEDBRACKET);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << ARITHMETICOPERATOR3) | (1L << REFERENCEATOM) | (1L << EXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				{
				setState(188);
				bodyformula();
				setState(189);
				match(SEMICOLON);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RIGHTCURVEDBRACKET);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00c9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\5\3\64\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\7\6A\n\6\f\6\16"+
		"\6D\13\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\7\3\7\5\7Q\n\7\3\b\3\b"+
		"\5\bU\n\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\5\22\u00a2\n\22\3\23\3\23\3\24\5\24\u00a7\n\24\3\24\3\24\5\24\u00ab"+
		"\n\24\3\25\3\25\3\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00c2\n\27"+
		"\f\27\16\27\u00c5\13\27\3\27\3\27\3\27\2\3\26\30\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,\2\4\4\2\31\31\33\34\4\2\4\5\7\7\2\u00cc\2."+
		"\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b;\3\2\2\2\nB\3\2\2\2\fN\3\2\2\2\16"+
		"R\3\2\2\2\20V\3\2\2\2\22^\3\2\2\2\24h\3\2\2\2\26r\3\2\2\2\30\u008e\3\2"+
		"\2\2\32\u0091\3\2\2\2\34\u0094\3\2\2\2\36\u0097\3\2\2\2 \u009a\3\2\2\2"+
		"\"\u00a1\3\2\2\2$\u00a3\3\2\2\2&\u00a6\3\2\2\2(\u00ac\3\2\2\2*\u00b7\3"+
		"\2\2\2,\u00b9\3\2\2\2./\5&\24\2/\60\7\'\2\2\60\3\3\2\2\2\61\64\5\34\17"+
		"\2\62\64\5\36\20\2\63\61\3\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\66\7\'"+
		"\2\2\66\5\3\2\2\2\678\7\31\2\289\5&\24\29:\7\'\2\2:\7\3\2\2\2;<\7\33\2"+
		"\2<=\5&\24\2=>\7\'\2\2>\t\3\2\2\2?A\7\22\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\5\f\7\2FI\5&\24\2GH\7%\2\2HJ\5\26"+
		"\f\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\20\t\2LM\7\'\2\2M\13\3\2\2\2NP"+
		"\7\20\2\2OQ\t\2\2\2PO\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RT\7\20\2\2SU\7\20\2"+
		"\2TS\3\2\2\2TU\3\2\2\2U\17\3\2\2\2VW\7\"\2\2WX\5\22\n\2X\21\3\2\2\2YZ"+
		"\5\24\13\2Z[\7&\2\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_a\3\2\2\2`^\3\2\2\2ab\5\24\13\2b\23\3\2\2\2ci\5,\27\2di\5\30\r\2ei"+
		"\5\32\16\2fi\5\34\17\2gi\5 \21\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2"+
		"\2hg\3\2\2\2i\25\3\2\2\2jk\b\f\1\2kl\7\t\2\2ls\5\26\f\bmn\7,\2\2no\5\26"+
		"\f\2op\7-\2\2ps\3\2\2\2qs\5\"\22\2rj\3\2\2\2rm\3\2\2\2rq\3\2\2\2s\u008b"+
		"\3\2\2\2tu\f\f\2\2uv\7\16\2\2v\u008a\5\26\f\rwx\f\13\2\2xy\7\17\2\2y\u008a"+
		"\5\26\f\fz{\f\n\2\2{|\7\20\2\2|\u008a\5\26\f\13}~\f\t\2\2~\177\7\n\2\2"+
		"\177\u008a\5\26\f\n\u0080\u0081\f\7\2\2\u0081\u0082\7\13\2\2\u0082\u008a"+
		"\5\26\f\b\u0083\u0084\f\6\2\2\u0084\u0085\7\f\2\2\u0085\u008a\5\26\f\7"+
		"\u0086\u0087\f\5\2\2\u0087\u0088\7\r\2\2\u0088\u008a\5\26\f\6\u0089t\3"+
		"\2\2\2\u0089w\3\2\2\2\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080\3\2\2"+
		"\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\5\16\b\2\u008f\u0090\5&\24\2\u0090\31\3\2\2\2\u0091\u0092\7\34"+
		"\2\2\u0092\u0093\5&\24\2\u0093\33\3\2\2\2\u0094\u0095\7\31\2\2\u0095\u0096"+
		"\5&\24\2\u0096\35\3\2\2\2\u0097\u0098\7\33\2\2\u0098\u0099\5&\24\2\u0099"+
		"\37\3\2\2\2\u009a\u009b\7\30\2\2\u009b\u009c\5(\25\2\u009c!\3\2\2\2\u009d"+
		"\u00a2\5 \21\2\u009e\u00a2\5$\23\2\u009f\u00a2\5*\26\2\u00a0\u00a2\5&"+
		"\24\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2#\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4%\3\2\2\2\u00a5"+
		"\u00a7\7\b\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\7\27\2\2\u00a9\u00ab\5(\25\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\'\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad\u00b2\5\"\22\2"+
		"\u00ae\u00af\7\32\2\2\u00af\u00b1\5\"\22\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6)\3\2\2\2\u00b7\u00b8\7\26\2\2"+
		"\u00b8+\3\2\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\5\26"+
		"\f\2\u00bc\u00bd\7-\2\2\u00bd\u00c3\7\60\2\2\u00be\u00bf\5\24\13\2\u00bf"+
		"\u00c0\7&\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7-\3\2\2\2\21\63BIPT^hr\u0089"+
		"\u008b\u00a1\u00a6\u00aa\u00b2\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}