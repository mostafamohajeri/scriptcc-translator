var(reza).
var(ali).

goal(match(A,B)) :- var(A),var(B).
goal(match(A,B)) :- var(A),var(B).

plan(match_0(A,B)):-goal(match(A,B)).
plan(match_1(A,B)):-goal(match(A,B)).

goal_plan(match_0(A,B)):-goal(match(A,B)),plan(match_1(A,B)).
goal_plan(match_1(A,B)):-goal(match(A,B)),plan(match_1(A,B)).