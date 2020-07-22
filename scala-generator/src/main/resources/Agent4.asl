neighbor('tom',10,'me').
neighbor('ali',15,'me').
neighbor('char',20,'u').
m(10).
!hi(2).

+!hi(Y) : m(X)  =>
    #println(X).

+!hi(Y) : N = 'Me' && N <- replaceAll('M','m') returns LN  && neighbor(Neighbor,Distance,LN)  =>
    +m(Y);
    +m(1);
    #println(Neighbor, LN).