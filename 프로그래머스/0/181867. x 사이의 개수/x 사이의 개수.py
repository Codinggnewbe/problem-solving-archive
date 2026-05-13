def solution(myString):
    answer = []
    ans = myString.split("x")
    print(ans)
    for i in range(len(ans)):
        answer.append(len(ans[i]))
    return answer