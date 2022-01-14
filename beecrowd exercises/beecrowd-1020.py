idade = eval(input())
x = [365, 30, 1]
y = []

for i in x:
    qtd = idade // i
    y.append(str(qtd))
    idade -= qtd * i

print(f'{y[0]} ano(s)\n{y[1]} mes(es)\n{y[2]} dia(s)')
