package exemplo1.decisao.simples;

import java.util.Scanner;

public class Exemplo1DecisaoSimples {

    public static void main(String[] args) {
        int n;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número");
        n = entrada.nextInt();
        
        if (n < 0) { //Decisão simples: verifica se n é negativo!
            n = n * -1;
        }
        
        System.out.println("O módulo é igual a: " + n);
        
    }
    
}
