num = int(input("Digite um número: "))

volta = 1

while True:
    mult = num * volta
    print(mult)
    volta += 1 # Equivale à volta = volta + 1
    if volta > 10:
        break