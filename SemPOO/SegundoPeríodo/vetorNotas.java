import java.util.Scanner;
public class vetorNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] nota = new double[3];
        double [] nota2 = new double[3];
        double [] media = new double[3];
        String [] nome = new String[3];
        boolean [] result = new boolean[3];

        System.out.println("Informe os dados:");
        for(int i = 0; i < nota.length; i ++) {
            int a = 1;
            System.out.print("Nome aluno: ");
            nome[i] = in.next();

            System.out.print(a + "° nota: ");
            nota[i] = in.nextDouble();

            while(nota[i] < 0 || nota[i] > 10) {
                System.out.println("Nota inválida. Informe novamente.");
                System.out.print(a + "° nota: ");
                nota[i] = in.nextDouble();
            }
            a ++;
            System.out.print(a + "° nota: ");
            nota2[i] = in.nextDouble();

            while(nota2[i] < 0 || nota2[i] > 10) {
                System.out.println("Nota inválida. Informe novamente.");
                System.out.print(a + "° nota: ");
                nota2[i] = in.nextDouble();
            }
            media[i] = (nota[i] * 2 + nota2[i] * 3)/5;
            result[i] = resultado(media[i]);
            System.out.print("\n");
        }
        System.out.println("ALUNOS APROVADOS:");
        for(int i = 0; i < nota.length; i ++) {
            if(result[i] == true) {
                System.out.println("Aluno: " + nome[i] + "\nMédia: " + media[i]);
                System.out.println("_____________________________________");
            }
        }
        System.out.println("ALUNOS REPROVADOS:");
        for(int i = 0; i < nota.length; i ++) {
            if(result[i] == false) {
                System.out.println("Aluno: " + nome[i] + "\nMédia: " + media[i]);
                System.out.println("_____________________________________");
            }
        }
        in.close();
    }
    public static boolean resultado(double media) {
        if(media >= 7) {
            return true;
        }
        else {
            return false;
        }
    }
}
