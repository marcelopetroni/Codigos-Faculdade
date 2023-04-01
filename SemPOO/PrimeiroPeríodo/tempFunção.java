import java.util.Scanner;

public class tempFunção {
    public static double fahreToCelsius(double fahre, double celsius) {
        celsius = (fahre - 32)/1.8;
        return celsius;
    }
    public static double CelsiusToFahre(double celsius, double fahre) {
        fahre = celsius * 1.8 + 32;
        return fahre;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y = 1, condicao, resp;
        do {
            System.out.println("Deseja converter fahrenheit ou celsius?\n['1'] para fahrenheit.\n['2'] para celsius.");
            condicao = in.nextDouble();
            while(condicao != 1 && condicao != 2) {
                System.out.print("Número inválido.\n['1'] para converter fahrenheit para celsius.");
                System.out.println("\n['2'] para converter celsius para fahrenheit.");
                condicao = in.nextDouble();
            }

            System.out.print("Qual o valor da temperatura? ");
            x = in.nextDouble();
            if(condicao == 1) {
                System.out.println(x + "°F é " + String.format("%.2f",fahreToCelsius(x, y)) + " °C.");
            }
            else {
                System.out.println(x + "°C é " + String.format("%.2f", CelsiusToFahre(x,y)) + " °F.");
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