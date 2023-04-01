import java.util.Scanner;
public class revisaoDivisidiveis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        System.out.print("Informe o intervalo mínimo: ");
        int num = in.nextInt();

        System.out.print("Informe o intervalo máximo: ");
        int num2 = in.nextInt();

        while(num > num2) {
            System.out.print("Número inválido. Informe um valor máximo maior que o mínimo: ");
            num2 = in.nextInt();
        }
        while(num < num2) {
            if(num % 3 == 0) {
                contador ++;
            }
            num++;
        }
        System.out.print("Existe " + contador + " números divisíveis por 3 no intervalo informado.");
        
        in.close();
    }
}
