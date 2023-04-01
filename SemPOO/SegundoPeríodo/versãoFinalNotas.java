import java.util.Scanner;
public class versãoFinalNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] nota = new double[50];
        double [] nota2 = new double[50];
        double [] media = new double[50];
        String [] nome = new String[50];
        String [] result = new String[50];

        System.out.println("Informe a seguir.");
        preencherVetor(nota, nota2, media, nome, result);
        resultado(media, nome, result);
        double media2 = mediaTurma(media);
        System.out.println("Média da turma: " + media2);
        System.out.println(abaixoDaMedia(media, media2) + "% abaixo da média da turma.");
        System.out.print(acimaDaMedia(media, media2) + " foi a maior média da turma.");
        in.close();
    }

    public static void preencherVetor(double[] nota, double[] nota2, double[] media, String[] nome, String[] result) {
        Scanner in = new Scanner(System.in);
        int z = 1;
        for(int i = 0; i < nota.length; i++) {
            System.out.print("Informe o nome do " + z + "ª aluno: ");
            nome[i] = in.next();

            System.out.print("Informe a primeira nota do aluno: ");
            nota[i] = in.nextDouble();

            while(nota[i] < 0 || nota[i] > 10) {
                System.out.println("Nota inválida. Informe uma nota entre 0 e 10.");
                System.out.print("Informe a primeira nota do aluno: ");
                nota[i] = in.nextDouble();
            }
            System.out.print("Informe a segunda nota do aluno: ");
            nota2[i] = in.nextDouble();
            System.out.println("");

            while(nota2[i] < 0 || nota2[i] > 10) {
                System.out.println("Nota inválida. Informe uma nota entre 0 e 10.");
                System.out.print("Informe a segunda nota do aluno: ");
                nota2[i] = in.nextDouble();
                System.out.println("");
            }
            z ++;
            media[i] = (nota[i] * 2 + nota2[i] * 3)/5;
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
    public static void resultado(double[] media, String[] nome, String[] result) {
        for(int i = 0; i < result.length; i++) {
            System.out.println("O aluno(a) " + nome[i] + " obteve média " + media[i] + " e está " + result[i]);
        }
    }
    public static double mediaTurma(double[]media) {
        double soma = 0;
        for(int i = 0; i < media.length; i++) {
            soma += media[i];
        }
        return soma/media.length;
    }
    public static double abaixoDaMedia(double[] media, double mediaTurma) {
        double percentual;
        double cont = 0;
        double cont2 = 0;
        for(int i = 0; i < media.length; i++) {
            cont ++;
            if(media[i] < mediaTurma) {
                cont2 ++;
            }
        }
        percentual = (cont2/cont) * 100;
        return percentual;
    }
    public static double acimaDaMedia(double[] media, double mediaTurma) {
        double maior = Double.MIN_VALUE;
        for(int i = 0 ; i < media.length; i++) {
            if(media[i] > maior) {
                maior = media[i];
            }
        }
        return maior;
    }
}
