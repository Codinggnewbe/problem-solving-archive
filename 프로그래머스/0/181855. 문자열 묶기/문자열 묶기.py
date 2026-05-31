def solution(strArr):
    answer = 0
    leng = [0] * len(strArr)
    strArr.sort(key=len)
    
    for i in range(len(strArr)):
        n = len(strArr[i]) - 1
        leng[n] += 1
            
    return max(leng)