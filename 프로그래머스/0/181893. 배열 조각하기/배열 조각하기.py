def solution(arr, query):
    for i, q in enumerate(query):
        if(i % 2 == 0):
            del arr[q+1:]
        else:
            del arr[:q]
    return arr