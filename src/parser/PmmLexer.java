// Generated from C:/Users/laisg/IdeaProjects/DLP/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, ID=2, COMMENTARIO=3, COMENTARIO_MULTILINEA=4, TRASH=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "CARACTER", "INT_CONSTANT", "ID", "COMMENTARIO", "COMENTARIO_MULTILINEA", 
			"TRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "ID", "COMMENTARIO", "COMENTARIO_MULTILINEA", "TRASH"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7K\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\6\4\31\n\4\r\4\16\4\32\5\4\35\n\4\3\5\3\5\5\5!\n\5\3\5\3\5\3\5\7"+
		"\5&\n\5\f\5\16\5)\13\5\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\6\5\6\63\n"+
		"\6\3\6\5\6\66\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\4.@\2\t\3\2\5\2\7\3\t\4\13\5\r\6\17\7"+
		"\3\2\7\3\2\62;\4\2C\\c|\3\2\63;\3\3\f\f\5\2\13\f\17\17\"\"\2Q\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5"+
		"\23\3\2\2\2\7\34\3\2\2\2\t \3\2\2\2\13*\3\2\2\2\r9\3\2\2\2\17G\3\2\2\2"+
		"\21\22\t\2\2\2\22\4\3\2\2\2\23\24\t\3\2\2\24\6\3\2\2\2\25\35\7\62\2\2"+
		"\26\30\t\4\2\2\27\31\5\3\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2"+
		"\32\33\3\2\2\2\33\35\3\2\2\2\34\25\3\2\2\2\34\26\3\2\2\2\35\b\3\2\2\2"+
		"\36!\5\5\3\2\37!\7a\2\2 \36\3\2\2\2 \37\3\2\2\2!\'\3\2\2\2\"&\7a\2\2#"+
		"&\5\5\3\2$&\5\3\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(\n\3\2\2\2)\'\3\2\2\2*.\7%\2\2+-\13\2\2\2,+\3\2\2\2-\60"+
		"\3\2\2\2./\3\2\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\7\17\2\2\62"+
		"\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\t\5\2\2\65\64\3\2\2\2\66"+
		"\67\3\2\2\2\678\b\6\2\28\f\3\2\2\29:\7)\2\2:;\7)\2\2;<\7)\2\2<@\3\2\2"+
		"\2=?\13\2\2\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2\2@>\3\2\2\2AC\3\2\2\2B@\3\2"+
		"\2\2CD\7)\2\2DE\7)\2\2EF\7)\2\2F\16\3\2\2\2GH\t\6\2\2HI\3\2\2\2IJ\b\b"+
		"\2\2J\20\3\2\2\2\f\2\32\34 %\'.\62\65@\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}