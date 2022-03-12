t = int(input())

for i in range(t):
    r1, r2 = list(map(int, input().split()))
            # int(x) for x in input().split()

    raiototal = ((r1*2)+(r2*2)) / 2

    print(int(raiototal))
