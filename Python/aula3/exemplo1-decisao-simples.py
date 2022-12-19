# Solicitar um número digitado pelo usuário
n = int(input("Digite um número:"))

#Comando de decisão: Verificar se o número é negativo
if n < 0:
    n = n * (-1)

# Exibe o número positivo
print("Módulo: ",n)