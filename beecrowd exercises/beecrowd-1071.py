#ler 2 valores inteiros
x = int(input())
y = int(input())
soma = 0

#Calcule e mostre a soma dos ímpares entre eles
y += 1
for i in range(y, x, 1):
    if i % 2 != 0:
        soma += i

print(soma)
