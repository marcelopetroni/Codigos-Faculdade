import java.util.Scanner;

public class conversãoMetros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double medida, escolha;
        char resp;

        do {
            menu();
            escolha = in.nextDouble();

            while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5 && escolha != 6) {
                System.out.println("Valor inválido. Escolha:");
                System.out.println("['1'] Quilômetro.\n['2'] Hectômetro.\n['3'] Decâmetro.");
                System.out.println("['4'] Decímetros.\n['5'] Centímetros\n['6'] Milímetros.");
                escolha = in.nextDouble();
            }

            System.out.print("Informe o valor em metros que você deseja converter: ");
            medida = in.nextDouble();

            if(escolha == 1) {
                System.out.println(medida + "m = " + quilometro(medida) + "km.");
            }
            else if(escolha == 2) {
                System.out.println(medida + "m = " + hectometro(medida) + "hm.");
            }
            else if(escolha == 3) {
                System.out.println(medida + "m = " + decametro(medida) + "dam.");
            }
            else if(escolha == 4) {
                System.out.println(medida + "m = " + decimetros(medida) + "dm.");
            }
            else if(escolha == 5) {
                System.out.println(medida + "m = " + centimetros(medida) + "cm.");
            }
            else {
                System.out.println(medida + "m = " + milimetros(medida) + "mm.");
            }

            System.out.println("Você deseja continuar?");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);

            while(resp != 'S' && resp != 'N') {
                System.out.println("Valor inválido. Informe: ['S'] para sim.\n['N'] para não.");
                resp = in.next().charAt(0);
                resp = Character.toUpperCase(resp);
            }
        } while(resp == 'S');
        
        in.close();
    }

        public static void menu() {
            System.out.println("Você deseja converter de metros para:\n['1'] Quilômetro.\n['2'] Hectômetro.");
            System.out.println("['3'] Decâmetro.\n['4'] Decímetros.\n['5'] Centímetros\n['6'] Milímetros.");
        }

        public static double quilometro(double medida) {
            double result;
            result = medida/1000;
            return result;
        }
        public static double hectometro(double medida) {
            double result;
            result = medida/100;
            return result;
        }
        public static double decametro(double medida) {
            double result;
            result = medida/10;
            return result;
        }
        public static double decimetros(double medida) {
            double result;
            result = medida * 10;
            return result;
        }
        public static double centimetros(double medida) {
            double result;
            result = medida * 100;
            return result;
        }
        public static double milimetros(double medida) {
            double result;
            result = medida * 1000;
            return result;
        }
}