# Solicita a quantia
quantia = int(input("Digite a quantia: "))

# Efetua o cálculo das quantias de cédulas
ced50 = quantia // 50
quantia = quantia % 50

ced20 = quantia // 20
quantia = quantia % 20

ced10 = quantia // 10
quantia = quantia % 10

# Exibe as quantidades de cédulas
print("Quantidade das cédulas 50: ", ced50)
print("Quantidade das cédulas 20: ", ced20)
print("Quantidade das cédulas 10: ", ced10)