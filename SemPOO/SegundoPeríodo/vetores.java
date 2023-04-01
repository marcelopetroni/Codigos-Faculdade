import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, x = 1;

        System.out.println("Quantos números deseja informar?");
        n = in.nextInt();

        int vetor[] = new int[n];

        for(i = 0; i < n; i++) {
            System.out.print("Informe o " + x + "° número: ");
            vetor[i] = in.nextInt();
            x ++;
        }

        System.out.println("Números digitados:");
        for(i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
        in.close();
    }
}