n = int(input("Digite um número: "))

if n > 0:
    print("Positivo")
else:
    if n < 0:
        print("Negativo")
    else:
        print("Nulo")

# também pode ser resolvido com elif:

# n = int(input("Digite um número: "))

# if n > 0:
#     print("Positivo")
# elif n < 0:
#     print("Negativo")
# else:
#     print("Nulo")