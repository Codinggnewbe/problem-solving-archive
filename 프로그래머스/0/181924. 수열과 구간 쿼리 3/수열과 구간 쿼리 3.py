def solution(arr, queries):
    for i in range(len(queries)):
        n1 = queries[i][0]
        n2 = queries[i][1]
        temp = arr[n1]
        arr[n1] = arr[n2]
        arr[n2] = temp
        
    return arr