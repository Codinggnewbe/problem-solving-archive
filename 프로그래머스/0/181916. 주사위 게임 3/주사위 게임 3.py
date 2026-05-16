def solution(a, b, c, d):
    arr = [a,b,c,d]
    arr.sort()
    arr2 = list(set(arr)) 
    leng = len(arr2)
    
    if(leng == 1): # 모두 같음
        return 1111 * arr2[0]
    elif(leng == 2): # 3개 동일 또는 2개씩 동일
        if(arr[1] == arr[2] and arr[2] < arr[3]): # 3개 동일
            return (10 * arr[2] + arr[3]) ** 2
        elif(arr[1] == arr[2] and arr[0] < arr[1]):
            return (10 * arr[1] + arr[0]) ** 2
        else:
            return (arr[1] + arr[2]) * abs(arr[1] - arr[2])
    elif(leng == 3): # 두개 같음, 나머지 다름
        if(arr[0] == arr[1] and arr[2] != arr[3]):
            return arr[2] * arr[3]
        elif(arr[2] == arr[3] and arr[0] != arr[1]):
            return arr[0] * arr[1]
        elif(arr[0] != arr[1] and arr[2] != arr[3]):
            return arr[0] * arr[3]
    elif(leng == 4): # 모두 다름
        return min(arr2)