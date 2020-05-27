import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception{
        ChocopyGrammarLexer lexer = new ChocopyGrammarLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ChocopyGrammarParser parser = new ChocopyGrammarParser(tokens);
        ParseTree tree = parser.var_def();

        MyVisit<Object> loader = new MyVisit<>();
        loader.visit(tree);
    }
}
