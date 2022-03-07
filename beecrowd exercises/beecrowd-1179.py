x = 15
par = []
impar = []

while x > 0:
    aux = int(input())

    if len(par) > 4:
        for i in range(5):
            print(f"par[{i}] = {par[i]}")
        par.clear()

    elif len(impar) > 4:
        for j in range(5):
            print(f"impar[{j}] = {impar[j]}")
        impar.clear()

    if aux % 2 == 0:
        par.append(aux)
    else:
        impar.append(aux)

    x -= 1

for k in range(len(impar)):
    print(f"impar[{k}] = {impar[k]}")

for s in range(len(par)):
    print(f"par[{s}] = {par[s]}")
