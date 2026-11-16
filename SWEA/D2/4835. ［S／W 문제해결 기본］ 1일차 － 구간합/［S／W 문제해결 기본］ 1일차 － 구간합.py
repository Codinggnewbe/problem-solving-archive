T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    nums = list(map(int, input().split()))
    
    end = M - 1
    maxN = 0
    minN = 99999999
    
    for i in range(len(nums)):
        if(i > len(nums) - (end+1)):
            break
        sumN = sum(nums[i:i+M])
        maxN = max(maxN, sumN)
        minN = min(minN, sumN)
        
    print(f"#{test_case} {maxN - minN}")