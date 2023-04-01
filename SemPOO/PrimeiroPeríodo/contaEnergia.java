import java.util.Scanner;

public class contaEnergia {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double consumo, conta;

        System.out.println("Quanto você consome de energia por mês?");
        consumo = in.nextDouble();

        if(consumo >= 10) {
            conta = consumo * 1.40;
        }
        else {
            conta = 10.5;
        }
        System.out.println("A conta de luz será de R$" + conta);
        
        in.close();
    }
}