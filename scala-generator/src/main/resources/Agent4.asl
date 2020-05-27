
loc(1,2).

friend2("Alice","Beta").

friend("Alice",friend(1),m).

!hi(friend("Alpha"),"Beta").
!hi("Charlie","Delta").


+!hi(X,Y) : friend(X) =>
    #println("Hi ",X);
    #println("Hello ",Y);
    !good_day(friend(X)).

+!good_day(A) : true =>
    #println("How is it going ",A).
