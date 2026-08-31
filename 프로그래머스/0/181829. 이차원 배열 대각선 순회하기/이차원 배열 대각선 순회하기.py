def solution(board, k):
    answer = 0
    # i는 가로, j는 세로줄일 때, i와 j는 0부터 시작함.
    for i in range(len(board)):
        for j in range(len(board[i])):
            if(i <= k and j <= k):
                if(i + j <= k):
                    answer += board[i][j]
    return answer