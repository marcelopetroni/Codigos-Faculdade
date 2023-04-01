import java.util.Scanner;

public class maiorMenorFunção {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num, num2, num3;

    System.out.print("Informe o primeiro número: ");
    num = in.nextInt();

    System.out.print("Informe o segundo número: ");
    num2 = in.nextInt();

    System.out.print("Informe o terceiro número: ");
    num3 = in.nextInt();

    maiorMenor(num, num2, num3);

    in.close();
    }

    public static void maiorMenor(int num, int num2, int num3) {
        int maior, menor;
            if(num > num2 && num > num3) {
                maior = num;
                System.out.println("O maior número é o " + maior + ".");
            }
            else if(num2 > num && num2 > num3) {
                maior = num2;
                System.out.println("O maior número é o " + maior + ".");
            }
            else {
                maior = num3;
                System.out.println("O maior número é o " + maior + ".");
            }
            if(num < num2 && num < num3) {
                menor = num;
                System.out.println("O menor número é o " + menor + ".");
            }
            else if(num2 < num && num2 < num3) {
                menor = num2;
                System.out.println("O menor número é o " + menor + ".");
            }
            else {
                menor = num3;
                System.out.println("O menor número é o " + menor + ".");
            }
        }
    }
