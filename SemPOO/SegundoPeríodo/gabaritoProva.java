import java.util.Scanner;
public class gabaritoProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] gabarito = new char[100];
        char[][] respostas = new char[50][100];
        String [] nomes = new String[50];
        int [] acertos = new int[50];

        System.out.println("PREENCHER GABARITO\n-------------------------------");
        preencherGabarito(gabarito);

        System.out.println("\nPREENCHER DADOS ALUNOS\n-------------------------------");
        preencherDados(nomes, respostas);

        System.out.println("EXIBIR APROVADOS\n-------------------------------");
        conta(gabarito, respostas, acertos);
        exibir(nomes, acertos);

        in.close();
    }
    public static void preencherGabarito(char[] gabarito) {
        Scanner in = new Scanner(System.in);
        int z = 1;
        for(int i = 0 ; i < gabarito.length; i++) {
            System.out.print(z + "º questão: ");
            gabarito[i] = in.next().charAt(0);

            while(gabarito[i] != 'a' && gabarito[i] != 'b' 
                && gabarito[i] != 'c' && gabarito[i] != 'd' && gabarito[i] != 'e') {

                    System.out.print("Valor inválido. Informe uma alternativa entre a - e: ");
                    gabarito[i] = in.next().charAt(0);
            }
            z++;
        }
    }
    public static void preencherDados(String[] nomes, char[][] respostas) {
        Scanner in = new Scanner(System.in);
        int z = 1;
        for(int i = 0 ; i < nomes.length; i++) {
            System.out.println("(" + z + "º aluno)");
            System.out.print("nome: ");
            nomes[i] = in.nextLine();

            for(int j = 0; j < 100; j++) {
                System.out.print(j + 1 + "º questão: ");
                respostas[i][j] = in.next().charAt(0);

                while(respostas[i][j] != 'a' && respostas[i][j] != 'b' 
                && respostas[i][j] != 'c' && respostas[i][j] != 'd' && respostas[i][j] != 'e') {

                    System.out.print("Valor inválido. Informe uma alternativa entre a - e: ");
                    respostas[i][j] = in.next().charAt(0);
                }
                in.nextLine();
            }
            System.out.println();
            z ++;
        }
    }
    public static void conta(char[] gabarito, char[][] respostas, int[] acertos) {
        for(int i = 0 ; i < 50; i++) {
            for(int j = 0; j < 100; j++) {
                if(respostas[i][j] == gabarito[j]) {
                    acertos[i] ++;
                }
            }
        }
    }
    public static void exibir(String [] nomes, int[] acertos) {
        for(int i = 0 ; i < nomes.length; i++) {
            if(acertos[i] >= 70) {
                System.out.println("O(a) aluno(a) " + nomes[i] + " obteve " + acertos[i] + " acertos e está aprovado(a).");
            }
        }
    }
}
