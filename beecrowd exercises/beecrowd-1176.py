n = int(input())

for i in range(n):
    elemento = int(input())
    fibo = [0, 1]

    for j in range(elemento+1):
        fibo.append(fibo[-1]+fibo[-2])

        if j == elemento:
            print(f"Fib({j}) = {fibo[j]}")
