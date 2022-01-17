#ler 4 valores inteiros
valores = input().split(" ")
a = int(valores[0])
b = int(valores[1])
c = int(valores[2])
d = int(valores[3])

#condicional
# if b > c and d > a and c+d > a+b and c > 0 and d > 0 and a % 2 == 0
# escrever msg valores aceitos, se n, valores n aceitos

if b>c and d>a and c+d>a+b and c>0 and d>0 and a%2==0:
    print('Valores aceitos')
else:
    print('Valores nao aceitos')
