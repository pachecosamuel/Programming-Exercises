from math import sqrt

#Pegar os coeficientes
coef = input().split(" ")
a = float(coef[0])
b = float(coef[1])
c = float(coef[2])

#calcular delta
delta = (b**2) - 4*a*c

#Avaliar raízes
if a == 0 or delta < 0:
    print('Impossivel calcular')
elif (delta > 0):
    x1 = (-b + sqrt(delta)) / (2 * a)
    x2 = (-b - sqrt(delta)) / (2 * a)
    print(f'R1 = {x1:.5f}\nR2 = {x2:.5f}')
elif (delta == 0):
    x1 = (-b + sqrt(delta)) / (2 * a)
    print(f'R1 = {x1:.5f}')




