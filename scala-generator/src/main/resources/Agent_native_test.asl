
//!find_a_friend_and_send_first_message.

!find_a_friend.

+!find_a_friend :  N = #toTerm(#myName) &&
    NS = #N.replaceAll('gen_agent_a','') &&
    T = #str2num(NS) &&
    Next = (T % 500) + 1 &&
    (NextText = #num2str(Next) || NextText = #ff('a'))=>
    +neighbor(Neighbor);
    !send_first_message;
    #println("found my neighbor" , Neighbor).





