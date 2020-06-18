package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor(staticName = "from")
public class BinaryExpression extends Expression {




    Expression lhs;
    String operator;
    Expression rhs;

    public String getSt4() {
        String out = String.format("Struct.of(\"%s\",%s,%s)",TUPOperator(operator), lhs.getSt4(),rhs.getSt4());
        return String.format("Struct.of(\"%s\",%s,%s)",TUPOperator(operator), lhs.getSt4(),rhs.getSt4());
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
            case "/": return "/";
            case "**": return "**";
        }
        return "UNIDENTIFIED_OPERATOR_" + ASOperator;
    }

}
