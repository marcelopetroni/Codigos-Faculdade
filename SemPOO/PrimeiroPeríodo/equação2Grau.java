import java.util.Scanner;

public class equação2Grau {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double a, b, c, delta, raiz, raiz2;

        System.out.println("Informe o valor do coeficiente a.");
        a = in.nextDouble();

        System.out.println("Informe o valor do coeficiente do b.");
        b = in.nextDouble();

        System.out.println("Informe o valor do coeficiente c.");
        c = in.nextDouble();

        delta = Math.pow(b,2) - (4 * a * c);

        if(delta < 0) {
            System.out.println("Não existe raíz real.");
        } else {
            if (delta == 0) {
            raiz = -b/(2 * a);
            System.out.println("A raíz da função será " + raiz);
            }
            else{
                raiz = (-b + Math.sqrt(delta))/(2 * a);
                raiz2 = (-b - Math.sqrt(delta))/(2 * a);
                System.out.println("As raízes x1 e x2 da função serão respectivamente " + raiz + " e " + raiz2);
            }
        }

        in.close();
    }
}