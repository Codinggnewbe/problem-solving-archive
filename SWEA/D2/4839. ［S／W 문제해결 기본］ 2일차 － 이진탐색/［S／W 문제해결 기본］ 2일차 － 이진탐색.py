def divide(start, total, res):
    mid = (start + total) // 2
    
    if(mid == res):
        return 1
    
    if(mid < res):
        return 1 + divide(mid, total, res)
    elif(mid > res):
        return 1 + divide(start, mid, res)

T = int(input())

for test_case in range(1, T + 1):
    P, A, B = map(int, input().split())
    
    a = divide(1, P, A)
    b = divide(1, P, B)
    
    if(a > b):
        print(f"#{test_case} B")
    elif(a < b):
        print(f"#{test_case} A")
    else:
        print(f"#{test_case} 0")