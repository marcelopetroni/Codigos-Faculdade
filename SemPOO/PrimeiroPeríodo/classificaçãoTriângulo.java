import java.util.Scanner;

public class classificaçãoTriângulo {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = 0, y = 0, z = 0;
		
		System.out.println("Escolha 3 valores para um triângulo e será determinado a sua classificação ");
        System.out.println("Digita o primeiro valor:");
        x = in.nextDouble();
        
        System.out.println("Digita o segundo valor:");
        y = in.nextDouble();

        System.out.println("Digita o terceiro valor:");
        z = in.nextDouble();

		if (x + y > z && x + z > y && y + z > x) {
			System.out.print("os valores conferem como um triângulo ");
			
			if (x == y && x == z) {
			System.out.print("equilátero. \n");
			}
            else{
			
                if (x == y && x != z && y != z || z == x && z != y && x != y || z == y && z != x && y != x) {
			System.out.print("isósceles. \n");
			}
            else {
                if (x != y && x != z && z != y) {
                    System.out.print("escaleno. \n");
                    }

                }
            }
		}
		else {
			System.out.println("Não é possível formar um triângulo com os valores apresentados.");
			}
        in.close();
        }
    }