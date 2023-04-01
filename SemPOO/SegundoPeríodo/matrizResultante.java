import java.util.Scanner;
public class matrizResultante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][] matriz = new double[5][5];

        System.out.println("PREENCHER A MATRIZ\n-------------------------------");
        preencher(matriz);
        operacao(matriz, maiorValor(matriz));
        System.out.println();
        System.out.println("EXIBIR A MATRIZ\n-------------------------------");
        exibir(matriz);

        in.close();
    }
    public static void preencher(double[][] matriz) {
        Scanner in = new Scanner(System.in);
        for(int j = 0 ; j < matriz.length; j++) {
            for(int i = 0; i < matriz.length; i++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextDouble();

            }
        }
    }
    public static double maiorValor(double[][] matriz) {
        double maior = Double.MIN_VALUE;
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
    public static void operacao(double[][] matriz, double maiorValor) {
        for(int i = 0 ; i < matriz.length; i++) {
            matriz[i][i] *= maiorValor;
        }
    }
    public static void exibir(double[][] matriz) {
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}