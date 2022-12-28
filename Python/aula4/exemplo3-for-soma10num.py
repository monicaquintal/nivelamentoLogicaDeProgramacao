soma = 0
print("Digite 10 números")

# Laço configurado para 10 voltas
for i in range(1, 11, 1):
    n = float(input())
    soma = soma + n

print("Somatória = ", soma)

# Lembre-se: o 11, dentro do range, indica que a volta vai até um valor anterior, que é o 10!!!