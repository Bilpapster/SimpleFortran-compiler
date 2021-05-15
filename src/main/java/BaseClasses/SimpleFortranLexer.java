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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT_TYPE=6, IDENTIFIER=7, NUMBER=8, 
		WHITESPACE=9, ONE_LINE_COMMENT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "COMMENT_START", "UNDERSCORE", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "NON_ZERO_DIGIT", "INT_TYPE", "IDENTIFIER", "NUMBER", 
			"WHITESPACE", "ONE_LINE_COMMENT"
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
			null, null, null, null, null, null, "INT_TYPE", "IDENTIFIER", "NUMBER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\6(\u00a8"+
		"\n(\r(\16(\u00a9\3(\3(\3(\3(\7(\u00b0\n(\f(\16(\u00b3\13(\3)\3)\6)\u00b7"+
		"\n)\r)\16)\u00b8\3)\7)\u00bc\n)\f)\16)\u00bf\13)\5)\u00c1\n)\3*\3*\3*"+
		"\3*\3+\3+\7+\u00c9\n+\f+\16+\u00cc\13+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\bO\tQ\nS\13U"+
		"\f\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\3\2c|\3\2C\\\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5"+
		"Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21"+
		"e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2"+
		"\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3"+
		"\2\2\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0083\3\2\2\2\61\u0085\3\2\2\2\63"+
		"\u0087\3\2\2\2\65\u0089\3\2\2\2\67\u008b\3\2\2\29\u008d\3\2\2\2;\u008f"+
		"\3\2\2\2=\u0091\3\2\2\2?\u0093\3\2\2\2A\u0095\3\2\2\2C\u0097\3\2\2\2E"+
		"\u0099\3\2\2\2G\u009b\3\2\2\2I\u009d\3\2\2\2K\u009f\3\2\2\2M\u00a1\3\2"+
		"\2\2O\u00a7\3\2\2\2Q\u00c0\3\2\2\2S\u00c2\3\2\2\2U\u00c6\3\2\2\2WX\7?"+
		"\2\2X\4\3\2\2\2YZ\7,\2\2Z\6\3\2\2\2[\\\7\61\2\2\\\b\3\2\2\2]^\7-\2\2^"+
		"\n\3\2\2\2_`\7/\2\2`\f\3\2\2\2ab\7&\2\2b\16\3\2\2\2cd\7a\2\2d\20\3\2\2"+
		"\2ef\t\2\2\2f\22\3\2\2\2gh\t\3\2\2h\24\3\2\2\2ij\t\4\2\2j\26\3\2\2\2k"+
		"l\t\5\2\2l\30\3\2\2\2mn\t\6\2\2n\32\3\2\2\2op\t\7\2\2p\34\3\2\2\2qr\t"+
		"\b\2\2r\36\3\2\2\2st\t\t\2\2t \3\2\2\2uv\t\n\2\2v\"\3\2\2\2wx\t\13\2\2"+
		"x$\3\2\2\2yz\t\f\2\2z&\3\2\2\2{|\t\r\2\2|(\3\2\2\2}~\t\16\2\2~*\3\2\2"+
		"\2\177\u0080\t\17\2\2\u0080,\3\2\2\2\u0081\u0082\t\20\2\2\u0082.\3\2\2"+
		"\2\u0083\u0084\t\21\2\2\u0084\60\3\2\2\2\u0085\u0086\t\22\2\2\u0086\62"+
		"\3\2\2\2\u0087\u0088\t\23\2\2\u0088\64\3\2\2\2\u0089\u008a\t\24\2\2\u008a"+
		"\66\3\2\2\2\u008b\u008c\t\25\2\2\u008c8\3\2\2\2\u008d\u008e\t\26\2\2\u008e"+
		":\3\2\2\2\u008f\u0090\t\27\2\2\u0090<\3\2\2\2\u0091\u0092\t\30\2\2\u0092"+
		">\3\2\2\2\u0093\u0094\t\31\2\2\u0094@\3\2\2\2\u0095\u0096\t\32\2\2\u0096"+
		"B\3\2\2\2\u0097\u0098\t\33\2\2\u0098D\3\2\2\2\u0099\u009a\t\34\2\2\u009a"+
		"F\3\2\2\2\u009b\u009c\t\35\2\2\u009cH\3\2\2\2\u009d\u009e\t\36\2\2\u009e"+
		"J\3\2\2\2\u009f\u00a0\t\37\2\2\u00a0L\3\2\2\2\u00a1\u00a2\5!\21\2\u00a2"+
		"\u00a3\5+\26\2\u00a3\u00a4\5\67\34\2\u00a4N\3\2\2\2\u00a5\u00a8\5E#\2"+
		"\u00a6\u00a8\5G$\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab"+
		"\u00b0\5E#\2\u00ac\u00b0\5G$\2\u00ad\u00b0\5I%\2\u00ae\u00b0\5\17\b\2"+
		"\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"P\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00c1\7\62\2\2\u00b5\u00b7\5K&\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\5I%\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c1R\3\2\2\2"+
		"\u00c2\u00c3\t \2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b*\2\2\u00c5T\3\2"+
		"\2\2\u00c6\u00ca\5\r\7\2\u00c7\u00c9\n!\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b+\2\2\u00ceV\3\2\2\2\13\2\u00a7"+
		"\u00a9\u00af\u00b1\u00b8\u00bd\u00c0\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}