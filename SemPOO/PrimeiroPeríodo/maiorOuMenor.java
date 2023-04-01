import java.util.Scanner;

public class maiorOuMenor {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x, y;

        System.out.println("Informe um número inteiro.");
        x = in.nextInt();

        System.out.println("Informe outro número inteiro.");
        y = in.nextInt();

        if(x > y) {
            System.out.println(x + " é maior que " + y);
        } else {
        if(x < y) {
            System.out.println(y + " é maior que " + x);
        }
         else {
        System.out.println("Os números são iguais, não existe um maior que o outro.");
        }
    }
        in.close();
    }
}