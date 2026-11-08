def dfs(row, min_sum): # 첫 행부터 시작
    if(min_sum >= total[0]):
        return
    
    if(row == line): # 종료 조건. row는 0부터 시작하기 때문에 line과 같은 값이 되는 순간 없는 곳을 참조하는 것이기 때문에 종료
        total[0] = min(total[0], min_sum)
        return
    
    for col in range(line):
        if(visited[col] == 0): # 방문하지 않았다면
            visited[col] = 1
            dfs(row+1, min_sum + numbers[row][col])

            visited[col] = 0
        else:
            continue

T = int(input())

for test_case in range(1, T + 1):
    line = int(input())
    numbers = [] # 우선 빈 배열 생성
    
    # 배열 생성
    for i in range(line):
        row = list(map(int, input().split()))
        numbers.append(row)

    visited = [0] * line # 열과 관련된 방문 여부 확인
    total = [float('inf')] # 최종값, 처음에는 엄청 큰 수를 지정
    min_sum = 0 # 중간에 계산되는 값
    dfs(0, min_sum)
    
    print(f"#{test_case} {total[0]}")