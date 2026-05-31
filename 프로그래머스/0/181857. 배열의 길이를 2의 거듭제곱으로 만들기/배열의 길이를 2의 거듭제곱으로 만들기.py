def solution(arr):
    answer = []
    n = 1 # 제곱수 값
    while n < len(arr):
        n *= 2

    if(len(arr) == n):
        return arr
    else:
        for i in range(n - len(arr)):
            arr.append(0)
        return arr