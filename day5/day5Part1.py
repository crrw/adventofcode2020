txt = open("day5inputs.txt")
ans = 0
for i in txt:
    left,right = 0,127
    for x in i[:-3]:
        mid = (left+right)//2
        if x == 'F':
            right = mid
        else:
            left = mid
    
    l2, r2 = 0,7

    for x in i[-3:]:
        mid = (l2 + r2)//2

        if x == 'R':
            l2 = mid
        else:
            r2 = mid
    left+=1
    ans = max(ans, left * 8 + l2)
print(ans)
