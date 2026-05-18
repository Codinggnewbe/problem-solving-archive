def solution(intStrs, k, s, l):
    answer = []
    ans = ""
    for i in intStrs:
        ans = i[s:s+l] # i에는 intStrs의 첫번째 문자열이 들어감
        if(int(ans) > k):
            answer.append(int(ans))
    return answer