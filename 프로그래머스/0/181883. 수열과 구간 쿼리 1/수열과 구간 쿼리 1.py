def solution(arr, q):
    for a, b in q:
        for i in range(a, b + 1):
            arr[i] += 1
    return arr