def solution(arr):
    answer = 0
    while True:
        change = 0
        for i in range(len(arr)):
            if(arr[i] >= 50 and arr[i] % 2 == 0):
                arr[i] = arr[i] // 2
                change += 1
            elif(arr[i] < 50 and arr[i] % 2 == 1):
                arr[i] = arr[i] * 2 + 1
                change += 1
        if(change == 0):
            break
        answer += 1
    return answer