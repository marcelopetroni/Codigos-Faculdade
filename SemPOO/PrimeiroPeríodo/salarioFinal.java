import java.util.Scanner;

public class salarioFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioMinimo, horasTrabalho, dependentes, horasExtras, salarioFinal, a, b, c;
        System.out.println ("Qual é o salário mínimo?");
        salarioMinimo = entrada.nextDouble();
        System.out.println ("Quantas horas trabalha por dia?");
        horasTrabalho = entrada.nextDouble();
        System.out.println ("Qual é o número de dependentes da família?");
        dependentes = entrada.nextDouble();
        System.out.println ("Quantas horas de trabalho extra foram contribuídas?");
        horasExtras = entrada.nextDouble();

        a = (0.1 * salarioMinimo) * horasTrabalho;
        b = a + (0.05 * salarioMinimo * dependentes);
        c = b + horasExtras * 1.5 * (0.1 * salarioMinimo);
        salarioFinal = c - 0.1 * c;

        System.out.println("O salário final desse funcionário será de " + salarioFinal + " reais");
        entrada.close();
    }
}
