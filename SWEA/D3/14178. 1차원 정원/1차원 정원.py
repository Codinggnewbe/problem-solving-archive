T = int(input())

for test_case in range(1, T + 1):
    N, D = map(int, input().split())
    
    maxD = D * 2 + 1
    
    if(N % maxD == 0):
        print(f"#{test_case} {N // maxD}")
    else:
        print(f"#{test_case} {(N // maxD) + 1}")