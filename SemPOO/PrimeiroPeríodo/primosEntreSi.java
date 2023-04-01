// IGNORAR, NÃO ENTENDI LÓGICA

import java.util.Scanner;

public class primosEntreSi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, num2, x = 1;
        char resp;
        do {
            System.out.print("Informe o primeiro número: ");
            num = in.nextInt();

            while(num < 1) {
                System.out.println("Valor inválido. Informe um valor a partir de 1.");
                num = in.nextInt();
            }

            System.out.print("Informe o segundo número: ");
            num2 = in.nextInt();

            while(num2 < 1) {
                System.out.println("Valor inválido. Informe um valor a partir de 1.");
                num2 = in.nextInt();
            }

            primos(num, num2, x);
            System.out.println("\nDeseja continuar?\n['S'] para sim.\n['N'] para não.");
            resp = in.next().charAt(0);
            resp = Character.toUpperCase(resp);

            while(resp != 'S' && resp != 'N') {
                System.out.println("Valor inválido. Informe:\n['S'] para sim.\n['N'] para não.");
                resp = in.next().charAt(0);
                resp = Character.toUpperCase(resp);
            }

        } while(resp == 'S');

        in.close();
    }

    public static void primos(int num, int num2, int conta) {
        int i, maior;
        if(num > num2) {
            maior = num;
        }
        else {
            maior = num2;
        }
        for(i = 2; i < maior; i++) {
            if(num % i == 0 && num2 % i == 0) {
                conta = 1;
            }
            else {
                conta = 2;
            }
        }
        if(conta == 1) {
            System.out.println(num + " e " + num2 + " não são primos entre si.");
        }
        else {
            System.out.println(num + " e " + num2 + " são primos entre si.");
        }
    }
}