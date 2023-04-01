import java.util.Scanner;
public class somaMatrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] matriz = new int[3][4];
        int [][] matriz2 = new int[3][4];
        int [][] matriz3 = new int[3][4];

        System.out.println("PREENCHER AS MATRIZES\n-------------------------------");
        System.out.println("MATRIZ A:");
        preencher(matriz);
        System.out.println("\nMATRIZ B: ");
        preencher(matriz2);
        System.out.println();
        System.out.println("RESULTADO DA SOMA DAS MATRIZES: \n-------------------------------");
        conta(matriz, matriz2, matriz3);
        exibir(matriz3);

        in.close();
    }
    public static void preencher(int[][] matriz) {
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < matriz.length; i++) {
            for(int x = 0; x < matriz.length; x++) {
                System.out.print("matriz[" + i + "][" + x + "]: ");
                matriz[i][x] = in.nextInt();
            }
        }
    }
    public static void conta(int[][] matriz, int[][] matriz2, int[][] matriz3) {
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                matriz3[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
    }
    public static void exibir(int[][] matriz) {
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}