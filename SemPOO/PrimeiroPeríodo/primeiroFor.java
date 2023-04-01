import java.util.Scanner;

public class primeiroFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Os números que quando divididos por 9 tem resto 4:");
        for(num = 1; num < 500; num ++) {
            if(num % 9 == 4) {
                System.out.println(num);
            }
        }

        in.close();
    }
}
