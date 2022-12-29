# Função booleana que verifica se uma nota é válida ou não
def nota_valida(nota):
    if nota >= 0 and nota <= 10:
        return True
    else:
        return False

# Função que retorna o menor entre 3 valores
def menor3n(n1, n2, n3):
    menor = n1
    if n2 < menor:
        menor = n2
    if n3 < menor:
        menor = n3
    return menor

# Função que calcula a media das 2 maiores notas
def media2maiores(n1, n2, n3):
    menor = menor3n(n1, n2, n3)
    return (n1 + n2 + n3 - menor) / 2

# Procedimento para exibir a média semestral
def msg_media_semestral(m):
    print(f"A sua Média Semestral é {m:.1f}")

# Função que calcula a média de 2 números
def media2n(n1, n2):
    return (n1 + n2) / 2

# Função que retorna uma msg de aprovado ou nao no exame
def msg_aprovado_exame(m):
    if m < 5:
        return "Reprovado em exame com média " + str(m)
    else:
        return "Aprovado em exame com média " + str(m)

# PROGRAMA PRINCIPAL
# Leitura da Nota
nota1 = float(input("Nota 1: "))
# Verificação se a nota é válida
if nota_valida(nota1):
    nota2 = float(input("Nota 2: "))
    if nota_valida(nota2):
        nota3 = float(input("Nota 3: "))
        if nota_valida(nota3):
            # Cálculo da media semestral com as duas notas maiores
            media_semestral = media2maiores(nota1, nota2, nota3)
            msg_media_semestral(media_semestral)
            # Verificação do Status de aprovação ou não do aluno
            if media_semestral < 4:
                print("Você está Reprovado direto.")
            elif media_semestral >= 7:
                print("Voce está Aprovado direto.")
            else:
                # Caso o aluno tenha ficado em exame
                print("\nVOCÊ FICOU EM EXAME!\n")
                nota_exame = float(input("Digite a nota do exame: "))
                if nota_valida(nota_exame):
                    media_exame = media2n(media_semestral, nota_exame)
                    # Status de aprovação ou não do aluno após o exame
                    print(msg_aprovado_exame(media_exame))
                else:
                    print(f"Nota de exame {nota_exame}inválida!")
        else:
            print(f"Nota 3: {nota3}-É inválida!")
    else:
        print(f"Nota 2: {nota2}-É inválida!")
else:
    print(f"Nota 1: {nota1}-É inválida!")