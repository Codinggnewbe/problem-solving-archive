def solution(picture, k):
    answer = []
    for i in picture:
        result = "".join([char * k for char in i])
        for j in range(k):
            answer.append(result)
    return answer 