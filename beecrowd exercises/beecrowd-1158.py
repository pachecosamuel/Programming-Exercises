n = int(input())

for i in range(n):
    vet = list(map(int, input().split()))

    partida = vet[0]
    qtd = vet[1]

    if partida % 2 == 0:
        partida += 1

    soma = 0
    for j in range(qtd):
        soma += partida
        partida += 2

    print(soma)

