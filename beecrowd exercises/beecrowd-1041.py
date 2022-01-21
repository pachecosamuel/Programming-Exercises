#Ler 2 valores (x e y) que representam uma coordenada em um ponto
ponto = input().split(" ")
x = eval(ponto[0])
y = eval(ponto[1])

if y == 0 and x == 0:
    print("Origem")
elif x != 0 and y == 0:
    print("Eixo X")
elif y != 0 and x == 0:
    print("Eixo Y")
elif x > 0: # and y != 0:
    if y > 0:
        print("Q1")
    else:
        print("Q4")
elif x < 0: # and y !
    if y > 0:
        print("Q2")
    else:
        print("Q3")
