T = int(input())

def change(num, result):
    N = 8
    temp = ""
    
    for _ in range(4):
        if(num - N >= 0):
            temp += "1"
            num -= N
        else:
            temp += "0"
        N //= 2
    result += temp
    return result

for test_case in range(1, T + 1):
    a, b = input().split()
    result = ""
    
    for i in b:
        if(i.isdigit()):
            result = change(int(i), result)
        elif(i == "A"):
            result = change(10, result)
        elif(i == "B"):
            result = change(11, result)
        elif(i == "C"):
            result = change(12, result)
        elif(i == "D"):
            result = change(13, result)
        elif(i == "E"):
            result = change(14, result)
        elif(i == "F"):
            result = change(15, result)
    
    print(f"#{test_case} {result}")