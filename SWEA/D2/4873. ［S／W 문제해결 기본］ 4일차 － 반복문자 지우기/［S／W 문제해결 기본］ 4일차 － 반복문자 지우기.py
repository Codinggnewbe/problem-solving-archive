T = int(input())

for test_case in range(1, T + 1):
    str1 = input()
    stack = []
    i = 0
    
    while (i < len(str1)):
        if(len(stack) == 0):
            stack.append(str1[i])
            i += 1

        else:
            t = stack.pop()

            if(t == str1[i]):
                i += 1
                continue
            else:
                stack.append(t)
                stack.append(str1[i])
                i += 1

    print(f"#{test_case} {len(stack)}")