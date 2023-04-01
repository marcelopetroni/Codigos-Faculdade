import java.util.Scanner;
public class matrizPermutacao {
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
        if(verificar(matriz) == true) {
            System.out.println("Essa matriz é de permutação.");
        }
        else {
            System.out.println("Essa matriz não é de permutação.");
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
    public static  boolean verificar(int[][] matriz) {
        for(int i = 0 ; i < matriz.length; i++) {
            int cont = 0, cont2 = 0;
            for(int j = 0; j < matriz.length; j++) {
               if(matriz[i][j] == 1) {
                cont ++;
               }
               if(matriz[i][j] == 0) {
                cont2 ++;
               }
            }
            if(cont > 1) {
                return false;
            }
            if(cont2 != matriz.length - 1) {
                return false;
            }
        }
        for(int j = 0; j < matriz.length; j++) {
            int cont3 = 0;
            for(int i = 0 ; i < matriz.length; i++) {
                if(matriz[i][j] == 1) {
                    cont3 ++;
                }
            }
            if(cont3 > 1) {
                return false;
            }
        }
        return true;
    }    
}
