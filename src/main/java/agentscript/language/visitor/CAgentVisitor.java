package agentscript.language.visitor;

import agentscript.language.entities.*;
import agentscript.language.entities.expression.BinaryExpression;
import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.expression.NegationExpression;
import agentscript.language.entities.expression.TermExpression;
import grammar.AgentBaseVisitor;
import grammar.AgentParser;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class CAgentVisitor extends AgentBaseVisitor<Optional<Object>> {

    @Getter
    private AgentFactory factory = new AgentFactory();


    @Override
    public Optional<Object> visitInitialbeliefs(AgentParser.InitialbeliefsContext ctx) {

        ctx.belief().stream().map(this::visitBelief).map(i -> (Literal) i.orElse(Literal.empty())).forEach(factory::addInitialBelief);

        return Optional.empty();
    }

    @Override
    public Optional<Object> visitBelief(AgentParser.BeliefContext ctx) {
        return visitLiteral(ctx.literal());
    }

    @Override
    public Optional<Object> visitInitialgoals(AgentParser.InitialgoalsContext ctx) {

        ctx.initialgoal().stream().map(
                g -> {
                    if (Objects.nonNull(g.achievementgoal())) return visitAchievementgoal(g.achievementgoal());
                    else if (Objects.nonNull(g.maintenancegoal())) return visitMaintenancegoal(g.maintenancegoal());
                    else return Optional.empty();
                }
        ).map(i -> (Goal) i.orElse(Goal.empty())).forEach(factory::addInitialGoal);

        return Optional.empty();
    }

    @Override
    public Optional<Object> visitPlans(AgentParser.PlansContext ctx) {
        ctx.plan().stream().map(this::visitPlan).map(i -> (Plan) i.orElse(Plan.empty())).forEach(factory::addPlan);
        return Optional.empty();
    }

    @Override
    public Optional<Object> visitPlan(AgentParser.PlanContext ctx) {
        Plan.PlanBuilder planBuilder = Plan.builder()
                .trigger(
                        (PlanTrigger) visitPlantrigger(ctx.plantrigger()).orElse(PlanTrigger.from(ActionOperator.NONE, PlanOperator.NONE))
                )
                .literal(
                        (Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())
                );

        if (Objects.nonNull(ctx.condition)) {
            planBuilder.expression((Expression) visitExpression(ctx.condition).orElse(Expression.empty()));
        }

        return Optional.of(planBuilder.build());
    }

    @Override
    public Optional<Object> visitExpression(AgentParser.ExpressionContext ctx) {
        if (Objects.nonNull(ctx.term()))
            return Optional.of(TermExpression.from( (Term) visitTerm(ctx.term()).orElse(Term.empty())));

        else if (Objects.nonNull(ctx.DEFAULTNEGATION()))
            return Optional.of(NegationExpression.from((Expression) visitExpression(ctx.single).orElse(Expression.empty())));

        else if (Objects.nonNull(ctx.LEFTROUNDBRACKET()) && Objects.nonNull(ctx.RIGHTROUNDBRACKET()))
            return visitExpression(ctx.single);

        else if (Objects.nonNull(ctx.rhs) && Objects.nonNull(ctx.lhs)) {
            return Optional.of(BinaryExpression.from(
                    (Expression) visitExpression(ctx.lhs).orElse(Expression.empty()),
                    ctx.binaryoperator.getText(),
                    (Expression) visitExpression(ctx.rhs).orElse(Expression.empty())
            ));
        }

        return Optional.empty();
    }

    @Override
    public Optional<Object> visitPlantrigger(AgentParser.PlantriggerContext ctx) {
        ActionOperator actionOperator = ActionOperator.NONE;
        PlanOperator planOperator = PlanOperator.NONE;
        if (Objects.nonNull(ctx.ARITHMETICOPERATOR3()) && ctx.ARITHMETICOPERATOR3().getText().equals(ActionOperator.PLUS.getValue())) actionOperator = ActionOperator.PLUS;
        else if (Objects.nonNull(ctx.ARITHMETICOPERATOR3()) && ctx.ARITHMETICOPERATOR3().getText().equals(ActionOperator.MINUS.getValue())) actionOperator = ActionOperator.MINUS;
        if (Objects.nonNull(ctx.EXCLAMATIONMARK())) planOperator = PlanOperator.EXCLAMATION;
        else if (Objects.nonNull(ctx.DOUBLEEXCLAMATIONMARK())) planOperator = PlanOperator.DOUBLEEXCLAMATION;
        else if (Objects.nonNull(ctx.QUESTIONMARK())) planOperator = PlanOperator.QUESTION;

        return Optional.of(PlanTrigger.from(actionOperator, planOperator));
    }

    @Override
    public Optional<Object> visitAchievementgoal(AgentParser.AchievementgoalContext ctx) {
        return Optional.of(AchievementGoal.from((Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())));
    }

    @Override
    public Optional<Object> visitMaintenancegoal(AgentParser.MaintenancegoalContext ctx) {
        return Optional.of(MaintenanceGoal.from((Literal) visitLiteral(ctx.literal()).orElse(Literal.empty())));
    }

    @Override
    public Optional<Object> visitLiteral(AgentParser.LiteralContext ctx) {
        return Optional.of(Literal.builder()
                .negated(Objects.nonNull(ctx.STRONGNEGATION()))
                .atom(Atom.from(ctx.ATOM().getText()))
                .terms(
                        Objects.nonNull(ctx.termlist()) ? (List) this.visitTermlist(ctx.termlist()).orElse(Collections.EMPTY_LIST) : Collections.EMPTY_LIST
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

        else if (Objects.nonNull(ctx.NUMBER()))
            return Optional.of(NumericTermValue.from(Double.valueOf(ctx.NUMBER().getText())));

        return Optional.empty();
    }
}
