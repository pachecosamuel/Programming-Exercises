n = int(input())

qtd, qsapo, qcoelho, qrato = 0, 0, 0, 0

for i in range(0, n):
    loc = input().split()

    qtd += int(loc[0]) 

    if loc[1] == 'C':
        qcoelho += int(loc[0])
    elif loc[1] == 'R':
        qrato += int(loc[0])
    elif loc[1] == 'S':
        qsapo += int(loc[0])

print(f"Total: {qtd} cobaias")
print(f"Total de coelhos: {qcoelho}")
print(f"Total de ratos: {qrato}")
print(f"Total de sapos: {qsapo}")
print(f"Percentual de coelhos: {(100 * qcoelho / qtd):.2f} %")
print(f"Percentual de ratos: {(100 * qrato / qtd):.2f} %")
print(f"Percentual de sapos: {(100 * qsapo / qtd):.2f} %")
