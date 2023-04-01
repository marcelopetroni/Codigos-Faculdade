import java.util.Scanner;

public class alturaPredio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double minhaAltura, minhaSombra, predioSombra, altura;
        System.out.println("Informe sua altura: (em metros)");
        minhaAltura = in.nextDouble();

        System.out.println("Informe a medida de sua sombra: (em metros)");
        minhaSombra = in.nextDouble();

        System.out.println("Informe a medida da sombra do prédio: (em metros)");
        predioSombra = in.nextDouble();

        altura = (minhaAltura * predioSombra)/ minhaSombra;

        System.out.println("A altura do prédio será " + altura + "m");
        in.close();
    }
}