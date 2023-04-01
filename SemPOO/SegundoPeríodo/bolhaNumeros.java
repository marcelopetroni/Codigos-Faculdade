import java.security.SecureRandom;
import java.util.Scanner;

public class bolhaNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[100];
        int contador = num.length;
        int escolha;
        preencherVetor(num, contador);
        bubblesort(num, contador);
        do {
        System.out.println("MENU");
        System.out.println("1 - Exibir valores.\n2 - A posição de um numero informado.");
        System.out.println("3 - Finalizar programa.");
        System.out.print("\nInforme o que deseja realizar: ");
        escolha = in.nextInt();

        while(escolha != 1 && escolha != 2 &&  escolha != 3 && escolha != 4 && escolha != 5) {
            System.out.print("Número inválido. Informe de 1 - 4: ");
            escolha = in.nextInt();
        }
        if(escolha == 1) {
            exibirNomes(num, contador);
        }
        else if(escolha == 2) {
            System.out.print("Informe um número que deseja saber a posição: ");
            int num2 = in.nextInt();
            int achou = procura(num, contador, num2);

            if(achou == -1) {
                System.out.println("Número não encontrado.");
            }
            else {
                System.out.println(num2 + " está na posição " + achou + ".");
            }
        }
        else {
            break;
        }
        } while(escolha != 5);

        in.close();
    }
    public static void preencherVetor(int [] num, int contador) {
        int pos;
            for(pos = 0; pos < contador; pos ++) {
                int valor = sorteiaNumero();
                num[pos] = valor;
            }      
    }
    public static void exibirNomes(int[] num, int contador) {
        for(int i = 0; i < contador; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static int procura(int[] num, int contador, int num2) {
        int inicio = 0, meio, fim = contador - 1;
        boolean achou = false;
        do {
            meio = (inicio + fim) / 2;
            if(num[meio] == num2) {
                achou = true;
                break;
            }
            else if(num[meio] < num2) {
                fim = meio - 1;
            }
            else {
                inicio = meio + 1;
            }
        } while (inicio <= fim);

        if (achou == true){
            return meio; 
        }
        else {
            return -1;
        }
    }

    public static int sorteiaNumero () {
        int num;
        SecureRandom random = new SecureRandom();
        num = random.nextInt(10000) + 1;
        return num;
    }
    public static void bubblesort (int num[], int contador) {
        int i, fim, pos;
        int chave;
        boolean troca;
        fim = contador - 2; pos = 0;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (num[i] < num[i+1]) {
                    chave = num[i]; num[i] = num[i+1]; num[i+1] = chave;
                    pos = i; troca = true;
                }
            }
            fim = pos-1;
        } while (troca == true);
    }   
}
