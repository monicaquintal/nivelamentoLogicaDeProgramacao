numero1= float(input("Digite o primeiro número: "))
numero2= float(input("Digite o segundo número: "))
operador = str(input("Digite a operação desejada (+ - * /): "))

if operador == '+':
    resultado = numero1 + numero2
    print("Soma = ", resultado)
elif operador == '-':
    resultado = numero1 -numero2
    print("Subtração = ", resultado)
elif operador == '*':
    resultado = numero1 * numero2
    print("Multiplicação = ", resultado)
elif operador == '/':
    if numero2 == 0:
        print("Não existe divisão por zero")
    else:
        resultado = numero1 / numero2
        print("Divisão = ", resultado)
else:
    print("Operador inválido")