import java.util.Scanner;
import java.text.DecimalFormat;

public class conversãoMoedas {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double quantia, dolar, libra, euro;
        System.out.println("Qual será a quantia convertida? ");
        quantia = in.nextDouble();

        dolar = quantia/5.01; // esse valor varia com a cotação do dolar no período
        libra = quantia/6.61; // esse valor varia com a cotação do libra no período
        euro = quantia/5.54; // esse valor varia com a cotação do euro no período
        
        System.out.println("Sua quantia em dolar será de: " + "R$" + new DecimalFormat("#,##0.00").format(dolar));
        System.out.println("Sua quantia em libra será de: " + "R$" + new DecimalFormat("#,##0.00").format(libra));
        System.out.println("Sua quantia em dolar será de: " + "R$" + new DecimalFormat("#,##0.00").format(euro));
        in.close();
    }
}