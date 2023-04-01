import java.util.Scanner;

public class valorCompra {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double total = 0, desconto = 0, codigo, quantidade;

        System.out.println("Qual é o código do produto que será comprado?");
        codigo = in.nextDouble();

        System.out.println("Qual é a quantidade desejada desse produto?");
        quantidade = in.nextDouble();

        if(codigo < 0){
            System.out.println("Código inválido para os produtoas disponíveis.");
        }
        else {
            if(codigo > 40){
                System.out.println("Código inválido para os produtoas disponíveis.");
            }
            else {
                if(codigo <= 10){
                    total = quantidade * 9.50;
                    System.out.println("O preço unitário do produto comprado é de R$9,50");
                    System.out.println("O valor total do produto será de R$" +  total);
                }
                else {
                    if(codigo <= 20){
                        total = quantidade * 13.25;
                        System.out.println("O preço unitário do produto comprado é de R$13,25");
                        System.out.println("O valor total do produto será de R$" +  total);
                    }
                    else{
                        if(codigo <= 30 ){
                            total = quantidade * 24.10;
                            System.out.println("O preço unitário do produto comprado é de R$24,10");
                            System.out.println("O valor total do produto será de R$" +  total);
                        }
                        else{
                            if(codigo <= 40){
                                total = quantidade * 37.75;
                                System.out.println("O preço unitário do produto comprado é de R$37,75");
                                System.out.println("O valor total do produto será de R$" +  total);
                            }
                        }
                    }
                }
            }
        }
    
        if(total < 1500){
            desconto = 0.025 * total;
            System.out.println("O desconto será de R$" +  desconto);
        }
        else {
            if(total < 3000){
                desconto = 0.05 * total;
                System.out.println("O desconto será de R$" +  desconto);
            }
            else {
                if(total > 3000){
                    desconto = 0.1 * total;
                    System.out.println("O desconto será de R$" +  desconto);
                }
                    }
                }
            total = total - desconto;
            System.out.println("O valor com desconto será de R$" +  total);
            
        in.close();
    }
}