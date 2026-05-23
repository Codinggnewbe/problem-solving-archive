def solution(n):
    answer = 0
    n1 = 0
    n2 = 0
    for i in range(len(n)):
        if(i % 2 == 0):
            n2 += n[i]
        else:
            n1 += n[i]
    return max(n1, n2)