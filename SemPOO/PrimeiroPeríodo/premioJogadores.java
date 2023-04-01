import java.util.Scanner;

public class premioJogadores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pontos, pontos2, pontos3, premio, premio2, total, premio3;

        System.out.println("Quantos pontos o primeiro jogador fez?");
        pontos = in.nextDouble();

        System.out.println("Quantos pontos o segundo jogador fez?");
        pontos2 = in.nextDouble();

        System.out.println("Quantos pontos o terceiro jogador fez?");
        pontos3 = in.nextDouble();

        total = pontos + pontos2 + pontos3;
        premio = 500000 * pontos/ total;
        premio2 = 500000 * pontos2/ total;
        premio3 = 500000 * pontos3/ total;

        System.out.println("O participante 1 obteve " + pontos + " pontos e irá receber R$" + premio);
        System.out.println("O participante 2 obteve " + pontos2 + " pontos e irá receber R$" + premio2);
        System.out.println("O participante 3 obteve " + pontos3 + " pontos e irá receber R$" + premio3);

        in.close();
    }
}