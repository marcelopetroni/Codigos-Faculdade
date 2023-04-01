import java.util.Scanner;
public class buscaBinaria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[100];
        int contador = 0;
        int escolha;
        do {
        System.out.println("MENU");
        System.out.println("1 - Inserir um novo nome.\n2 - Exibir os nomes.\n3 - A posição de um nome informado.");
        System.out.println("4 - Remover um nome do vetor de nomes.\n5 - Finalizar programa.");
        System.out.print("\nInforme o que deseja realizar: ");
        escolha = in.nextInt();

        while(escolha != 1 && escolha != 2 &&  escolha != 3 && escolha != 4 && escolha != 5) {
            System.out.print("Número inválido. Informe de 1 - 4: ");
            escolha = in.nextInt();
        }
        if(escolha == 1) {
            System.out.print("Informe um novo nome para inserir: ");
            in.nextLine();
            String nome = in.nextLine();

            int result = inserirValor(nomes, contador, nome);
            if(result == 1) {
                System.out.println("Inserção realizada.");
                contador ++;
            }
            else {
                System.out.println("Inserção não realizada.");
            }

        }
        else if(escolha == 2) {
            exibirNomes(nomes, contador);
        }
        else if(escolha == 3) {
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
        else if(escolha == 4){
            System.out.print("Informe um nome para retirar: ");
            in.nextLine();
            String nome3 = in.nextLine();
            int result2 = removerValor(nomes, contador, nome3);
            if(result2 == 1) {
                System.out.println("Remoção realizada.");
                contador --;
            }
            else {
                System.out.println("Remoção não realizada.");
            }
        }
        else {
            break;
        }
        } while(escolha != 5);

        in.close();
    }
    public static int inserirValor(String [] nomes, int contador, String nome) {
        int i, pos;
        if (nomes.length == contador) {
            return 0; // nomes cheio!!! Não pode inserir!
        } else if (contador == 0) { // nomes vazio!!
            nomes[contador] = nome;
            return 1;
        } else { // Caso geral: nomes nem vazio nem cheio
            for(pos = 0; pos < contador; pos ++) {
                if(nomes[pos].compareToIgnoreCase(nome) == 0) {
                    return 0;
                }
                else if(nomes[pos].compareToIgnoreCase(nome) < 0){
                    if(nomes[contador - 1].compareToIgnoreCase(nome) < 0) {
                        // caso o nome informado for menor que os que já estão no nomes
                        nomes[contador] = nome;
                        break;
                    }
                    continue;
                }
                else {
                  // achou uma posição em que o nome informado é maior
                  for (i = contador - 1; i >= pos; i--) { // mover valores para "abrir" espaço
                        nomes[i + 1] = nomes[i];
                    }
                    nomes[pos] = nome; // inserir novo valor
                    break;
                }
            }
        }
        return 1;
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
    public static int removerValor(String [] nomes, int contador, String nome) {
        int busca = procura(nomes, contador, nome);
        int i;
        if (busca == -1) {
            return 0; // não removeu!
        } else {
            for (i = busca; i <= contador - 1; i++) {
                nomes[i] = nomes[i + 1];
            }
            return 1;
        }
    }
}
