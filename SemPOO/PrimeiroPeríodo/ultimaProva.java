import java.util.Scanner;

public class ultimaProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Quantos gols o time A fez? ");
        a = in.nextInt();

        while(a < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            a = in.nextInt();
        }
        System.out.print("Quantos gols o time C fez? ");
        c = in.nextInt();

        while(c < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            c = in.nextInt();
        }
        while(a == c) {
            System.out.println("Não é possível empate em semifinais. Reinforme:");
            System.out.print("Número de gols do time A: ");
            a = in.nextInt();
            System.out.print("Número de gols do time C: ");
            c = in.nextInt();
        }
        System.out.print("\nQuantos gols o time B fez? ");
        b = in.nextInt();

        while(b < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            b = in.nextInt();
        }
        System.out.print("Quantos gols o time D fez? ");
        d = in.nextInt();

        while(d < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            d = in.nextInt();
        }
        while(b == d) {
            System.out.println("Não é possível empate em semifinais. Reinforme:");
            System.out.print("Número de gols do time B: ");
            b = in.nextInt();
            System.out.print("Número de gols do time D: ");
            d = in.nextInt();
        }

        finale(a, c, b, d);

        in.close();
    }
    public static void finale(int a, int c, int b, int d) {
        int x, y;
        x = resultado(a, c);

        if(x == 1) {
            System.out.print("O time A irá para final com ");
        }
        else {
            System.out.print("O time C irá pra final com ");
        }

        y = resultado(b, d);
        if(y == 1) {
            System.out.print("o time B.");
        }
        else {
            System.out.print("o time D.");
        }
        System.out.print(" O terceiro lugar será disputado entre ");

        if(x == 1) {
            if(y == 1) {
                System.out.print("o time C e o time D.");
            }
            else {
                System.out.println("o time C e o time B.");
            }
        }
        else {
            if(y == 1) {
                System.out.println("o time A e o time D.");
            }
            else {
                System.out.println("o time A e o time B.");
            }
        }
    
    }
    public static int resultado(int x, int y) {
        if(x > y) {
            return 1;
        }
        else {
            return 2;
        }
    }
    
}