import java.util.Scanner;

public class votarOuNão {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int idade;

        System.out.println("Quantos anos a pessoa tem?");
        idade = in.nextInt();

        if(idade > 0 && idade < 125){
            if(idade >= 16) {
                System.out.println("Esta pessoa tem " + idade  + " anos e pode votar.");
        }
            else {
                System.out.println("Esta pessoa tem " + idade  + " anos e não pode votar.");
        }
    } else {
        System.out.println("Idade inválida.");
    }
        in.close();
    }
}