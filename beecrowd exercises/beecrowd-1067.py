#ler um valor inteiro x
x = int(input())

#mostre os ímpares de 1 até x, inclusive x
if x % 2 != 0:
    x += 1
    for i in range(1, x, 2):
        print(i)
else:
    for i in range(1, x, 2):
        print(i)
