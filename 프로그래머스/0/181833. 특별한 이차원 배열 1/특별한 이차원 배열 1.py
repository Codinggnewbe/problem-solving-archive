def solution(n):
    answer = []
    for i in range(n): # 0 채워주기
        answer.append([0 for j in range(n)])
        
    for i in range(n):
        answer[i][i] = 1
    return answer