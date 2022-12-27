package exemplo1.pkgwhile.soma;

import java.util.Scanner;

public class Exemplo1WhileSoma {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Estancia o objeto Teclado para ler variáveis
        Scanner teclado = new Scanner(System.in);

        // Declaração das variáveis
        float salario, num = 1, soma = 0;
        
        System.out.println("Digite 0 para finalizar: ");
        
        while (num != 0) {
            System.out.println("Digite um numero: ");        
            num = teclado.nextFloat();
            soma += num; // equivale à soma = soma + 1
        }

        // Exibe a somatória
        System.out.println("Somatória = " + soma);
        
    }
    
}
