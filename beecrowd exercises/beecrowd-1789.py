# nvl 1 < 10cm/h ; nvl 2 >= 10 cm/h e < 20cm/h ; nv3 >= 20cm/h

while True:
    try:

        n = int(input())
        lesmas = list(map(int, input().split()))

        fast = 0

        for i in range(n):
            if lesmas[i] > fast:
                fast = lesmas[i]

        if fast < 10:
            print(1)
        elif fast >= 10 and fast < 20:
            print(2)
        elif fast >= 20:
            print(3)

    except EOFError:
        break
