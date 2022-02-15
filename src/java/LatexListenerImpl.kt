//import LatexParser.DocumentContext
//import LatexParser.TitleContext
//import LatexParser.AuthorContext
//import LatexParser.DateContext
//import LatexParser.SectionContext
//import LatexParser.SubSectionContext
//import LatexParser.SubSubSectionContext
//import LatexParser.StringContext
//import LatexParser.CommandContext
//import java.text.SimpleDateFormat
//import java.util.Calendar
//import LatexParser.UnderlineContext
//import LatexParser.EmphContext
//import LatexParser.BoldContext
//import org.jsoup.nodes.Document
//
//class LatexListenerImpl : LatexBaseListener() {
//    var document: Document? = null
//    var title: String? = null
//    var author: String? = null
//    var date: String? = null
//    var section = 0
//    var subSection = 0
//    var subSubSection = 0
//    val html: String
//        get() = document!!.html()
//
//    override fun enterDocument(ctx: DocumentContext) {
//        document = Document.createShell("")
//        document.outputSettings(Document.OutputSettings().prettyPrint(true))
//        document.head().prepend("<meta />")
//        document.head().select("meta")[0].attr("charset", "UTF-8")
//    }
//
//    override fun enterTitle(ctx: TitleContext) {
//        title = ctx.text
//        document!!.title(ctx.text)
//    }
//
//    override fun enterAuthor(ctx: AuthorContext) {
//        author = ctx.text
//    }
//
//    override fun enterDate(ctx: DateContext) {
//        date = ctx.text
//    }
//
//    override fun enterSection(ctx: SectionContext) {
//        subSubSection = 0
//        subSection = subSubSection
//        document!!.body().appendElement("h2").attr("class", "section")
//            .text(++section.toString() + "\t" + ctx.name)
//    }
//
//    override fun enterSubSection(ctx: SubSectionContext) {
//        subSubSection = 0
//        document!!.body().appendElement("h3").attr("class", "subSection")
//            .text(String.format("%d.%d", section, ++subSection) + "\t" + ctx.name)
//    }
//
//    override fun enterSubSubSection(ctx: SubSubSectionContext) {
//        document!!.body().appendElement("h3").attr("class", "subSection")
//            .text(String.format("%d.%d.%d", section, subSection, ++subSubSection) + "\t" + ctx.name)
//    }
//
//    override fun enterString(ctx: StringContext) {
//        document!!.body().appendText(ctx.text)
//    }
//
//    override fun enterCommand(ctx: CommandContext) {
//        var str = ""
//        when (ctx.text) {
//            "\\newline" -> document!!.body().appendElement("br")
//            "\\slash" -> str = "/"
//            "\\textbackslash" -> str = "\\"
//            "\\today" -> document!!.body().appendText(
//                SimpleDateFormat("dd.MM.yy")
//                    .format(Calendar.getInstance().time)
//            )
//            "\\ldots" -> str = "&hellip;"
//            "\\euro" -> str = " \u20ac"
//            "\\celsius" -> str = " \u2103"
//            "\\Gamma" -> str = " \u1d26"
//            "\\Delta" -> str = " \u0394"
//            "\\Theta" -> str = " \u0398"
//            "\\Lambda" -> str = " \u039b"
//            "\\Pi" -> str = " \u03a0"
//            "\\Sigma" -> str = " \u03a3"
//            "\\Phi" -> str = " \u03a6"
//            "\\Psi" -> str = " \u03a8"
//            "\\Omega" -> str = " \u03a9"
//            "\\alpha" -> str = " \u03b1"
//            "\\beta" -> str = " \u03b2"
//            "\\gamma" -> str = " \u03b3"
//            "\\delta" -> str = " \u03b4"
//            "\\epsilon" -> str = " \u03b5"
//            "\\eta" -> str = " \u03b7"
//            "\\theta" -> str = " \u03b8"
//            "\\iota" -> str = " \u03b9"
//            "\\kappa" -> str = " \u03ba"
//            "\\lambda" -> str = " \u03bb"
//            "\\mugreek" -> str = " \u03bc"
//            "\\nu" -> str = " \u03bd"
//            "\\xi" -> str = " \u03be"
//            "\\pi" -> str = " \u03c0"
//            "\\rho" -> str = " \u03c1"
//            "\\sigma" -> str = " \u03c3"
//            "\\tau" -> str = " \u03c4"
//            "\\tupsilon" -> str = " \u03c5"
//            "\\phi" -> str = " \u03c6"
//            "\\chi" -> str = " \u03c7"
//            "\\psi" -> str = " \u03c8"
//            "\\omega" -> str = " \u03c9"
//        }
//        document!!.body().appendText(str)
//    }
//
//    override fun enterUnderline(ctx: UnderlineContext) {
//        document!!.body().appendElement("span")
//            .attr("style", "text-decoration:underline;").text(ctx.text)
//    }
//
//    override fun enterEmph(ctx: EmphContext) {
//        document!!.body().appendElement("em").text(ctx.text)
//    }
//
//    override fun enterBold(ctx: BoldContext) {
//        document!!.body().appendElement("b").text(ctx.text)
//    }
//
//    fun enterVariable(ctx: LatexParser.VariableContext) {
//        document!!.body().appendElement("i").text(ctx.name)
//    }
//
//    fun enterIndex(ctx: LatexParser.IndexContext) {
//        document!!.body().appendElement("sub").appendElement("i").appendText(ctx.name)
//    }
//
//    fun enterPow(ctx: LatexParser.PowContext) {
//        document!!.body().appendElement("sup").appendText(ctx.name)
//    }
//}