import java.util.Scanner;

public class contaJuros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double vConta, vMulta, pJuros, totalMulta, totalJuros, totalAPagar;
        int nDias;
        System.out.print ("Qual é o valor da conta? ");
         vConta = entrada.nextDouble();
        System.out.print ("Quantos dias de atraso? ");
         nDias = entrada.nextInt();
        System.out.print ("Qual é o valor da multa? ");
         vMulta = entrada.nextDouble();
        System.out.print ("Qual é a porcentagem de juros? ");
         pJuros = entrada.nextDouble();
        totalMulta = vMulta * nDias;
        totalJuros = pJuros / 100 * vConta * nDias;
        totalAPagar = vConta + totalJuros + totalMulta;
        System.out.println ("O valor da multa será: " + totalMulta + " reias");
        System.out.println ("O valor dos juros será: " + totalJuros + " reais");
        System.out.println ("O valor total a pagar será: " + totalAPagar + " reais");
        entrada.close();
 
    }
}

