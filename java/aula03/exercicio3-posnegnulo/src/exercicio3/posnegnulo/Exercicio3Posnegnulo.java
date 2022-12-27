package exercicio3.posnegnulo;

import java.util.Scanner;

public class Exercicio3Posnegnulo {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int n;

    System.out.println("Digite um número:");
    n = entrada.nextInt();

    if (n > 0) {
        System.out.println("Positivo");
    } else {
        if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nulo");
        }
    }

// ou pode ser resolvido com else if
// import java.util.Scanner;

// Scanner entrada = new Scanner(System.in);
// int n;

// System.out.println("Digite um número:");
// n = entrada.nextInt();

// if(n > 0) 
//     System.out.println("Positivo");
// else if (n < 0) 
//     System.out.println("Negativo");
// else
//     System.out.println("Nulo");
    }
}
