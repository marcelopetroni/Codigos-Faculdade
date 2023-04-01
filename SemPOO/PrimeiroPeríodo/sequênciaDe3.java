import java.util.Scanner;

public class sequênciaDe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1, cont;

        System.out.println("Os números da sequência são:");
        for(cont = 0 ; cont < 25; cont ++) {
            System.out.println(num);
            num = num + 3;
        }

        in.close();
    }
}
