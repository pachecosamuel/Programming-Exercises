alc, gas, die = 0, 0, 0

while True:
    x = int(input())

    if x == 1:
        alc +=1
    elif x == 2:
        gas += 1
    elif x == 3:
        die += 1
    elif x == 4:
        break

print(f"MUITO OBRIGADO\nAlcool: {alc}\nGasolina: {gas}\nDiesel: {die}")
