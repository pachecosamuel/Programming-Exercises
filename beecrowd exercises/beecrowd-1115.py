while(1):
    par = [int(i) for i in input().split()]
    x = par[0]
    y = par[1]

    if x == 0 or y == 0:
        break

    if x > 0:
        if y > 0:
            print("primeiro")
        else:
            print("quarto")
    else:
        if y > 0:
            print("segundo")
        else:
            print("terceiro")
