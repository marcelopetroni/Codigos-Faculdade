import java.util.Scanner;
public class matrizTransposta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o número de linhas: ");
        int linhas = in.nextInt();

        System.out.print("Informe o número de colunas: ");
        int colunas = in.nextInt();
        int [][] matriz = new int[linhas][colunas];

        System.out.println("PREENCHER A MATRIZ\n-------------------------------");
        preencher(matriz, linhas, colunas);
        int[][] transposta = transposta(matriz, linhas, colunas);

        System.out.println();
        System.out.println("EXIBIR A MATRIZ TRANSPOSTA\n-------------------------------");
        exibir(transposta, linhas, colunas);

        in.close();
    }
    public static void preencher(int[][] matriz, int linhas, int colunas) {
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();

            }
        }
    }
    public static void exibir(int[][] matriz, int linhas, int colunas) {
        for(int i = 0 ; i < colunas; i++) {
            for(int j = 0; j < linhas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transposta(int[][] matriz, int linhas, int colunas) {
        int[][] transposta = new int[colunas][linhas];
        int[] mudanca = new int[linhas * colunas];
        int x = 0;
        for(int i = 0 ; i < colunas; i++) {
            for(int j = 0; j < linhas; j++) {
               mudanca[x] = matriz[j][i];
               x++;
            }
        }
        x = 0;
        for(int i = 0 ; i < colunas; i++) {
            for(int j = 0; j < linhas; j++) {
               transposta[i][j] = mudanca[x];
               x++;
            }
        }
        return transposta;
    }
}