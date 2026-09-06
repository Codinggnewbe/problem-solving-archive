def solution(array, commands):
    answer = []
    newArr = []
    for first, last, find in commands:
        newArr = array[first - 1:last]
        newArr.sort()
        answer.append(newArr[find - 1])
    return answer