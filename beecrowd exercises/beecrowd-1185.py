op = input()
matriz = []

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)

soma = 0
cont = 11
c2 = 0

for k in range(11):
    for L in range(0, cont):
        soma += matriz[k][L]
        c2 += 1
    cont -= 1

if op == 'S':
    print(f"{soma:.1f}")
elif op == 'M':
    print(f"{soma/c2:.1f}")
