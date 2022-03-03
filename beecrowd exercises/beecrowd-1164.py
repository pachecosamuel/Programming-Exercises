n = int(input())

for i in range(n):
    num = int(input())

    soma = 0
    j = 1
    while j < num:

        if num % j == 0:
            soma += j

        j += 1

    if soma == num:
        print(f'{num} eh perfeito')
    else:
        print(f'{num} nao eh perfeito')
