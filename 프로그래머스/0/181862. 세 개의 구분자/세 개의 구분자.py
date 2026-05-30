def solution(myStr):
    answer = []
    myStr = myStr.replace("a", " ")
    myStr = myStr.replace("b", " ")
    myStr = myStr.replace("c", " ")
    
    myStr = myStr.strip().split(" ")
    answer = [x for x in myStr if x != ""]
    
    if(answer == []):
        answer.append("EMPTY")
    return answer