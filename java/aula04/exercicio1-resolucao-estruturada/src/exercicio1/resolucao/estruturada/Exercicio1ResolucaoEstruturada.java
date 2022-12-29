package exercicio1.resolucao.estruturada;

import java.util.Scanner;

public class Exercicio1ResolucaoEstruturada {

    public static void main(String[] args) {
        
        // Estancia o objeto Teclado para ler variáveis
        Scanner teclado = new Scanner(System.in);

        // Declaração das variáveis
        float nota1, nota2, nota3, media_semestral, nota_exame, media_exame, menor_nota;
        
        System.out.print("Nota 1:");
        nota1 = teclado.nextFloat();
        // Verifica se a nota é válida
        if (nota1 >= 0 && nota1 <= 10) {
            System.out.print("Nota 2:");
            nota2 = teclado.nextFloat();
            if (nota2 >= 0 && nota2 <= 10) {
                System.out.print("Nota 3:");
                nota3 = teclado.nextFloat();
                if (nota3 >=0 && nota3 <= 10) {
                    // Verifica qual a menor nota
                    menor_nota = nota1;
                    if (nota2 < menor_nota) {
                        menor_nota = nota2; }
                    if(nota3 < menor_nota) {
                        menor_nota = nota3;}
                // Calcula a média tirando a nota com menor valor
                media_semestral = (nota1 + nota2 + nota3 - menor_nota) / 2;
                System.out.println("A sua média semestral é " + media_semestral);
                // Verifica o status do aluno
                if (media_semestral < 4) {
                    System.out.println("Você está reprovado direto");
                } else if (media_semestral >= 7) {
                    System.out.println("Você está aprovado direto");
                } else {
                    // Solicita uma nota em caso de exame 
                    System.out.println("VOCÊ FICOU EM EXAME");
                    System.out.print("Informe a nota do exame: ");
                    nota_exame = teclado.nextFloat();
                    if(nota_exame >= 0 && nota_exame <= 10) {
                        // Verifica se passou no exame
                        media_exame = (media_semestral + nota_exame) / 2;
                        if (media_exame < 5) {
                            System.out.println("Reprovado em exame com media " + media_exame);
                        } else {
                            System.out.println("Aprovado em exame com media " + media_exame);
                        }
                        
                    } else {
                        System.out.println("Nota de exame" + nota_exame + "Inválida");
                    }
                }
                
            } else {
                System.out.println("Nota 3 "+ nota3 + " -É inválida");
            }
        } else {
            System.out.println("Nota 2 " + nota2 + " -É inválida");
        }
    } else {
        System.out.println("Nota 1 "+nota1+" -É inválida");
    }                                   
 }
    
}
