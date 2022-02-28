l1 = input().split(" ")
l2 = input().split(" ")

cod1, qtd1, preco1 = l1
cod2, qtd2, preco2 = l2

total = (int(qtd1) * float(preco1)) + (int(qtd2)*float(preco2))

print(f'VALOR A PAGAR: R$ {total:.2f}')

