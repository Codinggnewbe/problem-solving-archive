def solution(myString):
    myString = list(myString)
    for i in range(len(myString)):
        if(myString[i] == 'a'):
            myString[i] = myString[i].upper()
        elif(myString[i] == 'A'):
            continue
        else:
            myString[i] = myString[i].lower()
    return ''.join(myString)