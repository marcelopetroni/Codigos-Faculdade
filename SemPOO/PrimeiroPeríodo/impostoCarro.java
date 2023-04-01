import java.util.Scanner;

public class impostoCarro {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double valorCarro, imposto;
        int anoFabricacao, ano;

        System.out.println("Quanto custa o novo carro?");
        valorCarro = in.nextDouble();

        System.out.println("Em que ano ele foi fabricado?");
        anoFabricacao = in.nextInt();

        System.out.println("Qual é o ano atual?");
        ano = in.nextInt();

        if(anoFabricacao < 2000) {
            imposto = 0.01 * valorCarro;
            System.out.println("O valor do imposto sobre o carro será de R$" + imposto);
        } else {
            if(anoFabricacao >= 2000 && anoFabricacao <= ano){
                imposto = 0.015 * valorCarro;
            System.out.println("O valor do imposto sobre o carro será de R$" + imposto);
            }
            else {
                System.out.println("O ano de fabricação informardo é inválido.");
            }
        }

        in.close();
    }
}