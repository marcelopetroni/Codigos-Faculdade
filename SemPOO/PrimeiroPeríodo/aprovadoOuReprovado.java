import java.util.Scanner;

public class aprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double prova, prova2, media;

        System.out.println("Informe a primeira nota parcial do aluno.");
        prova = in.nextDouble();

        System.out.println("Informe a segunda nota parcial do aluno.");
        prova2 = in.nextDouble();

        media = (prova + prova2)/2;

        if(media >= 0 && media <= 10){
            if(media >= 7) {
                System.out.println("O aluno obteve média " + media + " e está aprovado.");
            } else {
                if (media < 7 && media >= 3 ) {
                System.out.println("O aluno obteve média " + media + " e fará a prova final para recuperar a nota.");
                }
                else{
                    System.out.println("O aluno obteve média " + media + " e está reprovado.");
                }
            }
        }
        else {
            System.out.println("Valores inválidos para avaliações de 0-10.");
        }
        in.close();
    }
}