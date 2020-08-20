
+!fib_res(S,0) => #achieve(#executionContext.sender.agent.self,fib_result(S,0,1)).

+!fib_res(S,1) => #achieve(#executionContext.sender.agent.self,fib_result(S,1,1)).

+!fib(S,X) =>
