def solution(my_string, overwrite_string, s):
    answer = ''
    a = len(my_string)
    b = len(overwrite_string)
    
    if(len(my_string[s:]) > b): # a의 길이가 더 길다면
        for i in range(s):
            answer += my_string[i]
        answer += overwrite_string # 여기까지 통과
        
        for i in range(s + b, a): # 남은 구역 붙이기
            answer += my_string[i]
            
    else: # b의 길이가 더 길다면
        for i in range(s):
            answer += my_string[i]
        answer += overwrite_string
    
    return answer