def solution(numLog):
    answer = ''
    for i in range(len(numLog) - 1):
        num = numLog[i] - numLog[i+1]
        if(num == -1): answer += "w"
        elif(num == 1): answer += "s"
        elif(num == -10): answer += "d"
        elif(num == 10): answer += "a"
    return answer