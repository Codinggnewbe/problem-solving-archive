T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    
    mapp = [[0] * 10 for _ in range(10)]
    for i in range(N):
        numbers = list(map(int, input().split()))
        
        if(numbers[4] == 1):
            for x in range(numbers[0], numbers[2] + 1):
                for y in range(numbers[1], numbers[3] + 1):
                    if(mapp[x][y] != 1 and mapp[x][y] != 3):
                        mapp[x][y] += 1 
        elif(numbers[4] == 2):
            for x in range(numbers[0], numbers[2] + 1):
                for y in range(numbers[1], numbers[3] + 1):
                    if(mapp[x][y] != 2 and mapp[x][y] != 3):
                        mapp[x][y] += 2
                        
        cnt = 0
        for x in range(10):
            for y in range(10):
                if(mapp[x][y] == 3):
                    cnt += 1
                    
    print(f"#{test_case} {cnt}")