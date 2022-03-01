n = int(input())

for i in range(n+1):
    if i == 0:
        continue
    elif n % i == 0:
        print(i)
