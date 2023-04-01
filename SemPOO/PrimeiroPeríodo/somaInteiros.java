import java.util.Scanner;

public class somaInteiros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont, conta = 0;

        System.out.println("Escolha um número inteiro");
        num = in.nextInt();

        while(num < 1) {
            System.out.println("Valor inválido. Informe um valor positivo.");
            num = in.nextInt();
        }

        for(cont = 1; cont <= num; cont ++) {
            conta = conta + cont;
        }
        System.out.println("A soma dos " + num + " primeiros números inteiros é " + conta + ".");
        
        in.close();
        }
}
