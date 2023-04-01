import java.util.Scanner;

public class somaNInteiros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, quant, cont, conta = 0;

        System.out.println("Quantos números deseja informar?");
        quant = in.nextInt();

        while(quant < 1) {
            System.out.println("Valor inválido. Informe um valor positivo.");
            quant = in.nextInt();
        }

        for(cont = 1; cont <= quant; cont ++) {
            System.out.println("Informe o " + cont + "° número inteiro para somá-lo.");
            num = in.nextInt();
            conta = conta + num;
        }
        System.out.println("A soma dos " + quant + " números inteiros informados é " + conta + ".");

        in.close();
    }
}
