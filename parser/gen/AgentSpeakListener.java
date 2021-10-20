// Generated from /home/msotafa/IdeaProjects/antr4grammars/parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AgentSpeakParser}.
 */
public interface AgentSpeakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#belief}.
	 * @param ctx the parse tree
	 */
	void enterBelief(AgentSpeakParser.BeliefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#belief}.
	 * @param ctx the parse tree
	 */
	void exitBelief(AgentSpeakParser.BeliefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#initialgoal}.
	 * @param ctx the parse tree
	 */
	void enterInitialgoal(AgentSpeakParser.InitialgoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#initialgoal}.
	 * @param ctx the parse tree
	 */
	void exitInitialgoal(AgentSpeakParser.InitialgoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#initialachievegoal}.
	 * @param ctx the parse tree
	 */
	void enterInitialachievegoal(AgentSpeakParser.InitialachievegoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#initialachievegoal}.
	 * @param ctx the parse tree
	 */
	void exitInitialachievegoal(AgentSpeakParser.InitialachievegoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#initialmaintenancegoal}.
	 * @param ctx the parse tree
	 */
	void enterInitialmaintenancegoal(AgentSpeakParser.InitialmaintenancegoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#initialmaintenancegoal}.
	 * @param ctx the parse tree
	 */
	void exitInitialmaintenancegoal(AgentSpeakParser.InitialmaintenancegoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#plan}.
	 * @param ctx the parse tree
	 */
	void enterPlan(AgentSpeakParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#plan}.
	 * @param ctx the parse tree
	 */
	void exitPlan(AgentSpeakParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#plantrigger}.
	 * @param ctx the parse tree
	 */
	void enterPlantrigger(AgentSpeakParser.PlantriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#plantrigger}.
	 * @param ctx the parse tree
	 */
	void exitPlantrigger(AgentSpeakParser.PlantriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#beliefactiontrigger}.
	 * @param ctx the parse tree
	 */
	void enterBeliefactiontrigger(AgentSpeakParser.BeliefactiontriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#beliefactiontrigger}.
	 * @param ctx the parse tree
	 */
	void exitBeliefactiontrigger(AgentSpeakParser.BeliefactiontriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#plandefinition}.
	 * @param ctx the parse tree
	 */
	void enterPlandefinition(AgentSpeakParser.PlandefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#plandefinition}.
	 * @param ctx the parse tree
	 */
	void exitPlandefinition(AgentSpeakParser.PlandefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(AgentSpeakParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(AgentSpeakParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#bodyformula}.
	 * @param ctx the parse tree
	 */
	void enterBodyformula(AgentSpeakParser.BodyformulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#bodyformula}.
	 * @param ctx the parse tree
	 */
	void exitBodyformula(AgentSpeakParser.BodyformulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AgentSpeakParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AgentSpeakParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(AgentSpeakParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(AgentSpeakParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#beliefaction}.
	 * @param ctx the parse tree
	 */
	void enterBeliefaction(AgentSpeakParser.BeliefactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#beliefaction}.
	 * @param ctx the parse tree
	 */
	void exitBeliefaction(AgentSpeakParser.BeliefactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(AgentSpeakParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(AgentSpeakParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(AgentSpeakParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(AgentSpeakParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(AgentSpeakParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(AgentSpeakParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(AgentSpeakParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(AgentSpeakParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#testgoal}.
	 * @param ctx the parse tree
	 */
	void enterTestgoal(AgentSpeakParser.TestgoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#testgoal}.
	 * @param ctx the parse tree
	 */
	void exitTestgoal(AgentSpeakParser.TestgoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#achievementgoal}.
	 * @param ctx the parse tree
	 */
	void enterAchievementgoal(AgentSpeakParser.AchievementgoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#achievementgoal}.
	 * @param ctx the parse tree
	 */
	void exitAchievementgoal(AgentSpeakParser.AchievementgoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#maintenancegoal}.
	 * @param ctx the parse tree
	 */
	void enterMaintenancegoal(AgentSpeakParser.MaintenancegoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#maintenancegoal}.
	 * @param ctx the parse tree
	 */
	void exitMaintenancegoal(AgentSpeakParser.MaintenancegoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#primitiveaction}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveaction(AgentSpeakParser.PrimitiveactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#primitiveaction}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveaction(AgentSpeakParser.PrimitiveactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AgentSpeakParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AgentSpeakParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AgentSpeakParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AgentSpeakParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#termvalue}.
	 * @param ctx the parse tree
	 */
	void enterTermvalue(AgentSpeakParser.TermvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#termvalue}.
	 * @param ctx the parse tree
	 */
	void exitTermvalue(AgentSpeakParser.TermvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AgentSpeakParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AgentSpeakParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#inference}.
	 * @param ctx the parse tree
	 */
	void enterInference(AgentSpeakParser.InferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#inference}.
	 * @param ctx the parse tree
	 */
	void exitInference(AgentSpeakParser.InferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#termlist}.
	 * @param ctx the parse tree
	 */
	void enterTermlist(AgentSpeakParser.TermlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#termlist}.
	 * @param ctx the parse tree
	 */
	void exitTermlist(AgentSpeakParser.TermlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(AgentSpeakParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(AgentSpeakParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AgentSpeakParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AgentSpeakParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AgentSpeakParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AgentSpeakParser.VariableContext ctx);
}