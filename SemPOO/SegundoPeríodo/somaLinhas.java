import java.util.Scanner;
public class somaLinhas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] soma = new int[4];
        int [] soma2 = new int[5];
        int [][] matriz = new int[4][5];

        System.out.println("PREENCHER A MATRIZ:\n-------------------------------");
        preencher(matriz);

        System.out.println();
        System.out.println("EXIBIR A SOMA DAS LINHAS:\n-------------------------------");
        somaLinha(matriz, soma);
        exibir(soma);
        System.out.println();
        System.out.println("\nEXIBIR A SOMA DAS COLUNAS:\n-------------------------------");
        somaColuna(matriz, soma2);
        exibir(soma2);
        System.out.println();
        System.out.println("\nEXIBIR A SOMA TOTAL DAS LINHAS:\n-------------------------------");
        System.out.println(somaDaSoma(soma2));

        in.close();
    }
    public static void preencher(int[][] matriz) {
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();

            }
        }
    }
    public static void somaLinha(int[][]matriz, int[] soma) {
        for(int i = 0 ; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                soma[i] += matriz[i][j];
            }
        }
    }
    public static void somaColuna(int[][]matriz, int[] soma2) {
        for(int j = 0; j < 5; j++) {
            for(int i = 0 ; i < 4; i++) {
                soma2[j] += matriz[i][j];
            }
        }
    }
    public static int somaDaSoma(int[] soma) {
        int result = 0;
        for(int i = 0; i < soma.length; i++) {
            result += soma[i];
        }
        return result;
    }
    public static void exibir(int[] soma) {
        for(int i = 0 ; i < soma.length; i++) {
            System.out.print(soma[i] + " ");
        }
    }
}