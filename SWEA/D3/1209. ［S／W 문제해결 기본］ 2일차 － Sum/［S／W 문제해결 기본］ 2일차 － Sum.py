for _ in range(10):
    test_case = int(input())
    mapp = []
    ans = []
    for i in range(100):
        numbers = list(map(int, input().split()))
        mapp.append(numbers)
    
    # 가로
    rows = []
    temp = 0
    for i in range(100):
        temp = sum(mapp[i])
        rows.append(temp)
    ans.append(max(rows))
    
    # 세로
    cols = []
    for col in range(100):
        temp = 0
        for row in range(100):
            temp += mapp[row][col]
        cols.append(temp)
    ans.append(max(cols))
    
    # 대각선(왼 -> 오)
    qq = 0
    for i in range(100):
        qq += mapp[i][i]
    ans.append(qq)
    
    # 대각선(오 -> 왼)
    pp = 0
    for i in range(100):
        pp += mapp[i][99 - i]
    ans.append(pp)
    
    print(f"#{test_case} {max(ans)}")