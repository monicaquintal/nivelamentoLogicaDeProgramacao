package exercicio1.calculadora;

import java.util.Scanner;

public class Exercicio1Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1, numero2, resultado;
        String operador;
        
        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println("Digite a operação desejada (+ -* /): ");
        operador = entrada.next();
        // Analisaqualo sinal digitado para fazer a operação correspondente 
        switch(operador){
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Soma = "+resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Subtração = "+resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Multiplicação = " + resultado);
                break;
            case "/":
                // Certifica-se que o segundo número não é zero
                if (numero2 == 0)
                    System.out.println("Não há divisão por zero");
                else{
                    resultado = numero1 / numero2;
                    System.out.println("Divisão = " + resultado);
                    break;
                    }
            default:
                System.out.println("Operador inválido");
        
    }
  }
}
