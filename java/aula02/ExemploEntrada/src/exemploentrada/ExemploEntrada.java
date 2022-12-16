package exemploentrada;

import java.util.Scanner;

public class ExemploEntrada {

    public static void main(String[] args) {
        // TODO code application logic here
        int num, dobro;
        Scanner entrada = new Scanner (System.in);
        
        //entrada
        System.out.println("Digite um número: ");
        
        //casting
        num = entrada.nextInt();
        
        //processamento
        dobro = num + num;
        
        //saída de dados
        System.out.println("Dobro = " + dobro);
        
    }
    
}
