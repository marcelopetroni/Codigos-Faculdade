import java.util.Scanner;

public class finalCopa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gols, gols2, gols3, gols4;

        System.out.print("Quantos gols o Brasil fez? ");
        gols = in.nextInt();

        while(gols < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            gols = in.nextInt();
        }
        System.out.print("Quantos gols o Japão fez? ");
        gols2 = in.nextInt();

        while(gols2 < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            gols2 = in.nextInt();
        }
        while(gols == gols2) {
            System.out.println("Não é possível empate em semifinais. Reinforme:");
            System.out.print("Número de gols do Brasil: ");
            gols = in.nextInt();
            System.out.print("Número de gols do Japão: ");
            gols2 = in.nextInt();
        }
        System.out.print("\nQuantos gols o França fez? ");
        gols3 = in.nextInt();

        while(gols3 < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            gols3 = in.nextInt();
        }
        System.out.print("Quantos gols o Uruguai fez? ");
        gols4 = in.nextInt();

        while(gols4 < 0) {
            System.out.println("Valor inválido. Informe um número de gols a partir de 0: ");
            gols4 = in.nextInt();
        }
        while(gols3 == gols4) {
            System.out.println("Não é possível empate em semifinais. Reinforme:");
            System.out.print("Número de gols da França: ");
            gols3 = in.nextInt();
            System.out.print("Número de gols do Uruguai: ");
            gols4 = in.nextInt();
        }

        finale(gols, gols2, gols3, gols4);

        in.close();
    }
    public static void finale(int gols, int gols2, int gols3, int gols4) {
        int x, y;
        x = resultado(gols, gols2);
        y = resultado2(gols3, gols4);

        if(x == 1) {
            System.out.print("Brasil irá para final com ");
        }
        else {
            System.out.print("O Japão irá pra final com ");
        }
        if(y == 1) {
            System.out.print("a França.");
        }
        else {
            System.out.print("o Uruguai.");
        }
        System.out.print(" O terceiro lugar será disputado entre ");

        if(x == 1) {
            if(y == 1) {
                System.out.print("Japão e Uruguai.");
            }
            else {
                System.out.println("Japão e França.");
            }
        }
        else {
            if(y == 1) {
                System.out.println("Brasil e Uruguai.");
            }
            else {
                System.out.println("Brasil e França.");
            }
        }
    
    }
    public static int resultado(int gols, int gols2) {
        if(gols > gols2) {
            return 1;
        }
        else {
            return 2;
        }
    }
    public static int resultado2(int gols3, int gols4) {
        if(gols3 > gols4) {
            return 1;
        }
        else {
            return 2;
        }
    }
}