// Generated from /home/msotafa/IdeaProjects/antr4grammars/agentscript-parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AgentSpeakLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FOR", "IF", "ELIF", "ELSE", "IN", "LOGICALVALUE", "NUMBER", "CONSTANTNUMBER", 
			"STRING", "STRONGNEGATION", "DEFAULTNEGATION", "RETURNS", "OBJECT_REF", 
			"AS", "RELATIONALOPERATOR", "ASSIGNOPERATOR", "LOGICALOPERATOR1", "LOGICALOPERATOR2", 
			"LOGICALOPERATOR3", "ARITHMETICOPERATOR1", "ARITHMETICOPERATOR2", "ARITHMETICOPERATOR3", 
			"UNARYOPERATOR", "ANNOTATION", "ANNOTATION_STRING", "ANNOTATION_VARIABLEDESCRIPTION", 
			"ANNOTATION_CONSTANT", "VARIABLEATOM", "FUNC_NAME", "ATOM", "OBJECT_ATOM", 
			"EXCLAMATIONMARK", "COMMA", "DOUBLEEXCLAMATIONMARK", "QUESTIONMARK", 
			"DOLLAR", "VLINE", "HASH", "LEFTARROW", "RIGHTARROW", "RIGHTARROWDOUBLE", 
			"RULEOPERATOR", "AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "LEFTROUNDBRACKET", 
			"RIGHTROUNDBRACKET", "LEFTANGULARBRACKET", "RIGHTANGULARBRACKET", "LEFTCURVEDBRACKET", 
			"RIGHTCURVEDBRACKET", "PLUS", "MINUS", "DIVIDE", "PI", "EULER", "GRAVITY", 
			"AVOGADRO", "BOLTZMANN", "ELECTRON", "PROTON", "NEUTRON", "LIGHTSPEED", 
			"POSITIVEINFINITY", "NEGATIVEINFINITY", "MAXIMUMVALUE", "MINIMUMVALUE", 
			"NAN", "AND", "OR", "XOR", "TRUE", "FALSE", "CONSTANT", "PARALLEL", "ATOMIC", 
			"DESCRIPTION", "TAG", "VARIABLE", "DECONSTRUCT", "ASSIGN", "ASSIGNINCREMENT", 
			"ASSIGNDECREMENT", "ASSIGNMULTIPLY", "ASSIGNDIVIDE", "ASSIGNMODULO", 
			"ASSIGNPOW", "INCREMENT", "DECREMENT", "LESS", "LESSEQUAL", "GREATER", 
			"GREATEREQUAL", "EQUAL", "NOTEQUAL", "NOTUNIFIABLE", "POW", "MULTIPLY", 
			"MODULO", "IS", "SINGLEQUOTESTRING", "DOUBLEQUOTESTRING", "LOWERCASELETTER", 
			"UPPERCASELETTER", "DIGIT", "DIGITSEQUENCE", "WHITESPACE", "LINECOMMENT", 
			"BLOCKCOMMENT"
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


	public AgentSpeakLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AgentSpeak.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0336\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\u00f8\n\7\3\b\5"+
		"\b\u00fb\n\b\3\b\3\b\5\b\u00ff\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u010f\n\t\3\n\3\n\5\n\u0113\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0131\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u0140\n\26"+
		"\3\27\3\27\5\27\u0144\n\27\3\30\3\30\5\30\u0148\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u0150\n\31\3\32\3\32\5\32\u0154\n\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0167\n\34\3\34\3\34\3\35\3\35\5\35\u016d\n\35\3\35\3\35\3\35\7"+
		"\35\u0172\n\35\f\35\16\35\u0175\13\35\3\36\3\36\3\36\5\36\u017a\n\36\3"+
		"\36\3\36\3\36\3\36\7\36\u0180\n\36\f\36\16\36\u0183\13\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u018b\n\37\f\37\16\37\u018e\13\37\3 \3 \3 \5 "+
		"\u0193\n \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\5K\u026d\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0278\nL\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S"+
		"\3S\3S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z"+
		"\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3^\3^\3^\3_\3_\3`\3`\3`\3a\3a\3a\3b\3b"+
		"\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3f\3f\3f\3f\5f\u02e8\nf\3g\3g\3g\3h\3h"+
		"\7h\u02ef\nh\fh\16h\u02f2\13h\3h\3h\3i\3i\7i\u02f8\ni\fi\16i\u02fb\13"+
		"i\3i\3i\3j\3j\3k\3k\3l\3l\3m\6m\u0306\nm\rm\16m\u0307\3m\3m\6m\u030c\n"+
		"m\rm\16m\u030d\5m\u0310\nm\3n\6n\u0313\nn\rn\16n\u0314\3n\3n\3o\3o\3o"+
		"\3o\7o\u031d\no\fo\16o\u0320\13o\3o\5o\u0323\no\3o\3o\3o\3o\3p\3p\3p\3"+
		"p\7p\u032d\np\fp\16p\u0330\13p\3p\3p\3p\3p\3p\4\u031e\u032e\2q\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s\2"+
		"u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2"+
		"\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a58\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1"+
		"\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3"+
		"\2\u00d5\2\u00d7\2\u00d9\2\u00db9\u00dd:\u00df;\3\2\b\3\2))\3\2$$\3\2"+
		"c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u033c\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2\u00a5\3\2\2\2\2\u00db\3\2\2\2\2"+
		"\u00dd\3\2\2\2\2\u00df\3\2\2\2\3\u00e1\3\2\2\2\5\u00e5\3\2\2\2\7\u00e8"+
		"\3\2\2\2\t\u00ed\3\2\2\2\13\u00f2\3\2\2\2\r\u00f7\3\2\2\2\17\u00fa\3\2"+
		"\2\2\21\u010e\3\2\2\2\23\u0112\3\2\2\2\25\u0114\3\2\2\2\27\u0116\3\2\2"+
		"\2\31\u011a\3\2\2\2\33\u0122\3\2\2\2\35\u0125\3\2\2\2\37\u0130\3\2\2\2"+
		"!\u0132\3\2\2\2#\u0134\3\2\2\2%\u0136\3\2\2\2\'\u0138\3\2\2\2)\u013a\3"+
		"\2\2\2+\u013f\3\2\2\2-\u0143\3\2\2\2/\u0147\3\2\2\2\61\u0149\3\2\2\2\63"+
		"\u0153\3\2\2\2\65\u0159\3\2\2\2\67\u0160\3\2\2\29\u016c\3\2\2\2;\u0176"+
		"\3\2\2\2=\u0184\3\2\2\2?\u018f\3\2\2\2A\u0194\3\2\2\2C\u0196\3\2\2\2E"+
		"\u0198\3\2\2\2G\u019b\3\2\2\2I\u019d\3\2\2\2K\u019f\3\2\2\2M\u01a1\3\2"+
		"\2\2O\u01a3\3\2\2\2Q\u01a6\3\2\2\2S\u01a9\3\2\2\2U\u01ac\3\2\2\2W\u01af"+
		"\3\2\2\2Y\u01b1\3\2\2\2[\u01b3\3\2\2\2]\u01b5\3\2\2\2_\u01b7\3\2\2\2a"+
		"\u01b9\3\2\2\2c\u01bb\3\2\2\2e\u01bd\3\2\2\2g\u01bf\3\2\2\2i\u01c1\3\2"+
		"\2\2k\u01c3\3\2\2\2m\u01c5\3\2\2\2o\u01c7\3\2\2\2q\u01c9\3\2\2\2s\u01cb"+
		"\3\2\2\2u\u01ce\3\2\2\2w\u01d4\3\2\2\2y\u01dc\3\2\2\2{\u01e5\3\2\2\2}"+
		"\u01ef\3\2\2\2\177\u01f8\3\2\2\2\u0081\u01ff\3\2\2\2\u0083\u0207\3\2\2"+
		"\2\u0085\u0212\3\2\2\2\u0087\u0223\3\2\2\2\u0089\u0234\3\2\2\2\u008b\u0241"+
		"\3\2\2\2\u008d\u024e\3\2\2\2\u008f\u0259\3\2\2\2\u0091\u025c\3\2\2\2\u0093"+
		"\u025f\3\2\2\2\u0095\u026c\3\2\2\2\u0097\u0277\3\2\2\2\u0099\u0279\3\2"+
		"\2\2\u009b\u0282\3\2\2\2\u009d\u028b\3\2\2\2\u009f\u0292\3\2\2\2\u00a1"+
		"\u029e\3\2\2\2\u00a3\u02a2\3\2\2\2\u00a5\u02ab\3\2\2\2\u00a7\u02af\3\2"+
		"\2\2\u00a9\u02b1\3\2\2\2\u00ab\u02b4\3\2\2\2\u00ad\u02b7\3\2\2\2\u00af"+
		"\u02ba\3\2\2\2\u00b1\u02be\3\2\2\2\u00b3\u02c1\3\2\2\2\u00b5\u02c4\3\2"+
		"\2\2\u00b7\u02c7\3\2\2\2\u00b9\u02ca\3\2\2\2\u00bb\u02cc\3\2\2\2\u00bd"+
		"\u02cf\3\2\2\2\u00bf\u02d1\3\2\2\2\u00c1\u02d4\3\2\2\2\u00c3\u02d7\3\2"+
		"\2\2\u00c5\u02db\3\2\2\2\u00c7\u02de\3\2\2\2\u00c9\u02e1\3\2\2\2\u00cb"+
		"\u02e7\3\2\2\2\u00cd\u02e9\3\2\2\2\u00cf\u02ec\3\2\2\2\u00d1\u02f5\3\2"+
		"\2\2\u00d3\u02fe\3\2\2\2\u00d5\u0300\3\2\2\2\u00d7\u0302\3\2\2\2\u00d9"+
		"\u0305\3\2\2\2\u00db\u0312\3\2\2\2\u00dd\u0318\3\2\2\2\u00df\u0328\3\2"+
		"\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4\4"+
		"\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7h\2\2\u00e7\6\3\2\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7h\2\2\u00ec"+
		"\b\3\2\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\n\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\f\3\2\2\2\u00f5\u00f8\5\u0095K\2\u00f6\u00f8\5\u0097L\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\16\3\2\2\2\u00f9\u00fb\5o8\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00ff\5\21\t\2"+
		"\u00fd\u00ff\5\u00d9m\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\20\3\2\2\2\u0100\u010f\5s:\2\u0101\u010f\5u;\2\u0102\u010f\5w<\2\u0103"+
		"\u010f\5y=\2\u0104\u010f\5{>\2\u0105\u010f\5}?\2\u0106\u010f\5\177@\2"+
		"\u0107\u010f\5\u0081A\2\u0108\u010f\5\u0083B\2\u0109\u010f\5\u0085C\2"+
		"\u010a\u010f\5\u0087D\2\u010b\u010f\5\u0089E\2\u010c\u010f\5\u008bF\2"+
		"\u010d\u010f\5\u008dG\2\u010e\u0100\3\2\2\2\u010e\u0101\3\2\2\2\u010e"+
		"\u0102\3\2\2\2\u010e\u0103\3\2\2\2\u010e\u0104\3\2\2\2\u010e\u0105\3\2"+
		"\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\22\3\2\2\2\u0110\u0113\5\u00cfh\2\u0111"+
		"\u0113\5\u00d1i\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\24\3\2"+
		"\2\2\u0114\u0115\7\u0080\2\2\u0115\26\3\2\2\2\u0116\u0117\7p\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7v\2\2\u0119\30\3\2\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7g\2\2\u011c\u011d\7v\2\2\u011d\u011e\7w\2\2\u011e\u011f\7t\2\2"+
		"\u011f\u0120\7p\2\2\u0120\u0121\7u\2\2\u0121\32\3\2\2\2\u0122\u0123\7"+
		">\2\2\u0123\u0124\7/\2\2\u0124\34\3\2\2\2\u0125\u0126\7c\2\2\u0126\u0127"+
		"\7u\2\2\u0127\36\3\2\2\2\u0128\u0131\5\u00c1a\2\u0129\u0131\5\u00c3b\2"+
		"\u012a\u0131\5\u00c5c\2\u012b\u0131\5\u00b9]\2\u012c\u0131\5\u00bb^\2"+
		"\u012d\u0131\5\u00bd_\2\u012e\u0131\5\u00bf`\2\u012f\u0131\5\u00cdg\2"+
		"\u0130\u0128\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012b"+
		"\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131 \3\2\2\2\u0132\u0133\5\u00a7T\2\u0133\"\3\2\2\2\u0134"+
		"\u0135\5\u0093J\2\u0135$\3\2\2\2\u0136\u0137\5\u008fH\2\u0137&\3\2\2\2"+
		"\u0138\u0139\5\u0091I\2\u0139(\3\2\2\2\u013a\u013b\5\u00c7d\2\u013b*\3"+
		"\2\2\2\u013c\u0140\5\u00c9e\2\u013d\u0140\5q9\2\u013e\u0140\5\u00cbf\2"+
		"\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140,\3"+
		"\2\2\2\u0141\u0144\5m\67\2\u0142\u0144\5o8\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144.\3\2\2\2\u0145\u0148\5\u00b5[\2\u0146\u0148\5\u00b7"+
		"\\\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\60\3\2\2\2\u0149\u014f"+
		"\5W,\2\u014a\u0150\5\67\34\2\u014b\u0150\5\65\33\2\u014c\u0150\5\63\32"+
		"\2\u014d\u0150\5\u009bN\2\u014e\u0150\5\u009dO\2\u014f\u014a\3\2\2\2\u014f"+
		"\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2"+
		"\2\2\u0150\62\3\2\2\2\u0151\u0154\5\u009fP\2\u0152\u0154\5\u00a1Q\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5a"+
		"\61\2\u0156\u0157\5\23\n\2\u0157\u0158\5c\62\2\u0158\64\3\2\2\2\u0159"+
		"\u015a\5\u00a3R\2\u015a\u015b\5a\61\2\u015b\u015c\59\35\2\u015c\u015d"+
		"\5C\"\2\u015d\u015e\5\23\n\2\u015e\u015f\5c\62\2\u015f\66\3\2\2\2\u0160"+
		"\u0161\5\u0099M\2\u0161\u0162\5a\61\2\u0162\u0163\59\35\2\u0163\u0166"+
		"\5C\"\2\u0164\u0167\5\17\b\2\u0165\u0167\5\23\n\2\u0166\u0164\3\2\2\2"+
		"\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5c\62\2\u01698\3"+
		"\2\2\2\u016a\u016d\5\u00d5k\2\u016b\u016d\5_\60\2\u016c\u016a\3\2\2\2"+
		"\u016c\u016b\3\2\2\2\u016d\u0173\3\2\2\2\u016e\u0172\5\u00d3j\2\u016f"+
		"\u0172\5\u00d5k\2\u0170\u0172\5\u00d7l\2\u0171\u016e\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174:\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0179\5]/\2\u0177"+
		"\u017a\5\u00d3j\2\u0178\u017a\5\u00d5k\2\u0179\u0177\3\2\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\u0181\3\2\2\2\u017b\u0180\5\u00d3j\2\u017c\u0180\5\u00d5"+
		"k\2\u017d\u0180\5\u00d7l\2\u017e\u0180\5_\60\2\u017f\u017b\3\2\2\2\u017f"+
		"\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182<\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\u018c\5\u00d3j\2\u0185\u018b\5\u00d3j\2\u0186\u018b\5\u00d5"+
		"k\2\u0187\u018b\5\u00d7l\2\u0188\u018b\5o8\2\u0189\u018b\5_\60\2\u018a"+
		"\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d>\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0192\5M\'\2\u0190"+
		"\u0193\5=\37\2\u0191\u0193\59\35\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2"+
		"\2\2\u0193@\3\2\2\2\u0194\u0195\7#\2\2\u0195B\3\2\2\2\u0196\u0197\7.\2"+
		"\2\u0197D\3\2\2\2\u0198\u0199\7#\2\2\u0199\u019a\7#\2\2\u019aF\3\2\2\2"+
		"\u019b\u019c\7A\2\2\u019cH\3\2\2\2\u019d\u019e\7&\2\2\u019eJ\3\2\2\2\u019f"+
		"\u01a0\7~\2\2\u01a0L\3\2\2\2\u01a1\u01a2\7%\2\2\u01a2N\3\2\2\2\u01a3\u01a4"+
		"\7>\2\2\u01a4\u01a5\7/\2\2\u01a5P\3\2\2\2\u01a6\u01a7\7/\2\2\u01a7\u01a8"+
		"\7@\2\2\u01a8R\3\2\2\2\u01a9\u01aa\7?\2\2\u01aa\u01ab\7@\2\2\u01abT\3"+
		"\2\2\2\u01ac\u01ad\7<\2\2\u01ad\u01ae\7/\2\2\u01aeV\3\2\2\2\u01af\u01b0"+
		"\7B\2\2\u01b0X\3\2\2\2\u01b1\u01b2\7<\2\2\u01b2Z\3\2\2\2\u01b3\u01b4\7"+
		"=\2\2\u01b4\\\3\2\2\2\u01b5\u01b6\7\60\2\2\u01b6^\3\2\2\2\u01b7\u01b8"+
		"\7a\2\2\u01b8`\3\2\2\2\u01b9\u01ba\7*\2\2\u01bab\3\2\2\2\u01bb\u01bc\7"+
		"+\2\2\u01bcd\3\2\2\2\u01bd\u01be\7]\2\2\u01bef\3\2\2\2\u01bf\u01c0\7_"+
		"\2\2\u01c0h\3\2\2\2\u01c1\u01c2\7}\2\2\u01c2j\3\2\2\2\u01c3\u01c4\7\177"+
		"\2\2\u01c4l\3\2\2\2\u01c5\u01c6\7-\2\2\u01c6n\3\2\2\2\u01c7\u01c8\7/\2"+
		"\2\u01c8p\3\2\2\2\u01c9\u01ca\7\61\2\2\u01car\3\2\2\2\u01cb\u01cc\7r\2"+
		"\2\u01cc\u01cd\7k\2\2\u01cdt\3\2\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7"+
		"w\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7t\2\2\u01d3v"+
		"\3\2\2\2\u01d4\u01d5\7i\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7c\2\2\u01d7"+
		"\u01d8\7x\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7v\2\2\u01da\u01db\7{\2\2"+
		"\u01dbx\3\2\2\2\u01dc\u01dd\7c\2\2\u01dd\u01de\7x\2\2\u01de\u01df\7q\2"+
		"\2\u01df\u01e0\7i\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7f\2\2\u01e2\u01e3"+
		"\7t\2\2\u01e3\u01e4\7q\2\2\u01e4z\3\2\2\2\u01e5\u01e6\7d\2\2\u01e6\u01e7"+
		"\7q\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7|\2\2\u01ea"+
		"\u01eb\7o\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7p\2\2"+
		"\u01ee|\3\2\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7n\2\2\u01f1\u01f2\7g\2"+
		"\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6"+
		"\7q\2\2\u01f6\u01f7\7p\2\2\u01f7~\3\2\2\2\u01f8\u01f9\7r\2\2\u01f9\u01fa"+
		"\7t\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7q\2\2\u01fd"+
		"\u01fe\7p\2\2\u01fe\u0080\3\2\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7g\2"+
		"\2\u0201\u0202\7w\2\2\u0202\u0203\7v\2\2\u0203\u0204\7t\2\2\u0204\u0205"+
		"\7q\2\2\u0205\u0206\7p\2\2\u0206\u0082\3\2\2\2\u0207\u0208\7n\2\2\u0208"+
		"\u0209\7k\2\2\u0209\u020a\7i\2\2\u020a\u020b\7j\2\2\u020b\u020c\7v\2\2"+
		"\u020c\u020d\7u\2\2\u020d\u020e\7r\2\2\u020e\u020f\7g\2\2\u020f\u0210"+
		"\7g\2\2\u0210\u0211\7f\2\2\u0211\u0084\3\2\2\2\u0212\u0213\7r\2\2\u0213"+
		"\u0214\7q\2\2\u0214\u0215\7u\2\2\u0215\u0216\7k\2\2\u0216\u0217\7v\2\2"+
		"\u0217\u0218\7k\2\2\u0218\u0219\7x\2\2\u0219\u021a\7g\2\2\u021a\u021b"+
		"\7k\2\2\u021b\u021c\7p\2\2\u021c\u021d\7h\2\2\u021d\u021e\7k\2\2\u021e"+
		"\u021f\7p\2\2\u021f\u0220\7k\2\2\u0220\u0221\7v\2\2\u0221\u0222\7{\2\2"+
		"\u0222\u0086\3\2\2\2\u0223\u0224\7p\2\2\u0224\u0225\7g\2\2\u0225\u0226"+
		"\7i\2\2\u0226\u0227\7c\2\2\u0227\u0228\7v\2\2\u0228\u0229\7k\2\2\u0229"+
		"\u022a\7x\2\2\u022a\u022b\7g\2\2\u022b\u022c\7k\2\2\u022c\u022d\7p\2\2"+
		"\u022d\u022e\7h\2\2\u022e\u022f\7k\2\2\u022f\u0230\7p\2\2\u0230\u0231"+
		"\7k\2\2\u0231\u0232\7v\2\2\u0232\u0233\7{\2\2\u0233\u0088\3\2\2\2\u0234"+
		"\u0235\7o\2\2\u0235\u0236\7c\2\2\u0236\u0237\7z\2\2\u0237\u0238\7k\2\2"+
		"\u0238\u0239\7o\2\2\u0239\u023a\7w\2\2\u023a\u023b\7o\2\2\u023b\u023c"+
		"\7x\2\2\u023c\u023d\7c\2\2\u023d\u023e\7n\2\2\u023e\u023f\7w\2\2\u023f"+
		"\u0240\7g\2\2\u0240\u008a\3\2\2\2\u0241\u0242\7o\2\2\u0242\u0243\7k\2"+
		"\2\u0243\u0244\7p\2\2\u0244\u0245\7k\2\2\u0245\u0246\7o\2\2\u0246\u0247"+
		"\7w\2\2\u0247\u0248\7o\2\2\u0248\u0249\7x\2\2\u0249\u024a\7c\2\2\u024a"+
		"\u024b\7n\2\2\u024b\u024c\7w\2\2\u024c\u024d\7g\2\2\u024d\u008c\3\2\2"+
		"\2\u024e\u024f\7p\2\2\u024f\u0250\7q\2\2\u0250\u0251\7v\2\2\u0251\u0252"+
		"\7c\2\2\u0252\u0253\7p\2\2\u0253\u0254\7w\2\2\u0254\u0255\7o\2\2\u0255"+
		"\u0256\7d\2\2\u0256\u0257\7g\2\2\u0257\u0258\7t\2\2\u0258\u008e\3\2\2"+
		"\2\u0259\u025a\7(\2\2\u025a\u025b\7(\2\2\u025b\u0090\3\2\2\2\u025c\u025d"+
		"\7~\2\2\u025d\u025e\7~\2\2\u025e\u0092\3\2\2\2\u025f\u0260\7`\2\2\u0260"+
		"\u0094\3\2\2\2\u0261\u0262\7v\2\2\u0262\u0263\7t\2\2\u0263\u0264\7w\2"+
		"\2\u0264\u026d\7g\2\2\u0265\u0266\7u\2\2\u0266\u0267\7w\2\2\u0267\u0268"+
		"\7e\2\2\u0268\u0269\7e\2\2\u0269\u026a\7g\2\2\u026a\u026b\7u\2\2\u026b"+
		"\u026d\7u\2\2\u026c\u0261\3\2\2\2\u026c\u0265\3\2\2\2\u026d\u0096\3\2"+
		"\2\2\u026e\u026f\7h\2\2\u026f\u0270\7c\2\2\u0270\u0271\7n\2\2\u0271\u0272"+
		"\7u\2\2\u0272\u0278\7g\2\2\u0273\u0274\7h\2\2\u0274\u0275\7c\2\2\u0275"+
		"\u0276\7k\2\2\u0276\u0278\7n\2\2\u0277\u026e\3\2\2\2\u0277\u0273\3\2\2"+
		"\2\u0278\u0098\3\2\2\2\u0279\u027a\7e\2\2\u027a\u027b\7q\2\2\u027b\u027c"+
		"\7p\2\2\u027c\u027d\7u\2\2\u027d\u027e\7v\2\2\u027e\u027f\7c\2\2\u027f"+
		"\u0280\7p\2\2\u0280\u0281\7v\2\2\u0281\u009a\3\2\2\2\u0282\u0283\7r\2"+
		"\2\u0283\u0284\7c\2\2\u0284\u0285\7t\2\2\u0285\u0286\7c\2\2\u0286\u0287"+
		"\7n\2\2\u0287\u0288\7n\2\2\u0288\u0289\7g\2\2\u0289\u028a\7n\2\2\u028a"+
		"\u009c\3\2\2\2\u028b\u028c\7c\2\2\u028c\u028d\7v\2\2\u028d\u028e\7q\2"+
		"\2\u028e\u028f\7o\2\2\u028f\u0290\7k\2\2\u0290\u0291\7e\2\2\u0291\u009e"+
		"\3\2\2\2\u0292\u0293\7f\2\2\u0293\u0294\7g\2\2\u0294\u0295\7u\2\2\u0295"+
		"\u0296\7e\2\2\u0296\u0297\7t\2\2\u0297\u0298\7k\2\2\u0298\u0299\7r\2\2"+
		"\u0299\u029a\7v\2\2\u029a\u029b\7k\2\2\u029b\u029c\7q\2\2\u029c\u029d"+
		"\7p\2\2\u029d\u00a0\3\2\2\2\u029e\u029f\7v\2\2\u029f\u02a0\7c\2\2\u02a0"+
		"\u02a1\7i\2\2\u02a1\u00a2\3\2\2\2\u02a2\u02a3\7x\2\2\u02a3\u02a4\7c\2"+
		"\2\u02a4\u02a5\7t\2\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7c\2\2\u02a7\u02a8"+
		"\7d\2\2\u02a8\u02a9\7n\2\2\u02a9\u02aa\7g\2\2\u02aa\u00a4\3\2\2\2\u02ab"+
		"\u02ac\7?\2\2\u02ac\u02ad\7\60\2\2\u02ad\u02ae\7\60\2\2\u02ae\u00a6\3"+
		"\2\2\2\u02af\u02b0\7?\2\2\u02b0\u00a8\3\2\2\2\u02b1\u02b2\7-\2\2\u02b2"+
		"\u02b3\7?\2\2\u02b3\u00aa\3\2\2\2\u02b4\u02b5\7/\2\2\u02b5\u02b6\7?\2"+
		"\2\u02b6\u00ac\3\2\2\2\u02b7\u02b8\7,\2\2\u02b8\u02b9\7?\2\2\u02b9\u00ae"+
		"\3\2\2\2\u02ba\u02bb\7\61\2\2\u02bb\u02bc\7\61\2\2\u02bc\u02bd\7?\2\2"+
		"\u02bd\u00b0\3\2\2\2\u02be\u02bf\7\'\2\2\u02bf\u02c0\7?\2\2\u02c0\u00b2"+
		"\3\2\2\2\u02c1\u02c2\7`\2\2\u02c2\u02c3\7?\2\2\u02c3\u00b4\3\2\2\2\u02c4"+
		"\u02c5\7-\2\2\u02c5\u02c6\7-\2\2\u02c6\u00b6\3\2\2\2\u02c7\u02c8\7/\2"+
		"\2\u02c8\u02c9\7/\2\2\u02c9\u00b8\3\2\2\2\u02ca\u02cb\7>\2\2\u02cb\u00ba"+
		"\3\2\2\2\u02cc\u02cd\7?\2\2\u02cd\u02ce\7>\2\2\u02ce\u00bc\3\2\2\2\u02cf"+
		"\u02d0\7@\2\2\u02d0\u00be\3\2\2\2\u02d1\u02d2\7@\2\2\u02d2\u02d3\7?\2"+
		"\2\u02d3\u00c0\3\2\2\2\u02d4\u02d5\7?\2\2\u02d5\u02d6\7?\2\2\u02d6\u00c2"+
		"\3\2\2\2\u02d7\u02d8\7#\2\2\u02d8\u02d9\7?\2\2\u02d9\u02da\7?\2\2\u02da"+
		"\u00c4\3\2\2\2\u02db\u02dc\7#\2\2\u02dc\u02dd\7?\2\2\u02dd\u00c6\3\2\2"+
		"\2\u02de\u02df\7,\2\2\u02df\u02e0\7,\2\2\u02e0\u00c8\3\2\2\2\u02e1\u02e2"+
		"\7,\2\2\u02e2\u00ca\3\2\2\2\u02e3\u02e8\7\'\2\2\u02e4\u02e5\7o\2\2\u02e5"+
		"\u02e6\7q\2\2\u02e6\u02e8\7f\2\2\u02e7\u02e3\3\2\2\2\u02e7\u02e4\3\2\2"+
		"\2\u02e8\u00cc\3\2\2\2\u02e9\u02ea\7k\2\2\u02ea\u02eb\7u\2\2\u02eb\u00ce"+
		"\3\2\2\2\u02ec\u02f0\7)\2\2\u02ed\u02ef\n\2\2\2\u02ee\u02ed\3\2\2\2\u02ef"+
		"\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4\7)\2\2\u02f4\u00d0\3\2\2\2\u02f5"+
		"\u02f9\7$\2\2\u02f6\u02f8\n\3\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2"+
		"\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fc\u02fd\7$\2\2\u02fd\u00d2\3\2\2\2\u02fe\u02ff\t\4"+
		"\2\2\u02ff\u00d4\3\2\2\2\u0300\u0301\t\5\2\2\u0301\u00d6\3\2\2\2\u0302"+
		"\u0303\t\6\2\2\u0303\u00d8\3\2\2\2\u0304\u0306\5\u00d7l\2\u0305\u0304"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030f\3\2\2\2\u0309\u030b\7\60\2\2\u030a\u030c\5\u00d7l\2\u030b\u030a"+
		"\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0310\3\2\2\2\u030f\u0309\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u00da\3\2"+
		"\2\2\u0311\u0313\t\7\2\2\u0312\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\bn"+
		"\2\2\u0317\u00dc\3\2\2\2\u0318\u0319\7\61\2\2\u0319\u031a\7\61\2\2\u031a"+
		"\u031e\3\2\2\2\u031b\u031d\13\2\2\2\u031c\u031b\3\2\2\2\u031d\u0320\3"+
		"\2\2\2\u031e\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320"+
		"\u031e\3\2\2\2\u0321\u0323\7\17\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3"+
		"\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7\f\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\bo\2\2\u0327\u00de\3\2\2\2\u0328\u0329\7\61\2\2\u0329\u032a\7,"+
		"\2\2\u032a\u032e\3\2\2\2\u032b\u032d\13\2\2\2\u032c\u032b\3\2\2\2\u032d"+
		"\u0330\3\2\2\2\u032e\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0331\3\2"+
		"\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7,\2\2\u0332\u0333\7\61\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0335\bp\2\2\u0335\u00e0\3\2\2\2$\2\u00f7\u00fa\u00fe"+
		"\u010e\u0112\u0130\u013f\u0143\u0147\u014f\u0153\u0166\u016c\u0171\u0173"+
		"\u0179\u017f\u0181\u018a\u018c\u0192\u026c\u0277\u02e7\u02f0\u02f9\u0307"+
		"\u030d\u030f\u0314\u031e\u0322\u032e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}