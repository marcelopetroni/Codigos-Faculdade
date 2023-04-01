import java.util.Scanner;

public class saldoFunção {
    public static double saldoExtra(double bonus, double saldo) {
        if(saldo <= 200) {
            bonus = saldo * 0.1;
        }
        else if(saldo <= 300 ) {
            bonus = saldo * 0.2;
        }
        else if(saldo <= 400) {
            bonus = saldo * 0.25;
        }
        else if(saldo > 400) {
            bonus = saldo * 0.3;
        }
        return bonus;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = 1, y;
        char z, resp;

        do {
        System.out.print("Qual é seu saldo? ");
        y = in.nextDouble();

        if(y <= 0 ) {
            System.out.println("Pela falta de saldo, você não está classificado para receber o benefício.");
        }
        else {
            System.out.print("Para um saldo médio igual a R$" + y);
            System.out.println(", será dado um crédito de R$" + saldoExtra(x, y) + ".");
        }
        System.out.println("\nVocê deseja continuar?\n['S'] para sim.\n['N'] para não."); 
        z = in.next().charAt(0);
        resp = Character.toUpperCase(z);

        while(resp != 'S' && resp != 'N') {
            System.out.println("Valor inválido. Informe:\n['S'] para sim.\n['N'] para não.");
            z = in.next().charAt(0);
            resp = Character.toUpperCase(z);
        }

    } while(resp == 'S');

    in.close();
    }
}