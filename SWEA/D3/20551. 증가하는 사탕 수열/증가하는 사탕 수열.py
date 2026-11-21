T = int(input())

for test_case in range(1, T + 1):
    A, B, C = map(int, input().split())
    
    cnt = 0
    while(B >= C):
        B -= 1
        cnt += 1
    while(A >= B):
        A -= 1
        cnt += 1
    #print(f"A : {A}, B : {B}, C : {C}")
    
    if(A <= 0 or B <= 0):
        print(f"#{test_case} -1")
    else:
        print(f"#{test_case} {cnt}")