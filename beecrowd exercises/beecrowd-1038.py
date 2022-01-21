#Ler o código de um item e sua quantidade
x = input().split(" ")
cod = int(x[0])
qtd = int(x[1])

#Então calcule e mostre o valor da conta a pagar
prod = {1: 4.00, 2: 4.50, 3: 5.00, 4: 2.00, 5: 1.50}

print(f'Total: R$ {prod[cod]*qtd:.2f}')
