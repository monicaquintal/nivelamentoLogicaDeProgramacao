import java.util.Scanner;

public class aula01 {
        
    public static void main(String[] args) {

        //declaracao de variaveis    
        int n1 = 0;
        int n2 = 0;
        int soma;
        
        Scanner leitor = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o primeiro número:");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        n2 = leitor.nextInt();

        //processamento
        soma = n1 + n2;

        //saída de dados
        System.out.println("A soma é igual a: " + soma);
        }
    }