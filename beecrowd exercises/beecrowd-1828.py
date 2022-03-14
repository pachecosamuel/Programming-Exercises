n = int(input())

for i in range(n):
    game = input().split()

    sheldon = game[0]
    raj = game[1]
    win = 0

    if sheldon == raj:
        print(f"Caso #{i+1}: De novo!")
        break
    elif sheldon == 'tesoura':
        if raj == 'papel' or raj == 'lagarto':
            win = 1
        else:
            win = 2
    elif sheldon == 'papel':
        if raj == 'pedra' or raj == 'Spock':
            win = 1
        else:
            win = 2
    elif sheldon == 'pedra':
        if raj == 'lagarto' or raj == 'tesoura':
            win = 1
        else:
            win = 2
    elif sheldon == 'lagarto':
        if raj == 'Spock' or raj == 'papel':
            win = 1
        else:
            win = 2
    elif sheldon == 'Spock':
        if raj == 'tesoura' or raj == 'pedra':
            win = 1
        else:
            win = 2

    if win == 1:
        print(f"Caso #{i+1}: Bazinga!")
    elif win == 2:
        print(f"Caso #{i+1}: Raj trapaceou!")
