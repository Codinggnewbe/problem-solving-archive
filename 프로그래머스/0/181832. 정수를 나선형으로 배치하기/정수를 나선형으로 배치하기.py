def solution(n):
    answer = [[0] * n for _ in range(n)] # 배열 칸을 모두 0으로 초기화
    direction = 1 # 1은 오른쪽 방향, 2는 아래 방향, 3은 왼쪽 방향, 4는 위쪽 방향
    number = 1 # 지정된 숫자가 되기 전까지 반복
    row = 0
    col = 0
    
    answer[row][col] = number
    number += 1
    
    while(number <= n * n):
        # 행 또는 열이 끝에 도달했을 때 취할 선제 조건
        if(col == n-1 and direction == 1):
            direction = 2
        elif(row == n-1 and direction == 2):
            direction = 3
        elif(col == 0 and direction == 3):
            direction = 4
        elif(row == 0 and direction == 4):
            direction = 1
            
        if(direction == 1 and (col+1) <= (n-1)): # 오른쪽
            if(answer[row][col+1] != 0): # 이미 방문한 적이 있다면
                direction = 2 # 아래쪽으로 꺽어져라
                continue
            else:
                answer[row][col+1] = number
                number += 1
                col += 1
                
        elif(direction == 2 and (row+1) <= (n-1)): # 아래쪽
            if(answer[row+1][col] != 0):
                direction = 3
                continue
            else:
                answer[row+1][col] = number
                number += 1
                row += 1
                
        elif(direction == 3 and (col-1) >= 0): # 왼쪽
            if(answer[row][col-1] != 0):
                direction = 4
                continue
            else:
                answer[row][col-1] = number
                number += 1
                col -= 1
                
        elif(direction == 4 and (row-1) >= 0): # 위쪽
            if(answer[row-1][col] != 0):
                direction = 1
                continue
            else:
                answer[row-1][col] = number
                number += 1
                row -= 1
            
    return answer