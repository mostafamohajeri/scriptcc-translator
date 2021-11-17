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

The main way to use this compiler is through the [ASC2 framework](https://github.com/mostafamohajeri/agentscript) that uses the scriptcc compiler to run agents written in AgentSript language