import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número inteiro para determinar seu fatorial: ");
        int num = in.nextInt();

        //Declarei duas variáveis para não chamar as funções mais de uma vez.
        int iterativa = iterativa(num);
        int recursiva = recursiva(num);

        if(iterativa == -1 || recursiva == -1) {
            System.out.print("O fatorial de " + num + " é inexistente." );
        }
        else {
            System.out.println("ITERATIVA:");
            System.out.println("O fatorial de " + num + " é " + iterativa + ".\n");
            System.out.println("RECURSIVA:");
            System.out.println("O fatorial de " + num + " é " + recursiva + ".");
        }
        in.close();
    }
    public static int iterativa(int num) {
        int conta = 1;
        if(num < 0) {
            return -1;
        }
        else if(num == 1 || num == 0) {
            return 1;
        }
        else {
            for(int i = 1; i <= num; i ++) {
                conta *= i;
            }
            return conta;
        }
    }
    public static int recursiva(int num) {
        int conta = 1;
        if(num < 0) {
            return -1;
        }
        else if(num == 1 || num == 0) {
            return 1;
        }
        else {
            for(int i = 1; i <= num; i ++) {
                conta = num * recursiva(num - 1);
            }
            return conta;
        }
    }
}
