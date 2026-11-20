for test_case in range(1, 11):
    T = int(input())
    mapp = []
    for i in range(8):
        str1 = list(input())
        mapp.append(str1)
    
    cnt = 0
    
    # 가로
    for i in range(8):
        for j in range(8 - T + 1):
            str1 = mapp[i][j:T+j]
            rStr1 = str1[::-1]
            if(str1 == rStr1):
                cnt += 1
                
    # 세로
    for j in range(8):
        for i in range(8 - T + 1):
            str1 = []
            
            for k in range(T):
                str1.append(mapp[i+k][j])
            rStr1 =str1[::-1]
            if(str1 == rStr1):
                cnt += 1
                
    print(f"#{test_case} {cnt}")