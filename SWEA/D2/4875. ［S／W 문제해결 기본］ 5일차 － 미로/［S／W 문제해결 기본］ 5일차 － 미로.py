def dfs(row, col):
    # 0은 통로, 1은 벽
    maze[row][col] = '1'
    findEnd = False
    
    for i in range(4):
        nr = row + dr[i]
        nc = col + dc[i]
        
        if(0 <= nr < N and 0 <= nc < N):
            if(maze[nr][nc] == '0'):
                findEnd = dfs(nr, nc)
                if(findEnd):
                    return True
            elif(maze[nr][nc] == '3'):
                return True
    return False

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    maze = []
    for i in range(N):
        maze.append(list(input()))
    #print(maze)
    
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    
    for i in range(N):
        for j in range(N):
            if(maze[i][j] == '2'):
                startI = i
                startJ = j
            elif(maze[i][j] == '3'):
                endI = i
                endJ = j
    findEEnd = dfs(startI, startJ)
    
    if(findEEnd):
        print(f"#{test_case} 1")
    else:
        print(f"#{test_case} 0")