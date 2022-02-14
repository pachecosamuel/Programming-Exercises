n = int(input())

for i in range(0, n):
    x = input().split()
    vet = map(float, x)
    a, b, c = vet

    print(f"{(a*2 + b*3 + c*5) / 10:.1f}")
