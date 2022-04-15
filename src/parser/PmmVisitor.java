// Generated from C:/Users/laisg/IdeaProjects/DLP - copia/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import AST.program.*;
import AST.definitions.*;
import AST.expressions.*;
import AST.statements.*;
import AST.types.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invocation(PmmParser.Function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#record_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type(PmmParser.Record_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#record_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_field(PmmParser.Record_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(PmmParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(PmmParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(PmmParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_coma_list2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_coma_list2(PmmParser.Var_coma_list2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_coma_list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_coma_list1(PmmParser.Var_coma_list1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#body_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_plus(PmmParser.Body_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(PmmParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(PmmParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(PmmParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(PmmParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(PmmParser.Var_definitionContext ctx);
}