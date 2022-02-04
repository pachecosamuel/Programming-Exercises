values = []
cont = 0
x = 0

while x <= 5:
    values.append(eval(input()))
    if values[x] > 0:
        cont += 1
    x += 1

print(f"{cont} valores positivos")
