import java.util.Scanner;

public class FunçãoFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;

        System.out.println("Informe até que número deseja exibir a sequência de Fibonacci:");
        n = in.nextInt();

        while(n < 1) {
            System.out.println("Valor inválido. Informe um valor a partir de 1: ");
            n = in.nextInt();
        }
        conta(n);

        in.close();
    }
    public static void conta(int n) {
        int x = 1, y = 0;
        while(x < n || y < n) {
            x = x + y;
            y = y + x;

            if(x > n || y > n) {
                break;
            }
            else {
                System.out.println(x);
                System.out.println(y);
            }
        }
    }
}