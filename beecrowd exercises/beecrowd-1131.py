validador = True
qtd = 0
vitInter = 0
vitGremio = 0
empates = 0

while(validador == True):
    vet = [int(i) for i in input().split()]

    inter = vet[0]
    gremio = vet[1]

    qtd += 1
    if inter > gremio:
        vitInter += 1
    elif inter < gremio:
        vitGremio += 1
    else:
        empates += 1

    novo = input("Novo grenal (1-sim 2-nao)\n")
    if novo == '1':
        validador = True
    elif novo == '2':
        validador = False
        print(f"{qtd} grenais")
        print(f"Inter:{vitInter}")
        print(f"Gremio:{vitGremio}")
        print(f"Empates:{empates}")
        if vitGremio > vitInter:
            print("Gremio venceu mais")
        else:
            print("Inter venceu mais")
        break
