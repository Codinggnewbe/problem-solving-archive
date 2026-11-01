T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    numbers = list(map(int, input().split()))
    
    tree = [0]
    for n in numbers:
        tree.append(n)
        i = len(tree) - 1
        
        while (i > 1 and tree[i] < tree[i // 2]):
            tree[i], tree[i // 2] = tree[i // 2], tree[i]
            i //= 2
            
    treeLen = len(tree) - 1
    sum = 0
    while (treeLen > 1):
        treeLen //= 2
        sum += tree[treeLen]
    print(f"#{test_case} {sum}")
        