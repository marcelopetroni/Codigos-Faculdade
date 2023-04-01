import java.util.Scanner;
public class menorValor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[5];
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            vet[i] = in.nextInt();
        }
        menor(vet);
        in.close();
    }
    public static void menor(int[] vet) {
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i < vet.length; i++) {
            if(vet[i] < menor) {
                menor = vet[i];
            }
        }
        System.out.println("O menor valor dos números informados é " + menor);
        //Como você não pediu que retornasse, eu fiz um procedimento que exibisse também.
    }
}
