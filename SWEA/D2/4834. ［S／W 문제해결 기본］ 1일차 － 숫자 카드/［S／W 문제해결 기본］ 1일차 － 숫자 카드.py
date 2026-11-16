T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    numList = [0] * 10 # 0~9
    number = int(input())
    
    for i in range(len(str(number))):
        n = number % 10
        numList[n] += 1
        number //= 10
    
    maxN = max(numList)
    idx = [i for i, v in enumerate(numList) if v == maxN]
    
    print(f"#{test_case} {max(idx)} {maxN}")