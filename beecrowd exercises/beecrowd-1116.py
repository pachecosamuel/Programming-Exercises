n = int(input())

for i in range(n):
    vet = [int(j) for j in input().split()]

    if vet[1] == 0:
        print("divisao impossivel")
    else:
        print(f"{vet[0]/vet[1]:.1f}")
