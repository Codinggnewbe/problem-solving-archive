T = int(input())

for test_case in range(1, T + 1):
    str1 = input()
    stack = []
    cnt = 0
    
    for i in str1:
        if(i == "{" or i == "("):
            stack.append(i)
        elif(i == "}" or i == ")"):
            if(len(stack) > 0):
                t = stack.pop()
            else:
                cnt += 1
                break
            
            if((t == "{" and i == "}") or (t == "(" and i == ")")):
                continue
            else:
                cnt += 1
                break
                
    if(cnt > 0 or len(stack) > 0):
        print(f"#{test_case} 0")
    else:
        print(f"#{test_case} 1")