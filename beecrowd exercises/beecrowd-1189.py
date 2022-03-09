op = input()
matriz = []

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)

soma = 0
cont = 0
aux1 = 1

for k in range(1, 11):
    for L in range(0, aux1):
        soma += matriz[k][L]
        cont += 1

    if k < 5:
        aux1 += 1
    elif k > 5:
        aux1 -= 1

if op == 'S':
    print(soma)
elif op == 'M':
    print(f"{soma/cont:.1f}")
