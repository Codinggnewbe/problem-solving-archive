def solution(arr, flag):
    answer = []
    for i in range(len(flag)):
        if(flag[i] == False):
            count = arr[i]
            del answer[-count:]
        elif(flag[i] == True):
            count = arr[i]
            for j in range(count * 2):
                answer.append(arr[i])
    return answer