


!say_numbers(1,2).
!say_numbers(3,4).

+!say_numbers(X,Y) : true =>
    #println("first num ",X);
    #println("second num ",Y);
    !sum(X,Y).


+!sum(A,B) : true =>
    #add_and_print(B,A).



a(B) > ~a(B) : C.
