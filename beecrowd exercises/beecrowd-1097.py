x = 1
y = 7

for i in range(0, 5):
    aux = y
    for j in range (0, 3):
        print(f'I={x} J={aux}')
        aux -= 1
    x += 2
    y += 2
