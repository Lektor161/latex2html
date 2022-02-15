//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//
//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        String inputFile = "src/texFile.tex";
//        String outputFile = "src/htmlFile.html";
//
//        String input;
//        try(BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//            while (line != null) {
//                sb.append(line).append("\n");
//                line = br.readLine();
//            }
//            input = sb.toString();
//        }
//
//        LatexLexer lexer = new LatexLexer(CharStreams.fromString(input));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        LatexParser parser = new LatexParser(tokens);
//        ParseTree tree = parser.document();
//        ParseTreeWalker walker = new ParseTreeWalker();
//
//        LatexListenerImpl listener = new LatexListenerImpl();
//        walker.walk(listener, tree);
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
//            writer.write(listener.getHtml());
//        }
//    }
//}
