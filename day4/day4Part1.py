txt = open("day4input.txt").read().strip().split("\n\n")
pos = {"iyr", "ecl", "pid", "eyr", "hcl", "byr", "hgt"}

cnt = 0

for i in txt:
    if all(x in i for x in pos):
        cnt+=1
print(cnt)