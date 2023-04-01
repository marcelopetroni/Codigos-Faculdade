import java.util.Scanner;
public class acimaDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] matriz = new int[4][4];

        System.out.println("PREENCHER A MATRIZ\n-------------------------------");
        preencher(matriz);

        System.out.println();
        System.out.println("EXIBIR A MATRIZ\n-------------------------------");
        System.out.println("Soma acima da diagonal principal: " + somaAcimaDiagonal(matriz));

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
    public static int somaAcimaDiagonal(int[][] matriz) {
        int soma = 0, j = 0;
        for(int i = 0; i < matriz.length; i++) {
            j = i;
            while(j < matriz.length) {
                if(j != 0 && j != i) {
                    soma += matriz[i][j];
                }
                j++;
            }
        }
        return soma;
    }
}