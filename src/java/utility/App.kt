package utility

import LatexLexer
import LatexParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Path

fun main() {
    val inputPath = Path.of("src", "texFile.tex")
    val outputPath = Path.of("src", "htmlFile.html")
    val lexer = LatexLexer(CharStreams.fromPath(inputPath))
    val parser = LatexParser(CommonTokenStream(lexer))
    val grammar = parser.document().grammar
    grammar.generate(outputPath)
}