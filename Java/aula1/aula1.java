package Java.aula1;

import java.util.Scanner;

public class aula1 {
  public static void main(String[] args) {
    int n1, n2, soma;
    
    Scanner entrada = new Scanner(System.in);
    
     n1 = entrada.nextInt();
     n2 = entrada.nextInt();
    
    soma = n1 + n2;
    
    System.out.println("Soma: " + soma);
    
  }
}
