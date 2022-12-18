package exercicio2_cigarros;
        
import java.util.Scanner;
        
public class Exercicio2_cigarros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Declaração de variáveis
        float preco_maco, qtd_maco, anos, dias_fumante, custo;

        // Entrada de dados
        System.out.println("Digite o preço do maço:");
        preco_maco = entrada.nextFloat();

        System.out.println("Digite a quantidade de maços/dia:");
        qtd_maco = entrada.nextFloat();

        System.out.println("Digite a qtd. de anos que fuma:");
        anos = entrada.nextFloat();

        // cálculo da quantidade de dias como fumante
        dias_fumante = anos * 365;

        // cálculo da quantidade de dias como fumante
        dias_fumante = anos * 365;

        // cálculo do gasto de tempo que fuma
        custo = dias_fumante * preco_maco;

        // Exibe o custo
        System.out.println("Você já gastou R$ " + custo + "Fumando");
    }
    
}
