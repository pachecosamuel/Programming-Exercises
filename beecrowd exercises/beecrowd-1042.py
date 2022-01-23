#ler 3 valores inteiros e ordená-los de forma crescente
x = input().split(" ")
a = int(x[0])
b = int(x[1])
c = int(x[2])

numeros = [a, b, c]
numeros.sort()

for i in numeros:
    print(i)

print()
print(a)
print(b)
print(c)
