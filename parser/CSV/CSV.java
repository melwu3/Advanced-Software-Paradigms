import java.util.List;
import org.antlr.runtime.*;
import org.antlr.stringtemplate.*;

public class CSV {
    public static void main(String args[]) throws Exception {
        CSVLexer lex = new CSVLexer(new ANTLRInputStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CSVParser g = new CSVParser(tokens);
        List values = g.file();

        String decl =
            "Number[] values = { $values; wrap, anchor, separator=\", \"$ };";
        StringTemplate st = new StringTemplate(decl);
        st.setAttribute("values", values);
        System.out.println(st.toString(72));
    }
}