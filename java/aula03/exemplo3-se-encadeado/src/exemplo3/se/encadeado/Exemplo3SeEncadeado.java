package exemplo3.se.encadeado;

import java.util.Scanner;

public class Exemplo3SeEncadeado {

    public static void main(String[] args) {
        int dia;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe um número de 1 a 7");
        dia = entrada.nextInt();
        
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2 ) {
            System.out.println("Segunda");
        } else if (dia == 3 ) {
            System.out.println("Terça");
        } else if (dia == 4 ) {
            System.out.println("Quarta");
        } else if (dia == 5 ) {
            System.out.println("Quinta");
        } else if (dia == 6 ) {
            System.out.println("Sexta");
        } else if (dia == 7 ) {
            System.out.println("Sábado");
        } else {
            System.out.println("Número inválido");
        }
    }
}
