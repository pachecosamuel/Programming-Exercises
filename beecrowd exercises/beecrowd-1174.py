j = 0
vet = []

while j < 100:
    num = float(input())
    vet.append(num)
    j += 1

for i in range(100):
    if vet[i] <= 10:
        print(f"A[{i}] = {vet[i]:.1f}")
