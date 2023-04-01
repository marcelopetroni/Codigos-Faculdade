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
        for(int i = 0 ; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();

            }
        }
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
        System.out.println();
        System.out.println("EXIBIR A MATRIZ TRANSPOSTA\n-------------------------------");
        for(int i = 0 ; i < colunas; i++) {
            for(int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}