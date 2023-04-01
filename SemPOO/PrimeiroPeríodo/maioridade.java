import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int idade;

        System.out.println("Quantos anos você tem?");
        idade = in.nextInt();

        if(idade < 18) {
            System.out.println("Esta pessoa tem " + idade + " anos e não é maior de idade.");
        }
        else { 
        if(idade > 18 && idade < 120){
            System.out.println("Esta pessoa tem " + idade + " anos e é maior de idade.");
        }
        else {
            System.out.println("Idade inválida");
        }
    }
        in.close();
    }
}