package agentscript.language.entities.expression;

import agentscript.language.entities.Variable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor(staticName = "from")
public class BinaryExpression extends Expression implements IExpression {

    Expression lhs;
    String operator;
    Expression rhs;

    @Override
    public String getSt4() {
        return String.format("StructTerm(\"%s\",Seq[GenericTerm](%s,%s))",TUPOperator(operator), lhs.getSt4(),rhs.getSt4());
    }

    @Override
    public String getNative() {
        if(operator.equals("=")) {
            if(lhs instanceof TermExpression && ((TermExpression) lhs).getTerm() instanceof Variable)
                return String.format(" (vars %s (\"%s\" -> %s)) ", NativeOperator(operator),
                        ((Variable) ((TermExpression) lhs).getTerm()).getName() ,
                        rhs.getNative());
            else throw new RuntimeException("Assign to non-var:" + lhs.getNative());
        }
        return String.format(" (%s %s %s) ",lhs.getNative(), NativeOperator(operator),rhs.getNative());
    }

    @Override
    public String getScala() {
        if(operator.equals("=") && lhs instanceof TermExpression && ((TermExpression)lhs).term instanceof Variable) {
            Variable v = (Variable)((TermExpression)lhs).term;
            return "var " + v.getName() + " = Seq(" + rhs.getScala() + ") \n " + v.getName();
        }
        else if (operator.equals("&&"))
        {
            return lhs.getScala() + ".map( _ => {\n" + rhs.getScala() + "\n})";
        }
            return String.format(" %s %s %s ",lhs.getScala(), NativeOperator(operator),rhs.getScala());
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
