package exercicio1_media;

import java.util.Scanner;

public class Exercicio1_media {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in); 
        
        //Declaração das variáveis
        float n1, n2, n3, n4, media;
        // Solicita quatro números ao usuário System.out.println("Digite 4 números:");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();
        // Calculaa médiados4 números
        media=(n1+n2+n3+n4)/4;
        System.out.println("Média = "+media);
    }
}
