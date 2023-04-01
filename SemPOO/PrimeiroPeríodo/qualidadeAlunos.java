import java.util.Scanner;

public class qualidadeAlunos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota, nota2;
        
        for(int i = 0; i < 60; i++) {
            System.out.print("Informe a primeira nota do aluno: ");
            nota = in.nextDouble();

            while(nota < 0 || nota > 10) {
                System.out.print("Valor inválido. Informe uma nota entre 0 e 10: ");
                nota = in.nextDouble();
            }

            System.out.print("Informe a segunda nota do aluno: ");
            nota2 = in.nextDouble();

            while(nota2 < 0 || nota2 > 10) {
                System.out.print("Valor inválido. Informe uma nota entre 0 e 10: ");
                nota2 = in.nextDouble();
            }
            media(nota, nota2);
        }

        in.close();
    }
    public static void media(double nota, double nota2) {
        double media;
        char x;

        media = (nota + nota2)/2;
        x = conceito(media);
        System.out.println("O(a) aluno(a) obteve uma média " + media + " e se classifica no conceito " + x + ".");
    }
    public static char conceito(double media) {
        if(media >= 0 && media < 5) {
            return 'D';
        }
        else if(media >= 5 && media < 7) {
            return 'C';
        }
        if(media >= 7 && media < 9) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}