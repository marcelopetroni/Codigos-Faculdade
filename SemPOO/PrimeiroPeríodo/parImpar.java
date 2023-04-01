import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int inteiro;

        System.out.println("Informe um inteiro.");
        inteiro = in.nextInt();

        if(inteiro % 2 == 0){
            System.out.println("Esse número é par.");
        }
        else {
            System.out.println("Esse número é ímpar.");
        }

        in.close();
    }
}