def dfs(S):
    # 방문한 것을 표시
    visited[S] = True
    
    if(S == G):
        return 1
    
    for next_node in nodeL[S]:
        if(visited[next_node] == False):
            cnt = dfs(next_node)
            if(cnt == 1): 
                return 1
    return 0

T = int(input())

for test_case in range(1, T + 1):
    V, E = map(int, input().split())
    nodeL = [[] * (V + 1) for _ in range(V+1)]
    
    # 넣기 작업
    for i in range(E):
        n1, n2 = map(int, input().split())
        nodeL[n1].append(n2)
        
    S, G = map(int, input().split())
    visited = [False] * (V + 1)
    count = dfs(S)
    
    if(count == 1):
        print(f"#{test_case} 1")
    else:
        print(f"#{test_case} 0")