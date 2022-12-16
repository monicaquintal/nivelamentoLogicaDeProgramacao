nome = "Monica"
idade = 30
altura = 159

# Forma 1
print("1. O meu nome é" ,nome, ", tenho", idade, "anos e", altura, "centímetros de altura")

# Forma 2
print("2. O meu nome é {}, tenho {} anos e {} centímetros de altura.".format(nome, idade, altura))
print("2. O meu nome é {0}, tenho {1} anos e {2} centímetros de altura.".format(nome, idade, altura))
print("2. O meu nome é {n}, tenho {i} anos e {a} centímetros de altura.".format(n=nome, i=idade, a=altura))

#Forma 3
print(f"3. O meu nome é {nome}, tenho {idade} anos e {altura} centímetros de altura.")