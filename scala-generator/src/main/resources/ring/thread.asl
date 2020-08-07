

!init.

+!init =>
    N = "thread" + ((#executionContext.name.replaceAll("thread","").toInt + 1) % 100);
    +neighbor(N);
    #achieve(N,token(10000)).


+!token(T) : neighbor(N) =>
    if(T != 0) {
      #achieve(N,token(T - 1));
      } else {
      #println("done" + #executionContext.agentLogger.timeTaken);
      }
  .

+!token(T) : not (neighbor(N)) =>
       #println("problem" + #executionContext.agentLogger.timeTaken)
  .










