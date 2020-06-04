// Generated from /home/msotafa/IdeaProjects/antr4grammars/parser/src/main/antlr4/grammar/Terminal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Terminal extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, LOGICALVALUE=2, NUMBER=3, CONSTANTNUMBER=4, STRING=5, STRONGNEGATION=6, 
		DEFAULTNEGATION=7, RELATIONALOPERATOR=8, ASSIGNOPERATOR=9, LOGICALOPERATOR1=10, 
		LOGICALOPERATOR2=11, LOGICALOPERATOR3=12, ARITHMETICOPERATOR1=13, ARITHMETICOPERATOR2=14, 
		ARITHMETICOPERATOR3=15, UNARYOPERATOR=16, ANNOTATION=17, ANNOTATION_STRING=18, 
		ANNOTATION_VARIABLEDESCRIPTION=19, ANNOTATION_CONSTANT=20, VARIABLEATOM=21, 
		ATOM=22, EXCLAMATIONMARK=23, COMMA=24, DOUBLEEXCLAMATIONMARK=25, QUESTIONMARK=26, 
		DOLLAR=27, VLINE=28, HASH=29, LEFTARROW=30, RIGHTARROW=31, RIGHTARROWDOUBLE=32, 
		RULEOPERATOR=33, AT=34, COLON=35, SEMICOLON=36, DOT=37, UNDERSCORE=38, 
		SLASH=39, LEFTSHIFT=40, RIGHTSHIFT=41, LEFTROUNDBRACKET=42, RIGHTROUNDBRACKET=43, 
		LEFTANGULARBRACKET=44, RIGHTANGULARBRACKET=45, LEFTCURVEDBRACKET=46, RIGHTCURVEDBRACKET=47, 
		DECONSTRUCT=48, WHITESPACE=49, LINECOMMENT=50, BLOCKCOMMENT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FOR", "LOGICALVALUE", "NUMBER", "CONSTANTNUMBER", "STRING", "STRONGNEGATION", 
			"DEFAULTNEGATION", "RELATIONALOPERATOR", "ASSIGNOPERATOR", "LOGICALOPERATOR1", 
			"LOGICALOPERATOR2", "LOGICALOPERATOR3", "ARITHMETICOPERATOR1", "ARITHMETICOPERATOR2", 
			"ARITHMETICOPERATOR3", "UNARYOPERATOR", "ANNOTATION", "ANNOTATION_STRING", 
			"ANNOTATION_VARIABLEDESCRIPTION", "ANNOTATION_CONSTANT", "VARIABLEATOM", 
			"ATOM", "EXCLAMATIONMARK", "COMMA", "DOUBLEEXCLAMATIONMARK", "QUESTIONMARK", 
			"DOLLAR", "VLINE", "HASH", "LEFTARROW", "RIGHTARROW", "RIGHTARROWDOUBLE", 
			"RULEOPERATOR", "AT", "COLON", "SEMICOLON", "DOT", "UNDERSCORE", "SLASH", 
			"LEFTSHIFT", "RIGHTSHIFT", "LEFTROUNDBRACKET", "RIGHTROUNDBRACKET", "LEFTANGULARBRACKET", 
			"RIGHTANGULARBRACKET", "LEFTCURVEDBRACKET", "RIGHTCURVEDBRACKET", "PLUS", 
			"MINUS", "DIVIDE", "PI", "EULER", "GRAVITY", "AVOGADRO", "BOLTZMANN", 
			"ELECTRON", "PROTON", "NEUTRON", "LIGHTSPEED", "POSITIVEINFINITY", "NEGATIVEINFINITY", 
			"MAXIMUMVALUE", "MINIMUMVALUE", "NAN", "AND", "OR", "XOR", "TRUE", "FALSE", 
			"CONSTANT", "PARALLEL", "ATOMIC", "DESCRIPTION", "TAG", "VARIABLE", "DECONSTRUCT", 
			"ASSIGN", "ASSIGNINCREMENT", "ASSIGNDECREMENT", "ASSIGNMULTIPLY", "ASSIGNDIVIDE", 
			"ASSIGNMODULO", "ASSIGNPOW", "INCREMENT", "DECREMENT", "LESS", "LESSEQUAL", 
			"GREATER", "GREATEREQUAL", "EQUAL", "NOTEQUAL", "NOTUNIFIABLE", "POW", 
			"MULTIPLY", "MODULO", "SINGLEQUOTESTRING", "DOUBLEQUOTESTRING", "LOWERCASELETTER", 
			"UPPERCASELETTER", "DIGIT", "DIGITSEQUENCE", "WHITESPACE", "LINECOMMENT", 
			"BLOCKCOMMENT"
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
			"DEFAULTNEGATION", "RELATIONALOPERATOR", "ASSIGNOPERATOR", "LOGICALOPERATOR1", 
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


	public Terminal(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Terminal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0306\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\5\3\u00da\n\3\3\4\5\4\u00dd\n\4\3\4\3\4\5\4\u00e1\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f1\n\5\3"+
		"\6\3\6\5\6\u00f5\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0105\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010e\n\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u011b\n\17\3\20\3\20"+
		"\5\20\u011f\n\20\3\21\3\21\5\21\u0123\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u012b\n\22\3\23\3\23\5\23\u012f\n\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0142"+
		"\n\25\3\25\3\25\3\26\3\26\5\26\u0148\n\26\3\26\3\26\3\26\3\26\7\26\u014e"+
		"\n\26\f\26\16\26\u0151\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u015a"+
		"\n\27\f\27\16\27\u015d\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B"+
		"\3B\3C\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0240\nE\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\5F\u024b\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3O\3O"+
		"\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V"+
		"\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3^\3"+
		"^\3^\3_\3_\3`\3`\3`\3`\5`\u02bb\n`\3a\3a\7a\u02bf\na\fa\16a\u02c2\13a"+
		"\3a\3a\3b\3b\7b\u02c8\nb\fb\16b\u02cb\13b\3b\3b\3c\3c\3d\3d\3e\3e\3f\6"+
		"f\u02d6\nf\rf\16f\u02d7\3f\3f\6f\u02dc\nf\rf\16f\u02dd\5f\u02e0\nf\3g"+
		"\6g\u02e3\ng\rg\16g\u02e4\3g\3g\3h\3h\3h\3h\7h\u02ed\nh\fh\16h\u02f0\13"+
		"h\3h\5h\u02f3\nh\3h\3h\3h\3h\3i\3i\3i\3i\7i\u02fd\ni\fi\16i\u0300\13i"+
		"\3i\3i\3i\3i\3i\4\u02ee\u02fe\2j\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083"+
		"\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\62\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7"+
		"\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9"+
		"\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb"+
		"\2\u00cd\63\u00cf\64\u00d1\65\3\2\b\3\2))\3\2$$\3\2c|\3\2C\\\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u030f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2\u0099\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2"+
		"\u00d1\3\2\2\2\3\u00d3\3\2\2\2\5\u00d9\3\2\2\2\7\u00dc\3\2\2\2\t\u00f0"+
		"\3\2\2\2\13\u00f4\3\2\2\2\r\u00f6\3\2\2\2\17\u00f8\3\2\2\2\21\u0104\3"+
		"\2\2\2\23\u010d\3\2\2\2\25\u010f\3\2\2\2\27\u0111\3\2\2\2\31\u0113\3\2"+
		"\2\2\33\u0115\3\2\2\2\35\u011a\3\2\2\2\37\u011e\3\2\2\2!\u0122\3\2\2\2"+
		"#\u0124\3\2\2\2%\u012e\3\2\2\2\'\u0134\3\2\2\2)\u013b\3\2\2\2+\u0147\3"+
		"\2\2\2-\u0152\3\2\2\2/\u015e\3\2\2\2\61\u0160\3\2\2\2\63\u0162\3\2\2\2"+
		"\65\u0165\3\2\2\2\67\u0167\3\2\2\29\u0169\3\2\2\2;\u016b\3\2\2\2=\u016d"+
		"\3\2\2\2?\u0170\3\2\2\2A\u0173\3\2\2\2C\u0176\3\2\2\2E\u0179\3\2\2\2G"+
		"\u017b\3\2\2\2I\u017d\3\2\2\2K\u017f\3\2\2\2M\u0181\3\2\2\2O\u0183\3\2"+
		"\2\2Q\u0185\3\2\2\2S\u0188\3\2\2\2U\u018b\3\2\2\2W\u018d\3\2\2\2Y\u018f"+
		"\3\2\2\2[\u0191\3\2\2\2]\u0193\3\2\2\2_\u0195\3\2\2\2a\u0197\3\2\2\2c"+
		"\u0199\3\2\2\2e\u019b\3\2\2\2g\u019e\3\2\2\2i\u01a1\3\2\2\2k\u01a7\3\2"+
		"\2\2m\u01af\3\2\2\2o\u01b8\3\2\2\2q\u01c2\3\2\2\2s\u01cb\3\2\2\2u\u01d2"+
		"\3\2\2\2w\u01da\3\2\2\2y\u01e5\3\2\2\2{\u01f6\3\2\2\2}\u0207\3\2\2\2\177"+
		"\u0214\3\2\2\2\u0081\u0221\3\2\2\2\u0083\u022c\3\2\2\2\u0085\u022f\3\2"+
		"\2\2\u0087\u0232\3\2\2\2\u0089\u023f\3\2\2\2\u008b\u024a\3\2\2\2\u008d"+
		"\u024c\3\2\2\2\u008f\u0255\3\2\2\2\u0091\u025e\3\2\2\2\u0093\u0265\3\2"+
		"\2\2\u0095\u0271\3\2\2\2\u0097\u0275\3\2\2\2\u0099\u027e\3\2\2\2\u009b"+
		"\u0282\3\2\2\2\u009d\u0284\3\2\2\2\u009f\u0287\3\2\2\2\u00a1\u028a\3\2"+
		"\2\2\u00a3\u028d\3\2\2\2\u00a5\u0291\3\2\2\2\u00a7\u0294\3\2\2\2\u00a9"+
		"\u0297\3\2\2\2\u00ab\u029a\3\2\2\2\u00ad\u029d\3\2\2\2\u00af\u029f\3\2"+
		"\2\2\u00b1\u02a2\3\2\2\2\u00b3\u02a4\3\2\2\2\u00b5\u02a7\3\2\2\2\u00b7"+
		"\u02aa\3\2\2\2\u00b9\u02ae\3\2\2\2\u00bb\u02b1\3\2\2\2\u00bd\u02b4\3\2"+
		"\2\2\u00bf\u02ba\3\2\2\2\u00c1\u02bc\3\2\2\2\u00c3\u02c5\3\2\2\2\u00c5"+
		"\u02ce\3\2\2\2\u00c7\u02d0\3\2\2\2\u00c9\u02d2\3\2\2\2\u00cb\u02d5\3\2"+
		"\2\2\u00cd\u02e2\3\2\2\2\u00cf\u02e8\3\2\2\2\u00d1\u02f8\3\2\2\2\u00d3"+
		"\u00d4\7h\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6\4\3\2\2\2\u00d7"+
		"\u00da\5\u0089E\2\u00d8\u00da\5\u008bF\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\6\3\2\2\2\u00db\u00dd\5c\62\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e1\5\t\5\2\u00df\u00e1\5\u00cb"+
		"f\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\b\3\2\2\2\u00e2\u00f1"+
		"\5g\64\2\u00e3\u00f1\5i\65\2\u00e4\u00f1\5k\66\2\u00e5\u00f1\5m\67\2\u00e6"+
		"\u00f1\5o8\2\u00e7\u00f1\5q9\2\u00e8\u00f1\5s:\2\u00e9\u00f1\5u;\2\u00ea"+
		"\u00f1\5w<\2\u00eb\u00f1\5y=\2\u00ec\u00f1\5{>\2\u00ed\u00f1\5}?\2\u00ee"+
		"\u00f1\5\177@\2\u00ef\u00f1\5\u0081A\2\u00f0\u00e2\3\2\2\2\u00f0\u00e3"+
		"\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0"+
		"\u00e7\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ea\3\2"+
		"\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\n\3\2\2\2\u00f2\u00f5\5\u00c1"+
		"a\2\u00f3\u00f5\5\u00c3b\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\f\3\2\2\2\u00f6\u00f7\7\u0080\2\2\u00f7\16\3\2\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9\u00fa\7q\2\2\u00fa\u00fb\7v\2\2\u00fb\20\3\2\2\2\u00fc\u0105\5"+
		"\u009bN\2\u00fd\u0105\5\u00b5[\2\u00fe\u0105\5\u00b7\\\2\u00ff\u0105\5"+
		"\u00b9]\2\u0100\u0105\5\u00adW\2\u0101\u0105\5\u00afX\2\u0102\u0105\5"+
		"\u00b1Y\2\u0103\u0105\5\u00b3Z\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2"+
		"\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\22\3\2\2\2\u0106"+
		"\u010e\5\u009bN\2\u0107\u010e\5\u009dO\2\u0108\u010e\5\u009fP\2\u0109"+
		"\u010e\5\u00a1Q\2\u010a\u010e\5\u00a3R\2\u010b\u010e\5\u00a5S\2\u010c"+
		"\u010e\5\u00a7T\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\24\3\2\2\2\u010f\u0110\5\u0087D\2\u0110\26\3\2\2"+
		"\2\u0111\u0112\5\u0083B\2\u0112\30\3\2\2\2\u0113\u0114\5\u0085C\2\u0114"+
		"\32\3\2\2\2\u0115\u0116\5\u00bb^\2\u0116\34\3\2\2\2\u0117\u011b\5\u00bd"+
		"_\2\u0118\u011b\5e\63\2\u0119\u011b\5\u00bf`\2\u011a\u0117\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\36\3\2\2\2\u011c\u011f\5a\61"+
		"\2\u011d\u011f\5c\62\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f "+
		"\3\2\2\2\u0120\u0123\5\u00a9U\2\u0121\u0123\5\u00abV\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0121\3\2\2\2\u0123\"\3\2\2\2\u0124\u012a\5E#\2\u0125\u012b"+
		"\5)\25\2\u0126\u012b\5\'\24\2\u0127\u012b\5%\23\2\u0128\u012b\5\u008f"+
		"H\2\u0129\u012b\5\u0091I\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b$\3\2\2\2"+
		"\u012c\u012f\5\u0093J\2\u012d\u012f\5\u0095K\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5U+\2\u0131\u0132\5\13"+
		"\6\2\u0132\u0133\5W,\2\u0133&\3\2\2\2\u0134\u0135\5\u0097L\2\u0135\u0136"+
		"\5U+\2\u0136\u0137\5+\26\2\u0137\u0138\5\61\31\2\u0138\u0139\5\13\6\2"+
		"\u0139\u013a\5W,\2\u013a(\3\2\2\2\u013b\u013c\5\u008dG\2\u013c\u013d\5"+
		"U+\2\u013d\u013e\5+\26\2\u013e\u0141\5\61\31\2\u013f\u0142\5\7\4\2\u0140"+
		"\u0142\5\13\6\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143\u0144\5W,\2\u0144*\3\2\2\2\u0145\u0148\5\u00c7d\2\u0146\u0148"+
		"\5M\'\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014f\3\2\2\2\u0149"+
		"\u014e\5\u00c5c\2\u014a\u014e\5\u00c7d\2\u014b\u014e\5\u00c9e\2\u014c"+
		"\u014e\5O(\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150,\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u015b\5\u00c5c\2\u0153"+
		"\u015a\5\u00c5c\2\u0154\u015a\5\u00c7d\2\u0155\u015a\5\u00c9e\2\u0156"+
		"\u015a\5O(\2\u0157\u015a\5c\62\2\u0158\u015a\5M\'\2\u0159\u0153\3\2\2"+
		"\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c.\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7#\2\2\u015f"+
		"\60\3\2\2\2\u0160\u0161\7.\2\2\u0161\62\3\2\2\2\u0162\u0163\7#\2\2\u0163"+
		"\u0164\7#\2\2\u0164\64\3\2\2\2\u0165\u0166\7A\2\2\u0166\66\3\2\2\2\u0167"+
		"\u0168\7&\2\2\u01688\3\2\2\2\u0169\u016a\7~\2\2\u016a:\3\2\2\2\u016b\u016c"+
		"\7%\2\2\u016c<\3\2\2\2\u016d\u016e\7>\2\2\u016e\u016f\7/\2\2\u016f>\3"+
		"\2\2\2\u0170\u0171\7/\2\2\u0171\u0172\7@\2\2\u0172@\3\2\2\2\u0173\u0174"+
		"\7?\2\2\u0174\u0175\7@\2\2\u0175B\3\2\2\2\u0176\u0177\7<\2\2\u0177\u0178"+
		"\7/\2\2\u0178D\3\2\2\2\u0179\u017a\7B\2\2\u017aF\3\2\2\2\u017b\u017c\7"+
		"<\2\2\u017cH\3\2\2\2\u017d\u017e\7=\2\2\u017eJ\3\2\2\2\u017f\u0180\7\60"+
		"\2\2\u0180L\3\2\2\2\u0181\u0182\7a\2\2\u0182N\3\2\2\2\u0183\u0184\7\61"+
		"\2\2\u0184P\3\2\2\2\u0185\u0186\7>\2\2\u0186\u0187\7>\2\2\u0187R\3\2\2"+
		"\2\u0188\u0189\7@\2\2\u0189\u018a\7@\2\2\u018aT\3\2\2\2\u018b\u018c\7"+
		"*\2\2\u018cV\3\2\2\2\u018d\u018e\7+\2\2\u018eX\3\2\2\2\u018f\u0190\7]"+
		"\2\2\u0190Z\3\2\2\2\u0191\u0192\7_\2\2\u0192\\\3\2\2\2\u0193\u0194\7}"+
		"\2\2\u0194^\3\2\2\2\u0195\u0196\7\177\2\2\u0196`\3\2\2\2\u0197\u0198\7"+
		"-\2\2\u0198b\3\2\2\2\u0199\u019a\7/\2\2\u019ad\3\2\2\2\u019b\u019c\7\61"+
		"\2\2\u019c\u019d\7\61\2\2\u019df\3\2\2\2\u019e\u019f\7r\2\2\u019f\u01a0"+
		"\7k\2\2\u01a0h\3\2\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7w\2\2\u01a3\u01a4"+
		"\7n\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7t\2\2\u01a6j\3\2\2\2\u01a7\u01a8"+
		"\7i\2\2\u01a8\u01a9\7t\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7x\2\2\u01ab"+
		"\u01ac\7k\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7{\2\2\u01ael\3\2\2\2\u01af"+
		"\u01b0\7c\2\2\u01b0\u01b1\7x\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7i\2\2"+
		"\u01b3\u01b4\7c\2\2\u01b4\u01b5\7f\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7"+
		"\7q\2\2\u01b7n\3\2\2\2\u01b8\u01b9\7d\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb"+
		"\7n\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7|\2\2\u01bd\u01be\7o\2\2\u01be"+
		"\u01bf\7c\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7p\2\2\u01c1p\3\2\2\2\u01c2"+
		"\u01c3\7g\2\2\u01c3\u01c4\7n\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7e\2\2"+
		"\u01c6\u01c7\7v\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca"+
		"\7p\2\2\u01car\3\2\2\2\u01cb\u01cc\7r\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce"+
		"\7q\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7q\2\2\u01d0\u01d1\7p\2\2\u01d1"+
		"t\3\2\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7w\2\2\u01d5"+
		"\u01d6\7v\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7p\2\2"+
		"\u01d9v\3\2\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7i\2"+
		"\2\u01dd\u01de\7j\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7u\2\2\u01e0\u01e1"+
		"\7r\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7f\2\2\u01e4"+
		"x\3\2\2\2\u01e5\u01e6\7r\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8\7u\2\2\u01e8"+
		"\u01e9\7k\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7x\2\2"+
		"\u01ec\u01ed\7g\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0"+
		"\7h\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7p\2\2\u01f2\u01f3\7k\2\2\u01f3"+
		"\u01f4\7v\2\2\u01f4\u01f5\7{\2\2\u01f5z\3\2\2\2\u01f6\u01f7\7p\2\2\u01f7"+
		"\u01f8\7g\2\2\u01f8\u01f9\7i\2\2\u01f9\u01fa\7c\2\2\u01fa\u01fb\7v\2\2"+
		"\u01fb\u01fc\7k\2\2\u01fc\u01fd\7x\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff"+
		"\7k\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7h\2\2\u0201\u0202\7k\2\2\u0202"+
		"\u0203\7p\2\2\u0203\u0204\7k\2\2\u0204\u0205\7v\2\2\u0205\u0206\7{\2\2"+
		"\u0206|\3\2\2\2\u0207\u0208\7o\2\2\u0208\u0209\7c\2\2\u0209\u020a\7z\2"+
		"\2\u020a\u020b\7k\2\2\u020b\u020c\7o\2\2\u020c\u020d\7w\2\2\u020d\u020e"+
		"\7o\2\2\u020e\u020f\7x\2\2\u020f\u0210\7c\2\2\u0210\u0211\7n\2\2\u0211"+
		"\u0212\7w\2\2\u0212\u0213\7g\2\2\u0213~\3\2\2\2\u0214\u0215\7o\2\2\u0215"+
		"\u0216\7k\2\2\u0216\u0217\7p\2\2\u0217\u0218\7k\2\2\u0218\u0219\7o\2\2"+
		"\u0219\u021a\7w\2\2\u021a\u021b\7o\2\2\u021b\u021c\7x\2\2\u021c\u021d"+
		"\7c\2\2\u021d\u021e\7n\2\2\u021e\u021f\7w\2\2\u021f\u0220\7g\2\2\u0220"+
		"\u0080\3\2\2\2\u0221\u0222\7p\2\2\u0222\u0223\7q\2\2\u0223\u0224\7v\2"+
		"\2\u0224\u0225\7c\2\2\u0225\u0226\7p\2\2\u0226\u0227\7w\2\2\u0227\u0228"+
		"\7o\2\2\u0228\u0229\7d\2\2\u0229\u022a\7g\2\2\u022a\u022b\7t\2\2\u022b"+
		"\u0082\3\2\2\2\u022c\u022d\7(\2\2\u022d\u022e\7(\2\2\u022e\u0084\3\2\2"+
		"\2\u022f\u0230\7~\2\2\u0230\u0231\7~\2\2\u0231\u0086\3\2\2\2\u0232\u0233"+
		"\7`\2\2\u0233\u0088\3\2\2\2\u0234\u0235\7v\2\2\u0235\u0236\7t\2\2\u0236"+
		"\u0237\7w\2\2\u0237\u0240\7g\2\2\u0238\u0239\7u\2\2\u0239\u023a\7w\2\2"+
		"\u023a\u023b\7e\2\2\u023b\u023c\7e\2\2\u023c\u023d\7g\2\2\u023d\u023e"+
		"\7u\2\2\u023e\u0240\7u\2\2\u023f\u0234\3\2\2\2\u023f\u0238\3\2\2\2\u0240"+
		"\u008a\3\2\2\2\u0241\u0242\7h\2\2\u0242\u0243\7c\2\2\u0243\u0244\7n\2"+
		"\2\u0244\u0245\7u\2\2\u0245\u024b\7g\2\2\u0246\u0247\7h\2\2\u0247\u0248"+
		"\7c\2\2\u0248\u0249\7k\2\2\u0249\u024b\7n\2\2\u024a\u0241\3\2\2\2\u024a"+
		"\u0246\3\2\2\2\u024b\u008c\3\2\2\2\u024c\u024d\7e\2\2\u024d\u024e\7q\2"+
		"\2\u024e\u024f\7p\2\2\u024f\u0250\7u\2\2\u0250\u0251\7v\2\2\u0251\u0252"+
		"\7c\2\2\u0252\u0253\7p\2\2\u0253\u0254\7v\2\2\u0254\u008e\3\2\2\2\u0255"+
		"\u0256\7r\2\2\u0256\u0257\7c\2\2\u0257\u0258\7t\2\2\u0258\u0259\7c\2\2"+
		"\u0259\u025a\7n\2\2\u025a\u025b\7n\2\2\u025b\u025c\7g\2\2\u025c\u025d"+
		"\7n\2\2\u025d\u0090\3\2\2\2\u025e\u025f\7c\2\2\u025f\u0260\7v\2\2\u0260"+
		"\u0261\7q\2\2\u0261\u0262\7o\2\2\u0262\u0263\7k\2\2\u0263\u0264\7e\2\2"+
		"\u0264\u0092\3\2\2\2\u0265\u0266\7f\2\2\u0266\u0267\7g\2\2\u0267\u0268"+
		"\7u\2\2\u0268\u0269\7e\2\2\u0269\u026a\7t\2\2\u026a\u026b\7k\2\2\u026b"+
		"\u026c\7r\2\2\u026c\u026d\7v\2\2\u026d\u026e\7k\2\2\u026e\u026f\7q\2\2"+
		"\u026f\u0270\7p\2\2\u0270\u0094\3\2\2\2\u0271\u0272\7v\2\2\u0272\u0273"+
		"\7c\2\2\u0273\u0274\7i\2\2\u0274\u0096\3\2\2\2\u0275\u0276\7x\2\2\u0276"+
		"\u0277\7c\2\2\u0277\u0278\7t\2\2\u0278\u0279\7k\2\2\u0279\u027a\7c\2\2"+
		"\u027a\u027b\7d\2\2\u027b\u027c\7n\2\2\u027c\u027d\7g\2\2\u027d\u0098"+
		"\3\2\2\2\u027e\u027f\7?\2\2\u027f\u0280\7\60\2\2\u0280\u0281\7\60\2\2"+
		"\u0281\u009a\3\2\2\2\u0282\u0283\7?\2\2\u0283\u009c\3\2\2\2\u0284\u0285"+
		"\7-\2\2\u0285\u0286\7?\2\2\u0286\u009e\3\2\2\2\u0287\u0288\7/\2\2\u0288"+
		"\u0289\7?\2\2\u0289\u00a0\3\2\2\2\u028a\u028b\7,\2\2\u028b\u028c\7?\2"+
		"\2\u028c\u00a2\3\2\2\2\u028d\u028e\7\61\2\2\u028e\u028f\7\61\2\2\u028f"+
		"\u0290\7?\2\2\u0290\u00a4\3\2\2\2\u0291\u0292\7\'\2\2\u0292\u0293\7?\2"+
		"\2\u0293\u00a6\3\2\2\2\u0294\u0295\7`\2\2\u0295\u0296\7?\2\2\u0296\u00a8"+
		"\3\2\2\2\u0297\u0298\7-\2\2\u0298\u0299\7-\2\2\u0299\u00aa\3\2\2\2\u029a"+
		"\u029b\7/\2\2\u029b\u029c\7/\2\2\u029c\u00ac\3\2\2\2\u029d\u029e\7>\2"+
		"\2\u029e\u00ae\3\2\2\2\u029f\u02a0\7?\2\2\u02a0\u02a1\7>\2\2\u02a1\u00b0"+
		"\3\2\2\2\u02a2\u02a3\7@\2\2\u02a3\u00b2\3\2\2\2\u02a4\u02a5\7@\2\2\u02a5"+
		"\u02a6\7?\2\2\u02a6\u00b4\3\2\2\2\u02a7\u02a8\7?\2\2\u02a8\u02a9\7?\2"+
		"\2\u02a9\u00b6\3\2\2\2\u02aa\u02ab\7#\2\2\u02ab\u02ac\7?\2\2\u02ac\u02ad"+
		"\7?\2\2\u02ad\u00b8\3\2\2\2\u02ae\u02af\7#\2\2\u02af\u02b0\7?\2\2\u02b0"+
		"\u00ba\3\2\2\2\u02b1\u02b2\7,\2\2\u02b2\u02b3\7,\2\2\u02b3\u00bc\3\2\2"+
		"\2\u02b4\u02b5\7,\2\2\u02b5\u00be\3\2\2\2\u02b6\u02bb\7\'\2\2\u02b7\u02b8"+
		"\7o\2\2\u02b8\u02b9\7q\2\2\u02b9\u02bb\7f\2\2\u02ba\u02b6\3\2\2\2\u02ba"+
		"\u02b7\3\2\2\2\u02bb\u00c0\3\2\2\2\u02bc\u02c0\7)\2\2\u02bd\u02bf\n\2"+
		"\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7)"+
		"\2\2\u02c4\u00c2\3\2\2\2\u02c5\u02c9\7$\2\2\u02c6\u02c8\n\3\2\2\u02c7"+
		"\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7$\2\2\u02cd"+
		"\u00c4\3\2\2\2\u02ce\u02cf\t\4\2\2\u02cf\u00c6\3\2\2\2\u02d0\u02d1\t\5"+
		"\2\2\u02d1\u00c8\3\2\2\2\u02d2\u02d3\t\6\2\2\u02d3\u00ca\3\2\2\2\u02d4"+
		"\u02d6\5\u00c9e\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02df\3\2\2\2\u02d9\u02db\7\60\2\2"+
		"\u02da\u02dc\5\u00c9e\2\u02db\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02d9\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u00cc\3\2\2\2\u02e1\u02e3\t\7\2\2\u02e2"+
		"\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2"+
		"\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\bg\2\2\u02e7\u00ce\3\2\2\2\u02e8"+
		"\u02e9\7\61\2\2\u02e9\u02ea\7\61\2\2\u02ea\u02ee\3\2\2\2\u02eb\u02ed\13"+
		"\2\2\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f3\7\17"+
		"\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\7\f\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\bh\2\2\u02f7\u00d0\3\2"+
		"\2\2\u02f8\u02f9\7\61\2\2\u02f9\u02fa\7,\2\2\u02fa\u02fe\3\2\2\2\u02fb"+
		"\u02fd\13\2\2\2\u02fc\u02fb\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02ff\3"+
		"\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0302\7,\2\2\u0302\u0303\7\61\2\2\u0303\u0304\3\2\2\2\u0304\u0305\bi"+
		"\2\2\u0305\u00d2\3\2\2\2!\2\u00d9\u00dc\u00e0\u00f0\u00f4\u0104\u010d"+
		"\u011a\u011e\u0122\u012a\u012e\u0141\u0147\u014d\u014f\u0159\u015b\u023f"+
		"\u024a\u02ba\u02c0\u02c9\u02d7\u02dd\u02df\u02e4\u02ee\u02f2\u02fe\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}