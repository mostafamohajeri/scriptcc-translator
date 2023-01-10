package agentscript.language.entities.terms;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.expression.IExpression;
import agentscript.language.entities.expression.TermExpression;
import agentscript.language.entities.plan.PlanTrigger;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class PlanHeadLiteral extends Term {


    PlanTrigger trigger;

    Atom atom;

    @Singular
    List<Expression> expressions;

    public List<Expression> getVars() {
        return expressions
                .stream()
                .filter(t -> !(t instanceof TermExpression) || !(((TermExpression) t).getTerm() instanceof Variable))
                .collect(Collectors.toList());
    }

    public static PlanHeadLiteral empty() {
        return PlanHeadLiteral.builder().build();
    }

    @Override
    public String getAsValue() {
        StringBuilder builder = new StringBuilder();
        builder.append("StructTerm(\"");
        builder.append(this.getNameWithTrigger());
        builder.append("\",Seq[GenericTerm](");
        if(this.getExpressions().size()>0) {
            builder.append(this.getExpressions()
                    .stream()
                    .map(IExpression::getAsNative)
                    .collect(Collectors.joining(",")));
        }

        builder.append("))");
        return builder.toString();
    }

    @Override
    public String getAsStructure() {

        StringBuilder builder = new StringBuilder();
        builder.append("StructTerm(\"");
        builder.append(this.getNameWithTrigger());
        builder.append("\",Seq[GenericTerm](");
        if(this.getExpressions().size()>0) {
            builder.append(this.getExpressions()
                    .stream()
                    .map(IExpression::getAsStructure)
                    .collect(Collectors.joining(",")));
        }

        builder.append("))");
        return builder.toString();
    }


    public boolean getAchievementGoalPlan() {
        return (this.trigger.getAchievementGoalPlan());
    }

    public boolean getAddBeliefPlan() {
        return (this.trigger.getAddBeliefPlan());
    }
    public boolean getAddUnBeliefPlan() {
        return (this.trigger.getAddUnBeliefPlan());
    }



    public boolean getTestGoalPlan() {
        return (this.trigger.getTestGoalPlan());
    }

    public String getNameWithTrigger() {
        if(getAchievementGoalPlan())
            return "adopt_achievement_"+createName();
        else if (getAddBeliefPlan())
            return "adopt_belief_"+createName();
        else if (getAddUnBeliefPlan())
            return "adopt_unbelief_"+createName();
        else if(getTestGoalPlan())
            return "adopt_test_"+createName();
        return createName();
    }



    private String createName() {
        return this.getAtom().getName() +  "_" +
                this.getExpressions().size();
    }

}
