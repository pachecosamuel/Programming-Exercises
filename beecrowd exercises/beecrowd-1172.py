vet = []

for i in range(10):
    num = int(input())

    if num == 0 or num < 0:
        vet.append(1)
    else:
        vet.append(num)

for i in range(10):
    print(f"X[{i}] = {vet[i]}")

