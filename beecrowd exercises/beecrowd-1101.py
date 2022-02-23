while(1):
    vet = [int (i) for i in input().split()]
    x = min(vet)
    y = max(vet)

    if x <= 0 or y <= 0:
        break

    soma = 0
    for j in range(x, y+1):
        soma += j

    for k in range(x, y+1):
        print(k)

    print(f"Sum={soma}")
