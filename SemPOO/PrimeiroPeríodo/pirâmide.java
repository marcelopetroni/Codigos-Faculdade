import java.util.Scanner;

public class pirâmide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont;

        System.out.println("Informe um número.");
        num = in.nextInt();
        
        for(cont = 0; num >= 1; num --) {
        for(cont = 1; cont <= num; cont ++) {
            System.out.print(cont + " ");
        }
        System.out.print("\n");
    }
        in.close();
        }
}
