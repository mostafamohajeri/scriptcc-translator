ponged(0).

!ping_all.

+!ping_all =>
    #broadcast_achieve(ping)
.

+!ping =>
    if(X = 2) {
        #achieve(#executionContext.sender.ref,pong);
        #println(X);
    }.

+!pong : ponged(X) =>
    +ponged(X + 1) ;
    #println("I was ponged " + X + " at " + #executionContext.agentLogger.timeTaken)
    .


