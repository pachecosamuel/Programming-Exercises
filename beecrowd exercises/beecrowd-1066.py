#ler cinco valores e filtrar quais são positivos
#quais são negativos quais são pares ou quais são ímpares

x, par, impar, pos, neg = 0, 0, 0, 0, 0

while x <= 4:
    i = int(input())
    if i % 2 == 0:
        if i >= 0:
            if i == 0:
                par += 1
            else:
                par += 1
                pos += 1
        else:
            neg += 1
            par += 1
    else:
        if i < 0:
            impar += 1
            neg += 1
        else:
            pos += 1
            impar += 1
    x += 1

print(f"{par} valor(es) par(es)")
print(f"{impar} valor(es) impar(es)")
print(f"{pos} valor(es) positivo(s)")
print(f"{neg} valor(es) negativo(s)")
