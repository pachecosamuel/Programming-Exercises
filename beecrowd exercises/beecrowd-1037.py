valor = eval(input())

if (valor > 100 or valor < 0):
    print('Fora do intervalo')
elif (valor >= 0 and valor <= 25.0):
    print('Intervalo (0,25]')
elif (valor > 25.0 and valor <= 50.0):
    print('Intervalo (25,50]')
elif (valor > 50.0 and valor <= 75.0):
    print('Intervalo (50,75]')
elif (valor > 75.0 and valor <= 100.0):
    print('Intervalo (75, 100]')
