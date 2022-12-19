package exemplo2.desvio.composto;

import java.util.Scanner;

public class Exemplo2DesvioComposto {

    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a sua idade: ");
        idade = entrada.nextInt();
        
        if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }
    
}
