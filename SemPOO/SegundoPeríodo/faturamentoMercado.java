import java.util.Scanner;
public class faturamentoMercado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][] matriz = new double[9][13];
        int escolha;

        System.out.println("PREENCHER O FATURAMENTO DO MERCADO\n-------------------------------");
        preencher(matriz);
        do {
        menu();
        System.out.print("Informe: ");
        escolha = in.nextInt();

        while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {
            System.out.print("Valor informado inválido. Informe entre 1 - 5: ");
            escolha = in.nextInt();
        }

        if(escolha == 1) {
            System.out.println("O faturamento mensal médio foi de R$" + mensal(matriz) + "."); 
        }
        else if(escolha == 2) {
            System.out.print("Informe uma fruta para ser exibido seu faturamento anual: ");
            in.nextLine();
            String fruta = in.nextLine();
            double result = frutaAnual(matriz, fruta);

            if(result == -1) {
                System.out.println("Fruta não identificada.");
            }
            else {
                System.out.println("O faturamento da fruta informada foi de R$" + result + ".");
            }
        }
        else if(escolha == 3) {
            System.out.print("Informe o nº do mês desejado para ser exibido seu faturamento (1 - 12): ");
            int mes = in.nextInt();

            while(mes < 1 && mes > 12) {
                System.out.print("Valor inválido. Informe um mês entre 1 - 12: ");
                mes = in.nextInt();
            }
            System.out.println("O faturamento do mês informada foi de R$" + mesMensal(matriz, mes) + ".");

        }
        else if(escolha == 4){
            System.out.println("O faturamento anual foi de R$" + anual(matriz) + "."); 
        }
      
        } while(escolha != 5);
   
        in.close();
    }
    public static void preencher(double[][] matriz) {
        Scanner in = new Scanner(System.in);
        
        String [] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", 
        "outubro", "novembro", "dezembro"};
        String [] frutas = {"abacaxi", "banana", "maçã", "mamão", "melancia", "melão", "tangerina", "uva"};
        int z = 1, j;
        for(j = 0 ; j < 12; j++) {
            double soma = 0;
            System.out.println("(" + z + "º mês)");
            for(int i = 0; i < 8 ; i++) {
                System.out.print("Informe o valor arrecadado em " + meses[j] 
                + " com a venda de " + frutas[i] + ": ");
                matriz[i][j] = in.nextDouble();

                while(matriz[i][j] < 0) {
                    System.out.print("Valor inválido. Informe um valor acima de 0: ");
                    matriz[i][j] = in.nextDouble();
                }
                soma += matriz[i][j];
            }
            matriz[8][j] = soma;
            System.out.println();
            z ++;
        }
    }
    public static double mensal(double[][] matriz) {
        double media = anual(matriz)/12;
        return media;
    }
    public static double frutaAnual(double[][] matriz, String fruta) {
        double total = 0;
        boolean achou = false;
        String [] frutas = {"abacaxi", "banana", "maçã", "mamão", "melancia", "melão", "tangerina", "uva"};

        for(int i = 0; i < 8 ; i++) {
           double soma = 0;
            for(int j = 0 ; j < 12; j++)  {
                soma += matriz[i][j];
            }
            matriz[i][12] = soma;
        }
        for(int i = 0 ; i < 8; i++) {
            if(frutas[i].compareToIgnoreCase(fruta) == 0) {
                total = matriz[i][12];
                achou = true;
            }
        }
        if(achou == false) {
            return -1;
        }
        return total;
    }
    public static double mesMensal(double[][] matriz, int mes) {
        mes = mes - 1;
        return matriz[8][mes];
    }
    public static double anual(double[][] matriz) {
        double soma = 0;
        for(int j = 0 ; j < 12; j++) {
            soma += matriz[8][j];
        }
        return soma;
    }
    public static void menu() {
        System.out.println("MENU\n--------------------------");
        System.out.println("1 - Exibir o faturamento mensal médio.");
        System.out.println("2 - Exibir faturamento anual de uma fruta informada.");
        System.out.println("3 - Exibir faturamento de um mês informado.");
        System.out.println("4 - Exibir o faturamento anual.");
        System.out.println("5 - Finalizar programa.");
    }
   
}

