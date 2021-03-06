// Generated from D:/Papster/Codes/Antlr/SimpleFortran/src/main/ANTLRv4 Grammars\SimpleFortran.g4 by ANTLR 4.9.1
package BaseClasses;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleFortranLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT_TYPE=6, FLOAT_TYPE=7, BOOL_TYPE=8, 
		STRING_TYPE=9, TRUE_KEYWORD=10, FALSE_KEYWORD=11, IDENTIFIER=12, NUMBER=13, 
		WHITESPACE=14, ONE_LINE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "A", "B", "C", "D", "E", "F", 
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", "Z", "COMMENT_START", "UNDERSCORE", "LOWERCASE", 
			"UPPERCASE", "LETTER", "DIGIT", "NON_ZERO_DIGIT", "INT_TYPE", "FLOAT_TYPE", 
			"BOOL_TYPE", "STRING_TYPE", "TRUE_KEYWORD", "FALSE_KEYWORD", "IDENTIFIER", 
			"NUMBER", "WHITESPACE", "ONE_LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", 
			"STRING_TYPE", "TRUE_KEYWORD", "FALSE_KEYWORD", "IDENTIFIER", "NUMBER", 
			"WHITESPACE", "ONE_LINE_COMMENT"
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


	public SimpleFortranLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleFortran.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0109\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\6.\u00d2"+
		"\n.\r.\16.\u00d3\3.\3.\7.\u00d8\n.\f.\16.\u00db\13.\3.\5.\u00de\n.\3."+
		"\3.\6.\u00e2\n.\r.\16.\u00e3\3.\3.\7.\u00e8\n.\f.\16.\u00eb\13.\5.\u00ed"+
		"\n.\3/\3/\6/\u00f1\n/\r/\16/\u00f2\3/\7/\u00f6\n/\f/\16/\u00f9\13/\5/"+
		"\u00fb\n/\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0103\n\61\f\61\16\61\u0106"+
		"\13\61\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2"+
		";\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\bQ\tS\nU\13W\fY\r[\16]\17_\20a\21\3\2"+
		"#\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\3\2c|\3\2C\\\4\2C\\c|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3"+
		"\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3"+
		"\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37"+
		"\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2\2\'\u0087\3\2"+
		"\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u008f\3\2\2\2\61\u0091"+
		"\3\2\2\2\63\u0093\3\2\2\2\65\u0095\3\2\2\2\67\u0097\3\2\2\29\u0099\3\2"+
		"\2\2;\u009b\3\2\2\2=\u009d\3\2\2\2?\u009f\3\2\2\2A\u00a1\3\2\2\2C\u00a3"+
		"\3\2\2\2E\u00a5\3\2\2\2G\u00a7\3\2\2\2I\u00a9\3\2\2\2K\u00ab\3\2\2\2M"+
		"\u00ad\3\2\2\2O\u00af\3\2\2\2Q\u00b3\3\2\2\2S\u00b9\3\2\2\2U\u00be\3\2"+
		"\2\2W\u00c5\3\2\2\2Y\u00ca\3\2\2\2[\u00d1\3\2\2\2]\u00fa\3\2\2\2_\u00fc"+
		"\3\2\2\2a\u0100\3\2\2\2cd\7?\2\2d\4\3\2\2\2ef\7,\2\2f\6\3\2\2\2gh\7\61"+
		"\2\2h\b\3\2\2\2ij\7-\2\2j\n\3\2\2\2kl\7/\2\2l\f\3\2\2\2mn\t\2\2\2n\16"+
		"\3\2\2\2op\t\3\2\2p\20\3\2\2\2qr\t\4\2\2r\22\3\2\2\2st\t\5\2\2t\24\3\2"+
		"\2\2uv\t\6\2\2v\26\3\2\2\2wx\t\7\2\2x\30\3\2\2\2yz\t\b\2\2z\32\3\2\2\2"+
		"{|\t\t\2\2|\34\3\2\2\2}~\t\n\2\2~\36\3\2\2\2\177\u0080\t\13\2\2\u0080"+
		" \3\2\2\2\u0081\u0082\t\f\2\2\u0082\"\3\2\2\2\u0083\u0084\t\r\2\2\u0084"+
		"$\3\2\2\2\u0085\u0086\t\16\2\2\u0086&\3\2\2\2\u0087\u0088\t\17\2\2\u0088"+
		"(\3\2\2\2\u0089\u008a\t\20\2\2\u008a*\3\2\2\2\u008b\u008c\t\21\2\2\u008c"+
		",\3\2\2\2\u008d\u008e\t\22\2\2\u008e.\3\2\2\2\u008f\u0090\t\23\2\2\u0090"+
		"\60\3\2\2\2\u0091\u0092\t\24\2\2\u0092\62\3\2\2\2\u0093\u0094\t\25\2\2"+
		"\u0094\64\3\2\2\2\u0095\u0096\t\26\2\2\u0096\66\3\2\2\2\u0097\u0098\t"+
		"\27\2\2\u00988\3\2\2\2\u0099\u009a\t\30\2\2\u009a:\3\2\2\2\u009b\u009c"+
		"\t\31\2\2\u009c<\3\2\2\2\u009d\u009e\t\32\2\2\u009e>\3\2\2\2\u009f\u00a0"+
		"\t\33\2\2\u00a0@\3\2\2\2\u00a1\u00a2\7&\2\2\u00a2B\3\2\2\2\u00a3\u00a4"+
		"\7a\2\2\u00a4D\3\2\2\2\u00a5\u00a6\t\34\2\2\u00a6F\3\2\2\2\u00a7\u00a8"+
		"\t\35\2\2\u00a8H\3\2\2\2\u00a9\u00aa\t\36\2\2\u00aaJ\3\2\2\2\u00ab\u00ac"+
		"\t\37\2\2\u00acL\3\2\2\2\u00ad\u00ae\t \2\2\u00aeN\3\2\2\2\u00af\u00b0"+
		"\5\35\17\2\u00b0\u00b1\5\'\24\2\u00b1\u00b2\5\63\32\2\u00b2P\3\2\2\2\u00b3"+
		"\u00b4\5\27\f\2\u00b4\u00b5\5#\22\2\u00b5\u00b6\5)\25\2\u00b6\u00b7\5"+
		"\r\7\2\u00b7\u00b8\5\63\32\2\u00b8R\3\2\2\2\u00b9\u00ba\5\17\b\2\u00ba"+
		"\u00bb\5)\25\2\u00bb\u00bc\5)\25\2\u00bc\u00bd\5#\22\2\u00bdT\3\2\2\2"+
		"\u00be\u00bf\5\61\31\2\u00bf\u00c0\5\63\32\2\u00c0\u00c1\5/\30\2\u00c1"+
		"\u00c2\5\35\17\2\u00c2\u00c3\5\'\24\2\u00c3\u00c4\5\31\r\2\u00c4V\3\2"+
		"\2\2\u00c5\u00c6\5\63\32\2\u00c6\u00c7\5/\30\2\u00c7\u00c8\5\65\33\2\u00c8"+
		"\u00c9\5\25\13\2\u00c9X\3\2\2\2\u00ca\u00cb\5\27\f\2\u00cb\u00cc\5\r\7"+
		"\2\u00cc\u00cd\5#\22\2\u00cd\u00ce\5\61\31\2\u00ce\u00cf\5\25\13\2\u00cf"+
		"Z\3\2\2\2\u00d0\u00d2\5I%\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00ec\3\2\2\2\u00d5\u00d8\5I"+
		"%\2\u00d6\u00d8\5K&\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00ed\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\5C\"\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e9\3\2\2\2\u00df\u00e2\5I%\2\u00e0\u00e2\5K&\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5C\"\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e1\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00d9\3\2"+
		"\2\2\u00ec\u00dd\3\2\2\2\u00ed\\\3\2\2\2\u00ee\u00fb\7\62\2\2\u00ef\u00f1"+
		"\5M\'\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\5K&\2\u00f5\u00f4\3\2\2"+
		"\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fb"+
		"^\3\2\2\2\u00fc\u00fd\t!\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\60\2\2"+
		"\u00ff`\3\2\2\2\u0100\u0104\5A!\2\u0101\u0103\n\"\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\b\61\2\2\u0108b\3\2\2\2"+
		"\17\2\u00d3\u00d7\u00d9\u00dd\u00e1\u00e3\u00e9\u00ec\u00f2\u00f7\u00fa"+
		"\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}