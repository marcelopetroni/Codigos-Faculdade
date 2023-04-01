import java.util.Scanner;

public class loopNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double prova, prova2, media, media2, percentual, soma = 0;
        int contador = 1, aprovado = 0, reprovado = 0, recuperacao = 0;

        while(contador != 31) {
        System.out.println("Informe a primeira nota parcial do " + contador + "° aluno.");
        prova = in.nextDouble();

        System.out.println("Informe a segunda nota parcial do " + contador + "° aluno.");
        prova2 = in.nextDouble();


        while (prova < 0 || prova > 10 || prova2 < 0 || prova2 > 10) {
            System.out.println("Valores inválidos. Por favor escreva valores entre 0 e 10.");
            System.out.println("Reinforme a primeira nota parcial do " + contador + "° aluno.");
            prova = in.nextDouble();
            System.out.println("Reinforme a segunda nota parcial do " + contador + "° aluno.");
            prova2 = in.nextDouble();
        }
    
        media = (prova + prova2)/2;
        soma = soma + media;
            if(media >= 7) {
                System.out.println("O aluno obteve média " + media + " e está aprovado.");
                aprovado = aprovado + 1;
            } else {
                if (media < 7 && media >= 3 ) {
                    System.out.println("O aluno obteve média " + media + " e fará a prova final para recuperar a nota.");
                    recuperacao = recuperacao + 1;
                }
                else{
                    System.out.println("O aluno obteve média " + media + " e está reprovado.");
                    reprovado = reprovado + 1;
                }
            }
            contador = contador + 1;
        }
        System.out.println("A instituição de ensino teve " + aprovado + " alunos aprovados por média.");
        System.out.println("A instituição de ensino teve " + recuperacao + " alunos em recuperação.");
        System.out.println("A instituição de ensino teve " + reprovado + " alunos reprovados por média.");

        media2 = soma/30;
        percentual = ((double)aprovado/30) * 100;
        System.out.print("\nO percentual de alunos aprovados foi de " + percentual + "%");
        percentual = ((double)recuperacao/30) * 100;
        System.out.println("\nO percentual de alunos em recuperação foi de " + percentual + "%");
        percentual = ((double)reprovado/30) * 100;
        System.out.println("O percentual de alunos reprovados foi de " + percentual + "%");

        System.out.println("\nA média geral da turma foi de " + media2);

        in.close();
    }
}