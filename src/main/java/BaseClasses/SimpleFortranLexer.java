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
		T__0=1, T__1=2, T__2=3, INT_TYPE=4, IDENTIFIER=5, NUMBER=6, WHITESPACE=7, 
		ONE_LINE_COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "COMMENT_START", "UNDERSCORE", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LOWERCASE", "UPPERCASE", 
			"DIGIT", "NON_ZERO_DIGIT", "INT_TYPE", "IDENTIFIER", "NUMBER", "WHITESPACE", 
			"ONE_LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT_TYPE", "IDENTIFIER", "NUMBER", "WHITESPACE", 
			"ONE_LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\6&\u00a0\n&\r&\16&\u00a1\3&\3&\3"+
		"&\3&\7&\u00a8\n&\f&\16&\u00ab\13&\3\'\3\'\6\'\u00af\n\'\r\'\16\'\u00b0"+
		"\3\'\7\'\u00b4\n\'\f\'\16\'\u00b7\13\'\5\'\u00b9\n\'\3(\3(\3(\3(\3)\3"+
		")\7)\u00c1\n)\f)\16)\u00c4\13)\3)\3)\2\2*\3\3\5\4\7\5\t\2\13\2\r\2\17"+
		"\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\6K\7M\bO\tQ\n\3\2\"\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2c"+
		"|\3\2C\\\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00b0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2"+
		"\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3"+
		"\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2"+
		"\2\2%u\3\2\2\2\'w\3\2\2\2)y\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61"+
		"\u0081\3\2\2\2\63\u0083\3\2\2\2\65\u0085\3\2\2\2\67\u0087\3\2\2\29\u0089"+
		"\3\2\2\2;\u008b\3\2\2\2=\u008d\3\2\2\2?\u008f\3\2\2\2A\u0091\3\2\2\2C"+
		"\u0093\3\2\2\2E\u0095\3\2\2\2G\u0097\3\2\2\2I\u0099\3\2\2\2K\u009f\3\2"+
		"\2\2M\u00b8\3\2\2\2O\u00ba\3\2\2\2Q\u00be\3\2\2\2ST\7?\2\2T\4\3\2\2\2"+
		"UV\7,\2\2V\6\3\2\2\2WX\7-\2\2X\b\3\2\2\2YZ\7&\2\2Z\n\3\2\2\2[\\\7a\2\2"+
		"\\\f\3\2\2\2]^\t\2\2\2^\16\3\2\2\2_`\t\3\2\2`\20\3\2\2\2ab\t\4\2\2b\22"+
		"\3\2\2\2cd\t\5\2\2d\24\3\2\2\2ef\t\6\2\2f\26\3\2\2\2gh\t\7\2\2h\30\3\2"+
		"\2\2ij\t\b\2\2j\32\3\2\2\2kl\t\t\2\2l\34\3\2\2\2mn\t\n\2\2n\36\3\2\2\2"+
		"op\t\13\2\2p \3\2\2\2qr\t\f\2\2r\"\3\2\2\2st\t\r\2\2t$\3\2\2\2uv\t\16"+
		"\2\2v&\3\2\2\2wx\t\17\2\2x(\3\2\2\2yz\t\20\2\2z*\3\2\2\2{|\t\21\2\2|,"+
		"\3\2\2\2}~\t\22\2\2~.\3\2\2\2\177\u0080\t\23\2\2\u0080\60\3\2\2\2\u0081"+
		"\u0082\t\24\2\2\u0082\62\3\2\2\2\u0083\u0084\t\25\2\2\u0084\64\3\2\2\2"+
		"\u0085\u0086\t\26\2\2\u0086\66\3\2\2\2\u0087\u0088\t\27\2\2\u00888\3\2"+
		"\2\2\u0089\u008a\t\30\2\2\u008a:\3\2\2\2\u008b\u008c\t\31\2\2\u008c<\3"+
		"\2\2\2\u008d\u008e\t\32\2\2\u008e>\3\2\2\2\u008f\u0090\t\33\2\2\u0090"+
		"@\3\2\2\2\u0091\u0092\t\34\2\2\u0092B\3\2\2\2\u0093\u0094\t\35\2\2\u0094"+
		"D\3\2\2\2\u0095\u0096\t\36\2\2\u0096F\3\2\2\2\u0097\u0098\t\37\2\2\u0098"+
		"H\3\2\2\2\u0099\u009a\5\35\17\2\u009a\u009b\5\'\24\2\u009b\u009c\5\63"+
		"\32\2\u009cJ\3\2\2\2\u009d\u00a0\5A!\2\u009e\u00a0\5C\"\2\u009f\u009d"+
		"\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a8\5A!\2\u00a4\u00a8\5C\""+
		"\2\u00a5\u00a8\5E#\2\u00a6\u00a8\5\13\6\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aaL\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00b9\7\62\2\2\u00ad\u00af\5G$\2\u00ae\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\3\2\2\2\u00b2"+
		"\u00b4\5E#\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ac"+
		"\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b9N\3\2\2\2\u00ba\u00bb\t \2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\b(\2\2\u00bdP\3\2\2\2\u00be\u00c2\5\t\5\2\u00bf\u00c1"+
		"\n!\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\b)"+
		"\2\2\u00c6R\3\2\2\2\13\2\u009f\u00a1\u00a7\u00a9\u00b0\u00b5\u00b8\u00c2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}