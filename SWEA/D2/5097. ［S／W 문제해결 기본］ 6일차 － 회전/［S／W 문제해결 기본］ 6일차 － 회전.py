
T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split()) # N : 숫자 개수, M : 작업 횟수
    numbers = list(map(int, input().split()))
    
    for _ in range(M):
        change = numbers.pop(0)
        numbers.append(change)
        
    print(f"#{test_case} {numbers[0]}")