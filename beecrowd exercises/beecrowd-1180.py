n = int(input())
x = list(map(int, input().split()))

menor = x[0]
pos = 0

for i in range(n):
    if x[i] < menor:
        menor = x[i]
        pos = i

print(f"Menor valor: {menor}\nPosicao: {pos}")
