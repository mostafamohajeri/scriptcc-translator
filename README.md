# `scriptcc`: the AgentScript cross-compiler Framework

## Modules

### Parser
Language: Antlr + Java

Parser Module to parse codes in AgentScript Language

Uses ANTLR4 + ANTLR4-maven-plugin to generate Java based parser/lexer/visitor

Main Grammar file: `Agent.g4`

To compile: `$ mvn compile`

To test: `$ mvn test`

Check tests for more info on usage

### Scala Generator
Language: Java + StringTemplate4

Code generator to translate `.asl` based agent files into scala/akka actors with ST4 template

Currently very simple and not useful translation as conditional expressions and terms are not supported

usage (in Main.java)

```java
 translation.Translator t = new translation.Translator();
 t.translate(new File(t.getClass().getClassLoader().getResource("In.asl").getFile()).getAbsolutePath(),
             new File(t.getClass().getClassLoader().getResource("Test3.scala.stg").getFile()).getAbsolutePath(),
             "GeneratedAgent1");
```

An actor class by the the name of `"GeneratedAgent1"` will be created and the file is copied into `scala-playground` module

### Scala Playground
Language Scala + AKKA

A simple scala + sbt module created for convinience, the output akka actors of scala-generator module are copied here, the Main.scala and Helpers.scala contain code to run these actors

#### How to run the generated actors
Actors already contain their initial goals.

For example if you have generated two agent types `GeneratedAgent1` nad `GeneratedAgent2` and you want to create 10 of each

in the main file you will have

```scala
object Main extends App {
  val system: ActorSystem[AgentRequest] =
    ActorSystem(MAS(), "MAS")
  system ! AgentRequest(GeneratedAgent1.Agent,10)
  system ! AgentRequest(GeneratedAgent2.Agent,10)
}
```