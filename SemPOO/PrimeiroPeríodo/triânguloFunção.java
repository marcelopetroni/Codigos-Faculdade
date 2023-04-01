import java.util.Scanner;

public class triânguloFunção {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, resultado;
        boolean condicao;

        System.out.println("Informe 3 valores de um triângulo para determinar o seu tipo.");
        System.out.print("Digita o primeiro valor: ");
        a = in.nextDouble();

        while(a <= 0) {
            System.out.println("Valor incoerente. Informe um valor positivo.");
            a = in.nextDouble();
        }
        System.out.print("Digita o segundo valor: ");
        b = in.nextDouble();

        while(b <= 0) {
            System.out.println("Valor incoerente. Informe um valor positivo.");
            b = in.nextDouble();
        }
        System.out.print("Digita o terceiro valor: ");
        c = in.nextDouble();

        while(c < 0) {
            System.out.println("Valor incoerente. Informe um valor positivo.");
            c = in.nextDouble();
        }

        condicao = condicao(a, b, c);
        if(condicao) {
            resultado = tipoTriangulo(a, b, c);
            if(resultado == 1) {
                System.out.println("Os segmentos conferem um triângulo do tipo escaleno.");
            }
            else if(resultado == 2) {
                System.out.println("Os segmentos conferem um triângulo do tipo isósceles.");
            }
            else {
                System.out.println("Os segmentos conferem um triângulo do tipo equilátero.");
            }
        }
        else {
            System.out.println("Valores informados não formam um triângulo.");
        }

        in.close();
    }
    public static boolean condicao(double x, double y, double z) {
        if (x + y > z && x + z > y && y + z > x) {
			return true;
        }
        else {
            return false;
        }
    }
    public static double tipoTriangulo (double x, double y, double z) {
        if (x != y && x != z && z != y){
            return 1;
		}
        else if (x == y && x != z && y != z || z == x && z != y && x != y || z == y && z != x && y != x){
            return 2;
        }
        else {
            return 3;
        }
    }
}