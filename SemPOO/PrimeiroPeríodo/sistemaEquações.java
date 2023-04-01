import java.util.Scanner;

public class sistemaEquações {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, a, b, c, d, e, f;
        System.out.println("Qual é o valor do coeficiente a?");
        a = in.nextDouble();
        
        System.out.println("Qual é o valor do coeficiente b?");
        b = in.nextDouble();
        
        System.out.println("Qual é o valor do coeficiente c?");
        c = in.nextDouble();
        
        System.out.println("Qual é o valor do coeficiente d?");
        d = in.nextDouble();
        
        System.out.println("Qual é o valor do coeficiente e?");
        e = in.nextDouble();
        
        System.out.println("Qual é o valor do coeficiente f?");
        f = in.nextDouble();

        x = (c * e - b * f)/(a * e - b * d);
        y = (a * f - c * d)/(a * e - b * d);

        System.out.println("O valor de X é: " + x);
        System.out.println("O valor de Y é: " + y);
        
        in.close();
    }
}