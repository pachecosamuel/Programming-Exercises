#ler um float que representa um valor monetario
money = eval(input())

#calcular o menor n°de notas e moedas
notas = [100, 50, 20, 10, 5, 2]
moedas = [1, 0.5, 0.25, 0.10, 0.05, 0.01]
n = []
m = []

print('NOTAS:')

for i in notas:

    if money <= 1.0:
        break

    qtdnotas = money // i
    n.append(str(qtdnotas))
    money -= qtdnotas*i
    print(f'{qtdnotas:.0f} nota(s) de R$ {i}.00')

print('MOEDAS:')
for i in moedas:
    qtdmoedas = money // i
    m.append(str(qtdmoedas))
    money -= qtdmoedas*i

    if (i != 1 and i != 0.1 and i != 0.5):
        print(f'{qtdmoedas:.0f} moeda(s) de R$ {i}')
    elif (i == 1):
        print(f'{qtdmoedas:.0f} moeda(s) de R$ {i}.00')
    elif (i == 0.5):
        print(f'{qtdmoedas:.0f} moeda(s) de R$ {i}0')
    elif (i == 0.1):
        print(f'{qtdmoedas:.0f} moeda(s) de R$ {i}0')

#Depois imprima a relação de moedas necessárias
