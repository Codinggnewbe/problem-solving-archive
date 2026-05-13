def solution(num_list):
    an1 = 1
    an2 = sum(num_list) ** 2
    
    for i in range(len(num_list)):
        an1 *= num_list[i]
    print("an1 = ", an1, "an2 = ", an2)
    return 1 if(an1 < an2) else 0