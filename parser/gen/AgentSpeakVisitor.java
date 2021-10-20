// Generated from /home/msotafa/IdeaProjects/antr4grammars/parser/src/main/antlr4/grammar/AgentSpeak.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AgentSpeakParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AgentSpeakVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#belief}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelief(AgentSpeakParser.BeliefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#initialgoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialgoal(AgentSpeakParser.InitialgoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#initialachievegoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialachievegoal(AgentSpeakParser.InitialachievegoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#initialmaintenancegoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialmaintenancegoal(AgentSpeakParser.InitialmaintenancegoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan(AgentSpeakParser.PlanContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#plantrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlantrigger(AgentSpeakParser.PlantriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#beliefactiontrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeliefactiontrigger(AgentSpeakParser.BeliefactiontriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#plandefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlandefinition(AgentSpeakParser.PlandefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AgentSpeakParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#bodyformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyformula(AgentSpeakParser.BodyformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AgentSpeakParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(AgentSpeakParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#beliefaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeliefaction(AgentSpeakParser.BeliefactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(AgentSpeakParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(AgentSpeakParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(AgentSpeakParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(AgentSpeakParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#testgoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestgoal(AgentSpeakParser.TestgoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#achievementgoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAchievementgoal(AgentSpeakParser.AchievementgoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#maintenancegoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaintenancegoal(AgentSpeakParser.MaintenancegoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#primitiveaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveaction(AgentSpeakParser.PrimitiveactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AgentSpeakParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AgentSpeakParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#termvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermvalue(AgentSpeakParser.TermvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AgentSpeakParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#inference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInference(AgentSpeakParser.InferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#termlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermlist(AgentSpeakParser.TermlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(AgentSpeakParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link AgentSpeakParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AgentSpeakParser.VariableContext ctx);
}