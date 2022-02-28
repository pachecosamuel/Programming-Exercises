time = eval(input())
qtdtime = [3600, 60, 1]
result = []

for i in qtdtime:
    qtd = time // i
    result.append(str(qtd))
    time -= qtd * i

print(f'{result[0]}:{result[1]}:{result[2]}')

