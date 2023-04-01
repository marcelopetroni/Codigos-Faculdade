import java.util.Scanner;
public class nomesNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] media = new double[30];
        String [] nome = new String[30];
        String [] result = new String[30];
        int resp;

        System.out.println("PREENCHIMENTO DE DADOS DOS ALUNOS");
        System.out.println("----------------------------------------");
        preencherVetor(media, nome, result);
        do {
        System.out.println("MENU");
        System.out.println("----------------------------------------");
        System.out.println("O que você deseja realizar a seguir? ");
        System.out.println("1 - para exibir dados de um aluno a ser informado.");
        System.out.println("0 - Finalizar o Programa.");
        resp = in.nextInt();
        
        while(resp != 1 && resp != 0) {
            System.out.print("Resposta inválida. Informe 1 para exibir ou 0 para finalizar: ");
            resp = in.nextInt();
        }

        if(resp == 1) {
            System.out.print("Informe o nome do aluno que deseja acessar os dados: ");
            in.nextLine();
            String aluno = in.nextLine();

            int procura = busca(nome, aluno);
            if(procura == -1) {
               System.out.println("Nome não encontrado.");
            }
            else {
               resultado(procura, media, nome, result);
            }
        }

        } while(resp != 0);
        in.close();
    }

    public static void preencherVetor(double[] media, String[] nome, String result[]) {
        double nota = 0, nota2 = 0;
        Scanner in = new Scanner(System.in);
        int z = 1;
        boolean tudoOk = false;
        for(int i = 0; i < nome.length; i++) {
            System.out.print("Informe o nome do " + z + "ª aluno: ");
            nome[i] = in.nextLine();

            while(tudoOk == false) {
                for(int c = 0; c < nome[i].length(); c++) {
                    char posicao = nome[i].charAt(c);
                    if(Character.isLetter(posicao) || Character.isSpaceChar(posicao)) {
                        tudoOk = true;
                    }
                    else {
                        System.out.print("Nome Inválido. Informe um nome com apenas letras: ");
                        nome[i] = in.nextLine();
                        tudoOk = false;
                        break;
                    }
                }
            }

            System.out.print("Informe a primeira nota do aluno: ");
            nota = in.nextDouble();
            in.nextLine();

            while(nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Informe uma nota entre 0 e 10.");
                System.out.print("Informe a primeira nota do aluno: ");
                nota = in.nextDouble();
            }
            System.out.print("Informe a segunda nota do aluno: ");
            nota2 = in.nextDouble();
            in.nextLine();
            System.out.println();

            while(nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida. Informe uma nota entre 0 e 10.");
                System.out.print("Informe a segunda nota do aluno: ");
                nota2 = in.nextDouble();
                System.out.println();
            }
            z ++;
            media[i] = (nota * 2 + nota2 * 3)/5;
            if(media[i] <= 10) {
                if(media[i] >= 7) {
                    result[i] = "aprovado(a).";
                }
                else if(media[i]>= 3) {
                    result[i] = "em recuperação.";
                }
                else {
                    result[i] = "reprovado(a).";
                }
            }
        }
    }
    public static void resultado(int pos, double[] media, String[] nome, String result[]) {
        System.out.println("O aluno(a) " + nome[pos] + " obteve média " + media[pos] + " e está " + result[pos]);
    }
    public static int busca(String[] nome, String aluno) {
        int i;
        boolean achou = false;
        for(i = 0; i < nome.length; i++) {
            if(nome[i].compareToIgnoreCase(aluno)== 0) {
                achou = true;
                break;
            }
        }
        if(achou == false) {
            return -1;
        }
        else {
            return i;
        }
    }
}
