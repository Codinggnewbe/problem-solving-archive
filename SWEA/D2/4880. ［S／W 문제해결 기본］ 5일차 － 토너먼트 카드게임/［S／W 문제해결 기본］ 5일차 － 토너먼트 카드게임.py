# 1은 가위, 2는 바위, 3은 보 -> 1 < 2, 2 < 3, 3 < 1

def win(left, right):
    a = num[left]
    b = num[right]
    
    if(a == b):
        return left
    
    if((a == 2 and b == 1) or (a == 3 and b == 2) or (a == 1 and b == 3)):
        return left
    else:
        return right

def divide(start, end):
    if(start == end):
        return start
    
    mid = (start + end) // 2
    
    left = divide(start, mid)
    right = divide(mid + 1, end)
    
    return win(left, right)

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    num = list(map(int, input().split()))
    
    print(f"#{test_case} {divide(0, len(num) - 1) + 1}")