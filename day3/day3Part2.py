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
prevFound = 280

for i in range(n):
    if matrix[i][y%m] == '#':
        cnt+=1
    y +=1
y=0
first = cnt
cnt = 0

for i in range(n):
    if matrix[i][y%m] == '#':
        cnt+=1
    y+=5
y=0
second = cnt
cnt = 0

for i in range(n):
    if matrix[i][y%m] == '#':
        cnt+=1
    y+=7
y=0
third = cnt
cnt = 0

for i in range(0,n,2):
    if matrix[i][y%m] == '#':
        cnt+=1
    y+=1
last = cnt

print(first*second*third*last*prevFound)