def solution(my_string):
    answer = [0] * 52
    for i in range(len(my_string)):
        n = ord(my_string[i])
        if(n >= 97): # 소문자
            answer[n - 71] += 1
        elif(n >= 65): # 대문자
            answer[n - 65] += 1
    return answer