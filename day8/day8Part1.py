with open("inputs.txt") as file:
    lines = file.readlines()

cnt = 0
st = set()
size = len(lines)
x = 0
while(x < size):
    if x in st:
        break
    st.add(x)
    if lines[x][0] == 'a':
        cnt += int(lines[x][4:])
    elif lines[x][0] == 'j':
        x += int(lines[x][4:])
        continue
        if x in st:
            break
    x+=1
print(cnt)