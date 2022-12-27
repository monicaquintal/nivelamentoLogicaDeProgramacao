# zera as variáveis dos candidatos
hug = 0
zez = 0
lui = 0

# Exibe o menu com os candidatos
print("Digite o voto ou 0 para finalizar")
print("1 – Huguinho")
print("2 – Zezinho")
print("3 – Luizinho")
print("0 – Terminar a votação")

# inicia um laço infinito
while True:
    # Lê o voto
    voto = int(input("Digite o voto: "))
    # Contabiliza o voto
    if voto == 1:
        hug = hug + 1
    elif voto == 2:
        zez = zez + 1
    elif voto == 3:
        lui = lui + 1
    else:
        if voto != 0:
            print("Voto inválido, digite: 1, 2 ou 3")

    # Este if simula a condição de saída no final do laço
    if voto == 0:
        break # força a saída do laço

    # Exibe a quantidade de votos de cada candidato
    print(f"1 –Huguinho: {hug} votos")
    print(f"2 –Zezinho: {zez} votos")
    print(f"3 –Luizinho: {lui} votos")