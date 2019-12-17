package simplelang.visitors;

import grammar.SimpleLangBaseVisitor;
import grammar.SimpleLangParser;
import simplelang.ob.Instruction;

public class InstructionVisitor extends SimpleLangBaseVisitor<Instruction> {


    @Override
    public Instruction visitInstruction(SimpleLangParser.InstructionContext ctx) {
        String instructionName = ctx.getText();
        return new Instruction(instructionName);
    }
}