def inorder(node, num):
    if (node > N):
        return num
    
    # 왼쪽 자식
    num = inorder(node * 2, num)
    
    # 값 저장
    tree[node] = num
    num += 1
    
    # 오른쪽 자식
    num = inorder(node * 2 + 1, num)
    
    return num

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    num = 1 # 저장할 값
    tree = [0] * (N + 1)
    inorder(1, num)
    
    print(f"#{test_case} {tree[1]} {tree[N // 2]}")
    