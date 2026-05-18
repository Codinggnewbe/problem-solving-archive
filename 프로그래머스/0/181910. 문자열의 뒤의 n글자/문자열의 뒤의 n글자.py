def solution(my_string, n):
    answer = ''
    forward = len(my_string) - n
    answer += my_string[forward:]
    return answer