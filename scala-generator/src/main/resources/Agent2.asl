friend('charlie').
friend('alice').

greet("friendly","hi").
greet("formal","hello").
greet("far_friendly",'HIIIIII').

distance("alice",10).
distance("bob",1).
distance("charlie",10).


!hi("alice").
!hi("bob").
!hi("charlie").

+!hi(Y) : greet(Z,X) && distance(Y,D) && ( Z = "friendly" && D < 5 || Z = "far_friendly" && D > 5 ) && friend(Y)   =>
    #println(X, Y).


+!hi(Y) : greet(Z,X) && Z != "friendly" && not friend(Y)  =>
    #println(X, Y).