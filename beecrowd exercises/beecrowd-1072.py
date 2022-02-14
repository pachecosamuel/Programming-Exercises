#ler um inteiro e este será a qtd de inteiros lidos em seguida
x = int(input())
y = 0

dentro, fora = 0, 0

while y < x :
    local = int(input())
    if local >= 10 and local <= 20:
        dentro += 1
    else:
        fora += 1
    y += 1

print(f"{dentro} in\n{fora} out")
