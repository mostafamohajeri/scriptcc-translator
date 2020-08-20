package agentscript.language.visitor;

import agentscript.language.entities.*;
import agentscript.language.entities.expression.BinaryExpression;
import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.expression.NegationExpression;
import agentscript.language.entities.expression.TermExpression;
import agentscript.language.entities.goals.*;
import grammar.AgentBaseVisitor;
import grammar.AgentParser;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

public class CAgentVisitor extends AgentBaseVisitor<Optional<Object>> {

    @Getter
    private AgentFactory factory = new AgentFactory();

    @Override
    public Optional<Object> visitAgent(AgentParser.AgentContext ctx) {

        factory.startAgent();

        super.visitAgent(ctx);

        factory.endAgent();

        return Optional.empty();
    }

    @Override
    public Optional<Object> visitInitialbeliefs(AgentParser.InitialbeliefsContext ctx) {

        ctx.belief().stream().map(this::visitBelief).map(i -> (InitialBelief) i.orElse(Literal.empty())).forEach(factory::addInitialBelief);

        return Optional.empty();

    }

    @Override
    public Optional<Object> visitBelief(AgentParser.BeliefContext ctx) {
        return Optional.of(InitialBelief.from((Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())));
    }

    @Override
    public Optional<Object> visitInitialgoals(AgentParser.InitialgoalsContext ctx) {

        ctx.initialgoal().stream().map(
                g -> {
                    if (Objects.nonNull(g.achievementgoal())) return visitAchievementgoal(g.achievementgoal());
                    else if (Objects.nonNull(g.maintenancegoal())) return visitMaintenancegoal(g.maintenancegoal());
                    else return Optional.empty();
                }
        ).map(i -> InitialGoal.from((Goal) i.orElse(Goal.empty()))).forEach(factory::addInitialGoal);

        return Optional.empty();

    }

    @Override
    public Optional<Object> visitPlans(AgentParser.PlansContext ctx) {
        ctx.plan().stream().map(this::visitPlan).map(i -> (Plan) i.orElse(Plan.empty())).forEach(factory::addPlan);
        return Optional.empty();
    }

    @Override
    public Optional<Object> visitPlan(AgentParser.PlanContext ctx) {
        Plan.PlanBuilder planBuilder = Plan.builder();

        if (Objects.nonNull(ctx.plantrigger()))
            planBuilder
                    .trigger(
                            (PlanTrigger) visitPlantrigger(ctx.plantrigger()).orElse(PlanTrigger.from(ActionOperator.NONE, PlanOperator.NONE))
                    );

        if (Objects.nonNull(ctx.literal()))
            planBuilder
                    .literal(
                            (Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())
                    );

        if (Objects.nonNull(ctx.condition))
            planBuilder.expression((Expression) visitExpression(ctx.condition).orElse(Expression.empty()));


        if (Objects.nonNull(ctx.plandefinition()))
            planBuilder.planDefinition((PlanDefinition) visitPlandefinition(ctx.plandefinition()).orElse(PlanDefinition.empty()));

        if(Objects.nonNull(ctx.ANNOTATION()))
            ctx.ANNOTATION().forEach(a -> planBuilder.annotation(a.getText()));

        return Optional.of(planBuilder.build());
    }

    @Override
    public Optional<Object> visitPlandefinition(AgentParser.PlandefinitionContext ctx) {

        if (Objects.nonNull(ctx.body()))
            return visitBody(ctx.body());

        return Optional.empty();

    }

    @Override
    public Optional<Object> visitBody(AgentParser.BodyContext ctx) {
        PlanDefinition.PlanDefinitionBuilder builder = PlanDefinition.builder();

        ctx.bodyformula().forEach( formula -> builder.step((IPlanStep)(visitBodyformula(formula).get())));

        return Optional.of(builder.build());
    }

    @Override
    public Optional<Object> visitExpression(AgentParser.ExpressionContext ctx) {

        if (Objects.nonNull(ctx.term()))
            return Optional.of(TermExpression.from((Term) visitTerm(ctx.term()).orElse(Term.empty())));

        else if (Objects.nonNull(ctx.DEFAULTNEGATION()))
            return Optional.of(NegationExpression.from((Expression) visitExpression(ctx.single).orElse(Expression.empty())));

        else if (Objects.nonNull(ctx.LEFTROUNDBRACKET()) && Objects.nonNull(ctx.RIGHTROUNDBRACKET()))
            return visitExpression(ctx.single);

        else if (Objects.nonNull(ctx.rhs) && Objects.nonNull(ctx.lhs))
            return Optional.of(BinaryExpression.from(
                    (Expression) visitExpression(ctx.lhs).orElse(Expression.empty()),
                    ctx.binaryoperator.getText(),
                    (Expression) visitExpression(ctx.rhs).orElse(Expression.empty())
            ));


        return Optional.empty();

    }

    @Override
    public Optional<Object> visitPlantrigger(AgentParser.PlantriggerContext ctx) {

        ActionOperator actionOperator = ActionOperator.NONE;
        PlanOperator planOperator = PlanOperator.NONE;

        if (Objects.nonNull(ctx.ARITHMETICOPERATOR3())
                && ctx.ARITHMETICOPERATOR3().getText().equals(ActionOperator.PLUS.getValue()))
            actionOperator = ActionOperator.PLUS;
        else if (Objects.nonNull(ctx.ARITHMETICOPERATOR3())
                && ctx.ARITHMETICOPERATOR3().getText().equals(ActionOperator.MINUS.getValue()))
            actionOperator = ActionOperator.MINUS;

        if (Objects.nonNull(ctx.EXCLAMATIONMARK()))
            planOperator = PlanOperator.EXCLAMATION;
        else if (Objects.nonNull(ctx.DOUBLEEXCLAMATIONMARK()))
            planOperator = PlanOperator.DOUBLEEXCLAMATION;
        else if (Objects.nonNull(ctx.QUESTIONMARK()))
            planOperator = PlanOperator.QUESTION;

        return Optional.of(PlanTrigger.from(actionOperator, planOperator));

    }

    @Override
    public Optional<Object> visitFor_loop(AgentParser.For_loopContext ctx) {
        ForLoop.ForLoopBuilder builder = ForLoop.builder();

        builder.variable((Variable) visitVariable(ctx.variable()).orElse(Variable.empty()));
        builder.expression((Expression) visitExpression(ctx.expression()).orElse(Expression.empty()));

        ctx.bodyformula().forEach( formula -> builder.step((IPlanStep)(visitBodyformula(formula).get())));

        return Optional.of(builder.build());
    }

    @Override
    public Optional<Object> visitIf_else(AgentParser.If_elseContext ctx) {

        IfElse.IfElseBuilder builder = IfElse.builder();

        if(Objects.nonNull(ctx.condition_block()))
        {
           ctx.condition_block().forEach(condition_block -> builder.conditionBlock((ConditionBlock)visitCondition_block(condition_block).get()));
        }

        if(Objects.nonNull(ctx.code_block())) {
            builder.elseBlock((PlanDefinition) visitCode_block(ctx.code_block()).get());
        }

        return Optional.of(builder.build());
    }


    @Override
    public Optional<Object> visitCode_block(AgentParser.Code_blockContext ctx) {
        PlanDefinition.PlanDefinitionBuilder builder = PlanDefinition.builder();

        if(Objects.nonNull(ctx.single))
            builder.step((IPlanStep)(visitBodyformula(ctx.single).get()));
        else
            ctx.bodyformula().forEach( formula -> builder.step((IPlanStep)(visitBodyformula(formula).get())));

        return Optional.of(builder.build());
    }

    @Override
    public Optional<Object> visitCondition_block(AgentParser.Condition_blockContext ctx) {
        ConditionBlock.ConditionBlockBuilder builder = ConditionBlock.builder();

        builder.expression((Expression) (visitExpression(ctx.expression()).get()));
        builder.planDefinition((PlanDefinition) (visitCode_block(ctx.code_block()).get()));


        return Optional.of(builder.build());
    }

    @Override
    public Optional<Object> visitTestgoal(AgentParser.TestgoalContext ctx) {
        return Optional.of(TestGoal.from((Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())));
    }

    @Override
    public Optional<Object> visitAchievementgoal(AgentParser.AchievementgoalContext ctx) {
        return Optional.of(AchievementGoal.from((Atom) Atom.from(ctx.ATOM().getText()),
                Objects.nonNull(ctx.paramlist()) ? (List) this.visitParamlist(ctx.paramlist()).orElse(Collections.EMPTY_LIST) : null
                )
                );
    }

    @Override
    public Optional<Object> visitMaintenancegoal(AgentParser.MaintenancegoalContext ctx) {
        return Optional.of(MaintenanceGoal.from((Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())));
    }

    @Override
    public Optional<Object> visitBeliefaction(AgentParser.BeliefactionContext ctx) {

        ActionOperator actionOperator = (ActionOperator) (visitBeliefactiontrigger(ctx.beliefactiontrigger()).orElse(ActionOperator.NONE));

        return Optional.of(BeliefAction.from(actionOperator,
                (Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())));

    }

    @Override
    public Optional<Object> visitBeliefactiontrigger(AgentParser.BeliefactiontriggerContext ctx) {

            if(ctx.first.getText().equals(ActionOperator.PLUS.getValue()))
                return Optional.of(ActionOperator.PLUS);
            else if(ctx.first.getText().equals(ActionOperator.MINUS.getValue()))
            {
                if(Objects.nonNull(ctx.second) && ctx.second.getText().equals(ActionOperator.PLUS.getValue()))
                    return Optional.of(ActionOperator.MINUSPLUS);
                else if (Objects.isNull(ctx.second))
                    return Optional.of(ActionOperator.MINUS);
            }

            return Optional.empty();

    }

    @Override
    public Optional<Object> visitPrimitiveaction(AgentParser.PrimitiveactionContext ctx) {
        return Optional.of(
                PrimitiveAction.from(
                        Atom.from(ctx.OBJECT_ATOM().getText().replace("#","")),
                        Objects.nonNull(ctx.paramlist()) ? (List) this.visitParamlist(ctx.paramlist()).orElse(Collections.EMPTY_LIST) : null,
                        ctx.function_call().stream().map(this::visitFunction_call).map(i -> (PrimitiveAction) i.orElse(PrimitiveAction.empty())).collect(Collectors.toList())
                ));
    }

    @Override
    public Optional<Object> visitFunction_call(AgentParser.Function_callContext ctx) {
        return Optional.of(
                PrimitiveAction.from(
                        Atom.from(ctx.FUNC_NAME().getText().replace(".","")),
                        Objects.nonNull(ctx.paramlist()) ? (List) this.visitParamlist(ctx.paramlist()).orElse(Collections.EMPTY_LIST) : null,
                        Collections.EMPTY_LIST
                ));
    }

    @Override
    public Optional<Object> visitParamlist(AgentParser.ParamlistContext ctx) {
        return Optional.of(ctx.expression().stream().map(this::visitExpression).map(i -> (Expression) i.orElse(Expression.empty())).collect(Collectors.toList()));
    }

    @Override
    public Optional<Object> visitLiteral(AgentParser.LiteralContext ctx) {
        return Optional.of(Literal.builder()
                .negated(Objects.nonNull(ctx.STRONGNEGATION()))
                .atom(Atom.from(ctx.ATOM().getText()))
                .expressions(
                        Objects.nonNull(ctx.paramlist()) ? (List) this.visitParamlist(ctx.paramlist()).orElse(Collections.EMPTY_LIST) : Collections.EMPTY_LIST
                ).build());
    }

    @Override
    public Optional<Object> visitTermlist(AgentParser.TermlistContext ctx) {
        return Optional.of(ctx.term().stream().map(this::visitTerm).map(i -> (Term) i.orElse(Literal.empty())).collect(Collectors.toList()));
    }

    @Override
    public Optional<Object> visitTerm(AgentParser.TermContext ctx) {
        if (Objects.nonNull(ctx.literal()))
            return this.visitLiteral(ctx.literal());
        else if (Objects.nonNull(ctx.variable()))
            return this.visitVariable(ctx.variable());
        else if (Objects.nonNull(ctx.termvalue()))
            return this.visitTermvalue(ctx.termvalue());
        else if (Objects.nonNull(ctx.primitiveaction()))
            return this.visitPrimitiveaction(ctx.primitiveaction());
        return Optional.empty();
    }


    @Override
    public Optional<Object> visitVariable(AgentParser.VariableContext ctx) {
        return Optional.of(Variable.from(ctx.VARIABLEATOM().getText()));
    }

    @Override
    public Optional<Object> visitTermvalue(AgentParser.TermvalueContext ctx) {
        if (Objects.nonNull(ctx.LOGICALVALUE()))
            return Optional.of(BooleanTermValue.from(
                    !ctx.LOGICALVALUE().getText().isEmpty() &&
                            ("true".equals(ctx.LOGICALVALUE().getText())
                                    || "success".equals(ctx.LOGICALVALUE().getText()))
            ));

        else if (Objects.nonNull(ctx.STRING()))
            return Optional.of(StringTermValue.from(ctx.STRING().getText()));

        else if (Objects.nonNull(ctx.NUMBER())) {
            try{
                return Optional.of(NumericTermValue.from(Long.valueOf(ctx.NUMBER().getText())));
            } catch (Exception e) {}
            return Optional.of(NumericTermValue.from(Double.valueOf(ctx.NUMBER().getText())));
        }
        return Optional.empty();
    }

    @Override
    public Optional<Object> visitAssignment_statement(AgentParser.Assignment_statementContext ctx) {
        if(Objects.nonNull(ctx.variable()) && Objects.nonNull(ctx.expression())) {
            return Optional.of(AssignmentAction.from(
                    (Variable) visitVariable(ctx.variable()).get(),
                    (Expression) visitExpression(ctx.expression()).get()
            ));
        }

        return Optional.empty();

    }

    @Override
    public Optional<Object> visitBodyformula(AgentParser.BodyformulaContext ctx) {


            if (Objects.nonNull(ctx.beliefaction())) {

                return Optional.of((BeliefAction) visitBeliefaction(ctx.beliefaction()).orElse(BeliefAction.empty()));

            } else if (Objects.nonNull(ctx.achievementgoal())) {

                return Optional.of((AchievementGoal) visitAchievementgoal(ctx.achievementgoal()).orElse(AchievementGoal.empty()));

            } else if (Objects.nonNull(ctx.primitiveaction())) {

                return Optional.of((PrimitiveAction) visitPrimitiveaction(ctx.primitiveaction()).orElse(PrimitiveAction.empty()));

            } else if (Objects.nonNull(ctx.testgoal())) {

                return Optional.of((TestGoal) visitTestgoal(ctx.testgoal()).orElse(TestGoal.empty()));

            } else if (Objects.nonNull(ctx.assignment_statement())) {

                return Optional.of((AssignmentAction) visitAssignment_statement(ctx.assignment_statement()).orElse(TestGoal.empty()));

            } else if (Objects.nonNull(ctx.for_loop())) {

                return Optional.of((ForLoop) visitFor_loop(ctx.for_loop()).orElse(ForLoop.empty()));

            } else if (Objects.nonNull(ctx.if_else())) {

                return Optional.of((IfElse) visitIf_else(ctx.if_else()).orElse(IfElse.empty()));

            }


        throw new RuntimeException("unknown step");

    }
}