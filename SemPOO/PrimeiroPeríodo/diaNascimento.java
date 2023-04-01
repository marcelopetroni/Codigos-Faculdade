import java.util.Scanner;

public class diaNascimento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double resto;
        char resp;
        boolean data;

        do {
        System.out.print("Informe o dia: ");
        a = in.nextInt();

        System.out.print("Informe o mês: ");
        b = in.nextInt();

        System.out.print("Informe o ano: ");
        c = in.nextInt();

        bissexto(c);
        data = data(a, b, c);
        
        while(!data) {
            System.out.println("\nData inválida. Reinforme uma data válida: ");
            System.out.print("Dia: ");
            a = in.nextInt();
            System.out.print("Mês: ");
            b = in.nextInt();
            System.out.print("Ano: ");
            c = in.nextInt();
            data = data(a, b, c);
        }

        resto = diaDaSemana(a, b, c);
        if(resto >= 0 && resto < 1) {
            System.out.println("O dia da semana que você nasceu foi segunda.");
        }
        else if(resto >= 1 && resto < 2) {
            System.out.println("O dia da semana que você nasceu foi terça.");
        }
        else if(resto >= 2 && resto < 3) {
            System.out.println("O dia da semana que você nasceu foi quarta.");
        }
        else if(resto >= 3 && resto < 4) {
            System.out.println("O dia da semana que você nasceu foi quinta.");
        }
        else if(resto >= 4 && resto < 5) {
            System.out.println("O dia da semana que você nasceu foi sexta.");
        }
        else if(resto >= 5 && resto < 6) {
            System.out.println("O dia da semana que você nasceu foi sábado.");
        }
        else {
            System.out.println("O dia da semana que você nasceu foi domingo.");
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

    // FUNÇÃO VALIDAÇÃO DA DATA:
    public static boolean data(int x, int y, int z) {
        boolean dia, mes, ano;
        // DIA:
        if(!bissexto(z)) {
            if(y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
                if(x < 1 || x > 31) {
                dia = false;
                }
            else {
                dia = true;
                }
            }
            else if(y == 2) {
                if(x < 1 || x > 28) {
                    dia = false;
                    }
                else {
                    dia = true;
                }
            }
            else {
                if(x < 1 || x > 30) {
                    dia = false;
                    }
                else {
                    dia = true;
                }
            }
        }
        else {
            if(y == 2) {
                if(x >= 1 && x <= 29) {
                    dia = true;
                }
                else {
                    dia = false;
                }
            }
            else {
                if(y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
                    if(x < 1 || x > 31) {
                    dia = false;
                    }
                    else {
                        dia = true;
                    }
                }
                else {
                    if(x < 1 || x > 30) {
                        dia = false;
                        }
                    else {
                        dia = true;
                    }
                }
            }
        }
        // MÊS:
        if(y < 1 || y > 12){
            mes = false;
        }
        else {
            mes = true;
        }
        // ANO:
        if(z < 1900 || z > 2399) {
            ano = false;
        }
        else {
            ano = true;
        }
        // DATA TODA:
        if(dia && mes && ano) {
            return true;
        }
        else {
            return false;
        }
    }

    // FUNÇÃO ANO BISSEXTO:
    public static boolean bissexto(int z) {
        if( ( (z % 4 == 0 ) && ( z % 100 != 0 ) ) || ( z % 400 == 0 ) ) {
            return true;
        }
        else {
            return false;
        }
    }

    // FUNÇÃO DIA DA SEMANA:
    public static double diaDaSemana(int x, int y, int z) {
        double conta, resto, a, b, c, d;

        a = z - 1900;
        if(bissexto(z)) {
            b = (a/4) - 1;
        }
        else {
            b = a/4;
        }
        if(y == 1) {
            c = 0;
        }
        else if(y == 2) {
            c = 3;
        }
        else if(y == 3) {
            c = 3;
        }
        else if(y == 4) {
            c = 6;
        }
        else if(y == 5) {
            c = 1;
        }
        else if(y == 6) {
            c = 4;
        }
        else if(y == 7) {
            c = 6;
        }
        else if(y == 8) {
            c = 2;
        }
        else if(y == 9) {
            c = 5;
        }
        else if(y == 10) {
            c = 0;
        }
        else if(y == 11) {
            c = 3;
        }
        else {
            c = 5;
        }
        if(bissexto(z) && y >= 3) { 
            d = x;
        }
        else {
            d = x - 1;
        }
        conta = a + b + c + d;
        resto = (double)conta % 7.0;
        return resto;
    }
}