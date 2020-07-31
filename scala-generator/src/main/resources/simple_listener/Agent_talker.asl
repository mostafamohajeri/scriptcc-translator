!talk(10).

+!talk(X) =>
    for(B in between(0,X,B)) {
          #broadcast_achieve(listen(B));
        };
    #println("done")
   .



