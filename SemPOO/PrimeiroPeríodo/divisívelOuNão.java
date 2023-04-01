import java.util.Scanner;

public class divisívelOuNão {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m, n;

        System.out.println("Informe um número inteiro para ser dividido.");
        m = in.nextInt();

        System.out.println("Informe outro valor inteiro que irá dividir o primeiro.");
        n = in.nextInt();

        if(m % n == 0) {
            System.out.println(m + " é divisível por " + n);
        }
        else {
            System.out.println(m + " não é divisível por " + n);
        }

        in.close();
    }
}