# Solicita o número da placa
numeroPlaca = int(input("Digite o número da placa do veículo: "))
finalPlaca = numeroPlaca % 10

if finalPlaca == 1 or finalPlaca == 2:
    print("Segunda-feira");
elif finalPlaca == 3 or finalPlaca == 4:
    print("Terça-feira");
elif finalPlaca == 5 or finalPlaca == 6:
    print("Quarta-feira");
elif finalPlaca == 7 or finalPlaca == 8:
    print("Quinta-feira");
else:
    print("Sexta-feira");

# importante:
# Em Python, o comando:if finalPlaca == 1 or finalPlaca == 2: pode ser substituído pelo: if finalPlaca in (1,2)!