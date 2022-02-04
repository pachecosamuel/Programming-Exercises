# ler 6 valores
# mostrar qts deles são positivos
#depois imprimir a média dos positivos
values = []
x = 0
cont = 0
soma = 0

while x <= 5:
    values.append(float(input()))
    if values[x] > 0:
        cont += 1
        soma += values[x]
    x += 1

print(f"{cont} valores positivos\n{soma/cont:.1f}")
