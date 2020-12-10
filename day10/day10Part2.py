with open("day10Inputs.txt") as file:
    lines = file.readlines()

ls = []

for x in lines:
    ls.append(int(x))

ls.append(0)
ls.sort()

dp = [1] * len(ls)
for i in range(1,len(ls)):
    dp[i] = 0
    for j in range(i):
        if ls[i] - ls[j] <= 3:
            dp[i] += dp[j]
print(dp[-1])