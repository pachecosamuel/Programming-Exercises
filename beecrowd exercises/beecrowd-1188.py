op = input()
matriz = []

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)

soma = 0
cont = 0
inicio = 5
fim = 7

for k in range(7, 12):
    for L in range(inicio, fim):
        soma += matriz[k][L]
        cont += 1
    inicio -= 1
    fim += 1


if op == 'S':
    print(soma)
elif op == 'M':
    print(f"{soma/cont:.1f}")
