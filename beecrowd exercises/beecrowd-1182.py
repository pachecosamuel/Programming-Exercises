col = int(input())
op = input()
matriz = []

for i in range(12):
    lista = []

    for j in range(12):
        lista.append(float(input()))

    matriz.append(lista)

soma = 0

for k in range(12):
    soma = soma + matriz[k][col]

if op == 'S':
    print(soma)
elif op == 'M':
    print(f"{soma/12:.1f}")
