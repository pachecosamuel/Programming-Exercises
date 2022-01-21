#ler 4 notas float e calculá-las com os respectivos pesos
# 2,3,4 e 1.
notas = input().split(" ")
n1, n2, n3, n4 = float(notas[0]), float(notas[1]), float(notas[2]), float(notas[3])
media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10

#Condicional e impressão
if media >= 5.0:
    print(f"Media: {media:.1f}")
    if media >= 7.0:
        print("Aluno aprovado.")
    else:
        print("Aluno em exame.")
        n5 = eval(input())
        print(f"Nota do exame: {n5:.1f}")
        media = (media + n5) / 2
        if media >= 5.0:
            print("Aluno aprovado.")
            print(f'Media final: {media:.1f}')
        elif media <= 4.9:
            print("Aluno reprovado")
            print(f'Media final: {media:.1f}')
else:
    print(f"Media: {media:.1f}")
    print("Aluno reprovado.")

