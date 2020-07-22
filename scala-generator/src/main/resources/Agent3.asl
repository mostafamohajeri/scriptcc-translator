item(bag,item(bag1,croc,100)).
item(bag,item(bag2,snake,200)).
item(shoe,shoe1).
item(shoe,shoe2).

!find_a_friend.




+!say : findall(X,item(X,Y),L) && M = #toTerm(1) && true =>
    #println(L);
    #println(#visit(L));
    +m(1);
    for(B in member(B,#toTerm(#std.math.range(1,10)))) {
          #println(B);
          #println(#std.math.range(1+1,#visit(B)));
          #println(#toTerm(#std.math.range(1,#visit(B))));
        };

    for(B in item(B,_)) {
           #println(B,#visit(B));
        };

    for(B in item(bag,B)) {
           #println(B,#visit(B));
        }.





