friend('charlie').
friend('alice').
greet("friendly",'hi k').
greet("formal","hello").
greet("far_friendly",'HIIIIII').

distance(alice,3).
distance("bob",10).
distance("charlie",8).


!hi("alice").
!hi("bob").
!hi("charlie").

+!hi(Y) : greet(Z,X) && distance(Y,D) && ( Z = "friendly" && D < 5 || Z = "far_friendly" && D > 5 ) && friend(Y)   =>
    !say_distance(Y,D);
    #println(X, Y);
    #die("died").

+!hi(Y) : greet(Z,X) && Z != "friendly" && not friend(Y) && distance(Y,D) =>
    !say_distance(Y,D);
    #inform("agent2",X);
    #println(X, Y);
    #die("died").

+!say_distance(Y,D) : D == 10  =>
    #println(Y, "is So far away! at", D).

+!say_distance(Y,D) : D >= 5  =>
    #println(Y, "is a bit far, at", D).

+!say_distance(Y,D) : D < 5 =>
    #println(Y, "is close by", D).
