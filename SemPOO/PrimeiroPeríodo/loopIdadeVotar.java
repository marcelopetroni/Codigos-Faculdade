import java.util.Scanner;

public class loopIdadeVotar {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double i = 0;
        int idade = 0;

        while(i < 300) {
            System.out.println("Quantos anos a pessoa tem?");
            idade = in.nextInt();

            while(idade < 1 || idade > 120) {
                System.out.println("Idade inválida. Informe uma idade entre 1 e 120.");
                idade = in.nextInt();
            }

            if(idade >= 18 && idade <= 90) {
                System.out.println("Essa pessoa tem " + idade + " anos e pode votar.");
            }
            else {
                System.out.println("Essa pessoa tem " + idade + " anos e não pode votar.");
            }
            i = i + 1;
        }

        in.close();
    }
}