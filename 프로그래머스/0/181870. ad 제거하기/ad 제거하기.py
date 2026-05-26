def solution(strArr):
    answer = []
    for i, a in enumerate(strArr):
        if("ad" in a):
            continue
        answer.append(strArr[i])
    return answer