# No Python não existe uma estrutura Escolha (switch), como no Java.
# Sendo assim, vamos improvisar o if elif para simulá-lo:

dia_semana = int(input("Digite um número: "))
if dia_semana == 1:
    print("Domingo")
elif dia_semana == 2:
    print("Segunda-feira")
elif dia_semana == 3:
    print("Terça-feira")
elif dia_semana == 4:
    print("Quarta-feira")
elif dia_semana == 5:
    print("Quinta-feira")
elif dia_semana == 6:
    print("Sexta-feira")
elif dia_semana == 7:
    print("Sábado")
else:
    print("Número inválido")