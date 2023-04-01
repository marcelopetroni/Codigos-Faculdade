import java.util.Scanner;
public class primoOuNao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = in.nextInt();
        boolean teste = primo(num);

        if(teste == true) {
            System.out.print("O número informado é primo.");
        }
        else {
            System.out.print("O número informado não é primo.");
        }
        in.close();
    }

    public static boolean primo(int num) {
        for(int i = 1; i <= num; i++) {
            if(i != 1 && i != num) {
                if(num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
