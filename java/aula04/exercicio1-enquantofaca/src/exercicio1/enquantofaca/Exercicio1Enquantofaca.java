package exercicio1.enquantofaca;

import java.util.Scanner;

public class Exercicio1Enquantofaca {

    public static void main(String[] args) {
        
        // Estancia o objeto Teclado para ler variáveis
        Scanner teclado = new Scanner (System.in);

        // Declaração das variáveis
        int num, mult, volta;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        volta = 1;
        while (volta <= 10) {
            mult = num * volta;
            System.out.println(mult);
            volta++;
        }
        
    }  
    
}
