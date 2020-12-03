matrix = []
for i in range(323):
    line = input()
    curr = []
    for j in list(line):
        curr.append(j)
    matrix.append(curr)


cnt = 0
y = 0
n = len(matrix)
m = len(matrix[0])

for i in range(n):
    if matrix[i][y%m] == '#':
        cnt+=1
    y +=3

print(cnt)