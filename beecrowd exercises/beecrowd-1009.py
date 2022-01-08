nome = input()
salario = eval(input())
vendas = eval(input())

print(f'TOTAL = R$ {salario+(vendas*1.15 - vendas):.2f}')
