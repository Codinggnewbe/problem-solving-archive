def solution(arr):
    answer = []
    i = 0
    while i < len(arr):
        if(answer == []):
            answer.append(arr[i])
            i += 1
        else:
            if(answer[-1] == arr[i]):
                del answer[-1]
                i += 1
            else:
                answer.append(arr[i])
                i += 1
    if(answer == []):
        return [-1]
    else:
        return answer