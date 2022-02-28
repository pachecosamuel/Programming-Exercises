n = int(input())
fibo = [0, 1]

# vet[4] = vet[2] + vet[3]
for i in range(n):
    fibo.append(fibo[-1]+fibo[-2])

for i in range(n):
    if i == n-1:
        print(fibo[i], end='\n')
    else:
        print(fibo[i], end=" ")
