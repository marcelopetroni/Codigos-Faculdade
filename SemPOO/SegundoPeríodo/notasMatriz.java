import java.util.Scanner;
public class notasMatriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][] matriz = new double[20][3];
        String [] nomes = new String[20];
  
        System.out.println("PREENCHER A MATRIZ DE NOTAS\n-------------------------------");
        preencher(matriz, nomes);
        System.out.println("MÉDIA ALUNOS: \n-------------------------------");
        conta(matriz);
        exibir(matriz, nomes);

        in.close();
    }
    public static void preencher(double[][] matriz, String[] nome) {
        Scanner in = new Scanner(System.in);
        int z = 1;
        for(int i = 0 ; i < matriz.length; i++) {
            System.out.println("(" + z + "º aluno)");
            System.out.print("Informe o nome do(a) aluno(a): ");
            nome[i] = in.nextLine();
            for(int j = 0; j < 2; j++) {
                System.out.print(j + 1 + "º nota: ");
                matriz[i][j] = in.nextDouble();

                while(matriz[i][j] < 0 || matriz[i][j] > 10) {
                    System.out.print("Valor inválido. Informe uma nota no intervalo de 0 - 10: ");
                    matriz[i][j] = in.nextDouble();
                }
                in.nextLine();
            }
            System.out.println();
            z ++;
        }
    }
    public static void conta(double[][] matriz) {
        for(int i = 0 ; i < matriz.length; i++) {
            matriz[i][2] = (matriz[i][0] * 2 + matriz[i][1] * 3)/ 5;
        }
    }
    public static void exibir(double[][] matriz, String[] nomes) {
        for(int i = 0 ; i < matriz.length; i++) {
            System.out.println("O(a) aluno(a) " + nomes[i] + " obteve média " + matriz[i][2] + ".");
        }
    }
}