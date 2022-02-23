i = 0
med = 0

while i < 2:
    nota = float(input())

    if nota >= 0 and nota <= 10:
        i += 1
        med += nota
    else:
        print(f"nota invalida")

print(f"media = {med/2:.2f}")
