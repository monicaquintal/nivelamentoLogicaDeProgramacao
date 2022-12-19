# Solicita a idade do usuário
idade = int(input("Digite sua idade: "))

# Desvio composto exibe mensagem “Maior de idade” quando a idade for maior ou igual a 18 anos
# e “Menor de idade” caso contrário
if idade >= 18:
    print("Maior de idade")
else:
    print("Menor de idade")