def solution(myString, pat):
    answer = 0
    idx = 0
    while True:
        idx = myString.find(pat, idx)
        
        if(idx == -1):
            break
        answer += 1
        idx += 1
    return answer