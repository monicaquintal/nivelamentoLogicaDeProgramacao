print ("Digite 3 números: ")
n1 = int(input())
n2 = int(input())
n3 = int(input())

maior = n1

if n2 > maior:
    maior = n1
if n3 > maior:
    maior = n3

print ("Maior número: ", maior)