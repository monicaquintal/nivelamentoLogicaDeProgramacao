package exercicio2.rodizio;

import java.util.Scanner;

public class Exercicio2Rodizio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroPlaca, finalPlaca;
        
        System.out.println("Digite o número da placa:");
        numeroPlaca = entrada.nextInt();
        
        finalPlaca = numeroPlaca % 10;
        
        switch(finalPlaca){
            case 1:
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("Terça-feira");
                break;
            case 5:
            case 6:
                System.out.println("Quarta-feira");
                break;
            case 7:
            case 8:
                System.out.println("Quinta-feira");
                break;
            case 9:
            case 0:
                System.out.println("Sexta-feira");
                break;
        }
      }
    }
   
