import java.util.Scanner;

public class ordem3Num {
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
        int a, c;
            if(num > num2 && num > num3) {
                a = num3;
                num3 = num;
                if(a < num2) {
                    num = a;
                }
                else {
                    c = num2;
                    num2 = a;
                    num = c;
                }
                System.out.println(num);
                System.out.println(num2);
                System.out.println(num3);
            }
            else if(num2 > num && num2 > num3) {
                a = num3;
                num3 = num2;
                if(a < num) {
                    c = num;
                    num = a;
                    num2 = c;
                }
                else {
                   num2 = a;
                }
                System.out.println("Em ordem:");
                System.out.println(num);
                System.out.println(num2);
                System.out.println(num3);
            }
            else {
                if(num > num2) {
                    a = num2;
                    num2 = num;
                    num = a;
                }
                System.out.println("Em ordem:");
                System.out.println(num);
                System.out.println(num2);
                System.out.println(num3);
            }
        }
    }
