#ler um inteiro N
x = int(input())
y = 1

#Print o ² de cada um dos valores pares de 1 até N
while y <= x:
    if y % 2 == 0:
        print(f'{y}^2 = {y**2}')
    y += 1
