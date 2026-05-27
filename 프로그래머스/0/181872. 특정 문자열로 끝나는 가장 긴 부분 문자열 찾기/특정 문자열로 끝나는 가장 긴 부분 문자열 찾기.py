def solution(myString, pat):
    answer = ''
    idx = 0
    idx_list = []
    while True:
        idx = myString.find(pat, idx)
        
        if(idx == -1):
            break
        idx_list.append(idx)
        idx += 1
        
    last = idx_list[-1]
    pat_len = len(pat)
    return myString[:last + pat_len]