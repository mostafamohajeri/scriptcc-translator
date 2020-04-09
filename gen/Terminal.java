// Generated from /home/msotafa/IdeaProjects/antr4grammars/src/main/antlr4/grammar/Terminal.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOGICALVALUE", "NUMBER", "CONSTANTNUMBER", "STRING", "STRONGNEGATION", 
			"DEFAULTNEGATION", "ASSIGNOPERATOR", "RELATIONALOPERATOR", "LOGICALOPERATOR1", 
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
			"GREATER", "GREATEREQUAL", "EQUAL", "NOTEQUAL", "POW", "MULTIPLY", "MODULO", 
			"SINGLEQUOTESTRING", "DOUBLEQUOTESTRING", "LOWERCASELETTER", "UPPERCASELETTER", 
			"DIGIT", "DIGITSEQUENCE", "WHITESPACE", "LINECOMMENT", "BLOCKCOMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u02f8\b\1\4\2"+
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
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\5\2\u00d2\n\2"+
		"\3\3\5\3\u00d5\n\3\3\3\3\3\5\3\u00d9\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e9\n\4\3\5\3\5\5\5\u00ed\n\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fc\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0104\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\5\16\u0111\n\16\3\17\3\17\5\17\u0115\n\17\3\20\3\20\5\20\u0119\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0121\n\21\3\22\3\22\5\22\u0125"+
		"\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0138\n\24\3\24\3\24\3\25\3\25\5\25\u013e\n"+
		"\25\3\25\3\25\3\25\3\25\7\25\u0144\n\25\f\25\16\25\u0147\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u0150\n\26\f\26\16\26\u0153\13\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3"+
		"B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0236\nD\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\5E\u0241\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\3N\3O\3O\3"+
		"O\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3W\3"+
		"W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3^\3^\3^\3^\5"+
		"^\u02ad\n^\3_\3_\7_\u02b1\n_\f_\16_\u02b4\13_\3_\3_\3`\3`\7`\u02ba\n`"+
		"\f`\16`\u02bd\13`\3`\3`\3a\3a\3b\3b\3c\3c\3d\6d\u02c8\nd\rd\16d\u02c9"+
		"\3d\3d\6d\u02ce\nd\rd\16d\u02cf\5d\u02d2\nd\3e\6e\u02d5\ne\re\16e\u02d6"+
		"\3e\3e\3f\3f\3f\3f\7f\u02df\nf\ff\16f\u02e2\13f\3f\5f\u02e5\nf\3f\3f\3"+
		"f\3f\3g\3g\3g\3g\7g\u02ef\ng\fg\16g\u02f2\13g\3g\3g\3g\3g\3g\4\u02e0\u02f0"+
		"\2h\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\61\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1"+
		"\2\u00c3\2\u00c5\2\u00c7\2\u00c9\62\u00cb\63\u00cd\64\3\2\b\3\2))\3\2"+
		"$$\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u0300\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2\u0097\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\3\u00d1\3\2\2\2\5\u00d4\3\2\2\2\7\u00e8\3\2\2"+
		"\2\t\u00ec\3\2\2\2\13\u00ee\3\2\2\2\r\u00f0\3\2\2\2\17\u00fb\3\2\2\2\21"+
		"\u0103\3\2\2\2\23\u0105\3\2\2\2\25\u0107\3\2\2\2\27\u0109\3\2\2\2\31\u010b"+
		"\3\2\2\2\33\u0110\3\2\2\2\35\u0114\3\2\2\2\37\u0118\3\2\2\2!\u011a\3\2"+
		"\2\2#\u0124\3\2\2\2%\u012a\3\2\2\2\'\u0131\3\2\2\2)\u013d\3\2\2\2+\u0148"+
		"\3\2\2\2-\u0154\3\2\2\2/\u0156\3\2\2\2\61\u0158\3\2\2\2\63\u015b\3\2\2"+
		"\2\65\u015d\3\2\2\2\67\u015f\3\2\2\29\u0161\3\2\2\2;\u0163\3\2\2\2=\u0166"+
		"\3\2\2\2?\u0169\3\2\2\2A\u016c\3\2\2\2C\u016f\3\2\2\2E\u0171\3\2\2\2G"+
		"\u0173\3\2\2\2I\u0175\3\2\2\2K\u0177\3\2\2\2M\u0179\3\2\2\2O\u017b\3\2"+
		"\2\2Q\u017e\3\2\2\2S\u0181\3\2\2\2U\u0183\3\2\2\2W\u0185\3\2\2\2Y\u0187"+
		"\3\2\2\2[\u0189\3\2\2\2]\u018b\3\2\2\2_\u018d\3\2\2\2a\u018f\3\2\2\2c"+
		"\u0191\3\2\2\2e\u0194\3\2\2\2g\u0197\3\2\2\2i\u019d\3\2\2\2k\u01a5\3\2"+
		"\2\2m\u01ae\3\2\2\2o\u01b8\3\2\2\2q\u01c1\3\2\2\2s\u01c8\3\2\2\2u\u01d0"+
		"\3\2\2\2w\u01db\3\2\2\2y\u01ec\3\2\2\2{\u01fd\3\2\2\2}\u020a\3\2\2\2\177"+
		"\u0217\3\2\2\2\u0081\u0222\3\2\2\2\u0083\u0225\3\2\2\2\u0085\u0228\3\2"+
		"\2\2\u0087\u0235\3\2\2\2\u0089\u0240\3\2\2\2\u008b\u0242\3\2\2\2\u008d"+
		"\u024b\3\2\2\2\u008f\u0254\3\2\2\2\u0091\u025b\3\2\2\2\u0093\u0267\3\2"+
		"\2\2\u0095\u026b\3\2\2\2\u0097\u0274\3\2\2\2\u0099\u0278\3\2\2\2\u009b"+
		"\u027a\3\2\2\2\u009d\u027d\3\2\2\2\u009f\u0280\3\2\2\2\u00a1\u0283\3\2"+
		"\2\2\u00a3\u0287\3\2\2\2\u00a5\u028a\3\2\2\2\u00a7\u028d\3\2\2\2\u00a9"+
		"\u0290\3\2\2\2\u00ab\u0293\3\2\2\2\u00ad\u0295\3\2\2\2\u00af\u0298\3\2"+
		"\2\2\u00b1\u029a\3\2\2\2\u00b3\u029d\3\2\2\2\u00b5\u02a0\3\2\2\2\u00b7"+
		"\u02a3\3\2\2\2\u00b9\u02a6\3\2\2\2\u00bb\u02ac\3\2\2\2\u00bd\u02ae\3\2"+
		"\2\2\u00bf\u02b7\3\2\2\2\u00c1\u02c0\3\2\2\2\u00c3\u02c2\3\2\2\2\u00c5"+
		"\u02c4\3\2\2\2\u00c7\u02c7\3\2\2\2\u00c9\u02d4\3\2\2\2\u00cb\u02da\3\2"+
		"\2\2\u00cd\u02ea\3\2\2\2\u00cf\u00d2\5\u0087D\2\u00d0\u00d2\5\u0089E\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\4\3\2\2\2\u00d3\u00d5\5"+
		"a\61\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d9\5\7\4\2\u00d7\u00d9\5\u00c7d\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\6\3\2\2\2\u00da\u00e9\5e\63\2\u00db\u00e9\5g\64\2\u00dc"+
		"\u00e9\5i\65\2\u00dd\u00e9\5k\66\2\u00de\u00e9\5m\67\2\u00df\u00e9\5o"+
		"8\2\u00e0\u00e9\5q9\2\u00e1\u00e9\5s:\2\u00e2\u00e9\5u;\2\u00e3\u00e9"+
		"\5w<\2\u00e4\u00e9\5y=\2\u00e5\u00e9\5{>\2\u00e6\u00e9\5}?\2\u00e7\u00e9"+
		"\5\177@\2\u00e8\u00da\3\2\2\2\u00e8\u00db\3\2\2\2\u00e8\u00dc\3\2\2\2"+
		"\u00e8\u00dd\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0"+
		"\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\b\3\2\2\2\u00ea\u00ed\5\u00bd_\2\u00eb\u00ed\5\u00bf`\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\n\3\2\2\2\u00ee\u00ef\7\u0080"+
		"\2\2\u00ef\f\3\2\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\16\3\2\2\2\u00f4\u00fc\5\u0099M\2\u00f5\u00fc\5\u009bN\2"+
		"\u00f6\u00fc\5\u009dO\2\u00f7\u00fc\5\u009fP\2\u00f8\u00fc\5\u00a1Q\2"+
		"\u00f9\u00fc\5\u00a3R\2\u00fa\u00fc\5\u00a5S\2\u00fb\u00f4\3\2\2\2\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\20\3\2\2\2\u00fd\u0104"+
		"\5\u00b3Z\2\u00fe\u0104\5\u00b5[\2\u00ff\u0104\5\u00abV\2\u0100\u0104"+
		"\5\u00adW\2\u0101\u0104\5\u00afX\2\u0102\u0104\5\u00b1Y\2\u0103\u00fd"+
		"\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\22\3\2\2\2\u0105\u0106\5\u0085"+
		"C\2\u0106\24\3\2\2\2\u0107\u0108\5\u0081A\2\u0108\26\3\2\2\2\u0109\u010a"+
		"\5\u0083B\2\u010a\30\3\2\2\2\u010b\u010c\5\u00b7\\\2\u010c\32\3\2\2\2"+
		"\u010d\u0111\5\u00b9]\2\u010e\u0111\5c\62\2\u010f\u0111\5\u00bb^\2\u0110"+
		"\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\34\3\2\2"+
		"\2\u0112\u0115\5_\60\2\u0113\u0115\5a\61\2\u0114\u0112\3\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\36\3\2\2\2\u0116\u0119\5\u00a7T\2\u0117\u0119\5\u00a9U"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119 \3\2\2\2\u011a\u0120"+
		"\5C\"\2\u011b\u0121\5\'\24\2\u011c\u0121\5%\23\2\u011d\u0121\5#\22\2\u011e"+
		"\u0121\5\u008dG\2\u011f\u0121\5\u008fH\2\u0120\u011b\3\2\2\2\u0120\u011c"+
		"\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\"\3\2\2\2\u0122\u0125\5\u0091I\2\u0123\u0125\5\u0093J\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\5S*\2\u0127"+
		"\u0128\5\t\5\2\u0128\u0129\5U+\2\u0129$\3\2\2\2\u012a\u012b\5\u0095K\2"+
		"\u012b\u012c\5S*\2\u012c\u012d\5)\25\2\u012d\u012e\5/\30\2\u012e\u012f"+
		"\5\t\5\2\u012f\u0130\5U+\2\u0130&\3\2\2\2\u0131\u0132\5\u008bF\2\u0132"+
		"\u0133\5S*\2\u0133\u0134\5)\25\2\u0134\u0137\5/\30\2\u0135\u0138\5\5\3"+
		"\2\u0136\u0138\5\t\5\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013a\5U+\2\u013a(\3\2\2\2\u013b\u013e\5\u00c3b\2\u013c"+
		"\u013e\5K&\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0145\3\2\2"+
		"\2\u013f\u0144\5\u00c1a\2\u0140\u0144\5\u00c3b\2\u0141\u0144\5\u00c5c"+
		"\2\u0142\u0144\5M\'\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146*\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0151\5\u00c1"+
		"a\2\u0149\u0150\5\u00c1a\2\u014a\u0150\5\u00c3b\2\u014b\u0150\5\u00c5"+
		"c\2\u014c\u0150\5M\'\2\u014d\u0150\5a\61\2\u014e\u0150\5K&\2\u014f\u0149"+
		"\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152,\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155"+
		"\7#\2\2\u0155.\3\2\2\2\u0156\u0157\7.\2\2\u0157\60\3\2\2\2\u0158\u0159"+
		"\7#\2\2\u0159\u015a\7#\2\2\u015a\62\3\2\2\2\u015b\u015c\7A\2\2\u015c\64"+
		"\3\2\2\2\u015d\u015e\7&\2\2\u015e\66\3\2\2\2\u015f\u0160\7~\2\2\u0160"+
		"8\3\2\2\2\u0161\u0162\7%\2\2\u0162:\3\2\2\2\u0163\u0164\7>\2\2\u0164\u0165"+
		"\7/\2\2\u0165<\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0168\7@\2\2\u0168>\3"+
		"\2\2\2\u0169\u016a\7?\2\2\u016a\u016b\7@\2\2\u016b@\3\2\2\2\u016c\u016d"+
		"\7<\2\2\u016d\u016e\7/\2\2\u016eB\3\2\2\2\u016f\u0170\7B\2\2\u0170D\3"+
		"\2\2\2\u0171\u0172\7<\2\2\u0172F\3\2\2\2\u0173\u0174\7=\2\2\u0174H\3\2"+
		"\2\2\u0175\u0176\7\60\2\2\u0176J\3\2\2\2\u0177\u0178\7a\2\2\u0178L\3\2"+
		"\2\2\u0179\u017a\7\61\2\2\u017aN\3\2\2\2\u017b\u017c\7>\2\2\u017c\u017d"+
		"\7>\2\2\u017dP\3\2\2\2\u017e\u017f\7@\2\2\u017f\u0180\7@\2\2\u0180R\3"+
		"\2\2\2\u0181\u0182\7*\2\2\u0182T\3\2\2\2\u0183\u0184\7+\2\2\u0184V\3\2"+
		"\2\2\u0185\u0186\7]\2\2\u0186X\3\2\2\2\u0187\u0188\7_\2\2\u0188Z\3\2\2"+
		"\2\u0189\u018a\7}\2\2\u018a\\\3\2\2\2\u018b\u018c\7\177\2\2\u018c^\3\2"+
		"\2\2\u018d\u018e\7-\2\2\u018e`\3\2\2\2\u018f\u0190\7/\2\2\u0190b\3\2\2"+
		"\2\u0191\u0192\7\61\2\2\u0192\u0193\7\61\2\2\u0193d\3\2\2\2\u0194\u0195"+
		"\7r\2\2\u0195\u0196\7k\2\2\u0196f\3\2\2\2\u0197\u0198\7g\2\2\u0198\u0199"+
		"\7w\2\2\u0199\u019a\7n\2\2\u019a\u019b\7g\2\2\u019b\u019c\7t\2\2\u019c"+
		"h\3\2\2\2\u019d\u019e\7i\2\2\u019e\u019f\7t\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01a1\7x\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7{\2\2"+
		"\u01a4j\3\2\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7x\2\2\u01a7\u01a8\7q\2"+
		"\2\u01a8\u01a9\7i\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7f\2\2\u01ab\u01ac"+
		"\7t\2\2\u01ac\u01ad\7q\2\2\u01adl\3\2\2\2\u01ae\u01af\7d\2\2\u01af\u01b0"+
		"\7q\2\2\u01b0\u01b1\7n\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7|\2\2\u01b3"+
		"\u01b4\7o\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7p\2\2"+
		"\u01b7n\3\2\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7g\2"+
		"\2\u01bb\u01bc\7e\2\2\u01bc\u01bd\7v\2\2\u01bd\u01be\7t\2\2\u01be\u01bf"+
		"\7q\2\2\u01bf\u01c0\7p\2\2\u01c0p\3\2\2\2\u01c1\u01c2\7r\2\2\u01c2\u01c3"+
		"\7t\2\2\u01c3\u01c4\7q\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7q\2\2\u01c6"+
		"\u01c7\7p\2\2\u01c7r\3\2\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7g\2\2\u01ca"+
		"\u01cb\7w\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce\7q\2\2"+
		"\u01ce\u01cf\7p\2\2\u01cft\3\2\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7k\2"+
		"\2\u01d2\u01d3\7i\2\2\u01d3\u01d4\7j\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6"+
		"\7u\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8\7g\2\2\u01d8\u01d9\7g\2\2\u01d9"+
		"\u01da\7f\2\2\u01dav\3\2\2\2\u01db\u01dc\7r\2\2\u01dc\u01dd\7q\2\2\u01dd"+
		"\u01de\7u\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7k\2\2"+
		"\u01e1\u01e2\7x\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5"+
		"\7p\2\2\u01e5\u01e6\7h\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7p\2\2\u01e8"+
		"\u01e9\7k\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7{\2\2\u01ebx\3\2\2\2\u01ec"+
		"\u01ed\7p\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef\7i\2\2\u01ef\u01f0\7c\2\2"+
		"\u01f0\u01f1\7v\2\2\u01f1\u01f2\7k\2\2\u01f2\u01f3\7x\2\2\u01f3\u01f4"+
		"\7g\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7h\2\2\u01f7"+
		"\u01f8\7k\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7v\2\2"+
		"\u01fb\u01fc\7{\2\2\u01fcz\3\2\2\2\u01fd\u01fe\7o\2\2\u01fe\u01ff\7c\2"+
		"\2\u01ff\u0200\7z\2\2\u0200\u0201\7k\2\2\u0201\u0202\7o\2\2\u0202\u0203"+
		"\7w\2\2\u0203\u0204\7o\2\2\u0204\u0205\7x\2\2\u0205\u0206\7c\2\2\u0206"+
		"\u0207\7n\2\2\u0207\u0208\7w\2\2\u0208\u0209\7g\2\2\u0209|\3\2\2\2\u020a"+
		"\u020b\7o\2\2\u020b\u020c\7k\2\2\u020c\u020d\7p\2\2\u020d\u020e\7k\2\2"+
		"\u020e\u020f\7o\2\2\u020f\u0210\7w\2\2\u0210\u0211\7o\2\2\u0211\u0212"+
		"\7x\2\2\u0212\u0213\7c\2\2\u0213\u0214\7n\2\2\u0214\u0215\7w\2\2\u0215"+
		"\u0216\7g\2\2\u0216~\3\2\2\2\u0217\u0218\7p\2\2\u0218\u0219\7q\2\2\u0219"+
		"\u021a\7v\2\2\u021a\u021b\7c\2\2\u021b\u021c\7p\2\2\u021c\u021d\7w\2\2"+
		"\u021d\u021e\7o\2\2\u021e\u021f\7d\2\2\u021f\u0220\7g\2\2\u0220\u0221"+
		"\7t\2\2\u0221\u0080\3\2\2\2\u0222\u0223\7(\2\2\u0223\u0224\7(\2\2\u0224"+
		"\u0082\3\2\2\2\u0225\u0226\7~\2\2\u0226\u0227\7~\2\2\u0227\u0084\3\2\2"+
		"\2\u0228\u0229\7`\2\2\u0229\u0086\3\2\2\2\u022a\u022b\7v\2\2\u022b\u022c"+
		"\7t\2\2\u022c\u022d\7w\2\2\u022d\u0236\7g\2\2\u022e\u022f\7u\2\2\u022f"+
		"\u0230\7w\2\2\u0230\u0231\7e\2\2\u0231\u0232\7e\2\2\u0232\u0233\7g\2\2"+
		"\u0233\u0234\7u\2\2\u0234\u0236\7u\2\2\u0235\u022a\3\2\2\2\u0235\u022e"+
		"\3\2\2\2\u0236\u0088\3\2\2\2\u0237\u0238\7h\2\2\u0238\u0239\7c\2\2\u0239"+
		"\u023a\7n\2\2\u023a\u023b\7u\2\2\u023b\u0241\7g\2\2\u023c\u023d\7h\2\2"+
		"\u023d\u023e\7c\2\2\u023e\u023f\7k\2\2\u023f\u0241\7n\2\2\u0240\u0237"+
		"\3\2\2\2\u0240\u023c\3\2\2\2\u0241\u008a\3\2\2\2\u0242\u0243\7e\2\2\u0243"+
		"\u0244\7q\2\2\u0244\u0245\7p\2\2\u0245\u0246\7u\2\2\u0246\u0247\7v\2\2"+
		"\u0247\u0248\7c\2\2\u0248\u0249\7p\2\2\u0249\u024a\7v\2\2\u024a\u008c"+
		"\3\2\2\2\u024b\u024c\7r\2\2\u024c\u024d\7c\2\2\u024d\u024e\7t\2\2\u024e"+
		"\u024f\7c\2\2\u024f\u0250\7n\2\2\u0250\u0251\7n\2\2\u0251\u0252\7g\2\2"+
		"\u0252\u0253\7n\2\2\u0253\u008e\3\2\2\2\u0254\u0255\7c\2\2\u0255\u0256"+
		"\7v\2\2\u0256\u0257\7q\2\2\u0257\u0258\7o\2\2\u0258\u0259\7k\2\2\u0259"+
		"\u025a\7e\2\2\u025a\u0090\3\2\2\2\u025b\u025c\7f\2\2\u025c\u025d\7g\2"+
		"\2\u025d\u025e\7u\2\2\u025e\u025f\7e\2\2\u025f\u0260\7t\2\2\u0260\u0261"+
		"\7k\2\2\u0261\u0262\7r\2\2\u0262\u0263\7v\2\2\u0263\u0264\7k\2\2\u0264"+
		"\u0265\7q\2\2\u0265\u0266\7p\2\2\u0266\u0092\3\2\2\2\u0267\u0268\7v\2"+
		"\2\u0268\u0269\7c\2\2\u0269\u026a\7i\2\2\u026a\u0094\3\2\2\2\u026b\u026c"+
		"\7x\2\2\u026c\u026d\7c\2\2\u026d\u026e\7t\2\2\u026e\u026f\7k\2\2\u026f"+
		"\u0270\7c\2\2\u0270\u0271\7d\2\2\u0271\u0272\7n\2\2\u0272\u0273\7g\2\2"+
		"\u0273\u0096\3\2\2\2\u0274\u0275\7?\2\2\u0275\u0276\7\60\2\2\u0276\u0277"+
		"\7\60\2\2\u0277\u0098\3\2\2\2\u0278\u0279\7?\2\2\u0279\u009a\3\2\2\2\u027a"+
		"\u027b\7-\2\2\u027b\u027c\7?\2\2\u027c\u009c\3\2\2\2\u027d\u027e\7/\2"+
		"\2\u027e\u027f\7?\2\2\u027f\u009e\3\2\2\2\u0280\u0281\7,\2\2\u0281\u0282"+
		"\7?\2\2\u0282\u00a0\3\2\2\2\u0283\u0284\7\61\2\2\u0284\u0285\7\61\2\2"+
		"\u0285\u0286\7?\2\2\u0286\u00a2\3\2\2\2\u0287\u0288\7\'\2\2\u0288\u0289"+
		"\7?\2\2\u0289\u00a4\3\2\2\2\u028a\u028b\7`\2\2\u028b\u028c\7?\2\2\u028c"+
		"\u00a6\3\2\2\2\u028d\u028e\7-\2\2\u028e\u028f\7-\2\2\u028f\u00a8\3\2\2"+
		"\2\u0290\u0291\7/\2\2\u0291\u0292\7/\2\2\u0292\u00aa\3\2\2\2\u0293\u0294"+
		"\7>\2\2\u0294\u00ac\3\2\2\2\u0295\u0296\7>\2\2\u0296\u0297\7?\2\2\u0297"+
		"\u00ae\3\2\2\2\u0298\u0299\7@\2\2\u0299\u00b0\3\2\2\2\u029a\u029b\7@\2"+
		"\2\u029b\u029c\7?\2\2\u029c\u00b2\3\2\2\2\u029d\u029e\7?\2\2\u029e\u029f"+
		"\7?\2\2\u029f\u00b4\3\2\2\2\u02a0\u02a1\7#\2\2\u02a1\u02a2\7?\2\2\u02a2"+
		"\u00b6\3\2\2\2\u02a3\u02a4\7,\2\2\u02a4\u02a5\7,\2\2\u02a5\u00b8\3\2\2"+
		"\2\u02a6\u02a7\7,\2\2\u02a7\u00ba\3\2\2\2\u02a8\u02ad\7\'\2\2\u02a9\u02aa"+
		"\7o\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ad\7f\2\2\u02ac\u02a8\3\2\2\2\u02ac"+
		"\u02a9\3\2\2\2\u02ad\u00bc\3\2\2\2\u02ae\u02b2\7)\2\2\u02af\u02b1\n\2"+
		"\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\7)"+
		"\2\2\u02b6\u00be\3\2\2\2\u02b7\u02bb\7$\2\2\u02b8\u02ba\n\3\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7$\2\2\u02bf"+
		"\u00c0\3\2\2\2\u02c0\u02c1\t\4\2\2\u02c1\u00c2\3\2\2\2\u02c2\u02c3\t\5"+
		"\2\2\u02c3\u00c4\3\2\2\2\u02c4\u02c5\t\6\2\2\u02c5\u00c6\3\2\2\2\u02c6"+
		"\u02c8\5\u00c5c\2\u02c7\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02c7"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02d1\3\2\2\2\u02cb\u02cd\7\60\2\2"+
		"\u02cc\u02ce\5\u00c5c\2\u02cd\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cb\3\2"+
		"\2\2\u02d1\u02d2\3\2\2\2\u02d2\u00c8\3\2\2\2\u02d3\u02d5\t\7\2\2\u02d4"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\be\2\2\u02d9\u00ca\3\2\2\2\u02da"+
		"\u02db\7\61\2\2\u02db\u02dc\7\61\2\2\u02dc\u02e0\3\2\2\2\u02dd\u02df\13"+
		"\2\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e5\7\17"+
		"\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\7\f\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\bf\2\2\u02e9\u00cc\3\2"+
		"\2\2\u02ea\u02eb\7\61\2\2\u02eb\u02ec\7,\2\2\u02ec\u02f0\3\2\2\2\u02ed"+
		"\u02ef\13\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02f1\3"+
		"\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3"+
		"\u02f4\7,\2\2\u02f4\u02f5\7\61\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\bg"+
		"\2\2\u02f7\u00ce\3\2\2\2!\2\u00d1\u00d4\u00d8\u00e8\u00ec\u00fb\u0103"+
		"\u0110\u0114\u0118\u0120\u0124\u0137\u013d\u0143\u0145\u014f\u0151\u0235"+
		"\u0240\u02ac\u02b2\u02bb\u02c9\u02cf\u02d1\u02d6\u02e0\u02e4\u02f0\3\b"+
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