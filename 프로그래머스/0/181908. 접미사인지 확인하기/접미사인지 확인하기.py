def solution(my_string, is_suffix):
    answer = 0
    ans = []
    
    for i in range(len(my_string)):
        ans.append(my_string[i:])
        
    if is_suffix in ans:
        answer = 1
    return answer