// Generated from C:/mt/newLab2/2/src\Latex.g4 by ANTLR 4.9.2

    import utility.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatexParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(LatexParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LatexParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(LatexParser.PreambleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(LatexParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(LatexParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#usepkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsepkg(LatexParser.UsepkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(LatexParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#primeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimeSection(LatexParser.PrimeSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#mathItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathItems(LatexParser.MathItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#mathItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathItem(LatexParser.MathItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(LatexParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#subSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSection(LatexParser.SubSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#subSubSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSubSection(LatexParser.SubSubSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LatexParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#underline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderline(LatexParser.UnderlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#emph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmph(LatexParser.EmphContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(LatexParser.BoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#greek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreek(LatexParser.GreekContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LatexParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#documentclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentclass(LatexParser.DocumentclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#author}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthor(LatexParser.AuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(LatexParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(LatexParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(LatexParser.ArgContext ctx);
}