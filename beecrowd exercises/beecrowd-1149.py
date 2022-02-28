vet = list(map(int, input().split()))

a = vet[0]
ultimo_valor = len(vet) - 1
n = vet[ultimo_valor]

soma = 0

for i in range(0, n):
    soma += a + i

print(soma)
