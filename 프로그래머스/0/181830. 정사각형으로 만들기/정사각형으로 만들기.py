def solution(arr):
    answer = [[]]
    row = len(arr)
    col = len(arr[0])
    cnt = abs(row - col)
    if(row > col): # 행의 개수가 더 많은 경우 -> 열에다가 0 추가
         for i in arr:
            for j in range(cnt):
                i.append(0)
    elif(row < col) : # 열의 개수가 더 많은 경우 -> 행에다가 0 추가
        for i in range(cnt):
            arr.append([0] * col)
    else:
        return arr
        
    return arr