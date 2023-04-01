import java.util.Scanner;

public class raçãoGatos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double quantidade, gato, gato2, dias;

        System.out.println("Qual a quantidade de ração o primeiro gato consume por dia? (em kg)");
        gato = in.nextDouble();

        System.out.println("Qual a quantidade de ração o segundo gato consume por dia? (em kg)");
        gato2 = in.nextDouble();

        System.out.println("Por quantos dias você deseja manter essa quantidade x de ração para os gatos?");
        dias = in.nextDouble();

        quantidade = dias * (gato + gato2);
        System.out.println("Você precisará obter " + quantidade + "kg de ração para manter seus gatos alimentados" );

        in.close();
    }
}