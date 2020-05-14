package example

import akka.actor.typed.ActorSystem


object Main extends App {
  val system: ActorSystem[AgentRequest] =
    ActorSystem(MAS(), "MAS")
  system ! AgentRequest(GeneratedAgent1.Agent,10)
}