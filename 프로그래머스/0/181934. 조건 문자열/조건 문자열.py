def solution(ineq, eq, n, m):
    answer = 0
    if(eq == "!"):
        if(ineq == ">" and n > m or ineq == "<" and n < m):
            answer = 1
        else:
            answer = 0
    else:
        if(ineq == ">" and n >= m or ineq == "<" and n <= m):
            answer = 1
        else:
            answer = 0
    return answer