L = int(input())
op = input()

matriz = []

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)

soma = 0
for k in matriz[L]:
    soma += k

if op == 'S':
    print(soma)
else:
    print(f"{soma/12:.1f}")
