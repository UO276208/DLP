// Generated from C:/Users/laisg/IdeaProjects/DLP - copia/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import AST.program.*;
import AST.definitions.*;
import AST.expressions.*;
import AST.statements.*;
import AST.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, ID=40, CHAR_CONSTANT=41, COMMENTARIO=42, COMENTARIO_MULTILINEA=43, 
		TRASH=44;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_function_invocation = 2, RULE_type = 3, 
		RULE_record_type = 4, RULE_record_field = 5, RULE_id_list = 6, RULE_simple_type = 7, 
		RULE_cast = 8, RULE_statement = 9, RULE_var_coma_list2 = 10, RULE_var_coma_list1 = 11, 
		RULE_body_plus = 12, RULE_while_ = 13, RULE_if_ = 14, RULE_else_ = 15, 
		RULE_definition = 16, RULE_main_function = 17, RULE_var_definition = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "function_invocation", "type", "record_type", 
			"record_field", "id_list", "simple_type", "cast", "statement", "var_coma_list2", 
			"var_coma_list1", "body_plus", "while_", "if_", "else_", "definition", 
			"main_function", "var_definition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'struct'", "'{'", "'}'", "':'", "';'", "','", "'int'", "'double'", "'char'", 
			"'return'", "'='", "'input'", "'print'", "'while'", "'if'", "'else'", 
			"'def'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENTARIO", 
			"COMENTARIO_MULTILINEA", "TRASH"
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

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> aux;
		public DefinitionContext definition;
		public Main_functionContext main_function;
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).aux =  new ArrayList<>();
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					((ProgramContext)_localctx).definition = definition();
					_localctx.aux.addAll(((ProgramContext)_localctx).definition.ast);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(47);
			((ProgramContext)_localctx).main_function = main_function();
			_localctx.aux.add(((ProgramContext)_localctx).main_function.ast);
			setState(49);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(_localctx.aux);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext op1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public ExpressionContext op;
		public Function_invocationContext function_invocation;
		public CastContext cast;
		public ExpressionContext op2;
		public Token OP;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(53);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() +1,
				                        LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(55);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                                              ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() +1,
				                                              LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(57);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                                                                    ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() +1,
				                                                                    LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(59);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable( ((ExpressionContext)_localctx).ID.getLine(),  ((ExpressionContext)_localctx).ID.getCharPositionInLine() +1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 5:
				{
				setState(61);
				match(T__0);
				setState(62);
				((ExpressionContext)_localctx).op = expression(0);
				setState(63);
				match(T__1);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).op.ast;
				}
				break;
			case 6:
				{
				setState(66);
				((ExpressionContext)_localctx).function_invocation = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).function_invocation.ast;
				}
				break;
			case 7:
				{
				setState(69);
				((ExpressionContext)_localctx).cast = cast();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).cast.ast;
				}
				break;
			case 8:
				{
				setState(72);
				match(T__5);
				setState(73);
				((ExpressionContext)_localctx).op = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op.ast.getLine(), ((ExpressionContext)_localctx).op.ast.getColumn(), ((ExpressionContext)_localctx).op.ast);
				}
				break;
			case 9:
				{
				setState(76);
				match(T__6);
				setState(77);
				((ExpressionContext)_localctx).op = expression(5);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).op.ast.getLine(), ((ExpressionContext)_localctx).op.ast.getColumn(), ((ExpressionContext)_localctx).op.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(83);
						match(T__4);
						setState(84);
						((ExpressionContext)_localctx).op2 = expression(9);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(88);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						((ExpressionContext)_localctx).op2 = expression(5);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(93);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						((ExpressionContext)_localctx).op2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).op1.ast.getLine(),
						                          ((ExpressionContext)_localctx).op1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(98);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						((ExpressionContext)_localctx).op2 = expression(3);
						((ExpressionContext)_localctx).ast =  new LogicOperator(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(103);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						((ExpressionContext)_localctx).op2 = expression(2);
						((ExpressionContext)_localctx).ast =  new Comparator(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(108);
						match(T__2);
						setState(109);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(110);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Function_invocationContext extends ParserRuleContext {
		public FuncInvocation ast;
		public Token ID;
		public Var_coma_list1Context var_coma_list1;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Var_coma_list1Context var_coma_list1() {
			return getRuleContext(Var_coma_list1Context.class,0);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((Function_invocationContext)_localctx).ID = match(ID);
			setState(119);
			match(T__0);
			setState(120);
			((Function_invocationContext)_localctx).var_coma_list1 = var_coma_list1();
			setState(121);
			match(T__1);
			((Function_invocationContext)_localctx).ast =  new FuncInvocation(((Function_invocationContext)_localctx).ID.getLine(),
			                ((Function_invocationContext)_localctx).ID.getCharPositionInLine() +1, ((Function_invocationContext)_localctx).var_coma_list1.ast,
			                new Variable( ((Function_invocationContext)_localctx).ID.getLine(),  ((Function_invocationContext)_localctx).ID.getCharPositionInLine() +1, (((Function_invocationContext)_localctx).ID!=null?((Function_invocationContext)_localctx).ID.getText():null)));
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
		public Type ast;
		public Simple_typeContext simple_type;
		public Record_typeContext record_type;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Record_typeContext record_type() {
			return getRuleContext(Record_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((TypeContext)_localctx).simple_type = simple_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((TypeContext)_localctx).record_type = record_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).record_type.ast;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__2);
				setState(131);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(132);
				match(T__3);
				setState(133);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).type.ast.getLine(), ((TypeContext)_localctx).type.ast.getColumn(), ((TypeContext)_localctx).type.ast,
				        LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)));
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

	public static class Record_typeContext extends ParserRuleContext {
		public RecordType ast;
		public Record_fieldContext record_field;
		public List<Record_fieldContext> record_field() {
			return getRuleContexts(Record_fieldContext.class);
		}
		public Record_fieldContext record_field(int i) {
			return getRuleContext(Record_fieldContext.class,i);
		}
		public Record_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRecord_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_typeContext record_type() throws RecognitionException {
		Record_typeContext _localctx = new Record_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_record_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Record_typeContext)_localctx).ast =  new RecordType();
			setState(139);
			match(T__19);
			setState(140);
			match(T__20);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				((Record_typeContext)_localctx).record_field = record_field();
				_localctx.ast.addFields(((Record_typeContext)_localctx).record_field.ast);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(148);
			match(T__21);
			_localctx.ast.setPosition();
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

	public static class Record_fieldContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList();
		public ErrorType e;
		public Id_listContext id_list;
		public TypeContext type;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Record_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRecord_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_fieldContext record_field() throws RecognitionException {
		Record_fieldContext _localctx = new Record_fieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_record_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((Record_fieldContext)_localctx).id_list = id_list();
			setState(152);
			match(T__22);
			setState(153);
			((Record_fieldContext)_localctx).type = type();
			setState(154);
			match(T__23);

			        for(int i = 0; i<((Record_fieldContext)_localctx).id_list.ast.size();i++){
			            if(_localctx.ast.contains(((Record_fieldContext)_localctx).id_list.ast.get(i))){
			                    ((Record_fieldContext)_localctx).e =  new ErrorType(((Record_fieldContext)_localctx).id_list.ast.get(i).getLine(), ((Record_fieldContext)_localctx).id_list.ast.get(i).getColumn(),
			                            "RecordField" + ((Record_fieldContext)_localctx).id_list.ast.get(i).toString() + "is already defined");
			            }else{
			                _localctx.ast.add(new RecordField(((Record_fieldContext)_localctx).id_list.ast.get(i).getLine(),
			                     ((Record_fieldContext)_localctx).id_list.ast.get(i).getColumn(), ((Record_fieldContext)_localctx).id_list.ast.get(i).toString(), ((Record_fieldContext)_localctx).type.ast));
			                }
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

	public static class Id_listContext extends ParserRuleContext {
		public List<Variable> ast = new ArrayList();
		public Token ID1;
		public Token ID2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((Id_listContext)_localctx).ID1 = match(ID);
			_localctx.ast.add(new Variable( ((Id_listContext)_localctx).ID1.getLine(),
			        ((Id_listContext)_localctx).ID1.getCharPositionInLine() +1,
			        (((Id_listContext)_localctx).ID1!=null?((Id_listContext)_localctx).ID1.getText():null)));
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(159);
				match(T__24);
				setState(160);
				((Id_listContext)_localctx).ID2 = match(ID);
				_localctx.ast.add(new Variable( ((Id_listContext)_localctx).ID2.getLine(),
				                           ((Id_listContext)_localctx).ID2.getCharPositionInLine() +1,
				                           (((Id_listContext)_localctx).ID2!=null?((Id_listContext)_localctx).ID2.getText():null)));
				}
				}
				setState(166);
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

	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Token TYPE;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_type);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				((Simple_typeContext)_localctx).TYPE = match(T__25);
				((Simple_typeContext)_localctx).ast =  new IntType(((Simple_typeContext)_localctx).TYPE.getLine()
				                    , ((Simple_typeContext)_localctx).TYPE.getCharPositionInLine() +1);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				((Simple_typeContext)_localctx).TYPE = match(T__26);
				((Simple_typeContext)_localctx).ast =  new RealType(((Simple_typeContext)_localctx).TYPE.getLine()
				                                               , ((Simple_typeContext)_localctx).TYPE.getCharPositionInLine() +1);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				((Simple_typeContext)_localctx).TYPE = match(T__27);
				((Simple_typeContext)_localctx).ast =  new CharType(((Simple_typeContext)_localctx).TYPE.getLine()
				                                             , ((Simple_typeContext)_localctx).TYPE.getCharPositionInLine() +1);
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

	public static class CastContext extends ParserRuleContext {
		public Cast ast;
		public Simple_typeContext simple_type;
		public ExpressionContext expression;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__0);
			setState(176);
			((CastContext)_localctx).simple_type = simple_type();
			setState(177);
			match(T__1);
			setState(178);
			((CastContext)_localctx).expression = expression(0);
			((CastContext)_localctx).ast =  new Cast(((CastContext)_localctx).simple_type.ast.getLine()
			                , ((CastContext)_localctx).simple_type.ast.getColumn(), ((CastContext)_localctx).simple_type.ast, ((CastContext)_localctx).expression.ast);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext expression;
		public ExpressionContext op1;
		public ExpressionContext op2;
		public If_Context if_;
		public While_Context while_;
		public Var_coma_list2Context var_coma_list2;
		public Function_invocationContext function_invocation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Var_coma_list2Context var_coma_list2() {
			return getRuleContext(Var_coma_list2Context.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__28);
				setState(182);
				((StatementContext)_localctx).expression = expression(0);
				setState(183);
				match(T__23);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expression.ast.getLine()
				                    , ((StatementContext)_localctx).expression.ast.getColumn(), ((StatementContext)_localctx).expression.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((StatementContext)_localctx).op1 = expression(0);
				setState(187);
				match(T__29);
				setState(188);
				((StatementContext)_localctx).op2 = expression(0);
				setState(189);
				match(T__23);
				((StatementContext)_localctx).ast =  new Assigment(((StatementContext)_localctx).op1.ast.getLine()
				                                           , ((StatementContext)_localctx).op1.ast.getColumn(), ((StatementContext)_localctx).op1.ast ,((StatementContext)_localctx).op2.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				((StatementContext)_localctx).if_ = if_();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).if_.ast;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				((StatementContext)_localctx).while_ = while_();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).while_.ast;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(T__30);
				setState(199);
				((StatementContext)_localctx).var_coma_list2 = var_coma_list2();
				setState(200);
				match(T__23);
				((StatementContext)_localctx).ast =  new Input(((StatementContext)_localctx).var_coma_list2.ast.get(0).getLine(),
				                              ((StatementContext)_localctx).var_coma_list2.ast.get(0).getColumn(),((StatementContext)_localctx).var_coma_list2.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(T__31);
				setState(204);
				((StatementContext)_localctx).var_coma_list2 = var_coma_list2();
				setState(205);
				match(T__23);
				((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).var_coma_list2.ast.get(0).getLine(),
				                    ((StatementContext)_localctx).var_coma_list2.ast.get(0).getColumn(),((StatementContext)_localctx).var_coma_list2.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				((StatementContext)_localctx).function_invocation = function_invocation();
				setState(209);
				match(T__23);
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).function_invocation.ast;
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

	public static class Var_coma_list2Context extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext op1;
		public ExpressionContext op2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Var_coma_list2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_coma_list2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_coma_list2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_coma_list2Context var_coma_list2() throws RecognitionException {
		Var_coma_list2Context _localctx = new Var_coma_list2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_coma_list2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((Var_coma_list2Context)_localctx).op1 = expression(0);
			_localctx.ast.add(((Var_coma_list2Context)_localctx).op1.ast);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(216);
				match(T__24);
				setState(217);
				((Var_coma_list2Context)_localctx).op2 = expression(0);
				_localctx.ast.add(((Var_coma_list2Context)_localctx).op2.ast);
				}
				}
				setState(224);
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

	public static class Var_coma_list1Context extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext op1;
		public ExpressionContext op2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Var_coma_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_coma_list1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_coma_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_coma_list1Context var_coma_list1() throws RecognitionException {
		Var_coma_list1Context _localctx = new Var_coma_list1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_coma_list1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(225);
				((Var_coma_list1Context)_localctx).op1 = expression(0);
				 _localctx.ast.add(((Var_coma_list1Context)_localctx).op1.ast);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(227);
					match(T__24);
					setState(228);
					((Var_coma_list1Context)_localctx).op2 = expression(0);
					_localctx.ast.add(((Var_coma_list1Context)_localctx).op2.ast);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Body_plusContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Body_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_plusContext body_plus() throws RecognitionException {
		Body_plusContext _localctx = new Body_plusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__20);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				((Body_plusContext)_localctx).statement = statement();
				_localctx.ast.add(((Body_plusContext)_localctx).statement.ast);
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0) );
			setState(246);
			match(T__21);
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

	public static class While_Context extends ParserRuleContext {
		public While ast;
		public ExpressionContext expression;
		public Body_plusContext body_plus;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Body_plusContext body_plus() {
			return getRuleContext(Body_plusContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__32);
				setState(249);
				((While_Context)_localctx).expression = expression(0);
				setState(250);
				match(T__22);
				setState(251);
				((While_Context)_localctx).body_plus = body_plus();

				            ((While_Context)_localctx).ast =  new While(((While_Context)_localctx).expression.ast.getLine()
				                 ,((While_Context)_localctx).expression.ast.getColumn(), ((While_Context)_localctx).body_plus.ast, ((While_Context)_localctx).expression.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__32);
				setState(255);
				((While_Context)_localctx).expression = expression(0);
				setState(256);
				match(T__22);
				setState(257);
				((While_Context)_localctx).statement = statement();

				            ((While_Context)_localctx).ast =  new While(((While_Context)_localctx).expression.ast.getLine()
				                  ,((While_Context)_localctx).expression.ast.getColumn(), ((While_Context)_localctx).statement.ast, ((While_Context)_localctx).expression.ast);
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

	public static class If_Context extends ParserRuleContext {
		public If ast;
		public List<Statement> elseAux = new ArrayList<Statement>();
		public ExpressionContext expression;
		public Body_plusContext body_plus;
		public Else_Context else_;
		public StatementContext statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Body_plusContext body_plus() {
			return getRuleContext(Body_plusContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__33);
				setState(263);
				((If_Context)_localctx).expression = expression(0);
				setState(264);
				match(T__22);
				setState(265);
				((If_Context)_localctx).body_plus = body_plus();
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(266);
					((If_Context)_localctx).else_ = else_();
					((If_Context)_localctx).elseAux =  ((If_Context)_localctx).else_.ast;
					}
					break;
				}
				((If_Context)_localctx).ast =  new If(((If_Context)_localctx).expression.ast.getLine()
				                             ,((If_Context)_localctx).expression.ast.getColumn(), ((If_Context)_localctx).expression.ast, ((If_Context)_localctx).body_plus.ast, _localctx.elseAux);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__33);
				setState(274);
				((If_Context)_localctx).expression = expression(0);
				setState(275);
				match(T__22);
				setState(276);
				((If_Context)_localctx).statement = statement();
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(277);
					((If_Context)_localctx).else_ = else_();
					((If_Context)_localctx).elseAux =  ((If_Context)_localctx).else_.ast;
					}
					break;
				}
				((If_Context)_localctx).ast =  new If(((If_Context)_localctx).expression.ast.getLine()
				                                 ,((If_Context)_localctx).expression.ast.getColumn(), ((If_Context)_localctx).expression.ast, ((If_Context)_localctx).statement.ast, _localctx.elseAux);
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

	public static class Else_Context extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public Body_plusContext body_plus;
		public StatementContext statement;
		public Body_plusContext body_plus() {
			return getRuleContext(Body_plusContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__34);
				setState(287);
				((Else_Context)_localctx).body_plus = body_plus();
				_localctx.ast.addAll(((Else_Context)_localctx).body_plus.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__34);
				setState(291);
				((Else_Context)_localctx).statement = statement();
				_localctx.ast.add(((Else_Context)_localctx).statement.ast);
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public List<VarDefinition> parameters;
		public List<Statement> body;
		public Type typeAux;
		public Var_definitionContext var_definition;
		public Token ID;
		public Var_definitionContext va1;
		public Var_definitionContext va2;
		public TypeContext type;
		public Var_definitionContext va3;
		public StatementContext statement;
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definition);
		int _la;
		try {
			int _alt;
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((DefinitionContext)_localctx).var_definition = var_definition();
				setState(297);
				match(T__23);
				_localctx.ast.addAll(((DefinitionContext)_localctx).var_definition.ast);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{

				              ((DefinitionContext)_localctx).body =  new ArrayList<>();
				              ((DefinitionContext)_localctx).parameters =  new ArrayList<>();
				              ((DefinitionContext)_localctx).typeAux =  new VoidType(0,0);
				            
				setState(301);
				match(T__35);
				setState(302);
				((DefinitionContext)_localctx).ID = match(ID);
				setState(303);
				match(T__0);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(304);
							((DefinitionContext)_localctx).va1 = var_definition();
							setState(305);
							match(T__24);

							            _localctx.parameters.addAll(((DefinitionContext)_localctx).va1.ast);
							}
							} 
						}
						setState(312);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					setState(313);
					((DefinitionContext)_localctx).va2 = var_definition();
					_localctx.parameters.addAll(((DefinitionContext)_localctx).va2.ast);
					}
				}

				setState(318);
				match(T__1);
				setState(319);
				match(T__22);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
					{
					setState(320);
					((DefinitionContext)_localctx).type = type();
					((DefinitionContext)_localctx).typeAux =  ((DefinitionContext)_localctx).type.ast;
					}
				}

				setState(325);
				match(T__20);
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						((DefinitionContext)_localctx).va3 = var_definition();
						_localctx.body.addAll(((DefinitionContext)_localctx).va3.ast);
						setState(328);
						match(T__23);
						}
						} 
					}
					setState(334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(335);
					((DefinitionContext)_localctx).statement = statement();
					_localctx.body.add(((DefinitionContext)_localctx).statement.ast);
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(T__21);
				_localctx.ast.add(new FuncDefinition(((DefinitionContext)_localctx).ID.getLine(),  ((DefinitionContext)_localctx).ID.getCharPositionInLine() +1, (((DefinitionContext)_localctx).ID!=null?((DefinitionContext)_localctx).ID.getText():null),
				                                    new FuncType(0, 0, _localctx.parameters, _localctx.typeAux), _localctx.body));
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

	public static class Main_functionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public List<Statement> body;
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_main_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			            ((Main_functionContext)_localctx).body =  new ArrayList<>();
			        
			setState(348);
			match(T__35);
			setState(349);
			match(T__36);
			setState(350);
			match(T__0);
			setState(351);
			match(T__1);
			setState(352);
			match(T__22);
			setState(353);
			match(T__20);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					((Main_functionContext)_localctx).var_definition = var_definition();
					_localctx.body.addAll(((Main_functionContext)_localctx).var_definition.ast);
					setState(356);
					match(T__23);
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(363);
				((Main_functionContext)_localctx).statement = statement();
				_localctx.body.add(((Main_functionContext)_localctx).statement.ast);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(T__21);
			((Main_functionContext)_localctx).ast =  new FuncDefinition(0,  0, "main",
			                     new FuncType(0, 0, new ArrayList<VarDefinition>(), new VoidType(0,0)), _localctx.body);
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

	public static class Var_definitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public ErrorType e;
		public Id_listContext id_list;
		public TypeContext type;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((Var_definitionContext)_localctx).id_list = id_list();
			setState(375);
			match(T__22);
			setState(376);
			((Var_definitionContext)_localctx).type = type();

			                for(int i = 0; i<((Var_definitionContext)_localctx).id_list.ast.size();i++){
			                    if(_localctx.ast.contains(((Var_definitionContext)_localctx).id_list.ast.get(i))){
			                        ((Var_definitionContext)_localctx).e =  new ErrorType(((Var_definitionContext)_localctx).id_list.ast.get(i).getLine(), ((Var_definitionContext)_localctx).id_list.ast.get(i).getColumn(),
			                                "Var" + ((Var_definitionContext)_localctx).id_list.ast.get(i).toString() + "is already defined");
			                    }else{
			                        _localctx.ast.add(new VarDefinition(((Var_definitionContext)_localctx).id_list.ast.get(i).getLine(),
			                                         ((Var_definitionContext)_localctx).id_list.ast.get(i).getColumn(), ((Var_definitionContext)_localctx).id_list.ast.get(i).toString(), ((Var_definitionContext)_localctx).type.ast));
			                        }
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u017e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3S\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0093\n\6\r\6\16\6\u0094"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00a5\n\b"+
		"\f\b\16\b\u00a8\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00df\n\f\f\f\16\f\u00e2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ea\n\r"+
		"\f\r\16\r\u00ed\13\r\5\r\u00ef\n\r\3\16\3\16\3\16\3\16\6\16\u00f5\n\16"+
		"\r\16\16\16\u00f6\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0107\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0110\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011b"+
		"\n\20\3\20\3\20\5\20\u011f\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0129\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0137\n\22\f\22\16\22\u013a\13\22\3\22\3\22\3\22\5\22\u013f"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0146\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u014d\n\22\f\22\16\22\u0150\13\22\3\22\3\22\3\22\7\22\u0155\n\22"+
		"\f\22\16\22\u0158\13\22\3\22\3\22\5\22\u015c\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0169\n\23\f\23\16\23\u016c\13"+
		"\23\3\23\3\23\3\23\7\23\u0171\n\23\f\23\16\23\u0174\13\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\2\3\4\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\6\3\2\n\f\4\2\b\b\r\r\3\2\16\23\3\2\24\25\2\u0196"+
		"\2(\3\2\2\2\4R\3\2\2\2\6x\3\2\2\2\b\u008a\3\2\2\2\n\u008c\3\2\2\2\f\u0099"+
		"\3\2\2\2\16\u009f\3\2\2\2\20\u00af\3\2\2\2\22\u00b1\3\2\2\2\24\u00d6\3"+
		"\2\2\2\26\u00d8\3\2\2\2\30\u00ee\3\2\2\2\32\u00f0\3\2\2\2\34\u0106\3\2"+
		"\2\2\36\u011e\3\2\2\2 \u0128\3\2\2\2\"\u015b\3\2\2\2$\u015d\3\2\2\2&\u0178"+
		"\3\2\2\2(.\b\2\1\2)*\5\"\22\2*+\b\2\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2"+
		"\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\5$\23\2\62\63\b\2"+
		"\1\2\63\64\7\2\2\3\64\65\b\2\1\2\65\3\3\2\2\2\66\67\b\3\1\2\678\7(\2\2"+
		"8S\b\3\1\29:\7)\2\2:S\b\3\1\2;<\7+\2\2<S\b\3\1\2=>\7*\2\2>S\b\3\1\2?@"+
		"\7\3\2\2@A\5\4\3\2AB\7\4\2\2BC\b\3\1\2CS\3\2\2\2DE\5\6\4\2EF\b\3\1\2F"+
		"S\3\2\2\2GH\5\22\n\2HI\b\3\1\2IS\3\2\2\2JK\7\b\2\2KL\5\4\3\bLM\b\3\1\2"+
		"MS\3\2\2\2NO\7\t\2\2OP\5\4\3\7PQ\b\3\1\2QS\3\2\2\2R\66\3\2\2\2R9\3\2\2"+
		"\2R;\3\2\2\2R=\3\2\2\2R?\3\2\2\2RD\3\2\2\2RG\3\2\2\2RJ\3\2\2\2RN\3\2\2"+
		"\2Su\3\2\2\2TU\f\n\2\2UV\7\7\2\2VW\5\4\3\13WX\b\3\1\2Xt\3\2\2\2YZ\f\6"+
		"\2\2Z[\t\2\2\2[\\\5\4\3\7\\]\b\3\1\2]t\3\2\2\2^_\f\5\2\2_`\t\3\2\2`a\5"+
		"\4\3\6ab\b\3\1\2bt\3\2\2\2cd\f\4\2\2de\t\4\2\2ef\5\4\3\5fg\b\3\1\2gt\3"+
		"\2\2\2hi\f\3\2\2ij\t\5\2\2jk\5\4\3\4kl\b\3\1\2lt\3\2\2\2mn\f\f\2\2no\7"+
		"\5\2\2op\5\4\3\2pq\7\6\2\2qr\b\3\1\2rt\3\2\2\2sT\3\2\2\2sY\3\2\2\2s^\3"+
		"\2\2\2sc\3\2\2\2sh\3\2\2\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\5"+
		"\3\2\2\2wu\3\2\2\2xy\7*\2\2yz\7\3\2\2z{\5\30\r\2{|\7\4\2\2|}\b\4\1\2}"+
		"\7\3\2\2\2~\177\5\20\t\2\177\u0080\b\5\1\2\u0080\u008b\3\2\2\2\u0081\u0082"+
		"\5\n\6\2\u0082\u0083\b\5\1\2\u0083\u008b\3\2\2\2\u0084\u0085\7\5\2\2\u0085"+
		"\u0086\7(\2\2\u0086\u0087\7\6\2\2\u0087\u0088\5\b\5\2\u0088\u0089\b\5"+
		"\1\2\u0089\u008b\3\2\2\2\u008a~\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0084"+
		"\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d\b\6\1\2\u008d\u008e\7\26\2\2\u008e"+
		"\u0092\7\27\2\2\u008f\u0090\5\f\7\2\u0090\u0091\b\6\1\2\u0091\u0093\3"+
		"\2\2\2\u0092\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\30\2\2\u0097\u0098\b"+
		"\6\1\2\u0098\13\3\2\2\2\u0099\u009a\5\16\b\2\u009a\u009b\7\31\2\2\u009b"+
		"\u009c\5\b\5\2\u009c\u009d\7\32\2\2\u009d\u009e\b\7\1\2\u009e\r\3\2\2"+
		"\2\u009f\u00a0\7*\2\2\u00a0\u00a6\b\b\1\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3"+
		"\7*\2\2\u00a3\u00a5\b\b\1\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a6\3\2\2"+
		"\2\u00a9\u00aa\7\34\2\2\u00aa\u00b0\b\t\1\2\u00ab\u00ac\7\35\2\2\u00ac"+
		"\u00b0\b\t\1\2\u00ad\u00ae\7\36\2\2\u00ae\u00b0\b\t\1\2\u00af\u00a9\3"+
		"\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\21\3\2\2\2\u00b1"+
		"\u00b2\7\3\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\5"+
		"\4\3\2\u00b5\u00b6\b\n\1\2\u00b6\23\3\2\2\2\u00b7\u00b8\7\37\2\2\u00b8"+
		"\u00b9\5\4\3\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb\b\13\1\2\u00bb\u00d7\3"+
		"\2\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7 \2\2\u00be\u00bf\5\4\3\2\u00bf"+
		"\u00c0\7\32\2\2\u00c0\u00c1\b\13\1\2\u00c1\u00d7\3\2\2\2\u00c2\u00c3\5"+
		"\36\20\2\u00c3\u00c4\b\13\1\2\u00c4\u00d7\3\2\2\2\u00c5\u00c6\5\34\17"+
		"\2\u00c6\u00c7\b\13\1\2\u00c7\u00d7\3\2\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ca"+
		"\5\26\f\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc\b\13\1\2\u00cc\u00d7\3\2\2"+
		"\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\7\32\2\2\u00d0"+
		"\u00d1\b\13\1\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\7"+
		"\32\2\2\u00d4\u00d5\b\13\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00b7\3\2\2\2\u00d6"+
		"\u00bc\3\2\2\2\u00d6\u00c2\3\2\2\2\u00d6\u00c5\3\2\2\2\u00d6\u00c8\3\2"+
		"\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d9"+
		"\5\4\3\2\u00d9\u00e0\b\f\1\2\u00da\u00db\7\33\2\2\u00db\u00dc\5\4\3\2"+
		"\u00dc\u00dd\b\f\1\2\u00dd\u00df\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e2"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\27\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00eb\b\r\1\2\u00e5\u00e6\7\33"+
		"\2\2\u00e6\u00e7\5\4\3\2\u00e7\u00e8\b\r\1\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e3\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\31\3\2\2\2\u00f0\u00f4\7\27\2\2\u00f1\u00f2\5\24"+
		"\13\2\u00f2\u00f3\b\16\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\7\30\2\2\u00f9\33\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc"+
		"\5\4\3\2\u00fc\u00fd\7\31\2\2\u00fd\u00fe\5\32\16\2\u00fe\u00ff\b\17\1"+
		"\2\u00ff\u0107\3\2\2\2\u0100\u0101\7#\2\2\u0101\u0102\5\4\3\2\u0102\u0103"+
		"\7\31\2\2\u0103\u0104\5\24\13\2\u0104\u0105\b\17\1\2\u0105\u0107\3\2\2"+
		"\2\u0106\u00fa\3\2\2\2\u0106\u0100\3\2\2\2\u0107\35\3\2\2\2\u0108\u0109"+
		"\7$\2\2\u0109\u010a\5\4\3\2\u010a\u010b\7\31\2\2\u010b\u010f\5\32\16\2"+
		"\u010c\u010d\5 \21\2\u010d\u010e\b\20\1\2\u010e\u0110\3\2\2\2\u010f\u010c"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\20\1\2"+
		"\u0112\u011f\3\2\2\2\u0113\u0114\7$\2\2\u0114\u0115\5\4\3\2\u0115\u0116"+
		"\7\31\2\2\u0116\u011a\5\24\13\2\u0117\u0118\5 \21\2\u0118\u0119\b\20\1"+
		"\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\b\20\1\2\u011d\u011f\3\2\2\2\u011e\u0108\3\2\2\2"+
		"\u011e\u0113\3\2\2\2\u011f\37\3\2\2\2\u0120\u0121\7%\2\2\u0121\u0122\5"+
		"\32\16\2\u0122\u0123\b\21\1\2\u0123\u0129\3\2\2\2\u0124\u0125\7%\2\2\u0125"+
		"\u0126\5\24\13\2\u0126\u0127\b\21\1\2\u0127\u0129\3\2\2\2\u0128\u0120"+
		"\3\2\2\2\u0128\u0124\3\2\2\2\u0129!\3\2\2\2\u012a\u012b\5&\24\2\u012b"+
		"\u012c\7\32\2\2\u012c\u012d\b\22\1\2\u012d\u015c\3\2\2\2\u012e\u012f\b"+
		"\22\1\2\u012f\u0130\7&\2\2\u0130\u0131\7*\2\2\u0131\u013e\7\3\2\2\u0132"+
		"\u0133\5&\24\2\u0133\u0134\7\33\2\2\u0134\u0135\b\22\1\2\u0135\u0137\3"+
		"\2\2\2\u0136\u0132\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\5&"+
		"\24\2\u013c\u013d\b\22\1\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\4\2\2\u0141\u0145\7\31"+
		"\2\2\u0142\u0143\5\b\5\2\u0143\u0144\b\22\1\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014e\7\27"+
		"\2\2\u0148\u0149\5&\24\2\u0149\u014a\b\22\1\2\u014a\u014b\7\32\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0156\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0152\5\24\13\2\u0152\u0153\b\22\1\2\u0153\u0155\3\2\2\2\u0154\u0151"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\30\2\2\u015a\u015c\b"+
		"\22\1\2\u015b\u012a\3\2\2\2\u015b\u012e\3\2\2\2\u015c#\3\2\2\2\u015d\u015e"+
		"\b\23\1\2\u015e\u015f\7&\2\2\u015f\u0160\7\'\2\2\u0160\u0161\7\3\2\2\u0161"+
		"\u0162\7\4\2\2\u0162\u0163\7\31\2\2\u0163\u016a\7\27\2\2\u0164\u0165\5"+
		"&\24\2\u0165\u0166\b\23\1\2\u0166\u0167\7\32\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0164\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u0172\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\5\24\13\2\u016e"+
		"\u016f\b\23\1\2\u016f\u0171\3\2\2\2\u0170\u016d\3\2\2\2\u0171\u0174\3"+
		"\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\7\30\2\2\u0176\u0177\b\23\1\2\u0177%\3\2\2"+
		"\2\u0178\u0179\5\16\b\2\u0179\u017a\7\31\2\2\u017a\u017b\5\b\5\2\u017b"+
		"\u017c\b\24\1\2\u017c\'\3\2\2\2\34.Rsu\u008a\u0094\u00a6\u00af\u00d6\u00e0"+
		"\u00eb\u00ee\u00f6\u0106\u010f\u011a\u011e\u0128\u0138\u013e\u0145\u014e"+
		"\u0156\u015b\u016a\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}