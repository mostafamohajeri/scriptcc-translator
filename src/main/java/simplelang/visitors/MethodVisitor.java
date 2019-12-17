package simplelang.visitors;

import grammar.SimpleLangBaseVisitor;
import grammar.SimpleLangParser;
import simplelang.ob.Instruction;
import simplelang.ob.Method;

import java.util.List;
import java.util.stream.Collectors;

public class MethodVisitor extends SimpleLangBaseVisitor<Method> {

    @Override
    public Method visitMethod(SimpleLangParser.MethodContext ctx) {
        String methodName = ctx.methodName().getText();
        InstructionVisitor instructionVisitor = new InstructionVisitor();
        List<Instruction> instructions = ctx.instruction()
                .stream()
                .map(instruction -> instruction.accept(instructionVisitor))
                .collect(Collectors.toList());
        return new Method(methodName, instructions);
    }
}