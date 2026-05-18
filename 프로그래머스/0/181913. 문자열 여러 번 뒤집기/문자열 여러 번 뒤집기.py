def solution(my_string, queries):
    arr = list(my_string) # 문자열은 수정이 안되기 때문에 리스트 형식으로 바꿈
    
    for s, e in queries:
        left = s
        right = e
        
        while (left < right):
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1
    return ''.join(arr)