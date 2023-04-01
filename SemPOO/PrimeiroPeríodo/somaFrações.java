import java.util.Scanner;

public class somaFrações {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num, cont, conta = 1;

        System.out.println("Escolha um número inteiro.");
        num = in.nextInt();

        while(num < 1) {
            System.out.println("Valor inválido. Informe um valor positivo.");
            num = in.nextInt();
        }

        for(cont = 2; cont <= num; cont ++) {
            conta = conta + (1/cont);
        }
        System.out.println("A soma das " + num + " primeiras frações é " + conta + ".");
        
        in.close();
        }
}
