import java.util.Scanner;

public class tabuada1Num{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont, conta;

        System.out.println("Qual número você deseja ver a tabauada?");
        num = in.nextInt();
        System.out.println("A tabuada de " + num + " é:");

        for(cont = 1; cont <= 10; cont ++) {
            conta = num * cont;
            System.out.println(num + " * " + cont + " = " + conta);
        }

        in.close();
        }
}
