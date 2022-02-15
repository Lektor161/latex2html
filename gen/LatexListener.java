// Generated from C:/mt/newLab2/2/src\Latex.g4 by ANTLR 4.9.2

    import utility.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatexParser}.
 */
public interface LatexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatexParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(LatexParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(LatexParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LatexParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LatexParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(LatexParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(LatexParser.PreambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(LatexParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(LatexParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(LatexParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(LatexParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#usepkg}.
	 * @param ctx the parse tree
	 */
	void enterUsepkg(LatexParser.UsepkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#usepkg}.
	 * @param ctx the parse tree
	 */
	void exitUsepkg(LatexParser.UsepkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(LatexParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(LatexParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#primeSection}.
	 * @param ctx the parse tree
	 */
	void enterPrimeSection(LatexParser.PrimeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#primeSection}.
	 * @param ctx the parse tree
	 */
	void exitPrimeSection(LatexParser.PrimeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#mathItems}.
	 * @param ctx the parse tree
	 */
	void enterMathItems(LatexParser.MathItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#mathItems}.
	 * @param ctx the parse tree
	 */
	void exitMathItems(LatexParser.MathItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#mathItem}.
	 * @param ctx the parse tree
	 */
	void enterMathItem(LatexParser.MathItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#mathItem}.
	 * @param ctx the parse tree
	 */
	void exitMathItem(LatexParser.MathItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(LatexParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(LatexParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#subSection}.
	 * @param ctx the parse tree
	 */
	void enterSubSection(LatexParser.SubSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#subSection}.
	 * @param ctx the parse tree
	 */
	void exitSubSection(LatexParser.SubSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#subSubSection}.
	 * @param ctx the parse tree
	 */
	void enterSubSubSection(LatexParser.SubSubSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#subSubSection}.
	 * @param ctx the parse tree
	 */
	void exitSubSubSection(LatexParser.SubSubSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LatexParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LatexParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#underline}.
	 * @param ctx the parse tree
	 */
	void enterUnderline(LatexParser.UnderlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#underline}.
	 * @param ctx the parse tree
	 */
	void exitUnderline(LatexParser.UnderlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#emph}.
	 * @param ctx the parse tree
	 */
	void enterEmph(LatexParser.EmphContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#emph}.
	 * @param ctx the parse tree
	 */
	void exitEmph(LatexParser.EmphContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(LatexParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(LatexParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#greek}.
	 * @param ctx the parse tree
	 */
	void enterGreek(LatexParser.GreekContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#greek}.
	 * @param ctx the parse tree
	 */
	void exitGreek(LatexParser.GreekContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LatexParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LatexParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#documentclass}.
	 * @param ctx the parse tree
	 */
	void enterDocumentclass(LatexParser.DocumentclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#documentclass}.
	 * @param ctx the parse tree
	 */
	void exitDocumentclass(LatexParser.DocumentclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(LatexParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(LatexParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(LatexParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(LatexParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(LatexParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(LatexParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(LatexParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(LatexParser.ArgContext ctx);
}