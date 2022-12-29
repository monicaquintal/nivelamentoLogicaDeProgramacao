# Leitura da Nota
nota1 = float(input("Nota 1: "))
# Verificação se a nota é válida
if nota1 >= 0 and nota1 <= 10:
    nota2 = float(input("Nota 2: "))
    if nota2 >= 0 and nota2 <= 10:
        nota3 = float(input("Nota 3: "))
        if nota3 >= 0 and nota3 <= 10:
            # Verificação da menor entre 3 notas
            menor_nota = nota1
            if nota2 < menor_nota:
                menor_nota = nota2
            if nota3 < menor_nota:
                menor_nota = nota3
            # Cálculo da media semestral com as duas notas maiores
            media_semestral = (nota1 + nota2 + nota3 - menor_nota) / 2
            print(f"A sua Média Semestral é {media_semestral:.1f}")
            # Verificação do Status de aprovação ou não do aluno
            if media_semestral < 4:
                print("Você está Reprovado direto.")
            elif media_semestral >= 7:
                print("Voce está Aprovado direto.")
            else:
                # Caso o aluno tenha ficado em exame
                print("\nVOCÊ FICOU EM EXAME!\n")
                nota_exame = float(input("Digite a nota do exame: "))
                if nota_exame >= 0 and nota_exame <= 10:
                    media_exame = (media_semestral + nota_exame) / 2
                    # Status de aprovação ou não do aluno após o exame
                    if media_exame < 5:
                        print(f"\nReprovado em exame com média {media_exame:.1f}")
                    else:
                        print(f"\nAprovado em exame com média {media_exame:.1f}")
                else:
                    print(f"Nota de exame {nota_exame}inválida!")
        else:
            print(f"Nota 3: {nota3}-É inválida!")
    else:
        print(f"Nota 2: {nota2}-É inválida!")
else:
    print (f"Nota 1: {nota1}-É inválida!")