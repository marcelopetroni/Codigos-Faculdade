import java.util.Scanner;

public class volumeCilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double raio, altura, resultado;
        System.out.println ("Qual é a altura? ");
        altura = entrada.nextDouble();
        System.out.println ("Qual é o raio? ");
        raio = entrada.nextDouble();

        resultado = Math.PI * raio * raio * altura;
        System.out.print ("O valor do volume é " + resultado + "cm3");
        entrada.close();

    }
}
