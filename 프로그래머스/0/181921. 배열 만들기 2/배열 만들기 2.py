def solution(l, r):
    answer = []
    for i in range(l, r+1):
        if(i % 5 == 0 and all(x in ['0', '5'] for x in str(i)) ):
            answer.append(i)
        else:
            continue
    if(answer == []):
        answer.append(-1)
        
    answer.sort()
    return answer