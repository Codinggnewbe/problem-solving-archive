import math
def solution(num_list):
    answer = 0
    leng = len(num_list)
    
    if(leng >= 11):
        return sum(num_list[:])
    else:
        return math.prod(num_list)