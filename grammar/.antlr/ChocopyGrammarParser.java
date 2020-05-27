// Generated from /home/afromana/Documents/Java/Chocopy/grammar/ChocopyGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocopyGrammarParser extends Parser {
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
	public static final int
		RULE_inicial = 0, RULE_print_def = 1, RULE_class_def = 2, RULE_class_body = 3, 
		RULE_func_def = 4, RULE_func_body = 5, RULE_typed_var = 6, RULE_type = 7, 
		RULE_global_decl = 8, RULE_nonlocal_decl = 9, RULE_var_def = 10, RULE_stmt = 11, 
		RULE_simple_stmt = 12, RULE_block = 13, RULE_literal = 14, RULE_expr = 15, 
		RULE_cexpr = 16, RULE_tk_cadena = 17, RULE_member_expr = 18, RULE_index_expr = 19, 
		RULE_target = 20;
	public static final String[] ruleNames = {
		"inicial", "print_def", "class_def", "class_body", "func_def", "func_body", 
		"typed_var", "type", "global_decl", "nonlocal_decl", "var_def", "stmt", 
		"simple_stmt", "block", "literal", "expr", "cexpr", "tk_cadena", "member_expr", 
		"index_expr", "target"
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

	@Override
	public String getGrammarFileName() { return "ChocopyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChocopyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicialContext extends ParserRuleContext {
		public List<Print_defContext> print_def() {
			return getRuleContexts(Print_defContext.class);
		}
		public Print_defContext print_def(int i) {
			return getRuleContext(Print_defContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicial);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(46);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PRINT:
						{
						setState(42);
						print_def();
						}
						break;
					case ID:
						{
						setState(43);
						var_def();
						}
						break;
					case DEF:
						{
						setState(44);
						func_def();
						}
						break;
					case CLASS:
						{
						setState(45);
						class_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << PASS) | (1L << RETURN) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << INTEGER) | (1L << PIZQ) | (1L << AIZQ) | (1L << BIN_OP))) != 0)) {
				{
				{
				setState(51);
				stmt();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_defContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ChocopyGrammarParser.PRINT, 0); }
		public TerminalNode PIZQ() { return getToken(ChocopyGrammarParser.PIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(ChocopyGrammarParser.PDER, 0); }
		public Print_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_def; }
	}

	public final Print_defContext print_def() throws RecognitionException {
		Print_defContext _localctx = new Print_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_print_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PRINT);
			setState(58);
			match(PIZQ);
			setState(59);
			expr(0);
			setState(60);
			match(PDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ChocopyGrammarParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(ChocopyGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ChocopyGrammarParser.ID, i);
		}
		public TerminalNode PIZQ() { return getToken(ChocopyGrammarParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(ChocopyGrammarParser.PDER, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(ChocopyGrammarParser.DOSPUNTOS, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CLASS);
			setState(63);
			match(ID);
			setState(64);
			match(PIZQ);
			setState(65);
			match(ID);
			setState(66);
			match(PDER);
			setState(67);
			match(DOSPUNTOS);
			setState(68);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(ChocopyGrammarParser.PASS, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_body);
		try {
			int _alt;
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(PASS);
				}
				break;
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(73);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(71);
							var_def();
							}
							break;
						case DEF:
							{
							setState(72);
							func_def();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(75); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ChocopyGrammarParser.DEF, 0); }
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(ChocopyGrammarParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(ChocopyGrammarParser.PDER, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(ChocopyGrammarParser.DOSPUNTOS, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public List<Typed_varContext> typed_var() {
			return getRuleContexts(Typed_varContext.class);
		}
		public Typed_varContext typed_var(int i) {
			return getRuleContext(Typed_varContext.class,i);
		}
		public TerminalNode FLECHA() { return getToken(ChocopyGrammarParser.FLECHA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(ChocopyGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ChocopyGrammarParser.COMA, i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DEF);
			setState(80);
			match(ID);
			setState(81);
			match(PIZQ);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(82);
				typed_var();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(83);
					match(COMA);
					setState(84);
					typed_var();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(PDER);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FLECHA) {
				{
				setState(93);
				match(FLECHA);
				setState(94);
				type();
				}
			}

			setState(97);
			match(DOSPUNTOS);
			setState(98);
			func_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public List<Global_declContext> global_decl() {
			return getRuleContexts(Global_declContext.class);
		}
		public Global_declContext global_decl(int i) {
			return getRuleContext(Global_declContext.class,i);
		}
		public List<Nonlocal_declContext> nonlocal_decl() {
			return getRuleContexts(Nonlocal_declContext.class);
		}
		public Nonlocal_declContext nonlocal_decl(int i) {
			return getRuleContext(Nonlocal_declContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(104);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(100);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(101);
						nonlocal_decl();
						}
						break;
					case ID:
						{
						setState(102);
						var_def();
						}
						break;
					case DEF:
						{
						setState(103);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(109);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(ChocopyGrammarParser.DOSPUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_var; }
	}

	public final Typed_varContext typed_var() throws RecognitionException {
		Typed_varContext _localctx = new Typed_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typed_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(DOSPUNTOS);
			setState(116);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public TerminalNode TIPO_DATO() { return getToken(ChocopyGrammarParser.TIPO_DATO, 0); }
		public Tk_cadenaContext tk_cadena() {
			return getRuleContext(Tk_cadenaContext.class,0);
		}
		public TerminalNode AIZQ() { return getToken(ChocopyGrammarParser.AIZQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ADER() { return getToken(ChocopyGrammarParser.ADER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				}
				break;
			case TIPO_DATO:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(TIPO_DATO);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				tk_cadena();
				}
				break;
			case AIZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(AIZQ);
				setState(122);
				type();
				setState(123);
				match(ADER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_declContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(ChocopyGrammarParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public Global_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_decl; }
	}

	public final Global_declContext global_decl() throws RecognitionException {
		Global_declContext _localctx = new Global_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(GLOBAL);
			setState(128);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonlocal_declContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(ChocopyGrammarParser.NONLOCAL, 0); }
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public Nonlocal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_decl; }
	}

	public final Nonlocal_declContext nonlocal_decl() throws RecognitionException {
		Nonlocal_declContext _localctx = new Nonlocal_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonlocal_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(NONLOCAL);
			setState(131);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_defContext extends ParserRuleContext {
		public Typed_varContext typed_var() {
			return getRuleContext(Typed_varContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(ChocopyGrammarParser.IGUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			typed_var();
			setState(134);
			match(IGUAL);
			setState(135);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode IF() { return getToken(ChocopyGrammarParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DOSPUNTOS() { return getTokens(ChocopyGrammarParser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(ChocopyGrammarParser.DOSPUNTOS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(ChocopyGrammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(ChocopyGrammarParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(ChocopyGrammarParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(ChocopyGrammarParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(ChocopyGrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public TerminalNode IN() { return getToken(ChocopyGrammarParser.IN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			int _alt;
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case PRINT:
			case PASS:
			case RETURN:
			case NONE:
			case TRUE:
			case FALSE:
			case NOT:
			case ID:
			case STRING:
			case INTEGER:
			case PIZQ:
			case AIZQ:
			case BIN_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				simple_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(IF);
				setState(139);
				expr(0);
				setState(140);
				match(DOSPUNTOS);
				setState(141);
				block();
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(142);
						match(ELIF);
						setState(143);
						expr(0);
						setState(144);
						match(DOSPUNTOS);
						setState(145);
						block();
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(152);
					match(ELSE);
					setState(153);
					match(DOSPUNTOS);
					setState(154);
					block();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(WHILE);
				setState(158);
				expr(0);
				setState(159);
				match(DOSPUNTOS);
				setState(160);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(FOR);
				setState(163);
				match(ID);
				setState(164);
				match(IN);
				setState(165);
				expr(0);
				setState(166);
				match(DOSPUNTOS);
				setState(167);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(ChocopyGrammarParser.PASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ChocopyGrammarParser.RETURN, 0); }
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(ChocopyGrammarParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(ChocopyGrammarParser.IGUAL, i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_stmt);
		try {
			int _alt;
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(RETURN);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(174);
					expr(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(177);
						target();
						setState(178);
						match(IGUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(182); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(184);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(ChocopyGrammarParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(ChocopyGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ChocopyGrammarParser.FALSE, 0); }
		public TerminalNode INTEGER() { return getToken(ChocopyGrammarParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(ChocopyGrammarParser.STRING, 0); }
		public Tk_cadenaContext tk_cadena() {
			return getRuleContext(Tk_cadenaContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(FALSE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(INTEGER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(STRING);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				tk_cadena();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Tk_cadenaContext tk_cadena() {
			return getRuleContext(Tk_cadenaContext.class,0);
		}
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public Print_defContext print_def() {
			return getRuleContext(Print_defContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ChocopyGrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ChocopyGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(ChocopyGrammarParser.OR, 0); }
		public TerminalNode IF() { return getToken(ChocopyGrammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(ChocopyGrammarParser.ELSE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(202);
				tk_cadena();
				}
				break;
			case 2:
				{
				setState(203);
				cexpr(0);
				}
				break;
			case 3:
				{
				setState(204);
				print_def();
				}
				break;
			case 4:
				{
				setState(205);
				match(NOT);
				setState(206);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(213);
						match(IF);
						setState(214);
						expr(0);
						setState(215);
						match(ELSE);
						setState(216);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode AIZQ() { return getToken(ChocopyGrammarParser.AIZQ, 0); }
		public TerminalNode ADER() { return getToken(ChocopyGrammarParser.ADER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ChocopyGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ChocopyGrammarParser.COMA, i);
		}
		public TerminalNode PIZQ() { return getToken(ChocopyGrammarParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(ChocopyGrammarParser.PDER, 0); }
		public TerminalNode BIN_OP() { return getToken(ChocopyGrammarParser.BIN_OP, 0); }
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public TerminalNode PUNTO() { return getToken(ChocopyGrammarParser.PUNTO, 0); }
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_cexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(224);
				match(ID);
				}
				break;
			case 2:
				{
				setState(225);
				literal();
				}
				break;
			case 3:
				{
				setState(226);
				match(AIZQ);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << INTEGER) | (1L << PIZQ) | (1L << AIZQ) | (1L << BIN_OP))) != 0)) {
					{
					setState(227);
					expr(0);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(228);
						match(COMA);
						setState(229);
						expr(0);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(237);
				match(ADER);
				}
				break;
			case 4:
				{
				setState(238);
				match(PIZQ);
				setState(239);
				expr(0);
				setState(240);
				match(PDER);
				}
				break;
			case 5:
				{
				setState(242);
				match(ID);
				setState(243);
				match(PIZQ);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << INTEGER) | (1L << PIZQ) | (1L << AIZQ) | (1L << BIN_OP))) != 0)) {
					{
					setState(244);
					expr(0);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(245);
						match(COMA);
						setState(246);
						expr(0);
						}
						}
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(254);
				match(PDER);
				}
				break;
			case 6:
				{
				setState(255);
				match(BIN_OP);
				setState(256);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(259);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(260);
						match(BIN_OP);
						setState(261);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(262);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(263);
						match(PUNTO);
						setState(264);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(265);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(266);
						match(AIZQ);
						setState(267);
						expr(0);
						setState(268);
						match(ADER);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(270);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(271);
						match(PUNTO);
						setState(272);
						match(ID);
						setState(273);
						match(PIZQ);
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << INTEGER) | (1L << PIZQ) | (1L << AIZQ) | (1L << BIN_OP))) != 0)) {
							{
							setState(274);
							expr(0);
							setState(279);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMA) {
								{
								{
								setState(275);
								match(COMA);
								setState(276);
								expr(0);
								}
								}
								setState(281);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(284);
						match(PDER);
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tk_cadenaContext extends ParserRuleContext {
		public Tk_cadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_cadena; }
	}

	public final Tk_cadenaContext tk_cadena() throws RecognitionException {
		Tk_cadenaContext _localctx = new Tk_cadenaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tk_cadena);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__0);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(291);
					matchWildcard();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(297);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_exprContext extends ParserRuleContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(ChocopyGrammarParser.PUNTO, 0); }
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public Member_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_expr; }
	}

	public final Member_exprContext member_expr() throws RecognitionException {
		Member_exprContext _localctx = new Member_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_member_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			cexpr(0);
			setState(300);
			match(PUNTO);
			setState(301);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_exprContext extends ParserRuleContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode AIZQ() { return getToken(ChocopyGrammarParser.AIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADER() { return getToken(ChocopyGrammarParser.ADER, 0); }
		public Index_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_expr; }
	}

	public final Index_exprContext index_expr() throws RecognitionException {
		Index_exprContext _localctx = new Index_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_index_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			cexpr(0);
			setState(304);
			match(AIZQ);
			setState(305);
			expr(0);
			setState(306);
			match(ADER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyGrammarParser.ID, 0); }
		public Member_exprContext member_expr() {
			return getRuleContext(Member_exprContext.class,0);
		}
		public Index_exprContext index_expr() {
			return getRuleContext(Index_exprContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_target);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				member_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				index_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5L\n\5\r\5\16\5M\5\5P\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\5\6]\n\6\3\6\3\6\3\6\5"+
		"\6b\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\6\7q\n"+
		"\7\r\7\16\7r\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\r\3\r\3\r\5\r\u009e"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\6\16\u00b7\n\16\r\16\16"+
		"\16\u00b8\3\16\3\16\5\16\u00bd\n\16\3\17\6\17\u00c0\n\17\r\17\16\17\u00c1"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00d2\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00dd\n\21\f\21\16\21\u00e0\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00e9\n\22\f\22\16\22\u00ec\13\22\5\22\u00ee\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fa\n\22\f\22\16\22\u00fd\13"+
		"\22\5\22\u00ff\n\22\3\22\3\22\3\22\5\22\u0104\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0118\n\22\f\22\16\22\u011b\13\22\5\22\u011d\n\22\3\22\7\22\u0120"+
		"\n\22\f\22\16\22\u0123\13\22\3\23\3\23\7\23\u0127\n\23\f\23\16\23\u012a"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u013a\n\26\3\26\3\u0128\4 \"\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\3\4\2\20\20\24\24\2\u0160\2\62\3\2\2\2\4;\3\2\2"+
		"\2\6@\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fl\3\2\2\2\16t\3\2\2\2\20\177\3\2"+
		"\2\2\22\u0081\3\2\2\2\24\u0084\3\2\2\2\26\u0087\3\2\2\2\30\u00ab\3\2\2"+
		"\2\32\u00bc\3\2\2\2\34\u00bf\3\2\2\2\36\u00c9\3\2\2\2 \u00d1\3\2\2\2\""+
		"\u0103\3\2\2\2$\u0124\3\2\2\2&\u012d\3\2\2\2(\u0131\3\2\2\2*\u0139\3\2"+
		"\2\2,\61\5\4\3\2-\61\5\26\f\2.\61\5\n\6\2/\61\5\6\4\2\60,\3\2\2\2\60-"+
		"\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2"+
		"\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\5\30\r\2\66\65\3\2\2\2\67:\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;<\7\n\2\2<=\7\32\2\2=>\5"+
		" \21\2>?\7\33\2\2?\5\3\2\2\2@A\7\5\2\2AB\7\27\2\2BC\7\32\2\2CD\7\27\2"+
		"\2DE\7\33\2\2EF\7 \2\2FG\5\b\5\2G\7\3\2\2\2HP\7\16\2\2IL\5\26\f\2JL\5"+
		"\n\6\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OH\3"+
		"\2\2\2OK\3\2\2\2P\t\3\2\2\2QR\7\r\2\2RS\7\27\2\2S\\\7\32\2\2TY\5\16\b"+
		"\2UV\7\37\2\2VX\5\16\b\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2"+
		"\2\2[Y\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^a\7\33\2\2_`\7\"\2\2`b"+
		"\5\20\t\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7 \2\2de\5\f\7\2e\13\3\2\2\2"+
		"fk\5\22\n\2gk\5\24\13\2hk\5\26\f\2ik\5\n\6\2jf\3\2\2\2jg\3\2\2\2jh\3\2"+
		"\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\5\30"+
		"\r\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tu\7\27\2\2uv\7"+
		" \2\2vw\5\20\t\2w\17\3\2\2\2x\u0080\7\27\2\2y\u0080\7$\2\2z\u0080\5$\23"+
		"\2{|\7\34\2\2|}\5\20\t\2}~\7\35\2\2~\u0080\3\2\2\2\177x\3\2\2\2\177y\3"+
		"\2\2\2\177z\3\2\2\2\177{\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\7\4\2\2"+
		"\u0082\u0083\7\27\2\2\u0083\23\3\2\2\2\u0084\u0085\7\6\2\2\u0085\u0086"+
		"\7\27\2\2\u0086\25\3\2\2\2\u0087\u0088\5\16\b\2\u0088\u0089\7!\2\2\u0089"+
		"\u008a\5\36\20\2\u008a\27\3\2\2\2\u008b\u00ac\5\32\16\2\u008c\u008d\7"+
		"\7\2\2\u008d\u008e\5 \21\2\u008e\u008f\7 \2\2\u008f\u0097\5\34\17\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0092\5 \21\2\u0092\u0093\7 \2\2\u0093\u0094\5\34"+
		"\17\2\u0094\u0096\3\2\2\2\u0095\u0090\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009d\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7\t\2\2\u009b\u009c\7 \2\2\u009c\u009e\5\34\17\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00ac\3\2\2\2\u009f\u00a0\7\f"+
		"\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\5\34\17\2\u00a3"+
		"\u00ac\3\2\2\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7"+
		"\25\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7 \2\2\u00a9\u00aa\5\34\17\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u008b\3\2\2\2\u00ab\u008c\3\2\2\2\u00ab\u009f\3\2"+
		"\2\2\u00ab\u00a4\3\2\2\2\u00ac\31\3\2\2\2\u00ad\u00bd\7\16\2\2\u00ae\u00bd"+
		"\5 \21\2\u00af\u00b1\7\17\2\2\u00b0\u00b2\5 \21\2\u00b1\u00b0\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00bd\3\2\2\2\u00b3\u00b4\5*\26\2\u00b4\u00b5"+
		"\7!\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\5 "+
		"\21\2\u00bb\u00bd\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc"+
		"\u00af\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00c0\5\30\r"+
		"\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\35\3\2\2\2\u00c3\u00ca\7\21\2\2\u00c4\u00ca\7\22\2\2\u00c5"+
		"\u00ca\7\23\2\2\u00c6\u00ca\7\31\2\2\u00c7\u00ca\7\30\2\2\u00c8\u00ca"+
		"\5$\23\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\37\3\2\2"+
		"\2\u00cb\u00cc\b\21\1\2\u00cc\u00d2\5$\23\2\u00cd\u00d2\5\"\22\2\u00ce"+
		"\u00d2\5\4\3\2\u00cf\u00d0\7\26\2\2\u00d0\u00d2\5 \21\5\u00d1\u00cb\3"+
		"\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00de\3\2\2\2\u00d3\u00d4\f\4\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00dd\5 "+
		"\21\5\u00d6\u00d7\f\3\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\7\t\2\2\u00da\u00db\5 \21\4\u00db\u00dd\3\2\2\2\u00dc\u00d3\3\2"+
		"\2\2\u00dc\u00d6\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\22\1\2"+
		"\u00e2\u0104\7\27\2\2\u00e3\u0104\5\36\20\2\u00e4\u00ed\7\34\2\2\u00e5"+
		"\u00ea\5 \21\2\u00e6\u00e7\7\37\2\2\u00e7\u00e9\5 \21\2\u00e8\u00e6\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0104\7\35\2\2\u00f0\u00f1\7\32\2\2\u00f1"+
		"\u00f2\5 \21\2\u00f2\u00f3\7\33\2\2\u00f3\u0104\3\2\2\2\u00f4\u00f5\7"+
		"\27\2\2\u00f5\u00fe\7\32\2\2\u00f6\u00fb\5 \21\2\u00f7\u00f8\7\37\2\2"+
		"\u00f8\u00fa\5 \21\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00f6\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\7\33"+
		"\2\2\u0101\u0102\7#\2\2\u0102\u0104\5 \21\2\u0103\u00e1\3\2\2\2\u0103"+
		"\u00e3\3\2\2\2\u0103\u00e4\3\2\2\2\u0103\u00f0\3\2\2\2\u0103\u00f4\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0121\3\2\2\2\u0105\u0106\f\4\2\2\u0106"+
		"\u0107\7#\2\2\u0107\u0120\5\"\22\5\u0108\u0109\f\b\2\2\u0109\u010a\7\36"+
		"\2\2\u010a\u0120\7\27\2\2\u010b\u010c\f\7\2\2\u010c\u010d\7\34\2\2\u010d"+
		"\u010e\5 \21\2\u010e\u010f\7\35\2\2\u010f\u0120\3\2\2\2\u0110\u0111\f"+
		"\6\2\2\u0111\u0112\7\36\2\2\u0112\u0113\7\27\2\2\u0113\u011c\7\32\2\2"+
		"\u0114\u0119\5 \21\2\u0115\u0116\7\37\2\2\u0116\u0118\5 \21\2\u0117\u0115"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\7\33\2\2\u011f\u0105\3\2\2\2\u011f"+
		"\u0108\3\2\2\2\u011f\u010b\3\2\2\2\u011f\u0110\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122#\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0128\7\3\2\2\u0125\u0127\13\2\2\2\u0126\u0125\3\2\2\2"+
		"\u0127\u012a\3\2\2\2\u0128\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\3\2\2\u012c%\3\2\2\2\u012d"+
		"\u012e\5\"\22\2\u012e\u012f\7\36\2\2\u012f\u0130\7\27\2\2\u0130\'\3\2"+
		"\2\2\u0131\u0132\5\"\22\2\u0132\u0133\7\34\2\2\u0133\u0134\5 \21\2\u0134"+
		"\u0135\7\35\2\2\u0135)\3\2\2\2\u0136\u013a\7\27\2\2\u0137\u013a\5&\24"+
		"\2\u0138\u013a\5(\25\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013a+\3\2\2\2%\60\628KMOY\\ajlr\177\u0097\u009d\u00ab\u00b1"+
		"\u00b8\u00bc\u00c1\u00c9\u00d1\u00dc\u00de\u00ea\u00ed\u00fb\u00fe\u0103"+
		"\u0119\u011c\u011f\u0121\u0128\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}