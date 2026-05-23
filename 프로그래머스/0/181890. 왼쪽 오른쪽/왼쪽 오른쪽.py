def solution(s):
    answer = []
    for i in range(len(s)):
        if(s[i] == "l"):
            answer += s[:i]
            break
        elif(s[i] == "r"):
            answer += s[i+1:]
            break    
    return answer