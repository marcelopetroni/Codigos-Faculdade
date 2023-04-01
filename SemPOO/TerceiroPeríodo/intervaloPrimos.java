import java.util.Scanner;
public class intervaloPrimos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o limite inferior: ");
        int num = in.nextInt();

        while(num <= 1) {
            System.out.print("Não existe números primos negativos, informe um valor positivo acima de 1: ");
            num = in.nextInt();
        }

        System.out.print("Informe o limite superior: ");
        int num2 = in.nextInt();

        while(num > num2 || num == num2) {
            System.out.print("Número inválido. Informe um número diferente e maior que o inferior: ");
            num2 = in.nextInt();
        }
        NumeroDePrimos(num, num2);
        in.close();
    }

    public static void NumeroDePrimos(int num, int num2) {
        while(num <= num2) {
            for(int i = 1; i <= num; i++) {
                if(i != 1 && i != num) {
                    if(num % i == 0) {
                        break;
                    }
                }
                if(i == num) {
                    System.out.print(num + " ");
                }
            }
            num++;
        }
    }
}
