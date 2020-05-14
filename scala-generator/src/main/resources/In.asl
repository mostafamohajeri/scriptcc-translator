!m_goal_1(10).
!m_goal_2(5.5).

+!m_goal_1(X) : X > 10 =>
    !m_goal_2(X);
    #println(X);
    !m_goal_2(99).

+!m_goal_2(Y) : true =>
    #println("hello");
    #println(Y).
