def sum(a, b):
    tl = len(a)
    answer = ""
    plusBool = False
    
    # 맨 처음 계산시
    first = int(a[0]) + int(b[0])
    if(first >= 10):
        answer += str(first % 10) # 일의 자리만 더하기
        plusBool = True
    else:
        answer += str(first)
        plusBool = False
    #-------------------------------------
    for i in range(1, tl):
        ans = int(a[i]) + int(b[i])
        

        if(i == tl - 1 and plusBool): # 마지막 자리 계산
            ans += 1
            if(ans >= 10): # 뒤집기
                answer += str(ans)[::-1] 
            else: # 그대로 진행
                answer += str(ans)
        elif(i == tl - 1 and plusBool == False):
            if(ans >= 10): # 뒤집기
                answer += str(ans)[::-1] 
            else: # 그대로 진행
                answer += str(ans)
        elif(i < tl -1):
            # 마지막 자리가 아닌 경우 계산, 일의 자리는 남기고 1을 다음으로 넘김
            if(plusBool): # 그 전 단계에서 10이 넘었을 경우
                ans += 1
                if(ans >= 10):
                    answer += str(ans % 10)
                    plusBool = True
                else:
                    answer += str(ans)
                    plusBool = False
            else:
                if(ans >= 10):
                    answer += str(ans % 10)
                    plusBool = True
                else:
                    answer += str(ans)
                    plusBool = False
                
        
    
    return answer[::-1]
    
def solution(a, b):
    a = a[::-1]
    b = b[::-1]
    al = len(a)
    bl = len(b)
    dis = abs(al - bl) # 자리수 차이 구하기
    
    if(al > bl):
        for i in range(dis):
            b += "0"
        result = sum(a, b)
    elif(al < bl):
        for i in range(dis):
            a += "0"
        result = sum(a, b)
    else: # 둘의 길이가 같을 때
        result = sum(a, b)
    return result