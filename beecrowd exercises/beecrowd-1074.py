#ler um inteiro N
x = int(input())
y = 0

#Leia n valores e para cada lido diga se é par, ímpar
# positivo ou negativo, se for zero imprima null
while y < x:
    local = int(input())

    if local == 0:
        print("NULL")
    elif local % 2 == 0:
        if local > 0:
            print("EVEN POSITIVE")
        else:
            print("EVEN NEGATIVE")
    else:
        if local > 0:
            print("ODD POSITIVE")
        else:
            print("ODD NEGATIVE")
    y += 1
