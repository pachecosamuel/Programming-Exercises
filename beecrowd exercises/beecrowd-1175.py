#FIRST RESOLUTION
vet = []
tamanho = 20

for i in range(tamanho):
    vet.append(int(input()))
    #vet[i] = int(input())

vet.reverse()

for j in range(tamanho):
    print(f"N[{j}] = {vet[j]}")
    
    
#SECONDO RESOLUTION
vet = []
tamanho = 20

for i in range(tamanho):
    vet.append(int(input()))
    #vet[i] = int(input())

esquerda = 0
direita = tamanho-1

while esquerda < direita:
    vet[esquerda], vet[direita] = vet[direita], vet[esquerda]

    esquerda += 1
    direita -= 1

for j in range(tamanho):
    print(f"N[{j}] = {vet[j]}")
