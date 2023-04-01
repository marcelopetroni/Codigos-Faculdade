import java.util.Scanner;

public class ordenacaoEBusca {
    // MAIN:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha, cont = 0, flag = 1;
        String [] vetor = new String[100];
        do {
            Menu();
            escolha = in.nextInt();
            in.nextLine();
            if(escolha == 1) {
                flag = 1;
                System.out.print("Informe um nome para inserir: ");
                String nome = in.nextLine();
                int resp = inserir(vetor, cont, nome);

                if (resp == -1) {
                    System.out.println("Vetor cheio. Inserção não efetuada.\n");
                } else if(resp == 0) {
                    System.out.println("Nomes iguais! Informe outro nome.\n");
                }
                else {
                    cont ++;
                    System.out.println("Inserção efetuada.\n");
                }

            }
            else if(escolha == 2) {
                System.out.println("\nEXIBIR VETOR DE NOMES\n--------------------------");
                exibir(vetor, cont);
                System.out.println();

            }
            else if(escolha == 3) {
                flag = 2;
                insercaoDireta(vetor, cont);
                System.out.println("O vetor foi ordenado de forma crescente.\n");
                
            }
            else if(escolha == 4) {
                flag = 3;
                selecaoDireta(vetor, cont);
                System.out.println("O vetor foi ordenado de forma decrescente.\n");
                
            }
            else if(escolha == 5) {
                System.out.print("Informe um nome para fazer a busca: ");
                String nome = in.nextLine();
                int resp = busca(vetor, cont, nome, flag);
                if(resp == -1) {
                    System.out.println("O nome informado não se encontra no vetor de nomes.\n");
                }
                else {
                    System.out.println("O nome informado se encontra na posição " + resp + " do vetor.\n");
                }
            }
            else {
                System.out.println("Até mais!");
            }
          
        } while(escolha != 0);
        in.close();
    }
    // Letra a: Inserção sem repetidos
    public static int inserir(String[] vetor, int cont, String nome) {
        int i, pos;
        if (vetor.length == cont) {
            return -1; // Vetor cheio!!! Não pode inserir!
        } else if (cont == 0) { // Vetor vazio!!
            vetor[cont] = nome;
            cont++;
        } else { // Caso geral: vetor nem vazio nem cheio
            for(pos = 0; pos < cont; pos ++) {
                if(vetor[pos].compareToIgnoreCase(nome) == 0) {
                    return 0;
                }
            }
            vetor[cont] = nome;
        }
        return 1;
    }

    // Letra b: Exibir vetor
    public static void exibir(String[] vetor, int cont) {
        int i;
        if (cont == 0) {
            System.out.println("Lista de nomes vazia.");
        } else {
            for (i = 0; i < cont; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }

    // Letra c: Ordernar de forma crescente
    public static void insercaoDireta (String[] vetor, int cont) {
        int i,j;
        String chave;
        int fim = cont - 1;
        for (i = 1; i <= fim; i++) {
            chave = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j].compareToIgnoreCase(chave) > 0) {
                vetor[j+1] = vetor[j];
                j = j - 1;
            }
            vetor[j+1] = chave;
            }
    }
    // Letra d: Ordernar de forma decrescente
    public static void selecaoDireta (String[] vetor, int cont) {
        int i, j, maior;
        String aux;
        int fim = cont - 1;
        for (i = 0; i < fim; i++) {
            maior = i;
            for (j = i + 1; j <= fim ; j++) {
                if (vetor[j].compareToIgnoreCase(vetor[maior]) > 0) {
                    maior = j;
                }
            }
            aux = vetor[i];
            vetor[i] = vetor[maior];
            vetor [maior] = aux;
            }
        }
    // Letra e: Método busca
    public static int busca(String [] vetor, int cont, String nome, int flag) {
        if(flag == 1) {
            // Letra e: (1) Busca sequencial simples
            int i;
            boolean achou = false;
            for (i = 0; i < cont; i++) {
                if (vetor[i].compareToIgnoreCase(nome) == 0) {
                achou = true;
                break;
                }
            }
            if (achou == true) {
                return i; 
            }
            else {
                return -1; 
            } 
        }
        else if(flag == 2) {
            // (2) Busca binária crescente
            int inicio = 0, meio, fim = cont - 1;
            boolean achou = false;
            do {
                meio = (inicio + fim) / 2;
                if(vetor[meio].compareToIgnoreCase(nome) == 0) {
                    achou = true;
                    break;
                }
                else if(vetor[meio].compareToIgnoreCase(nome) > 0) {
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
        else {
            // (3) Busca binária decrescente
            int inicio = 0, meio, fim = cont - 1;
            boolean achou = false;
            do {
                meio = (inicio + fim) / 2;
                if(vetor[meio].compareToIgnoreCase(nome) == 0) {
                    achou = true;
                    break;
                }
                else if(vetor[meio].compareToIgnoreCase(nome) < 0) {
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
    }
    // MENU:
    public static void Menu() {
        System.out.println("1 - Cadastrar novo nome\n2 - Exibir todos os nomes");
        System.out.println("3 - Ordenar crescente\n4 - Ordenar decrescente"); 
        System.out.println("5 - Realizar busca\n0 - Sair do programa");   
        System.out.print("Informe a opção desejada: ");
    }
}
