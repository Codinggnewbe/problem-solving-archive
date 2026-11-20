T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    mapp = []
    maxP = 0
    
    for i in range(N):
        listP = list(map(int, input().split()))
        mapp.append(listP)
    #print(mapp)
    
    for row in range(N - M + 1): # 행
        for col in range(N - M + 1): # 열
            sumP = 0
            for i in range(M): # 행
                for j in range(M): # 열
                    sumP += mapp[row + i][col + j]
            maxP = max(maxP, sumP)
    print(f"#{test_case} {maxP}")