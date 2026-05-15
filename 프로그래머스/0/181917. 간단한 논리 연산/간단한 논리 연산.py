def solution(x1, x2, x3, x4):
    answer = True
    an1 = [x1, x2]
    an2 = [x3, x4]
    an3 = []
    
    if(True in an1):
        an3.append(True)
    elif(not any(an1)): # False만 있을 경우
        an3.append(False)
        
    if(True in an2):
        an3.append(True)
    elif(not any(an2)):
        an3.append(False)
        
    if(all(an3)):
        answer = True
    elif(False in an3):
        answer = False
        
    return answer