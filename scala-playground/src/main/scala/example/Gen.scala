package example

import akka.actor.typed.{Behavior}
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}


import scala.util.Random


object Gen {


  object Intention {

    def apply(): Behavior[IGoalMessage] = Behaviors.receive {
      (context, message) =>
        message.goal() match {

          case Gen.m_goal_1 =>
            m_goal_1.execute(context, message.params().asInstanceOf[Gen.m_goal_1.Parameters])

          case Gen.m_goal_2 =>
            m_goal_2.execute(context, message.params().asInstanceOf[Gen.m_goal_2.Parameters])


          case _ =>
            context.log.error("This actor can not handle goal of type {}", message.goal())
        }
        Behaviors.same
    }

  }

  object Agent extends IAgent {

    def initGoals() = List[IGoalMessage](
      GoalMessage(m_goal_1, m_goal_1.Parameters(List(10.0))),
      GoalMessage(m_goal_2, m_goal_2.Parameters(List(5.5)))
    )

    def apply(name: String): Behavior[IGoalMessage] = Behaviors.receive {
      (context, message) => {
        context.spawn(Intention(), "GOAL_" + Random.nextInt(Int.MaxValue)) ! GoalMessage(message.goal(), message.params())
      }
        Behaviors.same
    }
  }

  object m_goal_1 extends IGoal {

    case class Parameters(l_params: List[AnyVal]) extends IParams {}

    def execute(actorContext: ActorContext[IGoalMessage], params: Parameters): Unit = {
      var X = params.l_params(0)
      if (Comparer.compare(X, 10.0, ">"))

        plan0(actorContext, params)
    }


    def plan0(actorContext: ActorContext[IGoalMessage], params: Parameters): Unit = {

      var X = params.l_params(0)

      m_goal_2.execute(actorContext, m_goal_2.Parameters(List(X)))
      PrimitiveAction.execute(actorContext, PrimitiveAction.Parameters(() => println(X)))
      m_goal_2.execute(actorContext, m_goal_2.Parameters(List(99.0)))

    }


  }

  object m_goal_2 extends IGoal {

    case class Parameters(l_params: List[AnyVal]) extends IParams {}

    def execute(actorContext: ActorContext[IGoalMessage], params: Parameters): Unit = {
      var Y = params.l_params(0)
      if (true)

        plan0(actorContext, params)
    }

    def plan0(actorContext: ActorContext[IGoalMessage], params: Parameters): Unit = {
      var Y = params.l_params(0)
      PrimitiveAction.execute(actorContext, PrimitiveAction.Parameters(() => println("hello")))
      PrimitiveAction.execute(actorContext, PrimitiveAction.Parameters(() => println(Y)))
    }
  }


  object Comparer {
    def compare(lhs: AnyVal, rhs: AnyVal, operator: String): Boolean = true
  }





}

