item(bag,bag1).
item(bag,bag2).
item(shoe,shoe1).
item(shoe,shoe2).

!say.

+!say : findall(X,item(X,Y),L) =>
    +m(1);
    for(B in member(B,#std.math.range(1,10))) {
          #println(B);
        };

    for(B in item(B,_)) {
           #println(B);
        };

    for(B in item(bag,B)) {
           #println(B);
        }.





