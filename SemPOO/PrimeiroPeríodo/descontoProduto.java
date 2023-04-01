import java.util.Scanner;

public class descontoProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double preco, pDesconto, desconto, precoFinal;
        System.out.println ("Qual é o preço do produto?");
        preco = entrada.nextDouble();
        System.out.println ("Qual é a porcentagem de desconto oferecida ao produto?");
        pDesconto = entrada.nextDouble();

        desconto = pDesconto/100 * preco;
        precoFinal = preco - desconto;

        System.out.println("O preço real do produto era: " + preco);
        System.out.println("O produto teve um desconto de: " + desconto + " reais");
        System.out.println("O preço final do produto é atualmente de : " + precoFinal);
        entrada.close();
    }
}
