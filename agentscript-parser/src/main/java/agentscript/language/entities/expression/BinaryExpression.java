package agentscript.language.entities.expression;

import agentscript.language.entities.terms.Variable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class BinaryExpression extends Expression implements IExpression {

    Expression lhs;
    String operator;
    Expression rhs;

    @Override
    public String getAsStructure() {
        return String.format("StructTerm(\"%s\",Seq[GenericTerm](%s,%s))",
                TUPOperator(operator),
                lhs.getAsStructure(),
                rhs.getAsStructure());
    }

    @Override
    public String getAsNative() {
        if(operator.equals("=")) {
            if(lhs instanceof TermExpression && ((TermExpression) lhs).getTerm() instanceof Variable)
                return String.format(" (vars %s (\"%s\" -> %s)) ", NativeOperator(operator),
                        ((Variable) ((TermExpression) lhs).getTerm()).getName() ,
                        rhs.getAsNative());
            else throw new RuntimeException("Assign to non-var:" + lhs.getAsNative());
        }
        return String.format(" (%s %s %s) ",lhs.getAsNative(), NativeOperator(operator),rhs.getAsNative());
    }

    public static String TUPOperator(String ASOperator) {
        switch (ASOperator) {
            case "&&": return ",";
            case "||": return ";";
            case "=": return "=";
            case "==": return "==";
            case "<": return "<";
            case ">": return ">";
            case ">=": return ">=";
            case "=<": return "=<";
            case "is": return "is";
            case "!==": return "\\\\==";
            case "!=": return "\\\\=";
            case "+": return "+";
            case "-": return "-";
            case "*": return "*";
            case "returns": return "returns";
            case "as": return "as";
            case "<-": return "<-";
            case "/": return "/";
            case "**": return "**";
            case "%": return "mod";
        }
        return "UNIDENTIFIED_OPERATOR_" + ASOperator;
    }

    public static String NativeOperator(String ASOperator) {
        switch (ASOperator) {
            case "&&": return "&&";
            case "||": return "||";
            case "==": return "==";
            case "<": return "<";
            case ">": return ">";
            case ">=": return ">=";
            case "=<": return "<=";
            case "!=": return "!=";
            case "+": return "+";
            case "-": return "-";
            case "*": return "*";
            case "/": return "/";
            case "%": return "%";
            case "=": return "+=+";
        }

        return "UNIDENTIFIED_OPERATOR: " + ASOperator;
    }

}
