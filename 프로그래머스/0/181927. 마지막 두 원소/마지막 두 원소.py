def solution(num_list):
    answer = []
    leng = len(num_list)
    
    for i in range(leng):
            answer.append(num_list[i])
            
    if(num_list[leng - 2] < num_list[leng - 1]):
        answer.append(num_list[leng - 1] - num_list[leng - 2])
    else:
        answer.append(num_list[leng - 1] * 2)
    return answer