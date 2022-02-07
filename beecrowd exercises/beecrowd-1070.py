#ler um valor inteiro x
x = int(input())
aux = 0

if x % 2 != 0:
    while aux <= 5:
        print(x)
        aux += 1
        x += 2
else:
    x += 1
    while aux <= 5:
        print(x)
        aux += 1
        x += 2
