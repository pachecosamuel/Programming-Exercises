#leia o valor c 2 casas decimais q é o salário
sal = eval(input())
final = 0

#calcule e mostre o valor que deve ser pago de IR

if sal <= 2000.00:
    i = 0
    print("Isento")

elif 2000.00 < sal <= 3000.00:
    sal1 = sal - 2000.00
    i = sal1 * (8/100)
    final = i

elif 3000.00 < sal <= 4500.00:
    i2 = (8/100) * 1000
    sal2 = sal - 3000.00
    i = sal2 * (18/100) + i2 #serve p calculo do 2° IR
    final = i

elif sal > 4500.00:
    i2 = (8/100) * 1000.00
    i3 = (18/100) * 1500.00
    i4 = sal - 4500
    i = i2 + i3 + (i4 * (28/100))
    final = i

if sal > 2000.00:
    print(f"R$ {final:.2f}")
