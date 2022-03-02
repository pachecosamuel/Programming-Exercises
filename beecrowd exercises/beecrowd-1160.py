n = int(input())

for i in range(n):
    vet = list(map(float, input().split()))

    pa = int(vet[0])
    pb = int(vet[1])
    cresA = vet[2]/100
    cresB = vet[3]/100

    tempo = 0

    while pa < pb:
        pa += int(pa * cresA)
        pb += int(pb * cresB)
        tempo += 1

        if tempo > 100 or pa > pb:
            break

    if tempo <= 100:
        print(f"{tempo} anos.")
    else:
        print('Mais de 1 seculo')
