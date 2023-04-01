import java.util.Scanner;

public class arquivoTeste {

    public static double teste(double a) {
        double volume;
        volume = Math.pow(a,3);
        
        return volume;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char y = 'S';
        double cubo;
        String x = "" + y;
        x = x.toLowerCase();
        System.out.println(x);

        // outra opção para captalizar char:
        char a, b;
        System.out.print("Escreva um caracter minúsculo: ");
        a = in.next().charAt(0);
        b = Character.toUpperCase(a);
        System.out.println("Teste: " + b);

        System.out.print("Diga o valor do lado do cubo: ");
        cubo = in.nextDouble();
        System.out.println(teste(cubo));

        in.close();
    }
}