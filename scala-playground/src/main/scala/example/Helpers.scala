package example

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}

import scala.util.Random

trait IAgent {
  def initGoals() : List[IGoalMessage]
  def apply(name: String): Behavior[IGoalMessage]
}

trait IMessage {
}

trait IGoalMessage {
  def goal(): IGoal
  def params(): IParams
}

trait IGoal {

}

trait IParams {

}


trait IPlan {

}

class CPlan[G, P](goal: G, params: P) extends IPlan


case class GoalMessage(p_goal: IGoal, p_params: IParams) extends IGoalMessage {
  override def goal(): IGoal = p_goal
  override def params(): IParams = p_params
}

object MAS {

  def apply(): Behavior[AgentRequest] = Behaviors.receive {
    (context, message) => {
      for (a <- 1 to message.count) {
        val name = "Agent_" + Random.nextInt(Int.MaxValue)
        val ref = context.spawn(message.agent.apply(name), "Agent_" + Random.nextInt(Int.MaxValue))
          message.agent.initGoals().foreach(ref.tell)
      }
    }
      Behaviors.same
  }
}


case class AgentRequest(agent: IAgent,count: Int) {

}


object PrimitiveAction extends IGoal {

  case class Parameters(v1: () => Unit) extends IParams

  def execute(actorContext: ActorContext[IGoalMessage], params: Parameters): Unit = {
    params.v1()
  }
}
