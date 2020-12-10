from collections import Counter
with open("day10Inputs.txt") as file:
    lines = file.readlines()

ls = []

for x in lines:
    ls.append(int(x))

ls.append(0)
ls.sort()

s = Counter()
for i,j in zip(ls, ls[1:]):
    s[j-i] += 1

print(s)
s[3] += 1
print(s[1] * s[3])