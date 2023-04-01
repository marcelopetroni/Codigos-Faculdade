import java.util.Scanner;

public class tabuadaToda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont, conta;

        System.out.println("A tabuada de 1 a 10 é:");

        for(num = 1; num <= 10; num++) {
        for(cont = 1; cont <= 10; cont ++) {
            conta = num * cont;
            System.out.println(num + " * " + cont + " = " + conta);
            }
            System.out.print("\n");
        }

        in.close();
    }
}
