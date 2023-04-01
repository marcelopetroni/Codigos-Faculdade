import java.util.Scanner;

public class modularização {
    public static double realToDolar(double real, double dolar) {
        double conversao;
        conversao = real/dolar;
        return conversao;
    }
    public static double dolarToReal(double dolar, double real) {
        double conversao;
        conversao = dolar * real;
        return conversao;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, condicao, resp, y = 4.82;
        do {
            System.out.println("Deseja converter dólares ou reais?\n['1'] para dólares.\n['2'] para reais.");
            condicao = in.nextDouble();
            while(condicao != 1 && condicao != 2) {
                System.out.print("Número inválido.\n['1'] para converter dólares para real.");
                System.out.println("\n['2'] para converter reais para dólar.");
                condicao = in.nextDouble();
            }

            System.out.print("Quanto deseja converter? ");
            x = in.nextDouble();
            if(condicao == 1) {
                System.out.println(x + " dólares é " + String.format("%.2f",dolarToReal(x, y)) + " reais.");
            }
            else {
                System.out.println(x + " reais é " + String.format("%.2f", realToDolar(x,y)) + " dólares.");
            }

            System.out.println("\nQuer continuar o programa?\n['1'] para sim.\n['2'] para não.");
            resp = in.nextDouble();

            while(resp != 1 && resp != 2) {
                System.out.println("Número inválido. Informe:\n['1'] para sim.\n['2'] para não. ");
                resp = in.nextDouble();
            }
        } while(resp == 1);

        in.close();
    }
}