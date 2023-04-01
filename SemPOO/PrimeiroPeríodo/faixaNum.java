import java.util.Scanner;

public class faixaNum{
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        
        System.out.println("Informe um número real entre 1-100.");
        num = in.nextDouble();

        if(num <= 100){
            if(num >= 1) {
                System.out.println("O valor está dentro da faixa permitida.");
            }
            else {
                System.out.println("O valor não está dentro da faixa permitida.");
            }
        }
        else {
            System.out.println("O valor não está dentro da faixa permitida.");
        }

        in.close();
        }
    }