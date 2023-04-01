import java.util.Scanner;

public class funçãoDiaMesAno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        char resp;
        boolean x, y, z, bissexto;

        do {
        System.out.print("Informe o dia: ");
        a = in.nextInt();

        System.out.print("Informe o mês: ");
        b = in.nextInt();
        y = mes(b);

        System.out.print("Informe o ano: ");
        c = in.nextInt();
        z = ano(c);

        bissexto = bissexto(c);
        x = dia(a, b);

        // VERIFICAÇÃO DO DIA A MAIS DO ANO BISSEXTO:
        if(!bissexto) {
            if(x) {
                x = true;
            }
        }
        else {
            if(b == 2) {
                if(a >= 1 && a <= 29) {
                    x = true;
                }
                else {
                    x = false;
                }
            }
            else {
                if(x) {
                    x = true;
                }
                else {
                    x = false;
                }
            }
        }
        
        if(data(x, y, z)) {
            System.out.println("A data é válida.");
        }
        else {
            System.out.println("A data não é válida.");
        }
        System.out.println("\nVocê deseja continuar?\n['S'] para sim.\n['N'] para não."); 
        resp = in.next().charAt(0);
        resp = Character.toUpperCase(resp);

        while(resp != 'S' && resp != 'N') {
            System.out.println("Valor inválido. Informe:\n['S'] para sim.\n['N'] para não.");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);
        }

        } while(resp == 'S');
        in.close();
    }

    // FUNÇÃO DIA:
    public static boolean dia(int x, int y) {
        if(y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
            if(x < 1 || x > 31) {
            return false;
            }
        else {
            return true;
            }
        }
        else if(y == 2) {
            if(x < 1 || x > 28) {
                return false;
                }
            else {
                return true;
            }
        }
        else {
            if(x < 1 || x > 30) {
                return false;
                }
            else {
                return true;
            }
        }
    }

    // FUNÇÃO MÊS:
    public static boolean mes(int x) {
        if(x < 1 || x > 12){
            return false;
        }
        else {
            return true;
        }
    }
    // FUNÇÃO ANO BISSEXTO:
    public static boolean bissexto(int z) {
        if(z % 4 != 0 ) {
            return false;
        }
        else {
            return true;
        }
    }
    // FUNÇÃO ANO:
    public static boolean ano(int z) {
        if(z < 1900 || z > 3000) {
            return false;
        }
        else {
            return true;
        }
    }
    // FUNÇÃO VERIFICAÇÃO DA DATA TODA:
    public static boolean data(boolean x, boolean y, boolean z) {
        if(x && y && z) {
            return true;
        }
        else {
            return false;
        }
    }
}