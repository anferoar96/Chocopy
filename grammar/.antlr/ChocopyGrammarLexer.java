// Generated from /home/afromana/Documents/Java/Chocopy/grammar/ChocopyGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocopyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, GLOBAL=2, CLASS=3, NONLOCAL=4, IF=5, ELIF=6, ELSE=7, PRINT=8, 
		FOR=9, WHILE=10, DEF=11, PASS=12, RETURN=13, AND=14, NONE=15, TRUE=16, 
		FALSE=17, OR=18, IN=19, NOT=20, ID=21, STRING=22, INTEGER=23, PIZQ=24, 
		PDER=25, AIZQ=26, ADER=27, PUNTO=28, COMA=29, DOSPUNTOS=30, IGUAL=31, 
		FLECHA=32, BIN_OP=33, TIPO_DATO=34, COMMENT=35, LINE_COMMENT=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "GLOBAL", "CLASS", "NONLOCAL", "IF", "ELIF", "ELSE", "PRINT", 
		"FOR", "WHILE", "DEF", "PASS", "RETURN", "AND", "NONE", "TRUE", "FALSE", 
		"OR", "IN", "NOT", "ID", "STRING", "INTEGER", "PIZQ", "PDER", "AIZQ", 
		"ADER", "PUNTO", "COMA", "DOSPUNTOS", "IGUAL", "FLECHA", "BIN_OP", "TIPO_DATO", 
		"COMMENT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "GLOBAL", "CLASS", "NONLOCAL", "IF", "ELIF", "ELSE", "PRINT", 
		"FOR", "WHILE", "DEF", "PASS", "RETURN", "AND", "NONE", "TRUE", "FALSE", 
		"OR", "IN", "NOT", "ID", "STRING", "INTEGER", "PIZQ", "PDER", "AIZQ", 
		"ADER", "PUNTO", "COMA", "DOSPUNTOS", "IGUAL", "FLECHA", "BIN_OP", "TIPO_DATO", 
		"COMMENT", "LINE_COMMENT", "WS"
	};
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


	public ChocopyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChocopyGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0116\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26"+
		"\u00b3\n\26\f\26\16\26\u00b6\13\26\3\27\3\27\3\30\6\30\u00bb\n\30\r\30"+
		"\16\30\u00bc\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u00e1\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u00f7\n#\3$\3$\3$\3$\7$\u00fd\n$\f$\16$\u0100"+
		"\13$\3$\3$\3$\3$\3$\3%\3%\7%\u0109\n%\f%\16%\u010c\13%\3%\3%\3&\6&\u0111"+
		"\n&\r&\16&\u0112\3&\3&\3\u00fe\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\t\4\2C\\c|"+
		"\6\2\62;C\\aac|\3\2\62;\4\2,-//\4\2>>@@\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\2\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7V\3\2\2\2\t\\"+
		"\3\2\2\2\13e\3\2\2\2\rh\3\2\2\2\17m\3\2\2\2\21r\3\2\2\2\23x\3\2\2\2\25"+
		"|\3\2\2\2\27\u0082\3\2\2\2\31\u0086\3\2\2\2\33\u008b\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0096\3\2\2\2!\u009b\3\2\2\2#\u00a0\3\2\2\2%\u00a6\3\2\2\2"+
		"\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00b0\3\2\2\2-\u00b7\3\2\2\2/\u00ba\3"+
		"\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3\2"+
		"\2\29\u00c6\3\2\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cc\3\2\2\2A\u00ce"+
		"\3\2\2\2C\u00e0\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I\u0106\3\2\2\2K"+
		"\u0110\3\2\2\2MN\7$\2\2N\4\3\2\2\2OP\7i\2\2PQ\7n\2\2QR\7q\2\2RS\7d\2\2"+
		"ST\7c\2\2TU\7n\2\2U\6\3\2\2\2VW\7e\2\2WX\7n\2\2XY\7c\2\2YZ\7u\2\2Z[\7"+
		"u\2\2[\b\3\2\2\2\\]\7p\2\2]^\7q\2\2^_\7p\2\2_`\7n\2\2`a\7q\2\2ab\7e\2"+
		"\2bc\7c\2\2cd\7n\2\2d\n\3\2\2\2ef\7k\2\2fg\7h\2\2g\f\3\2\2\2hi\7g\2\2"+
		"ij\7n\2\2jk\7k\2\2kl\7h\2\2l\16\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7"+
		"g\2\2q\20\3\2\2\2rs\7r\2\2st\7t\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w\22\3\2"+
		"\2\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{\24\3\2\2\2|}\7y\2\2}~\7j\2\2~\177\7k"+
		"\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\26\3\2\2\2\u0082\u0083"+
		"\7f\2\2\u0083\u0084\7g\2\2\u0084\u0085\7h\2\2\u0085\30\3\2\2\2\u0086\u0087"+
		"\7r\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7u\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e"+
		"\u008f\7w\2\2\u008f\u0090\7t\2\2\u0090\u0091\7p\2\2\u0091\34\3\2\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7f\2\2\u0095\36\3\2\2\2\u0096"+
		"\u0097\7P\2\2\u0097\u0098\7q\2\2\u0098\u0099\7p\2\2\u0099\u009a\7g\2\2"+
		"\u009a \3\2\2\2\u009b\u009c\7V\2\2\u009c\u009d\7t\2\2\u009d\u009e\7w\2"+
		"\2\u009e\u009f\7g\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7H\2\2\u00a1\u00a2\7"+
		"c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5$"+
		"\3\2\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7p\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7q\2\2\u00ae\u00af\7v\2\2\u00af*\3\2\2\2\u00b0\u00b4\t\2\2\2\u00b1\u00b3"+
		"\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5,\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\t\2\2\2"+
		"\u00b8.\3\2\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\60\3\2\2\2\u00be"+
		"\u00bf\7*\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\64\3\2\2\2\u00c2"+
		"\u00c3\7]\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7_\2\2\u00c58\3\2\2\2\u00c6"+
		"\u00c7\7\60\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7.\2\2\u00c9<\3\2\2\2\u00ca"+
		"\u00cb\7<\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd@\3\2\2\2\u00ce\u00cf"+
		"\7/\2\2\u00cf\u00d0\7@\2\2\u00d0B\3\2\2\2\u00d1\u00e1\t\5\2\2\u00d2\u00d3"+
		"\7\61\2\2\u00d3\u00e1\7\61\2\2\u00d4\u00e1\7\'\2\2\u00d5\u00d6\7?\2\2"+
		"\u00d6\u00e1\7?\2\2\u00d7\u00d8\7#\2\2\u00d8\u00e1\7?\2\2\u00d9\u00da"+
		"\7>\2\2\u00da\u00e1\7?\2\2\u00db\u00dc\7@\2\2\u00dc\u00e1\7?\2\2\u00dd"+
		"\u00e1\t\6\2\2\u00de\u00df\7k\2\2\u00df\u00e1\7u\2\2\u00e0\u00d1\3\2\2"+
		"\2\u00e0\u00d2\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00d7"+
		"\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7d\2\2\u00e4"+
		"\u00e5\7l\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7e\2\2\u00e7\u00f7\7v\2\2"+
		"\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00f7\7t\2\2\u00eb\u00ec"+
		"\7d\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7q\2\2\u00ee\u00f7\7n\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f7\7v\2\2"+
		"\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f7\7v\2\2\u00f6\u00e2"+
		"\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6"+
		"\u00f3\3\2\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7,\2\2"+
		"\u00fa\u00fe\3\2\2\2\u00fb\u00fd\13\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7,\2\2\u0102\u0103\7\61\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\b$\2\2\u0105H\3\2\2\2\u0106\u010a\7%\2\2\u0107\u0109"+
		"\n\7\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\b%"+
		"\2\2\u010eJ\3\2\2\2\u010f\u0111\t\b\2\2\u0110\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\b&\3\2\u0115L\3\2\2\2\n\2\u00b4\u00bc\u00e0\u00f6\u00fe\u010a\u0112"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}