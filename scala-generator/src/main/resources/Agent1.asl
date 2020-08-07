
//!find_a_friend_and_send_first_message.


//+!find_a_friend_and_send_first_message =>
//    !find_a_friend;
//    !send_first_message.

!init.

+!init :  N = #myName &&
    replaceAll(N,'thread','',NS) &&
    str2num(NS,T) &&
    Next is (T % 500) + 1 &&
    num2str(Next,NextText) &&
    concat('thread',NextText, Neighbor) =>
    +neighbor(Neighbor);
    #achieve(Neighbor,sendToNext(1000)).

+!sendToNext(0) =>
    if(atom(X)) {
      #println(#executionContext.agentLogger.timeTaken);
    }.

+!sendToNext(N) : neighbor(Neighbor) =>
      #achieve(Neighbor,sendToNext(N - 1)).

+!sendToNext(N) : not(neighbor(Neighbor)) =>
     #println("i need to find my neighbor").







