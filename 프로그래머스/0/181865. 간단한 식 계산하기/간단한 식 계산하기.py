def solution(binomial):
    answer = 0
    n = binomial.split(" ")
    print(n)
    n1 = int(n[0])
    n2 = int(n[2])
    if(n[1] == "+"):
        answer = n1 + n2
    elif(n[1] == "-"):
        answer = n1 - n2
    elif(n[1] == "*"):
        answer = n1 * n2
    return answer