import java.util.Scanner;
public class quadradoMagico {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int ordem = in.nextInt();
        int [][] matriz = new int[ordem][ordem];

        System.out.println("PREENCHER A MATRIZ\n-------------------------------");
        preencher(matriz);

        System.out.println();
        System.out.println("EXIBIR A MATRIZ\n-------------------------------");
        exibir(matriz);
        if(verificar(matriz) == 1) {
            System.out.println("Essa matriz é quadrado mágico.");
        }
        else {
            System.out.println("Essa matriz não é quadrado mágico.");
        }

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
    public static void exibir(int[][] matriz) {
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int verificar(int[][]matriz) {
        int[] soma = new int[matriz.length];
        int[] soma2 = new int[matriz.length];
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                soma[i] += matriz[i][j];
            }
        }
        for(int j = 0; j < matriz.length; j++) {
            for(int i = 0 ; i < matriz.length; i++) {
                soma2[j] += matriz[i][j];
            }
        }
        for(int x = 0; x < matriz.length; x++) {
            if(soma[x] != soma2[x]) {
                return 0;
            }
        }
        return 1;
    }
}
