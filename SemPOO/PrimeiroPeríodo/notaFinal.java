import java.util.Scanner;

public class notaFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double notaFinal, nota1, nota2, nota3;
        System.out.println("Quanto você tirou no exame intermediário? ");
        nota1 = entrada.nextDouble();
        System.out.println("Quanto você tirou no exame prático? ");
        nota2 = entrada.nextDouble();
        System.out.println("Quanto você tirou no exame final? ");
        nota3 = entrada.nextDouble();

        nota1 = nota1 * 0.3;
        nota2 = nota2 * 0.2;
        nota3 = nota3 * 0.5;
        notaFinal = nota1 + nota2 + nota3;

        System.out.println("A sua nota final será: " + notaFinal);
        entrada.close();
    }
}