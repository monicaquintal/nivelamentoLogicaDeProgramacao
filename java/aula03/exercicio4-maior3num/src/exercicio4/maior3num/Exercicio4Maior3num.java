package exercicio4.maior3num;

import java.util.Scanner;

public class Exercicio4Maior3num {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, maior;

        System.out.println("Digite 3 números:");
            n1 = entrada.nextInt();
            n2 = entrada.nextInt();
            n3 = entrada.nextInt();

            maior = n1;

        if (n2 > maior)
            maior = n2;
        if (n3 > maior)
            maior = n3;
    
        System.out.println("O maior número é" + maior);
    
    }
    
}
