horas = input().split()
h = []

for i in horas:
    h.append(int(i))

tempo = h[1] - h[0]

if tempo <= 0:
    tempo += 24

print(f'O JOGO DUROU {tempo} HORA(S)')
