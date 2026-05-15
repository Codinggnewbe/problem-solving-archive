def solution(arr, queries):
    answer = []
    for i in range(len(queries)):
        s = queries[i][0]
        e = queries[i][1]
        k = queries[i][2]
        
        n = min((x for x in arr[s:e+1] if x > k), default = -1)
        answer.append(n)
    return answer