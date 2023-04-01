import java.util.Scanner;

public class maiorNum {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, z;

        System.out.println("Informe 3 números reais diferentes para verificar o maior deles.");
        System.out.print("Primeiro valor: ");
        x = in.nextDouble();
        System.out.print("Segundo valor: ");
        y = in.nextDouble();
        System.out.print("Terceiro valor: ");
        z = in.nextDouble();

        if(x == y || x == z || z == y) {
            System.out.println("Foi apresentado valores repetidos, por favor informe valores diferentes entre si.");
        }
        else {
            if(x > y && x > z) {
                System.out.println("O valor " + x + " é o maior de todos.");
            }
            else {
                if(y > x && y > z) {
                    System.out.println("O valor " + y + " é o maior de todos.");
            }
            else {
                if(z > x && z > y) {
                    System.out.println("O valor " + z + " é o maior de todos.");
            }
        }
    }
        }
        in.close();
        }
    }