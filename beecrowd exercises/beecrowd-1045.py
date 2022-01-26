#leia 3 valores float e ordene-os em ordem decrescente
values = input().split(" ")
l = []

for i in values:
    l.append(float(i))

l.sort(reverse = True)

#de modo que o lado A represente o maior dos 3 lados
a = l[0]
b = l[1]
c = l[2]

if a >= (b + c):
    print('NAO FORMA TRIANGULO')
else:
    if (a ** 2) == (b ** 2 + c ** 2):
        print('TRIANGULO RETANGULO')
    if (a ** 2) > (b ** 2 + c ** 2):
        print('TRIANGULO OBTUSANGULO')
    if (a ** 2) < (b ** 2 + c ** 2):
        print('TRIANGULO ACUTANGULO')
    if (a == b == c):
        print('TRIANGULO EQUILATERO')
    if a == b != c or b == c != a or a == c != b:
        print('TRIANGULO ISOSCELES')
