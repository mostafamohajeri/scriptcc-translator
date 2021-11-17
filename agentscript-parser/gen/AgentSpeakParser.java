// Generated from /home/msotafa/IdeaProjects/antr4grammars/parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
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
		FOR=1, IF=2, ELIF=3, ELSE=4, IN=5, LOGICALVALUE=6, NUMBER=7, CONSTANTNUMBER=8, 
		STRING=9, STRONGNEGATION=10, DEFAULTNEGATION=11, RETURNS=12, OBJECT_REF=13, 
		AS=14, RELATIONALOPERATOR=15, ASSIGNOPERATOR=16, LOGICALOPERATOR1=17, 
		LOGICALOPERATOR2=18, LOGICALOPERATOR3=19, ARITHMETICOPERATOR1=20, ARITHMETICOPERATOR2=21, 
		ARITHMETICOPERATOR3=22, UNARYOPERATOR=23, ANNOTATION=24, ANNOTATION_STRING=25, 
		ANNOTATION_VARIABLEDESCRIPTION=26, ANNOTATION_CONSTANT=27, VARIABLEATOM=28, 
		FUNC_NAME=29, ATOM=30, OBJECT_ATOM=31, EXCLAMATIONMARK=32, COMMA=33, DOUBLEEXCLAMATIONMARK=34, 
		QUESTIONMARK=35, DOLLAR=36, VLINE=37, HASH=38, LEFTARROW=39, RIGHTARROW=40, 
		RIGHTARROWDOUBLE=41, RULEOPERATOR=42, AT=43, COLON=44, SEMICOLON=45, DOT=46, 
		UNDERSCORE=47, LEFTSHIFT=48, RIGHTSHIFT=49, LEFTROUNDBRACKET=50, RIGHTROUNDBRACKET=51, 
		LEFTANGULARBRACKET=52, RIGHTANGULARBRACKET=53, LEFTCURVEDBRACKET=54, RIGHTCURVEDBRACKET=55, 
		DECONSTRUCT=56, WHITESPACE=57, LINECOMMENT=58, BLOCKCOMMENT=59;
	public static final int
		RULE_belief = 0, RULE_initialgoal = 1, RULE_initialachievegoal = 2, RULE_initialmaintenancegoal = 3, 
		RULE_plan = 4, RULE_plantrigger = 5, RULE_beliefactiontrigger = 6, RULE_plandefinition = 7, 
		RULE_body = 8, RULE_bodyformula = 9, RULE_expression = 10, RULE_assignment_statement = 11, 
		RULE_beliefaction = 12, RULE_for_loop = 13, RULE_if_else = 14, RULE_condition_block = 15, 
		RULE_code_block = 16, RULE_testgoal = 17, RULE_achievementgoal = 18, RULE_maintenancegoal = 19, 
		RULE_primitiveaction = 20, RULE_function_call = 21, RULE_term = 22, RULE_termvalue = 23, 
		RULE_literal = 24, RULE_inference = 25, RULE_termlist = 26, RULE_paramlist = 27, 
		RULE_variable = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"belief", "initialgoal", "initialachievegoal", "initialmaintenancegoal", 
			"plan", "plantrigger", "beliefactiontrigger", "plandefinition", "body", 
			"bodyformula", "expression", "assignment_statement", "beliefaction", 
			"for_loop", "if_else", "condition_block", "code_block", "testgoal", "achievementgoal", 
			"maintenancegoal", "primitiveaction", "function_call", "term", "termvalue", 
			"literal", "inference", "termlist", "paramlist", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'if'", "'elif'", "'else'", "'in'", null, null, null, 
			null, "'~'", "'not'", "'returns'", null, "'as'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'!'", "','", "'!!'", "'?'", "'$'", "'|'", "'#'", null, "'->'", 
			"'=>'", "':-'", "'@'", "':'", "';'", "'.'", "'_'", "'<<'", "'>>'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'=..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "IF", "ELIF", "ELSE", "IN", "LOGICALVALUE", "NUMBER", "CONSTANTNUMBER", 
			"STRING", "STRONGNEGATION", "DEFAULTNEGATION", "RETURNS", "OBJECT_REF", 
			"AS", "RELATIONALOPERATOR", "ASSIGNOPERATOR", "LOGICALOPERATOR1", "LOGICALOPERATOR2", 
			"LOGICALOPERATOR3", "ARITHMETICOPERATOR1", "ARITHMETICOPERATOR2", "ARITHMETICOPERATOR3", 
			"UNARYOPERATOR", "ANNOTATION", "ANNOTATION_STRING", "ANNOTATION_VARIABLEDESCRIPTION", 
			"ANNOTATION_CONSTANT", "VARIABLEATOM", "FUNC_NAME", "ATOM", "OBJECT_ATOM", 
			"EXCLAMATIONMARK", "COMMA", "DOUBLEEXCLAMATIONMARK", "QUESTIONMARK", 
			"DOLLAR", "VLINE", "HASH", "LEFTARROW", "RIGHTARROW", "RIGHTARROWDOUBLE", 
			"RULEOPERATOR", "AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "LEFTSHIFT", 
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
		public InferenceContext inference() {
			return getRuleContext(InferenceContext.class,0);
		}
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				literal();
				setState(59);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				inference();
				setState(62);
				match(DOT);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATIONMARK:
				{
				setState(66);
				achievementgoal();
				}
				break;
			case DOUBLEEXCLAMATIONMARK:
				{
				setState(67);
				maintenancegoal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			setState(72);
			match(EXCLAMATIONMARK);
			}
			setState(73);
			literal();
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
			setState(76);
			match(DOUBLEEXCLAMATIONMARK);
			}
			setState(77);
			literal();
			setState(78);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION) {
				{
				{
				setState(80);
				match(ANNOTATION);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			plantrigger();
			setState(87);
			literal();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(88);
				match(COLON);
				setState(89);
				((PlanContext)_localctx).condition = expression(0);
				}
			}

			setState(92);
			plandefinition();
			setState(93);
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
			setState(95);
			match(ARITHMETICOPERATOR3);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATIONMARK) | (1L << DOUBLEEXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				setState(96);
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
			setState(99);
			((BeliefactiontriggerContext)_localctx).first = match(ARITHMETICOPERATOR3);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETICOPERATOR3) {
				{
				setState(100);
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
			setState(103);
			match(RIGHTARROWDOUBLE);
			setState(104);
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
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					bodyformula();
					setState(107);
					match(SEMICOLON);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(114);
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
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
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
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				for_loop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				if_else();
				}
				break;
			case ARITHMETICOPERATOR3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				beliefaction();
				}
				break;
			case QUESTIONMARK:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				testgoal();
				}
				break;
			case EXCLAMATIONMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				achievementgoal();
				}
				break;
			case OBJECT_ATOM:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				primitiveaction();
				}
				break;
			case VARIABLEATOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				assignment_statement();
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
		public TerminalNode AS() { return getToken(AgentSpeakParser.AS, 0); }
		public TerminalNode ARITHMETICOPERATOR1() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR1, 0); }
		public TerminalNode ARITHMETICOPERATOR2() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR2, 0); }
		public TerminalNode ARITHMETICOPERATOR3() { return getToken(AgentSpeakParser.ARITHMETICOPERATOR3, 0); }
		public TerminalNode ASSIGNOPERATOR() { return getToken(AgentSpeakParser.ASSIGNOPERATOR, 0); }
		public TerminalNode RELATIONALOPERATOR() { return getToken(AgentSpeakParser.RELATIONALOPERATOR, 0); }
		public TerminalNode OBJECT_REF() { return getToken(AgentSpeakParser.OBJECT_REF, 0); }
		public TerminalNode RETURNS() { return getToken(AgentSpeakParser.RETURNS, 0); }
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULTNEGATION:
				{
				setState(126);
				match(DEFAULTNEGATION);
				setState(127);
				((ExpressionContext)_localctx).single = expression(6);
				}
				break;
			case LEFTROUNDBRACKET:
				{
				setState(128);
				match(LEFTROUNDBRACKET);
				setState(129);
				((ExpressionContext)_localctx).single = expression(0);
				setState(130);
				match(RIGHTROUNDBRACKET);
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
			case STRONGNEGATION:
			case VARIABLEATOM:
			case ATOM:
			case OBJECT_ATOM:
				{
				setState(132);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(136);
						((ExpressionContext)_localctx).binaryoperator = match(AS);
						setState(137);
						((ExpressionContext)_localctx).rhs = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(139);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR1);
						setState(140);
						((ExpressionContext)_localctx).rhs = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(142);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR2);
						setState(143);
						((ExpressionContext)_localctx).rhs = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(145);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR3);
						setState(146);
						((ExpressionContext)_localctx).rhs = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(148);
						((ExpressionContext)_localctx).binaryoperator = match(ASSIGNOPERATOR);
						setState(149);
						((ExpressionContext)_localctx).rhs = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						((ExpressionContext)_localctx).binaryoperator = match(RELATIONALOPERATOR);
						setState(152);
						((ExpressionContext)_localctx).rhs = expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154);
						((ExpressionContext)_localctx).binaryoperator = match(OBJECT_REF);
						setState(155);
						((ExpressionContext)_localctx).rhs = expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(157);
						((ExpressionContext)_localctx).binaryoperator = match(RETURNS);
						setState(158);
						((ExpressionContext)_localctx).rhs = expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR1);
						setState(161);
						((ExpressionContext)_localctx).rhs = expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR2);
						setState(164);
						((ExpressionContext)_localctx).rhs = expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR3);
						setState(167);
						((ExpressionContext)_localctx).rhs = expression(4);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNOPERATOR() { return getToken(AgentSpeakParser.ASSIGNOPERATOR, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			variable();
			{
			setState(174);
			match(ASSIGNOPERATOR);
			}
			setState(175);
			expression(0);
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
		enterRule(_localctx, 24, RULE_beliefaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			beliefactiontrigger();
			setState(178);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AgentSpeakParser.FOR, 0); }
		public TerminalNode LEFTROUNDBRACKET() { return getToken(AgentSpeakParser.LEFTROUNDBRACKET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(AgentSpeakParser.IN, 0); }
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
		enterRule(_localctx, 26, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FOR);
			setState(181);
			match(LEFTROUNDBRACKET);
			setState(182);
			variable();
			setState(183);
			match(IN);
			setState(184);
			expression(0);
			setState(185);
			match(RIGHTROUNDBRACKET);
			setState(186);
			match(LEFTCURVEDBRACKET);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ARITHMETICOPERATOR3) | (1L << VARIABLEATOM) | (1L << OBJECT_ATOM) | (1L << EXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				{
				setState(187);
				bodyformula();
				setState(188);
				match(SEMICOLON);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
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

	public static class If_elseContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(AgentSpeakParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(AgentSpeakParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AgentSpeakParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AgentSpeakParser.ELSE, i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_else);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			condition_block();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(ELSE);
					setState(200);
					match(IF);
					setState(201);
					condition_block();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(207);
				match(ELSE);
				setState(208);
				code_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode LEFTROUNDBRACKET() { return getToken(AgentSpeakParser.LEFTROUNDBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTROUNDBRACKET() { return getToken(AgentSpeakParser.RIGHTROUNDBRACKET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LEFTROUNDBRACKET);
			setState(212);
			expression(0);
			setState(213);
			match(RIGHTROUNDBRACKET);
			setState(214);
			code_block();
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

	public static class Code_blockContext extends ParserRuleContext {
		public BodyformulaContext single;
		public List<TerminalNode> SEMICOLON() { return getTokens(AgentSpeakParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AgentSpeakParser.SEMICOLON, i);
		}
		public List<BodyformulaContext> bodyformula() {
			return getRuleContexts(BodyformulaContext.class);
		}
		public BodyformulaContext bodyformula(int i) {
			return getRuleContext(BodyformulaContext.class,i);
		}
		public TerminalNode LEFTCURVEDBRACKET() { return getToken(AgentSpeakParser.LEFTCURVEDBRACKET, 0); }
		public TerminalNode RIGHTCURVEDBRACKET() { return getToken(AgentSpeakParser.RIGHTCURVEDBRACKET, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTCURVEDBRACKET:
				{
				{
				setState(216);
				match(LEFTCURVEDBRACKET);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ARITHMETICOPERATOR3) | (1L << VARIABLEATOM) | (1L << OBJECT_ATOM) | (1L << EXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
					{
					{
					setState(217);
					bodyformula();
					setState(218);
					match(SEMICOLON);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(RIGHTCURVEDBRACKET);
				}
				}
				break;
			case FOR:
			case IF:
			case ARITHMETICOPERATOR3:
			case VARIABLEATOM:
			case OBJECT_ATOM:
			case EXCLAMATIONMARK:
			case QUESTIONMARK:
				{
				setState(226);
				((Code_blockContext)_localctx).single = bodyformula();
				setState(227);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 34, RULE_testgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			match(QUESTIONMARK);
			}
			{
			setState(232);
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
		public TerminalNode ATOM() { return getToken(AgentSpeakParser.ATOM, 0); }
		public TerminalNode STRONGNEGATION() { return getToken(AgentSpeakParser.STRONGNEGATION, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
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
		enterRule(_localctx, 36, RULE_achievementgoal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			match(EXCLAMATIONMARK);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONGNEGATION) {
				{
				setState(235);
				match(STRONGNEGATION);
				}
			}

			{
			setState(238);
			match(ATOM);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTROUNDBRACKET) {
				{
				setState(239);
				paramlist();
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
		enterRule(_localctx, 38, RULE_maintenancegoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			match(DOUBLEEXCLAMATIONMARK);
			}
			{
			setState(243);
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
		public TerminalNode OBJECT_ATOM() { return getToken(AgentSpeakParser.OBJECT_ATOM, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
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
		enterRule(_localctx, 40, RULE_primitiveaction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(OBJECT_ATOM);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(246);
				paramlist();
				}
				break;
			}
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					function_call();
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode FUNC_NAME() { return getToken(AgentSpeakParser.FUNC_NAME, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(FUNC_NAME);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(256);
				paramlist();
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
		enterRule(_localctx, 44, RULE_term);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_ATOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				primitiveaction();
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				termvalue();
				}
				break;
			case VARIABLEATOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				variable();
				}
				break;
			case STRONGNEGATION:
			case ATOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
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
		enterRule(_localctx, 46, RULE_termvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
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
		enterRule(_localctx, 48, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONGNEGATION) {
				{
				setState(267);
				match(STRONGNEGATION);
				}
			}

			setState(270);
			match(ATOM);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(271);
				paramlist();
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

	public static class InferenceContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RULEOPERATOR() { return getToken(AgentSpeakParser.RULEOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterInference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitInference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitInference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferenceContext inference() throws RecognitionException {
		InferenceContext _localctx = new InferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			literal();
			setState(275);
			match(RULEOPERATOR);
			setState(276);
			expression(0);
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
		enterRule(_localctx, 52, RULE_termlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LEFTROUNDBRACKET);
			setState(279);
			term();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				term();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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

	public static class ParamlistContext extends ParserRuleContext {
		public TerminalNode LEFTROUNDBRACKET() { return getToken(AgentSpeakParser.LEFTROUNDBRACKET, 0); }
		public TerminalNode RIGHTROUNDBRACKET() { return getToken(AgentSpeakParser.RIGHTROUNDBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AgentSpeakParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AgentSpeakParser.COMMA, i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LEFTROUNDBRACKET);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICALVALUE) | (1L << NUMBER) | (1L << STRING) | (1L << STRONGNEGATION) | (1L << DEFAULTNEGATION) | (1L << VARIABLEATOM) | (1L << ATOM) | (1L << OBJECT_ATOM) | (1L << LEFTROUNDBRACKET))) != 0)) {
				{
				setState(290);
				expression(0);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(291);
					match(COMMA);
					setState(292);
					expression(0);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(300);
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
		enterRule(_localctx, 56, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2C\n\2\3\3\3\3\5\3G\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\7"+
		"\3\7\5\7d\n\7\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\n\3\n\3\n\7\np\n\n\f\n\16"+
		"\ns\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00cd\n\20\f\20\16\20\u00d0\13\20\3\20\3\20\5\20\u00d4"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00df\n\22\f\22"+
		"\16\22\u00e2\13\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22\3\23\3\23\3\23"+
		"\3\24\3\24\5\24\u00ef\n\24\3\24\3\24\5\24\u00f3\n\24\3\25\3\25\3\25\3"+
		"\26\3\26\5\26\u00fa\n\26\3\26\7\26\u00fd\n\26\f\26\16\26\u0100\13\26\3"+
		"\27\3\27\5\27\u0104\n\27\3\30\3\30\3\30\3\30\5\30\u010a\n\30\3\31\3\31"+
		"\3\32\5\32\u010f\n\32\3\32\3\32\5\32\u0113\n\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\7\34\u011d\n\34\f\34\16\34\u0120\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\7\35\u0128\n\35\f\35\16\35\u012b\13\35\5\35\u012d\n"+
		"\35\3\35\3\35\3\36\3\36\3\36\2\3\26\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\4\4\2\"\"$%\4\2\b\t\13\13\2\u0141\2B\3"+
		"\2\2\2\4F\3\2\2\2\6J\3\2\2\2\bN\3\2\2\2\nU\3\2\2\2\fa\3\2\2\2\16e\3\2"+
		"\2\2\20i\3\2\2\2\22q\3\2\2\2\24}\3\2\2\2\26\u0087\3\2\2\2\30\u00af\3\2"+
		"\2\2\32\u00b3\3\2\2\2\34\u00b6\3\2\2\2\36\u00c7\3\2\2\2 \u00d5\3\2\2\2"+
		"\"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00ec\3\2\2\2(\u00f4\3\2\2\2*\u00f7\3"+
		"\2\2\2,\u0101\3\2\2\2.\u0109\3\2\2\2\60\u010b\3\2\2\2\62\u010e\3\2\2\2"+
		"\64\u0114\3\2\2\2\66\u0118\3\2\2\28\u0123\3\2\2\2:\u0130\3\2\2\2<=\5\62"+
		"\32\2=>\7\60\2\2>C\3\2\2\2?@\5\64\33\2@A\7\60\2\2AC\3\2\2\2B<\3\2\2\2"+
		"B?\3\2\2\2C\3\3\2\2\2DG\5&\24\2EG\5(\25\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2"+
		"\2HI\7\60\2\2I\5\3\2\2\2JK\7\"\2\2KL\5\62\32\2LM\7\60\2\2M\7\3\2\2\2N"+
		"O\7$\2\2OP\5\62\32\2PQ\7\60\2\2Q\t\3\2\2\2RT\7\32\2\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\f\7\2Y\\\5\62\32\2Z["+
		"\7.\2\2[]\5\26\f\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\5\20\t\2_`\7\60\2"+
		"\2`\13\3\2\2\2ac\7\30\2\2bd\t\2\2\2cb\3\2\2\2cd\3\2\2\2d\r\3\2\2\2eg\7"+
		"\30\2\2fh\7\30\2\2gf\3\2\2\2gh\3\2\2\2h\17\3\2\2\2ij\7+\2\2jk\5\22\n\2"+
		"k\21\3\2\2\2lm\5\24\13\2mn\7/\2\2np\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\5\24\13\2u\23\3\2\2\2v~\5\34\17\2"+
		"w~\5\36\20\2x~\5\32\16\2y~\5$\23\2z~\5&\24\2{~\5*\26\2|~\5\30\r\2}v\3"+
		"\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\25"+
		"\3\2\2\2\177\u0080\b\f\1\2\u0080\u0081\7\r\2\2\u0081\u0088\5\26\f\b\u0082"+
		"\u0083\7\64\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\65\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0088\5.\30\2\u0087\177\3\2\2\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u00ac\3\2\2\2\u0089\u008a\f\20\2\2\u008a\u008b\7"+
		"\20\2\2\u008b\u00ab\5\26\f\21\u008c\u008d\f\17\2\2\u008d\u008e\7\26\2"+
		"\2\u008e\u00ab\5\26\f\20\u008f\u0090\f\16\2\2\u0090\u0091\7\27\2\2\u0091"+
		"\u00ab\5\26\f\17\u0092\u0093\f\r\2\2\u0093\u0094\7\30\2\2\u0094\u00ab"+
		"\5\26\f\16\u0095\u0096\f\f\2\2\u0096\u0097\7\22\2\2\u0097\u00ab\5\26\f"+
		"\r\u0098\u0099\f\13\2\2\u0099\u009a\7\21\2\2\u009a\u00ab\5\26\f\f\u009b"+
		"\u009c\f\n\2\2\u009c\u009d\7\17\2\2\u009d\u00ab\5\26\f\13\u009e\u009f"+
		"\f\t\2\2\u009f\u00a0\7\16\2\2\u00a0\u00ab\5\26\f\n\u00a1\u00a2\f\7\2\2"+
		"\u00a2\u00a3\7\23\2\2\u00a3\u00ab\5\26\f\b\u00a4\u00a5\f\6\2\2\u00a5\u00a6"+
		"\7\24\2\2\u00a6\u00ab\5\26\f\7\u00a7\u00a8\f\5\2\2\u00a8\u00a9\7\25\2"+
		"\2\u00a9\u00ab\5\26\f\6\u00aa\u0089\3\2\2\2\u00aa\u008c\3\2\2\2\u00aa"+
		"\u008f\3\2\2\2\u00aa\u0092\3\2\2\2\u00aa\u0095\3\2\2\2\u00aa\u0098\3\2"+
		"\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0"+
		"\5:\36\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\5\26\f\2\u00b2\31\3\2\2\2\u00b3"+
		"\u00b4\5\16\b\2\u00b4\u00b5\5\62\32\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\3"+
		"\2\2\u00b7\u00b8\7\64\2\2\u00b8\u00b9\5:\36\2\u00b9\u00ba\7\7\2\2\u00ba"+
		"\u00bb\5\26\f\2\u00bb\u00bc\7\65\2\2\u00bc\u00c2\78\2\2\u00bd\u00be\5"+
		"\24\13\2\u00be\u00bf\7/\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\79\2\2\u00c6\35\3\2\2\2\u00c7\u00c8"+
		"\7\4\2\2\u00c8\u00ce\5 \21\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\7\4\2\2\u00cb"+
		"\u00cd\5 \21\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7\6\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7\64\2\2\u00d6\u00d7\5\26\f\2\u00d7"+
		"\u00d8\7\65\2\2\u00d8\u00d9\5\"\22\2\u00d9!\3\2\2\2\u00da\u00e0\78\2\2"+
		"\u00db\u00dc\5\24\13\2\u00dc\u00dd\7/\2\2\u00dd\u00df\3\2\2\2\u00de\u00db"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e8\79\2\2\u00e4\u00e5\5\24"+
		"\13\2\u00e5\u00e6\7/\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\5\62\32\2"+
		"\u00eb%\3\2\2\2\u00ec\u00ee\7\"\2\2\u00ed\u00ef\7\f\2\2\u00ee\u00ed\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7 \2\2\u00f1"+
		"\u00f3\58\35\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\'\3\2\2\2"+
		"\u00f4\u00f5\7$\2\2\u00f5\u00f6\5\62\32\2\u00f6)\3\2\2\2\u00f7\u00f9\7"+
		"!\2\2\u00f8\u00fa\58\35\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fe\3\2\2\2\u00fb\u00fd\5,\27\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff+\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0103\7\37\2\2\u0102\u0104\58\35\2\u0103\u0102\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104-\3\2\2\2\u0105\u010a\5*\26\2\u0106\u010a\5"+
		"\60\31\2\u0107\u010a\5:\36\2\u0108\u010a\5\62\32\2\u0109\u0105\3\2\2\2"+
		"\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a/\3"+
		"\2\2\2\u010b\u010c\t\3\2\2\u010c\61\3\2\2\2\u010d\u010f\7\f\2\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7 "+
		"\2\2\u0111\u0113\58\35\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\63\3\2\2\2\u0114\u0115\5\62\32\2\u0115\u0116\7,\2\2\u0116\u0117\5\26"+
		"\f\2\u0117\65\3\2\2\2\u0118\u0119\7\64\2\2\u0119\u011e\5.\30\2\u011a\u011b"+
		"\7#\2\2\u011b\u011d\5.\30\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\7\65\2\2\u0122\67\3\2\2\2\u0123\u012c\7\64\2\2\u0124"+
		"\u0129\5\26\f\2\u0125\u0126\7#\2\2\u0126\u0128\5\26\f\2\u0127\u0125\3"+
		"\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\65\2\2\u012f9\3\2\2\2\u0130\u0131"+
		"\7\36\2\2\u0131;\3\2\2\2\35BFU\\cgq}\u0087\u00aa\u00ac\u00c2\u00ce\u00d3"+
		"\u00e0\u00e7\u00ee\u00f2\u00f9\u00fe\u0103\u0109\u010e\u0112\u011e\u0129"+
		"\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}