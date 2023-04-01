import java.util.Scanner;

public class salarioVendedor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double carrosVendidos, valorVendas, salario;
        
        System.out.println("Quantos carros você vendeu? ");
        carrosVendidos = in.nextDouble();

        System.out.println("Qual foi o seu valor total de vendas? ");
        valorVendas = in.nextDouble();

        salario = 1500 + (carrosVendidos * 100) + 0.05 * valorVendas;

        System.out.println("Você receberá um salário de " + salario + " reais");
        in.close();
    }
}