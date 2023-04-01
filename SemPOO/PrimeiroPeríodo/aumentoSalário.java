import java.util.Scanner;

public class  aumentoSalário {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double salario, bonus;

        System.out.println("Qual é o salário atual do jogador?");
        salario = in.nextDouble();

        if(salario <= 1900) {
            bonus = salario * 0.2;
            salario = salario * 1.2;
            System.out.println("O jogador terá aumento de R$" + bonus + " e passará a receber R$" + salario + ".");
        }
        else {
            if(salario > 1900 && salario <= 3300) {
                bonus = salario * 0.15;
                salario = salario * 1.15;
                System.out.println("O jogador terá aumento de R$" + bonus + " e passará a receber R$" + salario + ".");
            }
            else {
                if(salario > 3300 && salario <= 5800){
                    bonus = salario * 0.15;
                    salario = salario * 1.1;
                    System.out.println("O jogador terá aumento de R$" + bonus + " e passará a receber R$" + salario + ".");
                }
                else{
                    if(salario > 5800){
                        bonus = salario * 0.05;
                        salario = salario * 1.05;
                        System.out.println("O jogador terá aumento de R$" + bonus + " e passará a receber R$" + salario + ".");
                    }
                }
            }
        }
        
        in.close();
    }
}