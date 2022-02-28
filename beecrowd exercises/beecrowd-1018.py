valor = eval(input())
x = [100, 50, 20, 10, 5, 2, 1]

print(valor)

for i in x:
    cont = valor // i
    print(f'{cont} nota(s) de R$ {i},00')
    valor -= cont * i

    
