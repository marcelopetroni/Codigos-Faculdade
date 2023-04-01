import java.util.Scanner;

public class orçamentoLatasTinta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double altura, diametro, area, raio, qCilindros, qLatas, qLitros, custo;
        System.out.println("Qual a altura do cilindro? ");
        altura = entrada.nextDouble();
        System.out.println("Qual é o diâmetro do cilindro? ");
        diametro = entrada.nextDouble();
        System.out.println("Quantos cilindros serão necessários? ");
        qCilindros = entrada.nextDouble();

        raio = diametro/2;
        area = (2 * Math.PI * raio * raio) + 2 * 3.14 * raio * altura;
        qCilindros = qCilindros * area;
        qLitros= qCilindros/3;
        qLatas = qLitros/5;
        custo = qLatas * 45;

        System.out.println("A quantidade de latas necessárias serão de " + qLatas);
        System.out.println("O custo total será de: " + custo + " reais");
        entrada.close();
    }
}