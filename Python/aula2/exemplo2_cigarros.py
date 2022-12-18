# Solicitando os dados ao usuário
preco_maco = float(input("Digite o preço do maço: "))
qtd_maco = float(input("Digite a quantidade de maços fumados por dia:"))
anos = float(input("Digite a qtd. de anos que fuma:"))

# calcula a qtd. de dias como fumante
dias_fumante = anos * 365

# calcula o gasto do tempo que fuma
custo = dias_fumante * preco_maco

# Exibe o custo
print("Você já gastou R$ ", custo, "Fumando")