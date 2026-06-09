def solution(rank, attendance):
    answer = 0
    ans = []
    for i in range(len(attendance)):
        if(attendance[i] == True):
            ans.append([rank[i], i])
    print(ans)
    ans.sort(key=lambda x:x[0])
    print(ans)
    answer = ans[0][1] * 10000 + ans[1][1] * 100 + ans[2][1]
    return answer