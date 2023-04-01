import java.util.Scanner;
public class abaixoDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] matriz = new int[4][4];

        System.out.println("PREENCHER A MATRIZ\n-------------------------------");
        preencher(matriz);

        System.out.println();
        System.out.println("EXIBIR A MATRIZ\n-------------------------------");
        System.out.println("Soma abaixo da diagonal secundária: " + somaAbaixoDiagonal(matriz));

        in.close();
    }
    public static void preencher(int[][] matriz) {
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }
    }
    public static int somaAbaixoDiagonal(int[][] matriz) {
        int soma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i == 2 && j == 3|| i == 3 && j == 2 || i == 3 && j == 3) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
}