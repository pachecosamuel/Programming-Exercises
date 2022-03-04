x = float(input())
vet = []
aux = x

for i in range(100):

    if i == 0:
        vet.append(x)
    else:
        aux /= 2
        vet.append(aux)

for j in range(100):
    print(f"N[{j}] = {vet[j]:.4f}")
