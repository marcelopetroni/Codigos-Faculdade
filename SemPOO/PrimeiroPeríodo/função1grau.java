import java.util.Scanner;

public class função1grau {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double a, b, raiz;

        System.out.println("Qual é o coeficiente angular da função a ser calculada? (diferente de 0)");
        a = in.nextDouble();
    
        System.out.println("Qual é o coeficiente linear da função a ser calculada?");
        b = in.nextDouble();

        if(a != 0) {
        raiz = (-b)/a;
        System.out.println("O valor da raíz da função será " + raiz);
        }
        else {
            System.out.println("Por favor informe um valor diferente de 0 para o coeficiente angular.");
        }

        in.close();
    }
}