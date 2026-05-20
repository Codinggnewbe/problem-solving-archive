def solution(n, k):
    answer = []
    i = 1
    while(i <= n):
        if(i % k == 0):
            answer.append(i)
        i += 1
    answer.sort()
    return answer