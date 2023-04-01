import java.util.Scanner;

public class cubosNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num, conta;

        System.out.println("Os cubos dos números de 15 a 25 são:");
        for(num = 15; num <= 25; num ++) {
            conta = Math.pow(num, 3);
            System.out.println(conta);
        }

        in.close();
    }
}
