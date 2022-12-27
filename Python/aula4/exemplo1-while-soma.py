print("Digite 0 para finalizar")

# zera a variável que acumula a soma
soma = 0

# para entrar no laço a primeira vez
num = 1

# início do laço Enquanto-Faça
while num != 0:
# Bloco de repetição
    num = float(input("Digite um número: "))
    soma = soma + num

# fluxo depois do final do laço:
# Exibir o valor da somatória
print("Somatoria = ", soma)