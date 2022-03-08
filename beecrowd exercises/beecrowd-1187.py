op = input()
matriz = []

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)

soma = 0
#cont = 11
inicio = 1
final = 11
c2 = 0

for k in range(0, 5):
    for L in range(inicio, final):
        soma += matriz[k][L]
        c2 += 1
    inicio += 1
    final -= 1
    #cont -= 1

if op == 'S':
    print(f"{soma:.1f}")
elif op == 'M':
    print(f"{soma/c2:.1f}")
