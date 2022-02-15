package utility

import java.nio.file.Path
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class Grammar(
    private val preamble: Preamble,
    private val body: Body,
) {
    val document: Document = Document.createShell("")

    init {
        generateHead()
        generateBody()
    }

    private fun generateHead() {
        val titleBlock = document.body()
            .appendElement("div")
            .attr("id", "titleBlock")

        if (preamble.title != null) {
            document.title(preamble.title)
            titleBlock.appendElement("h2")
                .attr("style", "font-size: 1.75em; text-align:center;")
                .text(preamble.title)
        }
        if (preamble.author != null) {
            titleBlock.appendElement("h3")
                .attr("style", "text-align:center;")
                .text(preamble.author)
        }
        if (preamble.date != null) {
            titleBlock.appendElement("h3")
                .attr("style", "text-align:center;")
                .text(preamble.date);
        }
    }

    private fun generateBody() {
        var count = 0
        for (section in body.content) {
            if (section is PrimeSection) {
                generatePrimeSection(section)
            } else {
                generateSection(section as Section, ++count)
            }
        }
    }

    private fun generatePrimeSection(section: PrimeSection) {
        if (section.content != null) {
            document.body().appendText(section.content)
        }
        if (section.command != null) {
            generateCommand(section.command)
        }
        if (section.math != null) {
            val elem = document.body().appendElement("math")
            elem.attr("xmlns", "http://www.w3.org/1998/Math/MathML")
            generateMathFormula(elem, section.math)
        }
    }

    private fun generateMathFormula(element: Element, formula: MathFormula) {
        formula.items.forEach { generateMathItem(element, it) }
    }

    private fun generateMathItem(element: Element, math: MathItem) {
        if (math is StringItem) {
            val st = setOf<String>("+", "-", "*", "/", ">", "<", "=")
            if (st.contains(math.str)) {
                element.appendElement("mo").text(math.str)
            } else {
                element.appendElement("mi").text(math.str)
            }
        } else if (math is IndexItem) {
            val newElement = element.appendElement("msub")
            generateMathItem(newElement, math.item)
            generateMathItem(newElement, math.index)
        } else if (math is GreekItem) {
            element.appendElement("mi").text(parseGreek(math.latter))
        } else if (math is FracItem) {
            val fracElement = element.appendElement("mfrac")
            generateMathFormula(fracElement.appendElement("mrow"), math.first)
            generateMathFormula(fracElement.appendElement("mrow"), math.second)
        } else if (math is SqrtItem) {
            generateMathFormula(element.appendElement("msqrt"), math.value)
        }
    }

    private fun parseGreek(str: String):String {
        return when (str) {
            "\\Gamma"    -> " \u1d26"
            "\\Delta"    -> " \u0394"
            "\\Theta"    -> " \u0398"
            "\\Lambda"   -> " \u039b"
            "\\Pi"       -> " \u03a0"
            "\\Sigma"    -> " \u03a3"
            "\\Phi"      -> " \u03a6"
            "\\Psi"      -> " \u03a8"
            "\\Omega"    -> " \u03a9"
            "\\alpha"    -> " \u03b1"
            "\\beta"     -> " \u03b2"
            "\\gamma"    -> " \u03b3"
            "\\delta"    -> " \u03b4"
            "\\epsilon"  -> " \u03b5"
            "\\eta"      -> " \u03b7"
            "\\theta"    -> " \u03b8"
            "\\iota"     -> " \u03b9"
            "\\kappa"    -> " \u03ba"
            "\\lambda"   -> " \u03bb"
            "\\mugreek"  -> " \u03bc"
            "\\nu"       -> " \u03bd"
            "\\xi"       -> " \u03be"
            "\\pi"       -> " \u03c0"
            "\\rho"      -> " \u03c1"
            "\\sigma"    -> " \u03c3"
            "\\tau"      -> " \u03c4"
            "\\tupsilon" -> " \u03c5"
            "\\phi"      -> " \u03c6"
            "\\chi"      -> " \u03c7"
            "\\psi"      -> " \u03c8"
            "\\omega"    -> " \u03c9"
            else -> ""
        }
    }

    private fun generateCommand(command: String) {
        var str = parseGreek(command)
        when (command) {
            "\\newline" -> document.body().appendElement("br")
            "\\slash"   -> str = "/"
            "\\textbackslash" -> str = "\\"
            "\\today"   -> SimpleDateFormat("dd.MM.yy").format(Calendar.getInstance().time)
            "\\ldots"   -> str = "&hellip;"
            "\\euro"    -> str = " \u20ac"
            "\\celsius" -> str = " \u2103"
        }
        document.body().appendText(str)
    }

    private fun generateSection(section: Section, id: Int) {
        document.body()
            .appendElement("h${section.number + 2}")
            .attr("class", "${"sub".repeat(section.number)}Section")
            .text("$id\t${section.name}")
        var count = 0
        for (subSection in section.content) {
            if (subSection is PrimeSection) {
                generatePrimeSection(subSection)
            } else {
                generateSection(subSection as Section, ++count)
            }
        }
    }

    fun generate(path: Path) {
        File(path.toString()).writeText(document.html())
    }
}

class Preamble(
    val author: String?,
    val date: String?,
    val title: String?,
)

class Body(
    val content: List<AbstractSection>,
)

open class AbstractSection

class PrimeSection(
    val content: String?,
    val command: String?,
    val math: MathFormula?
) : AbstractSection()

class Section(
    val number: Int,
    val name: String,
    val content: List<AbstractSection>,
) : AbstractSection()

class MathFormula(
    val items: List<MathItem>
)

open class MathItem

class StringItem(
    val str: String
): MathItem()

class IndexItem(
    val item: MathItem,
    val index: MathItem
): MathItem()

class GreekItem(
    val latter: String
): MathItem()

class FracItem(
    val first: MathFormula,
    val second: MathFormula
): MathItem()

class SqrtItem(
    val value: MathFormula
): MathItem()