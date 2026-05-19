def solution(q, r, code):
    answer = ''
    ans = []
    
    for i in range(len(code)):
        if(i % q == r):
            ans.append(i)   
    
    for i in ans:
        answer += code[i]
    
    return answer