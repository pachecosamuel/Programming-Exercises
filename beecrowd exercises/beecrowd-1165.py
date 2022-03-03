n = int(input())

for i in range(n):
    num = int(input())
    j = 1
    cont = 0

    while j <= num:
        if num % j == 0:
            cont += 1

        j += 1
        if cont > 2:
            print(f"{num} nao eh primo")
            break

    if cont == 2:
        print(f"{num} eh primo")
