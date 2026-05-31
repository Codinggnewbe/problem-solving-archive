def solution(arr, k):
    answer = []
    
    for i in range(len(arr)):
        if(len(answer) == k):
            break
        if(answer == []):
            answer.append(arr[i])
        else:
            if(arr[i] in answer):
                continue
            else:
                answer.append(arr[i])
    if(len(answer) != k):
        for i in range(k - len(answer)):
            answer.append(-1)
    return answer