// Generated from /home/msotafa/IdeaProjects/antr4grammars/agentscript-parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
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
		UNDERSCORE=47, LEFTROUNDBRACKET=48, RIGHTROUNDBRACKET=49, LEFTANGULARBRACKET=50, 
		RIGHTANGULARBRACKET=51, LEFTCURVEDBRACKET=52, RIGHTCURVEDBRACKET=53, DECONSTRUCT=54, 
		WHITESPACE=55, LINECOMMENT=56, BLOCKCOMMENT=57;
	public static final int
		RULE_belief = 0, RULE_initialgoal = 1, RULE_initialachievegoal = 2, RULE_initialmaintenancegoal = 3, 
		RULE_planhead = 4, RULE_plan = 5, RULE_plantrigger = 6, RULE_beliefactiontrigger = 7, 
		RULE_plandefinition = 8, RULE_body = 9, RULE_bodyformula = 10, RULE_expression = 11, 
		RULE_assignment_statement = 12, RULE_beliefaction = 13, RULE_for_loop = 14, 
		RULE_if_else = 15, RULE_condition_block = 16, RULE_code_block = 17, RULE_testgoal = 18, 
		RULE_achievementgoal = 19, RULE_maintenancegoal = 20, RULE_primitiveaction = 21, 
		RULE_function_call = 22, RULE_term = 23, RULE_termvalue = 24, RULE_literal = 25, 
		RULE_termlist = 26, RULE_paramlist = 27, RULE_variable = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"belief", "initialgoal", "initialachievegoal", "initialmaintenancegoal", 
			"planhead", "plan", "plantrigger", "beliefactiontrigger", "plandefinition", 
			"body", "bodyformula", "expression", "assignment_statement", "beliefaction", 
			"for_loop", "if_else", "condition_block", "code_block", "testgoal", "achievementgoal", 
			"maintenancegoal", "primitiveaction", "function_call", "term", "termvalue", 
			"literal", "termlist", "paramlist", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'if'", "'elif'", "'else'", "'in'", null, null, null, 
			null, "'~'", "'not'", "'returns'", null, "'as'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'!'", "','", "'!!'", "'?'", "'$'", "'|'", "'#'", null, "'->'", 
			"'=>'", "':-'", "'@'", "':'", "';'", "'.'", "'_'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'=..'"
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
			"RULEOPERATOR", "AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "LEFTROUNDBRACKET", 
			"RIGHTROUNDBRACKET", "LEFTANGULARBRACKET", "RIGHTANGULARBRACKET", "LEFTCURVEDBRACKET", 
			"RIGHTCURVEDBRACKET", "DECONSTRUCT", "WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT"
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(58);
			expression(0);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATIONMARK:
				{
				setState(61);
				achievementgoal();
				}
				break;
			case DOUBLEEXCLAMATIONMARK:
				{
				setState(62);
				maintenancegoal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
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
			setState(67);
			match(EXCLAMATIONMARK);
			}
			setState(68);
			literal();
			setState(69);
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
			setState(71);
			match(DOUBLEEXCLAMATIONMARK);
			}
			setState(72);
			literal();
			setState(73);
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

	public static class PlanheadContext extends ParserRuleContext {
		public PlantriggerContext plantrigger() {
			return getRuleContext(PlantriggerContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PlanheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).enterPlanhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AgentSpeakListener ) ((AgentSpeakListener)listener).exitPlanhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AgentSpeakVisitor ) return ((AgentSpeakVisitor<? extends T>)visitor).visitPlanhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanheadContext planhead() throws RecognitionException {
		PlanheadContext _localctx = new PlanheadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_planhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			plantrigger();
			setState(76);
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
		enterRule(_localctx, 10, RULE_plan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION) {
				{
				{
				setState(78);
				match(ANNOTATION);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			plantrigger();
			setState(85);
			literal();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(86);
				match(COLON);
				setState(87);
				((PlanContext)_localctx).condition = expression(0);
				}
			}

			setState(90);
			plandefinition();
			setState(91);
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
		enterRule(_localctx, 12, RULE_plantrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			match(ARITHMETICOPERATOR3);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATIONMARK) | (1L << DOUBLEEXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				setState(94);
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
		enterRule(_localctx, 14, RULE_beliefactiontrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((BeliefactiontriggerContext)_localctx).first = match(ARITHMETICOPERATOR3);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETICOPERATOR3) {
				{
				setState(98);
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
		enterRule(_localctx, 16, RULE_plandefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(RIGHTARROWDOUBLE);
			setState(102);
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
		enterRule(_localctx, 18, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					bodyformula();
					setState(105);
					match(SEMICOLON);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(112);
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
		enterRule(_localctx, 20, RULE_bodyformula);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				for_loop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				if_else();
				}
				break;
			case ARITHMETICOPERATOR3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				beliefaction();
				}
				break;
			case QUESTIONMARK:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				testgoal();
				}
				break;
			case EXCLAMATIONMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				achievementgoal();
				}
				break;
			case OBJECT_ATOM:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				primitiveaction();
				}
				break;
			case VARIABLEATOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
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
		public TerminalNode RIGHTARROW() { return getToken(AgentSpeakParser.RIGHTARROW, 0); }
		public TerminalNode LOGICALOPERATOR3() { return getToken(AgentSpeakParser.LOGICALOPERATOR3, 0); }
		public TerminalNode RULEOPERATOR() { return getToken(AgentSpeakParser.RULEOPERATOR, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULTNEGATION:
				{
				setState(124);
				match(DEFAULTNEGATION);
				setState(125);
				((ExpressionContext)_localctx).single = expression(8);
				}
				break;
			case LEFTROUNDBRACKET:
				{
				setState(126);
				match(LEFTROUNDBRACKET);
				setState(127);
				((ExpressionContext)_localctx).single = expression(0);
				setState(128);
				match(RIGHTROUNDBRACKET);
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
			case STRONGNEGATION:
			case ARITHMETICOPERATOR3:
			case VARIABLEATOM:
			case ATOM:
			case OBJECT_ATOM:
				{
				setState(130);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(134);
						((ExpressionContext)_localctx).binaryoperator = match(AS);
						setState(135);
						((ExpressionContext)_localctx).rhs = expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(137);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR1);
						setState(138);
						((ExpressionContext)_localctx).rhs = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(140);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR2);
						setState(141);
						((ExpressionContext)_localctx).rhs = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(143);
						((ExpressionContext)_localctx).binaryoperator = match(ARITHMETICOPERATOR3);
						setState(144);
						((ExpressionContext)_localctx).rhs = expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(146);
						((ExpressionContext)_localctx).binaryoperator = match(ASSIGNOPERATOR);
						setState(147);
						((ExpressionContext)_localctx).rhs = expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(149);
						((ExpressionContext)_localctx).binaryoperator = match(RELATIONALOPERATOR);
						setState(150);
						((ExpressionContext)_localctx).rhs = expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(152);
						((ExpressionContext)_localctx).binaryoperator = match(OBJECT_REF);
						setState(153);
						((ExpressionContext)_localctx).rhs = expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(155);
						((ExpressionContext)_localctx).binaryoperator = match(RETURNS);
						setState(156);
						((ExpressionContext)_localctx).rhs = expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR1);
						setState(159);
						((ExpressionContext)_localctx).rhs = expression(8);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(161);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR2);
						setState(162);
						((ExpressionContext)_localctx).rhs = expression(7);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(164);
						((ExpressionContext)_localctx).binaryoperator = match(RIGHTARROW);
						setState(165);
						((ExpressionContext)_localctx).rhs = expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						((ExpressionContext)_localctx).binaryoperator = match(LOGICALOPERATOR3);
						setState(168);
						((ExpressionContext)_localctx).rhs = expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						((ExpressionContext)_localctx).binaryoperator = match(RULEOPERATOR);
						setState(171);
						((ExpressionContext)_localctx).rhs = expression(4);
						}
						break;
					}
					} 
				}
				setState(176);
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
		enterRule(_localctx, 24, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			variable();
			{
			setState(178);
			match(ASSIGNOPERATOR);
			}
			setState(179);
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
		enterRule(_localctx, 26, RULE_beliefaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			beliefactiontrigger();
			setState(182);
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
		enterRule(_localctx, 28, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FOR);
			setState(185);
			match(LEFTROUNDBRACKET);
			setState(186);
			variable();
			setState(187);
			match(IN);
			setState(188);
			expression(0);
			setState(189);
			match(RIGHTROUNDBRACKET);
			setState(190);
			match(LEFTCURVEDBRACKET);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ARITHMETICOPERATOR3) | (1L << VARIABLEATOM) | (1L << OBJECT_ATOM) | (1L << EXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
				{
				{
				setState(191);
				bodyformula();
				setState(192);
				match(SEMICOLON);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
		enterRule(_localctx, 30, RULE_if_else);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IF);
			setState(202);
			condition_block();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(ELSE);
					setState(204);
					match(IF);
					setState(205);
					condition_block();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(211);
				match(ELSE);
				setState(212);
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
		enterRule(_localctx, 32, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LEFTROUNDBRACKET);
			setState(216);
			expression(0);
			setState(217);
			match(RIGHTROUNDBRACKET);
			setState(218);
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
		enterRule(_localctx, 34, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTCURVEDBRACKET:
				{
				{
				setState(220);
				match(LEFTCURVEDBRACKET);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << ARITHMETICOPERATOR3) | (1L << VARIABLEATOM) | (1L << OBJECT_ATOM) | (1L << EXCLAMATIONMARK) | (1L << QUESTIONMARK))) != 0)) {
					{
					{
					setState(221);
					bodyformula();
					setState(222);
					match(SEMICOLON);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
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
				setState(230);
				((Code_blockContext)_localctx).single = bodyformula();
				setState(231);
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
		enterRule(_localctx, 36, RULE_testgoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			match(QUESTIONMARK);
			}
			{
			setState(236);
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
		enterRule(_localctx, 38, RULE_achievementgoal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			match(EXCLAMATIONMARK);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONGNEGATION) {
				{
				setState(239);
				match(STRONGNEGATION);
				}
			}

			{
			setState(242);
			match(ATOM);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTROUNDBRACKET) {
				{
				setState(243);
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
		enterRule(_localctx, 40, RULE_maintenancegoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			match(DOUBLEEXCLAMATIONMARK);
			}
			{
			setState(247);
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
		enterRule(_localctx, 42, RULE_primitiveaction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(OBJECT_ATOM);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(250);
				paramlist();
				}
				break;
			}
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					function_call();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 44, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(FUNC_NAME);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(260);
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
		public PlanheadContext planhead() {
			return getRuleContext(PlanheadContext.class,0);
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
		enterRule(_localctx, 46, RULE_term);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_ATOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				primitiveaction();
				}
				break;
			case LOGICALVALUE:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				termvalue();
				}
				break;
			case VARIABLEATOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				variable();
				}
				break;
			case STRONGNEGATION:
			case ATOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				literal();
				}
				break;
			case ARITHMETICOPERATOR3:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				planhead();
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
		enterRule(_localctx, 48, RULE_termvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONGNEGATION) {
				{
				setState(272);
				match(STRONGNEGATION);
				}
			}

			setState(275);
			match(ATOM);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(276);
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
			setState(279);
			match(LEFTROUNDBRACKET);
			setState(280);
			term();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				term();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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
			setState(290);
			match(LEFTROUNDBRACKET);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICALVALUE) | (1L << NUMBER) | (1L << STRING) | (1L << STRONGNEGATION) | (1L << DEFAULTNEGATION) | (1L << ARITHMETICOPERATOR3) | (1L << VARIABLEATOM) | (1L << ATOM) | (1L << OBJECT_ATOM) | (1L << LEFTROUNDBRACKET))) != 0)) {
				{
				setState(291);
				expression(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(292);
					match(COMMA);
					setState(293);
					expression(0);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(301);
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
			setState(303);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\5\3B\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7"+
		"R\n\7\f\7\16\7U\13\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\7\3\b\3\b\5\b"+
		"b\n\b\3\t\3\t\5\tf\n\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13n\n\13\f\13\16\13"+
		"q\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0086\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00af\n\r\f\r\16\r"+
		"\u00b2\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21"+
		"\3\21\3\21\5\21\u00d8\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u00e3\n\23\f\23\16\23\u00e6\13\23\3\23\3\23\3\23\3\23\5\23\u00ec"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u00f3\n\25\3\25\3\25\5\25\u00f7\n"+
		"\25\3\26\3\26\3\26\3\27\3\27\5\27\u00fe\n\27\3\27\7\27\u0101\n\27\f\27"+
		"\16\27\u0104\13\27\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u010f\n\31\3\32\3\32\3\33\5\33\u0114\n\33\3\33\3\33\5\33\u0118\n"+
		"\33\3\34\3\34\3\34\3\34\7\34\u011e\n\34\f\34\16\34\u0121\13\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\7\35\u0129\n\35\f\35\16\35\u012c\13\35\5\35\u012e"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\2\3\30\37\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:\2\4\4\2\"\"$%\4\2\b\t\13\13\2\u0144\2"+
		"<\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fS\3\2\2\2\16_\3"+
		"\2\2\2\20c\3\2\2\2\22g\3\2\2\2\24o\3\2\2\2\26{\3\2\2\2\30\u0085\3\2\2"+
		"\2\32\u00b3\3\2\2\2\34\u00b7\3\2\2\2\36\u00ba\3\2\2\2 \u00cb\3\2\2\2\""+
		"\u00d9\3\2\2\2$\u00eb\3\2\2\2&\u00ed\3\2\2\2(\u00f0\3\2\2\2*\u00f8\3\2"+
		"\2\2,\u00fb\3\2\2\2.\u0105\3\2\2\2\60\u010e\3\2\2\2\62\u0110\3\2\2\2\64"+
		"\u0113\3\2\2\2\66\u0119\3\2\2\28\u0124\3\2\2\2:\u0131\3\2\2\2<=\5\30\r"+
		"\2=>\7\60\2\2>\3\3\2\2\2?B\5(\25\2@B\5*\26\2A?\3\2\2\2A@\3\2\2\2BC\3\2"+
		"\2\2CD\7\60\2\2D\5\3\2\2\2EF\7\"\2\2FG\5\64\33\2GH\7\60\2\2H\7\3\2\2\2"+
		"IJ\7$\2\2JK\5\64\33\2KL\7\60\2\2L\t\3\2\2\2MN\5\16\b\2NO\5\64\33\2O\13"+
		"\3\2\2\2PR\7\32\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2"+
		"US\3\2\2\2VW\5\16\b\2WZ\5\64\33\2XY\7.\2\2Y[\5\30\r\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\\\3\2\2\2\\]\5\22\n\2]^\7\60\2\2^\r\3\2\2\2_a\7\30\2\2`b\t\2\2\2"+
		"a`\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ce\7\30\2\2df\7\30\2\2ed\3\2\2\2ef\3\2"+
		"\2\2f\21\3\2\2\2gh\7+\2\2hi\5\24\13\2i\23\3\2\2\2jk\5\26\f\2kl\7/\2\2"+
		"ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\5\26\f\2s\25\3\2\2\2t|\5\36\20\2u|\5 \21\2v|\5\34\17\2w|\5&\24\2x|"+
		"\5(\25\2y|\5,\27\2z|\5\32\16\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2"+
		"{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\27\3\2\2\2}~\b\r\1\2~\177\7\r\2\2\177"+
		"\u0086\5\30\r\n\u0080\u0081\7\62\2\2\u0081\u0082\5\30\r\2\u0082\u0083"+
		"\7\63\2\2\u0083\u0086\3\2\2\2\u0084\u0086\5\60\31\2\u0085}\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u00b0\3\2\2\2\u0087\u0088\f\22"+
		"\2\2\u0088\u0089\7\20\2\2\u0089\u00af\5\30\r\23\u008a\u008b\f\21\2\2\u008b"+
		"\u008c\7\26\2\2\u008c\u00af\5\30\r\22\u008d\u008e\f\20\2\2\u008e\u008f"+
		"\7\27\2\2\u008f\u00af\5\30\r\21\u0090\u0091\f\17\2\2\u0091\u0092\7\30"+
		"\2\2\u0092\u00af\5\30\r\20\u0093\u0094\f\16\2\2\u0094\u0095\7\22\2\2\u0095"+
		"\u00af\5\30\r\17\u0096\u0097\f\r\2\2\u0097\u0098\7\21\2\2\u0098\u00af"+
		"\5\30\r\16\u0099\u009a\f\f\2\2\u009a\u009b\7\17\2\2\u009b\u00af\5\30\r"+
		"\r\u009c\u009d\f\13\2\2\u009d\u009e\7\16\2\2\u009e\u00af\5\30\r\f\u009f"+
		"\u00a0\f\t\2\2\u00a0\u00a1\7\23\2\2\u00a1\u00af\5\30\r\n\u00a2\u00a3\f"+
		"\b\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00af\5\30\r\t\u00a5\u00a6\f\7\2\2\u00a6"+
		"\u00a7\7*\2\2\u00a7\u00af\5\30\r\b\u00a8\u00a9\f\6\2\2\u00a9\u00aa\7\25"+
		"\2\2\u00aa\u00af\5\30\r\7\u00ab\u00ac\f\5\2\2\u00ac\u00ad\7,\2\2\u00ad"+
		"\u00af\5\30\r\6\u00ae\u0087\3\2\2\2\u00ae\u008a\3\2\2\2\u00ae\u008d\3"+
		"\2\2\2\u00ae\u0090\3\2\2\2\u00ae\u0093\3\2\2\2\u00ae\u0096\3\2\2\2\u00ae"+
		"\u0099\3\2\2\2\u00ae\u009c\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae\u00a2\3\2"+
		"\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\31\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5:\36\2\u00b4\u00b5\7\22\2\2\u00b5"+
		"\u00b6\5\30\r\2\u00b6\33\3\2\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9\5\64"+
		"\33\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\7\62\2\2\u00bc"+
		"\u00bd\5:\36\2\u00bd\u00be\7\7\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\7"+
		"\63\2\2\u00c0\u00c6\7\66\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3\7/\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\67\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\7\4\2\2\u00cc\u00d2\5\"\22"+
		"\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d1\5\"\22\2\u00d0"+
		"\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\6\2\2\u00d6"+
		"\u00d8\5$\23\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2"+
		"\u00d9\u00da\7\62\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\63\2\2\u00dc"+
		"\u00dd\5$\23\2\u00dd#\3\2\2\2\u00de\u00e4\7\66\2\2\u00df\u00e0\5\26\f"+
		"\2\u00e0\u00e1\7/\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ec\7\67\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\7"+
		"/\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec"+
		"%\3\2\2\2\u00ed\u00ee\7%\2\2\u00ee\u00ef\5\64\33\2\u00ef\'\3\2\2\2\u00f0"+
		"\u00f2\7\"\2\2\u00f1\u00f3\7\f\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\7 \2\2\u00f5\u00f7\58\35\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9"+
		"\u00fa\5\64\33\2\u00fa+\3\2\2\2\u00fb\u00fd\7!\2\2\u00fc\u00fe\58\35\2"+
		"\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101"+
		"\5.\30\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103-\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\37\2\2"+
		"\u0106\u0108\58\35\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108/\3"+
		"\2\2\2\u0109\u010f\5,\27\2\u010a\u010f\5\62\32\2\u010b\u010f\5:\36\2\u010c"+
		"\u010f\5\64\33\2\u010d\u010f\5\n\6\2\u010e\u0109\3\2\2\2\u010e\u010a\3"+
		"\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\61\3\2\2\2\u0110\u0111\t\3\2\2\u0111\63\3\2\2\2\u0112\u0114\7\f\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7 "+
		"\2\2\u0116\u0118\58\35\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\65\3\2\2\2\u0119\u011a\7\62\2\2\u011a\u011f\5\60\31\2\u011b\u011c\7#"+
		"\2\2\u011c\u011e\5\60\31\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7\63\2\2\u0123\67\3\2\2\2\u0124\u012d\7\62\2\2\u0125"+
		"\u012a\5\30\r\2\u0126\u0127\7#\2\2\u0127\u0129\5\30\r\2\u0128\u0126\3"+
		"\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\63\2\2\u01309\3\2\2\2\u0131\u0132"+
		"\7\36\2\2\u0132;\3\2\2\2\34ASZaeo{\u0085\u00ae\u00b0\u00c6\u00d2\u00d7"+
		"\u00e4\u00eb\u00f2\u00f6\u00fd\u0102\u0107\u010e\u0113\u0117\u011f\u012a"+
		"\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}