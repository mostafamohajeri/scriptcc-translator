

num_of_agents(100).
num_of_tokens(10000).
!start.
!init.

+!start => #println("started").

+!init =>
    N = "thread" + ((#executionContext.name.replaceAll("thread","").toInt % 1000) + 1);
    +neighbor(N);
    #achieve(N,token(10000))
    .


+!token(T) : neighbor(N) && T != 0 =>
      #achieve(N,token(T - 1))
  .

+!token(0)  =>
      #println("done" + #executionContext.agentLogger.timeTaken)
  .

+!token(T) : not (neighbor(N)) =>
       #println("problem" + #executionContext.agentLogger.timeTaken)
  .








