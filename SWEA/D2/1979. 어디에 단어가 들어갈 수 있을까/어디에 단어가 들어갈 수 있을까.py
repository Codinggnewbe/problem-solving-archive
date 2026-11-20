T = int(input())

# 흰색 부분은 1(빈칸임), 검은색 부분은 0
for test_case in range(1, T + 1):
    N, K = map(int, input().split())
    maze = []
    for i in range(N):
        numbers = list(map(int, input().split()))
        maze.append(numbers)
    #print(maze)
    total = 0
    
    # 가로 비교
    for row in range(N):
        cnt = 0
        for col in range(N):
            if(maze[row][col] == 1):
                cnt += 1
            if(maze[row][col] == 0 or col == N - 1):
                if(cnt == K):
                    total += 1
                cnt = 0
                
    # 세로 비교
    for col in range(N):
        cnt = 0
        for row in range(N):
            if(maze[row][col] == 1):
                cnt += 1
            if(maze[row][col] == 0 or row == N - 1):
                if(cnt == K):
                    total += 1
                cnt = 0
    print(f"#{test_case} {total}")