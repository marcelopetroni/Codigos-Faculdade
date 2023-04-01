import java.util.Scanner;

public class funçãoFatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x, resp;
        int condicao, num;
        double num2;

        do {
        System.out.print("O que você deseja utilizar?\n['1'] para fatorial.\n['2'] para potência.\n");
        condicao = in.nextInt();

        while(condicao != 1 && condicao != 2) {
            System.out.println("Valor inválido. Informe:\n['1'] para fatorial.\n['2'] para potência.");
            condicao = in.nextInt();
        }

        if(condicao == 1) {
            System.out.println("Informe um número inteiro para determinar seu fatorial.");
            num = in.nextInt();

            while(num < 0) {
                System.out.println("Valor inválido. Informe um número positivo a partir de 0.");
                num = in.nextInt();
            }

            System.out.println("O fatorial de " + num + " é igual a " + fatorial(num) + ".");
        }
        else {
            System.out.print("Informe um número real: ");
            num2 = in.nextInt();

            System.out.print("Informe um número inteiro que será a potência: ");
            num = in.nextInt();

            while(num < 0) {
                System.out.println("Valor inválido. Informe um número positivo a partir de 0.");
                num = in.nextInt();
            }

            System.out.println(num2 + " elevado a " + num + " é igual a " + potencia(num2, num) + ".");
        }
        System.out.println("\nVocê deseja continuar?\n['S'] para sim.\n['N'] para não."); 
        x = in.next().charAt(0);
        resp = Character.toUpperCase(x);

        while(resp != 'S' && resp != 'N') {
            System.out.println("Valor inválido. Informe:\n['S'] para sim.\n['N'] para não.");
            x = in.next().charAt(0);
            resp = Character.toUpperCase(x);
        }

        } while(resp == 'S');
        in.close();
    }

    public static int fatorial(int x) {
        int i, sum = x;
        if(x == 0) {
            x = 1;
            return x;
        }
        else {
            for(i = 1; i < x ; i++) {
                sum = sum * (x - i);    
            }
            return sum;
        }
    }
    public static double potencia(double x, int y) {
        int i;
        double sum = x;
        if(y == 0) {
            x = 1;
            return x;
        }
        else if(y == 1) {
            x = x * 1;
            return x;
        }
        else {
            for(i = 1; i < y; i++) {
                sum = sum * x;
            }
            return sum;
        }
    }
}