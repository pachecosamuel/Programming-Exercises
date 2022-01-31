hi, mi, hf, mf = map(int, input().split())

mi += hi*60
mf += hf*60

duracao = mf - mi

if duracao <= 0:
    duracao += 24*60

hora = duracao // 60
minuto = duracao % 60

print(f'O JOGO DUROU {hora} HORA(S) E {minuto} MINUTO(S)')
