def solution(date1, date2):
    if(date1[0] < date2[0]): # data1이 연도 기준으로 더 과거일때
        print("year")
        return 1
    elif(date1[0] == date2[0]):
        if(date1[1] < date2[1]):
            return 1
        elif(date1[1] == date2[1]):
            if(date1[2] < date2[2]):
                return 1
            else:
                return 0
        else:
            return 0
    else:
        return 0