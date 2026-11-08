from collections import deque

T = int(input())

for test_case in range(1, T + 1):
    V,  E = map(int, input().split())
    nodeP = [[] for _ in range(V+1)] # 노드의 개수
    
    for i in range(E):
        s, e = map(int, input().split()) # 간선 정보 받아옴
        nodeP[s].append(e)
        nodeP[e].append(s)
    
    S, G = map(int, input().split()) # 출발 S, 도착 G
    
    distance = [-1] * (V + 1)
    distance[S] = 0 # 출발 지점이니까 0으로 설정
    
    queue = deque([S])
    
    while queue:
        current = queue.popleft()
        
        for next_node in nodeP[current]:
            if(distance[next_node] == -1):
                distance[next_node] = distance[current] + 1 # 현재까지의 거리에다가 다음의 거리 1을 더한 것
                queue.append(next_node)
    
    if(distance[G] == -1): # 연결되어 있지 않다면
        print(f"#{test_case} 0")
    else:
        print(f"#{test_case} {distance[G]}")