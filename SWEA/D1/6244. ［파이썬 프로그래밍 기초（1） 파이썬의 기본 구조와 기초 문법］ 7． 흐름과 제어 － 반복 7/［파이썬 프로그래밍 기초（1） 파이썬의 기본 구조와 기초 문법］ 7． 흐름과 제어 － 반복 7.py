score = [85, 65, 77, 83, 75, 22, 98, 88, 38, 100]
total = 0
count = 0

while (count < len(score)):
    if(score[count] >= 80):
        total += score.pop(count)
    else:
        count += 1
print(total)