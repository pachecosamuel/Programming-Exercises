numeros = input().split(" ")
a = int(numeros[0])
b = int(numeros[1])

if a == b and a > 0 and b > 0:
    print("Sao Multiplos")
elif a > b:
    if a % b == 0:
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")
elif b > a:
    if b % a == 0:
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")
