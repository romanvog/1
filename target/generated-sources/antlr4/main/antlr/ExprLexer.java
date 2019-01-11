// Generated from main/antlr/Expr.g4 by ANTLR 4.3
package main.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, MUL=4, DIV=5, ADD=6, SUB=7, INC=8, DEC=9, ASSMUL=10, 
		ASSDIV=11, ASSADD=12, ASSSUB=13, ID=14, INT=15, NEWLINE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "INC", "DEC", "ASSMUL", 
		"ASSDIV", "ASSADD", "ASSSUB", "ID", "INT", "NEWLINE", "WS"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\6\17G\n\17\r\17\16\17H\3\20\6\20L\n\20\r\20\16\20M\3\21\5\21Q\n\21\3"+
		"\21\3\21\3\22\6\22V\n\22\r\22\16\22W\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3"+
		"\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2"+
		"\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23"+
		"\66\3\2\2\2\259\3\2\2\2\27<\3\2\2\2\31?\3\2\2\2\33B\3\2\2\2\35F\3\2\2"+
		"\2\37K\3\2\2\2!P\3\2\2\2#U\3\2\2\2%&\7?\2\2&\4\3\2\2\2\'(\7*\2\2(\6\3"+
		"\2\2\2)*\7+\2\2*\b\3\2\2\2+,\7,\2\2,\n\3\2\2\2-.\7\61\2\2.\f\3\2\2\2/"+
		"\60\7-\2\2\60\16\3\2\2\2\61\62\7/\2\2\62\20\3\2\2\2\63\64\7-\2\2\64\65"+
		"\7-\2\2\65\22\3\2\2\2\66\67\7/\2\2\678\7/\2\28\24\3\2\2\29:\7,\2\2:;\7"+
		"?\2\2;\26\3\2\2\2<=\7\61\2\2=>\7?\2\2>\30\3\2\2\2?@\7-\2\2@A\7?\2\2A\32"+
		"\3\2\2\2BC\7/\2\2CD\7?\2\2D\34\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2I\36\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2N \3\2\2\2OQ\7\17\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\f"+
		"\2\2S\"\3\2\2\2TV\t\4\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3"+
		"\2\2\2YZ\b\22\2\2Z$\3\2\2\2\7\2HMPW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}