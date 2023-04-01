import java.util.Scanner;
public class revisaoParImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = in.nextInt();

        if(num % 2 == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.print("O número é ímpar");
        }
        in.close();
    }
}