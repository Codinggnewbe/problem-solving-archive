T = int(input())
error = False

for test_case in range(1, T + 1):
    stack = []
    a = input().split()
    i = 0
    while(a[i] != "."):
        if(a[i].isdigit()):
            stack.append(a[i])
            i += 1
        else:
            if(len(stack) < 2):
                error = True
                break
            
            n1 = int(stack.pop())
            n2 = int(stack.pop())
            if(a[i] == "+"):
                stack.append(n2 + n1)
            elif(a[i] == "-"):
                stack.append(n2-n1)
            elif(a[i] ==  "/"):
                stack.append(n2 // n1)
            elif(a[i] == "*"):
                stack.append(n2 * n1)
            i += 1
    if(error or len(stack) != 1):
        print(f"#{test_case} error")
        error = False
    else:
        print(f"#{test_case} {stack.pop()}")