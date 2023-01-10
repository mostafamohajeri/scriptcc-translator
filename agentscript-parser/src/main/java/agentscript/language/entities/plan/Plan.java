package agentscript.language.entities.plan;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.terms.Atom;
import agentscript.language.entities.terms.Literal;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(staticName = "empty")
public class Plan {

    @Singular
    List<String> annotations;
    PlanTrigger trigger;
    Literal literal;
    Expression expression;
    PlanDefinition planDefinition;



    public boolean getAtomic() {
        return annotations.contains("@atomic");
    }

    public boolean getPreferenceCheck() {
        return annotations.contains("@preferences");
    }

    public boolean getHasHeadCheck() {
        return literal.getVars().size() != 0;
    }

    public boolean getHasContextCheck() {
        return Objects.nonNull(this.expression) && !this.expression.getAsStructure().isEmpty();
    }

    public String getContextCheck() {
        return this.getHasContextCheck() ? this.expression.getAsStructure() : "";
    }

    public String getHeadCheck() {
        if(literal.getVars().size() == 0) return "/* " + literal.getAsStructure() + " All vars no need to check */" ;


        return this.literal.getAsStructure() +
                ",StructTerm(\""+literal.getAtom().getName() + "\",params.l_params)";
    }

    public String getApplicableRule() {

        if(!literal.getExpressions().isEmpty()) {
            Literal l = Literal.builder().atom(Atom.from(getNameWithArity())).expressions(this.literal.getExpressions()).build();
            var e =  this.getHasContextCheck() ? this.getContextCheck() : "BooleanTerm(true)" ;
            return String.format("StructTerm(\":-\",Seq[GenericTerm](%s,%s)),", l.getAsStructure(), e);
        } else  {
            Literal l = Literal.builder().atom(Atom.from(getNameWithArity())).expressions(this.literal.getExpressions()).build();
            return String.format("//StructTerm(\":-\",Seq[GenericTerm](%s,%s)),", l.getAsStructure(), this.getContextCheck());
        }
    }

    public String getNameWithArity() {
        if(getAchievementGoalPlan())
            return "adopt_achievement_"+createName();
        if (getAddBeliefPlan())
            return "adopt_belief_"+createName();
        if (getAddUnBeliefPlan())
            return "adopt_unbelief_"+createName();
        else if(getTestGoalPlan())
            return "adopt_test_"+createName();
        return createName();
    }



    private String createName() {
        return this.literal.getAtom().getName() +
                "_" +
                this.literal.getExpressions().size();
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

}
