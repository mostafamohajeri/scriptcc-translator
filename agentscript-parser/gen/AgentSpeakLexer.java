// Generated from /home/msotafa/IdeaProjects/antr4grammars/parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
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
		UNDERSCORE=47, LEFTSHIFT=48, RIGHTSHIFT=49, LEFTROUNDBRACKET=50, RIGHTROUNDBRACKET=51, 
		LEFTANGULARBRACKET=52, RIGHTANGULARBRACKET=53, LEFTCURVEDBRACKET=54, RIGHTCURVEDBRACKET=55, 
		DECONSTRUCT=56, WHITESPACE=57, LINECOMMENT=58, BLOCKCOMMENT=59;
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
			"RULEOPERATOR", "AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "LEFTSHIFT", 
			"RIGHTSHIFT", "LEFTROUNDBRACKET", "RIGHTROUNDBRACKET", "LEFTANGULARBRACKET", 
			"RIGHTANGULARBRACKET", "LEFTCURVEDBRACKET", "RIGHTCURVEDBRACKET", "PLUS", 
			"MINUS", "DIVIDE", "PI", "EULER", "GRAVITY", "AVOGADRO", "BOLTZMANN", 
			"ELECTRON", "PROTON", "NEUTRON", "LIGHTSPEED", "POSITIVEINFINITY", "NEGATIVEINFINITY", 
			"MAXIMUMVALUE", "MINIMUMVALUE", "NAN", "AND", "OR", "XOR", "TRUE", "FALSE", 
			"CONSTANT", "PARALLEL", "ATOMIC", "DESCRIPTION", "TAG", "VARIABLE", "DECONSTRUCT", 
			"ASSIGN", "ASSIGNINCREMENT", "ASSIGNDECREMENT", "ASSIGNMULTIPLY", "ASSIGNDIVIDE", 
			"ASSIGNMODULO", "ASSIGNPOW", "INCREMENT", "DECREMENT", "LESS", "LESSEQUAL", 
			"GREATER", "GREATEREQUAL", "EQUAL", "NOTEQUAL", "NOTUNIFIABLE", "POW", 
			"MULTIPLY", "MODULO", "IS", "SINGLEQUOTESTRING", "DOUBLEQUOTESTRING", 
			"LOWERCASELETTER", "UPPERCASELETTER", "DIGIT", "DIGITSEQUENCE", "WHITESPACE", 
			"LINECOMMENT", "BLOCKCOMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0340\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\u00fc"+
		"\n\7\3\b\5\b\u00ff\n\b\3\b\3\b\5\b\u0103\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0113\n\t\3\n\3\n\5\n\u0117\n\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0135\n\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26"+
		"\u0144\n\26\3\27\3\27\5\27\u0148\n\27\3\30\3\30\5\30\u014c\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0154\n\31\3\32\3\32\5\32\u0158\n\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u016b\n\34\3\34\3\34\3\35\3\35\5\35\u0171\n\35\3\35\3"+
		"\35\3\35\7\35\u0176\n\35\f\35\16\35\u0179\13\35\3\36\3\36\3\36\5\36\u017e"+
		"\n\36\3\36\3\36\3\36\3\36\7\36\u0184\n\36\f\36\16\36\u0187\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u018f\n\37\f\37\16\37\u0192\13\37\3 \3"+
		" \3 \5 \u0197\n \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0277\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\5"+
		"N\u0282\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3`\3`\3`\3a\3"+
		"a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3h\3h\3h\3h\5"+
		"h\u02f2\nh\3i\3i\3i\3j\3j\7j\u02f9\nj\fj\16j\u02fc\13j\3j\3j\3k\3k\7k"+
		"\u0302\nk\fk\16k\u0305\13k\3k\3k\3l\3l\3m\3m\3n\3n\3o\6o\u0310\no\ro\16"+
		"o\u0311\3o\3o\6o\u0316\no\ro\16o\u0317\5o\u031a\no\3p\6p\u031d\np\rp\16"+
		"p\u031e\3p\3p\3q\3q\3q\3q\7q\u0327\nq\fq\16q\u032a\13q\3q\5q\u032d\nq"+
		"\3q\3q\3q\3q\3r\3r\3r\3r\7r\u0337\nr\fr\16r\u033a\13r\3r\3r\3r\3r\3r\4"+
		"\u0328\u0338\2s\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9:\u00ab"+
		"\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd"+
		"\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf"+
		"\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9\2\u00db\2\u00dd\2\u00df;\u00e1"+
		"<\u00e3=\3\2\b\3\2))\3\2$$\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u0346"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2\u00a9\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\3\u00e5\3\2\2\2\5\u00e9\3\2\2\2\7\u00ec\3\2\2\2\t\u00f1\3\2\2"+
		"\2\13\u00f6\3\2\2\2\r\u00fb\3\2\2\2\17\u00fe\3\2\2\2\21\u0112\3\2\2\2"+
		"\23\u0116\3\2\2\2\25\u0118\3\2\2\2\27\u011a\3\2\2\2\31\u011e\3\2\2\2\33"+
		"\u0126\3\2\2\2\35\u0129\3\2\2\2\37\u0134\3\2\2\2!\u0136\3\2\2\2#\u0138"+
		"\3\2\2\2%\u013a\3\2\2\2\'\u013c\3\2\2\2)\u013e\3\2\2\2+\u0143\3\2\2\2"+
		"-\u0147\3\2\2\2/\u014b\3\2\2\2\61\u014d\3\2\2\2\63\u0157\3\2\2\2\65\u015d"+
		"\3\2\2\2\67\u0164\3\2\2\29\u0170\3\2\2\2;\u017a\3\2\2\2=\u0188\3\2\2\2"+
		"?\u0193\3\2\2\2A\u0198\3\2\2\2C\u019a\3\2\2\2E\u019c\3\2\2\2G\u019f\3"+
		"\2\2\2I\u01a1\3\2\2\2K\u01a3\3\2\2\2M\u01a5\3\2\2\2O\u01a7\3\2\2\2Q\u01aa"+
		"\3\2\2\2S\u01ad\3\2\2\2U\u01b0\3\2\2\2W\u01b3\3\2\2\2Y\u01b5\3\2\2\2["+
		"\u01b7\3\2\2\2]\u01b9\3\2\2\2_\u01bb\3\2\2\2a\u01bd\3\2\2\2c\u01c0\3\2"+
		"\2\2e\u01c3\3\2\2\2g\u01c5\3\2\2\2i\u01c7\3\2\2\2k\u01c9\3\2\2\2m\u01cb"+
		"\3\2\2\2o\u01cd\3\2\2\2q\u01cf\3\2\2\2s\u01d1\3\2\2\2u\u01d3\3\2\2\2w"+
		"\u01d5\3\2\2\2y\u01d8\3\2\2\2{\u01de\3\2\2\2}\u01e6\3\2\2\2\177\u01ef"+
		"\3\2\2\2\u0081\u01f9\3\2\2\2\u0083\u0202\3\2\2\2\u0085\u0209\3\2\2\2\u0087"+
		"\u0211\3\2\2\2\u0089\u021c\3\2\2\2\u008b\u022d\3\2\2\2\u008d\u023e\3\2"+
		"\2\2\u008f\u024b\3\2\2\2\u0091\u0258\3\2\2\2\u0093\u0263\3\2\2\2\u0095"+
		"\u0266\3\2\2\2\u0097\u0269\3\2\2\2\u0099\u0276\3\2\2\2\u009b\u0281\3\2"+
		"\2\2\u009d\u0283\3\2\2\2\u009f\u028c\3\2\2\2\u00a1\u0295\3\2\2\2\u00a3"+
		"\u029c\3\2\2\2\u00a5\u02a8\3\2\2\2\u00a7\u02ac\3\2\2\2\u00a9\u02b5\3\2"+
		"\2\2\u00ab\u02b9\3\2\2\2\u00ad\u02bb\3\2\2\2\u00af\u02be\3\2\2\2\u00b1"+
		"\u02c1\3\2\2\2\u00b3\u02c4\3\2\2\2\u00b5\u02c8\3\2\2\2\u00b7\u02cb\3\2"+
		"\2\2\u00b9\u02ce\3\2\2\2\u00bb\u02d1\3\2\2\2\u00bd\u02d4\3\2\2\2\u00bf"+
		"\u02d6\3\2\2\2\u00c1\u02d9\3\2\2\2\u00c3\u02db\3\2\2\2\u00c5\u02de\3\2"+
		"\2\2\u00c7\u02e1\3\2\2\2\u00c9\u02e5\3\2\2\2\u00cb\u02e8\3\2\2\2\u00cd"+
		"\u02eb\3\2\2\2\u00cf\u02f1\3\2\2\2\u00d1\u02f3\3\2\2\2\u00d3\u02f6\3\2"+
		"\2\2\u00d5\u02ff\3\2\2\2\u00d7\u0308\3\2\2\2\u00d9\u030a\3\2\2\2\u00db"+
		"\u030c\3\2\2\2\u00dd\u030f\3\2\2\2\u00df\u031c\3\2\2\2\u00e1\u0322\3\2"+
		"\2\2\u00e3\u0332\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8\4\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7h\2\2\u00eb\6"+
		"\3\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f0\7h\2\2\u00f0\b\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3"+
		"\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5\n\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		"\u00f8\7p\2\2\u00f8\f\3\2\2\2\u00f9\u00fc\5\u0099M\2\u00fa\u00fc\5\u009b"+
		"N\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\16\3\2\2\2\u00fd\u00ff"+
		"\5s:\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u0103\5\21\t\2\u0101\u0103\5\u00ddo\2\u0102\u0100\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\20\3\2\2\2\u0104\u0113\5w<\2\u0105\u0113\5y=\2\u0106\u0113"+
		"\5{>\2\u0107\u0113\5}?\2\u0108\u0113\5\177@\2\u0109\u0113\5\u0081A\2\u010a"+
		"\u0113\5\u0083B\2\u010b\u0113\5\u0085C\2\u010c\u0113\5\u0087D\2\u010d"+
		"\u0113\5\u0089E\2\u010e\u0113\5\u008bF\2\u010f\u0113\5\u008dG\2\u0110"+
		"\u0113\5\u008fH\2\u0111\u0113\5\u0091I\2\u0112\u0104\3\2\2\2\u0112\u0105"+
		"\3\2\2\2\u0112\u0106\3\2\2\2\u0112\u0107\3\2\2\2\u0112\u0108\3\2\2\2\u0112"+
		"\u0109\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010c\3\2"+
		"\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\22\3\2\2\2\u0114\u0117\5\u00d3"+
		"j\2\u0115\u0117\5\u00d5k\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\24\3\2\2\2\u0118\u0119\7\u0080\2\2\u0119\26\3\2\2\2\u011a\u011b\7p\2"+
		"\2\u011b\u011c\7q\2\2\u011c\u011d\7v\2\2\u011d\30\3\2\2\2\u011e\u011f"+
		"\7t\2\2\u011f\u0120\7g\2\2\u0120\u0121\7v\2\2\u0121\u0122\7w\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7p\2\2\u0124\u0125\7u\2\2\u0125\32\3\2\2\2\u0126"+
		"\u0127\7>\2\2\u0127\u0128\7/\2\2\u0128\34\3\2\2\2\u0129\u012a\7c\2\2\u012a"+
		"\u012b\7u\2\2\u012b\36\3\2\2\2\u012c\u0135\5\u00c5c\2\u012d\u0135\5\u00c7"+
		"d\2\u012e\u0135\5\u00c9e\2\u012f\u0135\5\u00bd_\2\u0130\u0135\5\u00bf"+
		"`\2\u0131\u0135\5\u00c1a\2\u0132\u0135\5\u00c3b\2\u0133\u0135\5\u00d1"+
		"i\2\u0134\u012c\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u012e\3\2\2\2\u0134"+
		"\u012f\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0133\3\2\2\2\u0135 \3\2\2\2\u0136\u0137\5\u00abV\2\u0137\""+
		"\3\2\2\2\u0138\u0139\5\u0097L\2\u0139$\3\2\2\2\u013a\u013b\5\u0093J\2"+
		"\u013b&\3\2\2\2\u013c\u013d\5\u0095K\2\u013d(\3\2\2\2\u013e\u013f\5\u00cb"+
		"f\2\u013f*\3\2\2\2\u0140\u0144\5\u00cdg\2\u0141\u0144\5u;\2\u0142\u0144"+
		"\5\u00cfh\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2"+
		"\2\u0144,\3\2\2\2\u0145\u0148\5q9\2\u0146\u0148\5s:\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0146\3\2\2\2\u0148.\3\2\2\2\u0149\u014c\5\u00b9]\2\u014a\u014c"+
		"\5\u00bb^\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\60\3\2\2\2\u014d"+
		"\u0153\5W,\2\u014e\u0154\5\67\34\2\u014f\u0154\5\65\33\2\u0150\u0154\5"+
		"\63\32\2\u0151\u0154\5\u009fP\2\u0152\u0154\5\u00a1Q\2\u0153\u014e\3\2"+
		"\2\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\62\3\2\2\2\u0155\u0158\5\u00a3R\2\u0156\u0158\5\u00a5"+
		"S\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\5e\63\2\u015a\u015b\5\23\n\2\u015b\u015c\5g\64\2\u015c\64\3\2\2"+
		"\2\u015d\u015e\5\u00a7T\2\u015e\u015f\5e\63\2\u015f\u0160\59\35\2\u0160"+
		"\u0161\5C\"\2\u0161\u0162\5\23\n\2\u0162\u0163\5g\64\2\u0163\66\3\2\2"+
		"\2\u0164\u0165\5\u009dO\2\u0165\u0166\5e\63\2\u0166\u0167\59\35\2\u0167"+
		"\u016a\5C\"\2\u0168\u016b\5\17\b\2\u0169\u016b\5\23\n\2\u016a\u0168\3"+
		"\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5g\64\2\u016d"+
		"8\3\2\2\2\u016e\u0171\5\u00d9m\2\u016f\u0171\5_\60\2\u0170\u016e\3\2\2"+
		"\2\u0170\u016f\3\2\2\2\u0171\u0177\3\2\2\2\u0172\u0176\5\u00d7l\2\u0173"+
		"\u0176\5\u00d9m\2\u0174\u0176\5\u00dbn\2\u0175\u0172\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178:\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017d\5]/\2\u017b"+
		"\u017e\5\u00d7l\2\u017c\u017e\5\u00d9m\2\u017d\u017b\3\2\2\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0185\3\2\2\2\u017f\u0184\5\u00d7l\2\u0180\u0184\5\u00d9"+
		"m\2\u0181\u0184\5\u00dbn\2\u0182\u0184\5_\60\2\u0183\u017f\3\2\2\2\u0183"+
		"\u0180\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186<\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0188\u0190\5\u00d7l\2\u0189\u018f\5\u00d7l\2\u018a\u018f\5\u00d9"+
		"m\2\u018b\u018f\5\u00dbn\2\u018c\u018f\5s:\2\u018d\u018f\5_\60\2\u018e"+
		"\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191>\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0196\5M\'\2\u0194"+
		"\u0197\5=\37\2\u0195\u0197\59\35\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197@\3\2\2\2\u0198\u0199\7#\2\2\u0199B\3\2\2\2\u019a\u019b\7.\2"+
		"\2\u019bD\3\2\2\2\u019c\u019d\7#\2\2\u019d\u019e\7#\2\2\u019eF\3\2\2\2"+
		"\u019f\u01a0\7A\2\2\u01a0H\3\2\2\2\u01a1\u01a2\7&\2\2\u01a2J\3\2\2\2\u01a3"+
		"\u01a4\7~\2\2\u01a4L\3\2\2\2\u01a5\u01a6\7%\2\2\u01a6N\3\2\2\2\u01a7\u01a8"+
		"\7>\2\2\u01a8\u01a9\7/\2\2\u01a9P\3\2\2\2\u01aa\u01ab\7/\2\2\u01ab\u01ac"+
		"\7@\2\2\u01acR\3\2\2\2\u01ad\u01ae\7?\2\2\u01ae\u01af\7@\2\2\u01afT\3"+
		"\2\2\2\u01b0\u01b1\7<\2\2\u01b1\u01b2\7/\2\2\u01b2V\3\2\2\2\u01b3\u01b4"+
		"\7B\2\2\u01b4X\3\2\2\2\u01b5\u01b6\7<\2\2\u01b6Z\3\2\2\2\u01b7\u01b8\7"+
		"=\2\2\u01b8\\\3\2\2\2\u01b9\u01ba\7\60\2\2\u01ba^\3\2\2\2\u01bb\u01bc"+
		"\7a\2\2\u01bc`\3\2\2\2\u01bd\u01be\7>\2\2\u01be\u01bf\7>\2\2\u01bfb\3"+
		"\2\2\2\u01c0\u01c1\7@\2\2\u01c1\u01c2\7@\2\2\u01c2d\3\2\2\2\u01c3\u01c4"+
		"\7*\2\2\u01c4f\3\2\2\2\u01c5\u01c6\7+\2\2\u01c6h\3\2\2\2\u01c7\u01c8\7"+
		"]\2\2\u01c8j\3\2\2\2\u01c9\u01ca\7_\2\2\u01cal\3\2\2\2\u01cb\u01cc\7}"+
		"\2\2\u01ccn\3\2\2\2\u01cd\u01ce\7\177\2\2\u01cep\3\2\2\2\u01cf\u01d0\7"+
		"-\2\2\u01d0r\3\2\2\2\u01d1\u01d2\7/\2\2\u01d2t\3\2\2\2\u01d3\u01d4\7\61"+
		"\2\2\u01d4v\3\2\2\2\u01d5\u01d6\7r\2\2\u01d6\u01d7\7k\2\2\u01d7x\3\2\2"+
		"\2\u01d8\u01d9\7g\2\2\u01d9\u01da\7w\2\2\u01da\u01db\7n\2\2\u01db\u01dc"+
		"\7g\2\2\u01dc\u01dd\7t\2\2\u01ddz\3\2\2\2\u01de\u01df\7i\2\2\u01df\u01e0"+
		"\7t\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7x\2\2\u01e2\u01e3\7k\2\2\u01e3"+
		"\u01e4\7v\2\2\u01e4\u01e5\7{\2\2\u01e5|\3\2\2\2\u01e6\u01e7\7c\2\2\u01e7"+
		"\u01e8\7x\2\2\u01e8\u01e9\7q\2\2\u01e9\u01ea\7i\2\2\u01ea\u01eb\7c\2\2"+
		"\u01eb\u01ec\7f\2\2\u01ec\u01ed\7t\2\2\u01ed\u01ee\7q\2\2\u01ee~\3\2\2"+
		"\2\u01ef\u01f0\7d\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2\7n\2\2\u01f2\u01f3"+
		"\7v\2\2\u01f3\u01f4\7|\2\2\u01f4\u01f5\7o\2\2\u01f5\u01f6\7c\2\2\u01f6"+
		"\u01f7\7p\2\2\u01f7\u01f8\7p\2\2\u01f8\u0080\3\2\2\2\u01f9\u01fa\7g\2"+
		"\2\u01fa\u01fb\7n\2\2\u01fb\u01fc\7g\2\2\u01fc\u01fd\7e\2\2\u01fd\u01fe"+
		"\7v\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7q\2\2\u0200\u0201\7p\2\2\u0201"+
		"\u0082\3\2\2\2\u0202\u0203\7r\2\2\u0203\u0204\7t\2\2\u0204\u0205\7q\2"+
		"\2\u0205\u0206\7v\2\2\u0206\u0207\7q\2\2\u0207\u0208\7p\2\2\u0208\u0084"+
		"\3\2\2\2\u0209\u020a\7p\2\2\u020a\u020b\7g\2\2\u020b\u020c\7w\2\2\u020c"+
		"\u020d\7v\2\2\u020d\u020e\7t\2\2\u020e\u020f\7q\2\2\u020f\u0210\7p\2\2"+
		"\u0210\u0086\3\2\2\2\u0211\u0212\7n\2\2\u0212\u0213\7k\2\2\u0213\u0214"+
		"\7i\2\2\u0214\u0215\7j\2\2\u0215\u0216\7v\2\2\u0216\u0217\7u\2\2\u0217"+
		"\u0218\7r\2\2\u0218\u0219\7g\2\2\u0219\u021a\7g\2\2\u021a\u021b\7f\2\2"+
		"\u021b\u0088\3\2\2\2\u021c\u021d\7r\2\2\u021d\u021e\7q\2\2\u021e\u021f"+
		"\7u\2\2\u021f\u0220\7k\2\2\u0220\u0221\7v\2\2\u0221\u0222\7k\2\2\u0222"+
		"\u0223\7x\2\2\u0223\u0224\7g\2\2\u0224\u0225\7k\2\2\u0225\u0226\7p\2\2"+
		"\u0226\u0227\7h\2\2\u0227\u0228\7k\2\2\u0228\u0229\7p\2\2\u0229\u022a"+
		"\7k\2\2\u022a\u022b\7v\2\2\u022b\u022c\7{\2\2\u022c\u008a\3\2\2\2\u022d"+
		"\u022e\7p\2\2\u022e\u022f\7g\2\2\u022f\u0230\7i\2\2\u0230\u0231\7c\2\2"+
		"\u0231\u0232\7v\2\2\u0232\u0233\7k\2\2\u0233\u0234\7x\2\2\u0234\u0235"+
		"\7g\2\2\u0235\u0236\7k\2\2\u0236\u0237\7p\2\2\u0237\u0238\7h\2\2\u0238"+
		"\u0239\7k\2\2\u0239\u023a\7p\2\2\u023a\u023b\7k\2\2\u023b\u023c\7v\2\2"+
		"\u023c\u023d\7{\2\2\u023d\u008c\3\2\2\2\u023e\u023f\7o\2\2\u023f\u0240"+
		"\7c\2\2\u0240\u0241\7z\2\2\u0241\u0242\7k\2\2\u0242\u0243\7o\2\2\u0243"+
		"\u0244\7w\2\2\u0244\u0245\7o\2\2\u0245\u0246\7x\2\2\u0246\u0247\7c\2\2"+
		"\u0247\u0248\7n\2\2\u0248\u0249\7w\2\2\u0249\u024a\7g\2\2\u024a\u008e"+
		"\3\2\2\2\u024b\u024c\7o\2\2\u024c\u024d\7k\2\2\u024d\u024e\7p\2\2\u024e"+
		"\u024f\7k\2\2\u024f\u0250\7o\2\2\u0250\u0251\7w\2\2\u0251\u0252\7o\2\2"+
		"\u0252\u0253\7x\2\2\u0253\u0254\7c\2\2\u0254\u0255\7n\2\2\u0255\u0256"+
		"\7w\2\2\u0256\u0257\7g\2\2\u0257\u0090\3\2\2\2\u0258\u0259\7p\2\2\u0259"+
		"\u025a\7q\2\2\u025a\u025b\7v\2\2\u025b\u025c\7c\2\2\u025c\u025d\7p\2\2"+
		"\u025d\u025e\7w\2\2\u025e\u025f\7o\2\2\u025f\u0260\7d\2\2\u0260\u0261"+
		"\7g\2\2\u0261\u0262\7t\2\2\u0262\u0092\3\2\2\2\u0263\u0264\7(\2\2\u0264"+
		"\u0265\7(\2\2\u0265\u0094\3\2\2\2\u0266\u0267\7~\2\2\u0267\u0268\7~\2"+
		"\2\u0268\u0096\3\2\2\2\u0269\u026a\7`\2\2\u026a\u0098\3\2\2\2\u026b\u026c"+
		"\7v\2\2\u026c\u026d\7t\2\2\u026d\u026e\7w\2\2\u026e\u0277\7g\2\2\u026f"+
		"\u0270\7u\2\2\u0270\u0271\7w\2\2\u0271\u0272\7e\2\2\u0272\u0273\7e\2\2"+
		"\u0273\u0274\7g\2\2\u0274\u0275\7u\2\2\u0275\u0277\7u\2\2\u0276\u026b"+
		"\3\2\2\2\u0276\u026f\3\2\2\2\u0277\u009a\3\2\2\2\u0278\u0279\7h\2\2\u0279"+
		"\u027a\7c\2\2\u027a\u027b\7n\2\2\u027b\u027c\7u\2\2\u027c\u0282\7g\2\2"+
		"\u027d\u027e\7h\2\2\u027e\u027f\7c\2\2\u027f\u0280\7k\2\2\u0280\u0282"+
		"\7n\2\2\u0281\u0278\3\2\2\2\u0281\u027d\3\2\2\2\u0282\u009c\3\2\2\2\u0283"+
		"\u0284\7e\2\2\u0284\u0285\7q\2\2\u0285\u0286\7p\2\2\u0286\u0287\7u\2\2"+
		"\u0287\u0288\7v\2\2\u0288\u0289\7c\2\2\u0289\u028a\7p\2\2\u028a\u028b"+
		"\7v\2\2\u028b\u009e\3\2\2\2\u028c\u028d\7r\2\2\u028d\u028e\7c\2\2\u028e"+
		"\u028f\7t\2\2\u028f\u0290\7c\2\2\u0290\u0291\7n\2\2\u0291\u0292\7n\2\2"+
		"\u0292\u0293\7g\2\2\u0293\u0294\7n\2\2\u0294\u00a0\3\2\2\2\u0295\u0296"+
		"\7c\2\2\u0296\u0297\7v\2\2\u0297\u0298\7q\2\2\u0298\u0299\7o\2\2\u0299"+
		"\u029a\7k\2\2\u029a\u029b\7e\2\2\u029b\u00a2\3\2\2\2\u029c\u029d\7f\2"+
		"\2\u029d\u029e\7g\2\2\u029e\u029f\7u\2\2\u029f\u02a0\7e\2\2\u02a0\u02a1"+
		"\7t\2\2\u02a1\u02a2\7k\2\2\u02a2\u02a3\7r\2\2\u02a3\u02a4\7v\2\2\u02a4"+
		"\u02a5\7k\2\2\u02a5\u02a6\7q\2\2\u02a6\u02a7\7p\2\2\u02a7\u00a4\3\2\2"+
		"\2\u02a8\u02a9\7v\2\2\u02a9\u02aa\7c\2\2\u02aa\u02ab\7i\2\2\u02ab\u00a6"+
		"\3\2\2\2\u02ac\u02ad\7x\2\2\u02ad\u02ae\7c\2\2\u02ae\u02af\7t\2\2\u02af"+
		"\u02b0\7k\2\2\u02b0\u02b1\7c\2\2\u02b1\u02b2\7d\2\2\u02b2\u02b3\7n\2\2"+
		"\u02b3\u02b4\7g\2\2\u02b4\u00a8\3\2\2\2\u02b5\u02b6\7?\2\2\u02b6\u02b7"+
		"\7\60\2\2\u02b7\u02b8\7\60\2\2\u02b8\u00aa\3\2\2\2\u02b9\u02ba\7?\2\2"+
		"\u02ba\u00ac\3\2\2\2\u02bb\u02bc\7-\2\2\u02bc\u02bd\7?\2\2\u02bd\u00ae"+
		"\3\2\2\2\u02be\u02bf\7/\2\2\u02bf\u02c0\7?\2\2\u02c0\u00b0\3\2\2\2\u02c1"+
		"\u02c2\7,\2\2\u02c2\u02c3\7?\2\2\u02c3\u00b2\3\2\2\2\u02c4\u02c5\7\61"+
		"\2\2\u02c5\u02c6\7\61\2\2\u02c6\u02c7\7?\2\2\u02c7\u00b4\3\2\2\2\u02c8"+
		"\u02c9\7\'\2\2\u02c9\u02ca\7?\2\2\u02ca\u00b6\3\2\2\2\u02cb\u02cc\7`\2"+
		"\2\u02cc\u02cd\7?\2\2\u02cd\u00b8\3\2\2\2\u02ce\u02cf\7-\2\2\u02cf\u02d0"+
		"\7-\2\2\u02d0\u00ba\3\2\2\2\u02d1\u02d2\7/\2\2\u02d2\u02d3\7/\2\2\u02d3"+
		"\u00bc\3\2\2\2\u02d4\u02d5\7>\2\2\u02d5\u00be\3\2\2\2\u02d6\u02d7\7?\2"+
		"\2\u02d7\u02d8\7>\2\2\u02d8\u00c0\3\2\2\2\u02d9\u02da\7@\2\2\u02da\u00c2"+
		"\3\2\2\2\u02db\u02dc\7@\2\2\u02dc\u02dd\7?\2\2\u02dd\u00c4\3\2\2\2\u02de"+
		"\u02df\7?\2\2\u02df\u02e0\7?\2\2\u02e0\u00c6\3\2\2\2\u02e1\u02e2\7#\2"+
		"\2\u02e2\u02e3\7?\2\2\u02e3\u02e4\7?\2\2\u02e4\u00c8\3\2\2\2\u02e5\u02e6"+
		"\7#\2\2\u02e6\u02e7\7?\2\2\u02e7\u00ca\3\2\2\2\u02e8\u02e9\7,\2\2\u02e9"+
		"\u02ea\7,\2\2\u02ea\u00cc\3\2\2\2\u02eb\u02ec\7,\2\2\u02ec\u00ce\3\2\2"+
		"\2\u02ed\u02f2\7\'\2\2\u02ee\u02ef\7o\2\2\u02ef\u02f0\7q\2\2\u02f0\u02f2"+
		"\7f\2\2\u02f1\u02ed\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f2\u00d0\3\2\2\2\u02f3"+
		"\u02f4\7k\2\2\u02f4\u02f5\7u\2\2\u02f5\u00d2\3\2\2\2\u02f6\u02fa\7)\2"+
		"\2\u02f7\u02f9\n\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8"+
		"\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd"+
		"\u02fe\7)\2\2\u02fe\u00d4\3\2\2\2\u02ff\u0303\7$\2\2\u0300\u0302\n\3\2"+
		"\2\u0301\u0300\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304"+
		"\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\7$\2\2\u0307"+
		"\u00d6\3\2\2\2\u0308\u0309\t\4\2\2\u0309\u00d8\3\2\2\2\u030a\u030b\t\5"+
		"\2\2\u030b\u00da\3\2\2\2\u030c\u030d\t\6\2\2\u030d\u00dc\3\2\2\2\u030e"+
		"\u0310\5\u00dbn\2\u030f\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0319\3\2\2\2\u0313\u0315\7\60\2\2"+
		"\u0314\u0316\5\u00dbn\2\u0315\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u0313\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u00de\3\2\2\2\u031b\u031d\t\7\2\2\u031c"+
		"\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2"+
		"\2\2\u031f\u0320\3\2\2\2\u0320\u0321\bp\2\2\u0321\u00e0\3\2\2\2\u0322"+
		"\u0323\7\61\2\2\u0323\u0324\7\61\2\2\u0324\u0328\3\2\2\2\u0325\u0327\13"+
		"\2\2\2\u0326\u0325\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0329\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032d\7\17"+
		"\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u032f\7\f\2\2\u032f\u0330\3\2\2\2\u0330\u0331\bq\2\2\u0331\u00e2\3\2"+
		"\2\2\u0332\u0333\7\61\2\2\u0333\u0334\7,\2\2\u0334\u0338\3\2\2\2\u0335"+
		"\u0337\13\2\2\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0339\3"+
		"\2\2\2\u0338\u0336\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0338\3\2\2\2\u033b"+
		"\u033c\7,\2\2\u033c\u033d\7\61\2\2\u033d\u033e\3\2\2\2\u033e\u033f\br"+
		"\2\2\u033f\u00e4\3\2\2\2$\2\u00fb\u00fe\u0102\u0112\u0116\u0134\u0143"+
		"\u0147\u014b\u0153\u0157\u016a\u0170\u0175\u0177\u017d\u0183\u0185\u018e"+
		"\u0190\u0196\u0276\u0281\u02f1\u02fa\u0303\u0311\u0317\u0319\u031e\u0328"+
		"\u032c\u0338\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}