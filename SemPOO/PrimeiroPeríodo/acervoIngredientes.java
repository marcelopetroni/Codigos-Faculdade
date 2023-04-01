import java.util.Scanner;

public class acervoIngredientes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double qSanduiches, qQueijo, qPresunto, qCarne;
        System.out.println("Quantos sanduíches você deseja? ");
        qSanduiches = entrada.nextDouble();

        qQueijo = qSanduiches * 100;
        qPresunto = qSanduiches * 50;
        qCarne = qSanduiches * 100;

        System.out.println("A quantidade de queijo necessário será de " + qQueijo + "g");
        System.out.println("A quantidade de presunto necessário será de " + qPresunto + "g");
        System.out.println("A quantidade de carne necessário será de " + qCarne + "g");
        entrada.close();
    }
}