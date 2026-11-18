def findPal(sent, M):
    res = [0, ""]
    for i in range(N):
        for j in range(N):
            if(j > N - M):
                break
            temp1 = sent[i][j:j+M+1]
            temp2 = temp1[::-1]
        
            if(temp1 == temp2):
                res[1] = temp1
                res[0] = 1
                break
    return res

def a(pal, leng, M):
    result = findPal(pal, M)
    
    if(result[0] != 1):
        result = findPal(leng, M)
        
    return result

T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    
    pal = [[""] * N for _ in range(N)]
    
    for i in range(N):
        str1 = input()
        pal[i] = str1
    
    # 세로 버전
    leng = [[""] * N for _ in range(N)]

    for i in range(N):
        lenT = ""
        for j in range(N):
            lenT += pal[j][i]
        leng[i] = lenT
    
    resultM = a(pal, leng, M)
    print(f"#{test_case} {resultM[1]}")