import java.util.Scanner;

public class salarioImposto{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double salarioMinimo, horasTrabalhadas, salarioTotal, salarioLiquido, desconto;

        System.out.println("Qual é o salário mínimo?");
        salarioMinimo = in.nextDouble();

        System.out.println("Quantos horas de trabalho foram contribuídos?");
        horasTrabalhadas = in.nextDouble();

        salarioTotal = horasTrabalhadas * salarioMinimo * 0.015;

        if(salarioTotal > 2500) {
            desconto = (salarioTotal * 0.075);
            salarioLiquido = salarioTotal - desconto;
            System.out.println("O salário total do funcionário é de " + salarioTotal + " reais");
            System.out.println("O desconto do imposto sobre o salário do funcionário é de " + desconto + " reais");
            System.out.println("O salário líquido do funcionário é de " + salarioLiquido + " reais");
        }
        else {
            System.out.println("O salário total do funcionário é de " + salarioTotal + " reais");
        }

        in.close();
    }
}