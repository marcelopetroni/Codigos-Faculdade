import java.util.Scanner;

public class condiçãoTriângulo {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, z;

        System.out.println("Informe três valores para verificar se é possível formar um triângulo.");
        System.out.print("Primeiro valor: ");
        x = in.nextDouble();
        System.out.print("Segundo valor: ");
        y = in.nextDouble();
        System.out.print("Terceiro valor: ");
        z = in.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
			System.out.print("Os valores formam um triângulo.");
        }
        else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        in.close();
        }
    }