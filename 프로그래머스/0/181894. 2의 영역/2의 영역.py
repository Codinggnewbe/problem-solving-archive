def solution(arr):
    answer = []
    an1 = -1
    an2 = -1
    for front, back in zip(range(len(arr)), range(len(arr) -1, -1, -1)):
        if(arr[front] == 2 and an1 == -1):
            an1 = front
        if(arr[back] == 2 and an2 == -1):
            an2 = back
            
    if(an1 == -1 and an2 == -1):
        answer.append(-1)
    else:
        for i in range(an1, an2 + 1):
            answer.append(arr[i])
    return answer