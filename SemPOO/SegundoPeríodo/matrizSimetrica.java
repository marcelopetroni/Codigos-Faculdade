import java.util.Scanner;
public class matrizSimetrica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int ordem = in.nextInt();

        int [][] matriz = new int[ordem][ordem];

        System.out.println("PREENCHER A MATRIZ\n-------------------------------");
        preencher(matriz);
        System.out.println();
        System.out.println("É UMA MATRIZ SIMÉTRICA?\n-------------------------------");
        boolean resp = validar(matriz);
        if(resp == true) {
            System.out.println("A matriz informada é simétrica.");
        }
        else {
            System.out.println("A matriz informada não é simétrica.");
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
    public static boolean validar(int[][] matriz) {
        for(int i = 0 ; i < matriz.length; i++) {
            for(int j = 1; j < matriz.length; j++) {
                if(matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}