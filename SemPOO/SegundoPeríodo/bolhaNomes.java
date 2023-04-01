import java.util.Scanner;
public class bolhaNomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[20];
        int contador = nomes.length;
        int escolha;
        System.out.println("PREENCHER VETOR\n----------------------");
        preencherVetor(nomes);
        do {
        System.out.println("MENU");
        System.out.println("1 - Exibir os nomes.\n2 - A posição de um nome informado.");
        System.out.println("3 - Finalizar programa.");
        System.out.print("\nInforme o que deseja realizar: ");
        escolha = in.nextInt();

        while(escolha != 1 && escolha != 2 &&  escolha != 3 && escolha != 4 && escolha != 5) {
            System.out.print("Número inválido. Informe de 1 - 4: ");
            escolha = in.nextInt();
        }

        if(escolha == 1) {
            exibirNomes(nomes, contador);
        }
        else if(escolha == 2) {
            System.out.print("Informe um nome que deseja saber a posição: ");
            in.nextLine();
            String nome2 = in.nextLine();
            int achou = procura(nomes, contador, nome2);

            if(achou == -1) {
                System.out.println("Nome não encontrado.");
            }
            else {
                System.out.println(nome2 + " está na posição " + achou + ".");
            }
        }
        else {
            break;
        }
        } while(escolha != 5);

        in.close();
    }
    public static void preencherVetor(String [] nomes) {
        Scanner in = new Scanner(System.in);
        int i, pos, cont = 0, x = 1;
            for(i = 0; i < nomes.length; i++) {
                System.out.print("Informe o " + x + "º nome: ");
                nomes[i] = in.nextLine();
                x++;
                for(pos = 0; pos < cont; pos++) {
                    while(nomes[i].compareToIgnoreCase(nomes[pos]) == 0) {
                        System.out.print("Nome repetido. Reinforme: ");
                        nomes[i] = in.nextLine();
                    }
                }
                cont++;
            }

    }
    public static void exibirNomes(String[] nomes, int contador) {
        for(int i = 0; i < contador; i++) {
            System.out.print(nomes[i] + " ");
        }
        System.out.println();
    }
    public static int procura(String [] nomes, int contador, String nome) {
        int inicio = 0, meio, fim = contador - 1;
        boolean achou = false;
        do {
            meio = (inicio + fim) / 2;
            if(nomes[meio].compareToIgnoreCase(nome) == 0) {
                achou = true;
                break;
            }
            else if(nomes[meio].compareToIgnoreCase(nome) > 0) {
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
    public static void bubblesort (String nomes[], int contador) {
        int i, fim, pos;
        String chave;
        boolean troca;
        fim = contador - 2; pos = 0;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (nomes[i].compareToIgnoreCase(nomes[i+1]) < 0) {
                    chave = nomes[i]; nomes[i] = nomes[i+1]; nomes[i+1] = chave;
                    pos = i; troca = true;
                }
            }
            fim = pos-1;
        } while (troca == true);
    }   
}
