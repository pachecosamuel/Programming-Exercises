#evento inicia e termina dentro do msm mês
#calcular o tempo que o evento vai durar

#entrada
di = int(input().split()[1])

ti = input().split(" : ")
hi = int(ti[0])
mi = int(ti[1])
si = int(ti[2])

df = int(input().split()[1])

tf = input().split(" : ")
hf = int(tf[0])
mf = int(tf[1])
sf = int(tf[2])

dt = df-di

ht = hf-hi
if ht < 0:
    ht += 24
    dt -= 1

mt = mf-mi
if mf < 0:
    mt += 60
    ht -= 1

st = sf-si
if st < 0:
    st += 60
    mt -= 1

print(f'{dt} dia(s)\n{ht} hora(s)\n{mt} minutos(s)\n{st} segundo(s)')
