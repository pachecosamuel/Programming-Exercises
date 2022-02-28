values = input().split(" ")
a = int(values[0])
b = int(values[1])
c = int(values[2])

maior = a

if maior < b and b > c:
    maior = b
    print(f'{maior} eh o maior')
elif maior < c:
    maior = c
    print(f'{maior} eh o maior')
else:
    print(f'{maior} eh o maior')

    
