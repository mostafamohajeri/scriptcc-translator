
//!find_a_friend_and_send_first_message.


//+!find_a_friend_and_send_first_message =>
//    !find_a_friend;
//    !send_first_message.

!find_a_friend.

+!find_a_friend :  #toTerm(#myName) == "gen_agent_a1" &&
    N = #toTerm(#myName) &&
    replaceAll(N,'gen_agent_a','',NS) &&
    str2num(NS,T) &&
    Next is (T % 10) + 1 &&
    num2str(Next,NextText)&&
    concat('gen_agent_a',NextText, Neighbor) =>
    +neighbor(Neighbor);
    !send_first_message;
    #println("found my neighbor" , Neighbor).

+!lazy_find_a_friend : N = #toTerm(#myName) &&
 replaceAll(N,"gen_agent_a","",NS) &&
  str2num(NS,T) &&
   Next is (T % 10) + 1 &&
   num2str(Next,NextText)&&
    concat('gen_agent_a',NextText, Neighbor) =>
    +neighbor(Neighbor);
    #println("found my neighbor" , Neighbor).

+!send_first_message :  neighbor(N) =>
    !send(N,sendToNext(50000)).

+!send_first_message =>
    #println("Oops,  I don't have a friend").

+!send(Who,What) =>
    #inform2(Who,What).

+!sendToNext(0) =>
     #println(#System.nanoTime).

+!sendToNext(N) : neighbor(Neighbor) &&  X is N - 1  =>
     #println("sending to my neighbor", Neighbor);
     !send(Neighbor,sendToNext( X )).

+!sendToNext(N) : not(neighbor(Neighbor)) =>
     #println("i need to find my neighbor");
     !lazy_find_a_friend;
     !sendToNext( N ).







