def solution(num_list):
    answer = 0
    for i in range(len(num_list)):
        num = num_list[i]
        while True:
            if(num == 1):
                break
            elif(num % 2 == 0):
                num /= 2
                answer += 1
            elif(num % 2 == 1):
                num = (num - 1) / 2
                answer += 1
    return answer