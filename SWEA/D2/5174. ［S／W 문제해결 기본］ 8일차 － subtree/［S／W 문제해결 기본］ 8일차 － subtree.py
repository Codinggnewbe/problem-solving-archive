T = int(input())

def countN(N):
    count = 1
    
    for child in children[N]:
        count += countN(child)
    return count

for test_case in range(1, T + 1):
    line, N = map(int, input().split())
    pc = list(map(int, input().split()))
    children = [[] for _ in range(line + 2)]
    parent = -1
    
    for i, value in enumerate(pc):
        if(i % 2 == 0): # 짝수 -> 부모
            parent = value
        else:
            children[parent].append(value)

    total = countN(N)
    print(f"#{test_case} {total}")
        