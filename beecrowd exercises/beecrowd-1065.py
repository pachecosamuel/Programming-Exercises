x = 0
cont = 0

while x <= 4:
    y = int(input())
    if y % 2 == 0:
        cont += 1
    x += 1

print(f"{cont} valores pares")
