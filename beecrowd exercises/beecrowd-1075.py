#ler um inteiro N
x = int(input())
y = 0

for i in range(1, 10001):
    if i % x == 2:
        print(i)
