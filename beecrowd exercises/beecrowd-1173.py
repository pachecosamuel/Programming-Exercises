num = int(input())
vet = []

for i in range(10):
    if i == 0:
        vet.append(num)
        print(f"N[{i}] = {num}")
        continue
    else:
        vet.append(vet[-1] * 2)
        print(f"N[{i}] = {vet[i]}")
