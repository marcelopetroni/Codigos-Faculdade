import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont, conta = 1;

        System.out.println("Informe um número inteiro para determinar seu fatorial.");
        num = in.nextInt();

        System.out.print("O fatorial de " + num + " é ");
        for(cont = 1; cont <= num; cont ++) {
            conta = conta * cont;
        }
        if(num < 0) {
            System.out.print("inexistente.");
        }
        else if (conta == 1 || conta == 0) {
            System.out.print("1.");
        }
        else {
            System.out.print(conta + ".");
        }

        in.close();
    }
}
