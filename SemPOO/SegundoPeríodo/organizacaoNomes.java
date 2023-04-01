import java.util.Scanner;

public class organizacaoNomes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] vet = new String[100];
        int contador = 0, resp, resultado;
        String nome;
        do {
            exibirOpcoes();
            resp = in.nextInt();
            in.nextLine();
            switch (resp) {
                case 1:
                    System.out.println("Informe um nome: ");
                    nome = in.nextLine();
                    resultado = inserirOrdenado(vet, contador, nome);
                    if (resultado == -1) {
                        System.out.println("Vetor cheio. Inserção não efetuada");
                    } else if(resultado == -2) {
                        System.out.println("Nomes iguais! Informe outro nome.");
                        System.out.println(resultado);
                    }
                    else {
                        contador = resultado;
                        System.out.println("Inserção efetuada.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de nomes: ");
                    exibir(vet, contador);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o nome a ser removido: ");
                    nome = in.nextLine();
                    resultado = remover(vet, contador, nome);
                    if (resultado == -1) {
                        System.out.println("Remoção não efetuada: nome não encontrado!");
                    } else {
                        contador = resultado;
                        System.out.println("Remoção efetuada.");
                    }
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (resp != 0);
        in.close();
    }

    public static void exibirOpcoes() {
        System.out.println("1 - Inserir um novo nome: ");
        System.out.println("2 - Exibir nomes");
        System.out.println("3 - Remover um nome");
        System.out.println("0 - Encerrar programa");
        System.out.println("Informe a opcão desejada:");
    }

    public static int buscaMelhorada(String[] vet, int cont, String nome) {
        int i;
        boolean achou = false;
        if (cont == 0) {
            return -1;
        } else {
            for (i = 0; i <= cont - 1; i++) {
                if (vet[i].compareToIgnoreCase(nome) == 0) {
                    achou = true;
                    break;  // interrompe o for
                }
            }
            if (achou == false) {
                return -1;
            } else {
                return i;
            }
        }
    }

    public static int remover(String[] vet, int cont, String nome) {
        int pos = buscaMelhorada(vet, cont, nome);
        int i;
        if (pos == -1) {
            return -1; // não removeu!
        } else {
            for (i = pos; i <= cont - 1; i++) {
                vet[i] = vet[i + 1];
            }
            cont--;
            return cont;
        }
    }

    public static int inserirOrdenado(String[] vetor, int cont, String nome) {
        int i, pos;
        if (vetor.length == cont) {
            return -1; // Vetor cheio!!! Não pode inserir!
        } else if (cont == 0) { // Vetor vazio!!
            vetor[cont] = nome;
            cont++;
        } else { // Caso geral: vetor nem vazio nem cheio
            for(pos = 0; pos < cont; pos ++) {
                if(vetor[pos].compareToIgnoreCase(nome) == 0) {
                    return -2;
                }
                else if(vetor[pos].compareToIgnoreCase(nome) < 0){
                    if(vetor[cont - 1].compareToIgnoreCase(nome) < 0) {
                        // caso o nome informado for menor que os que já estão no vetor
                        vetor[cont] = nome;
                        cont ++;
                        break;
                    }
                    continue;
                }
                else {
                  // achou uma posição em que o nome informado é maior
                  for (i = cont - 1; i >= pos; i--) { // mover valores para "abrir" espaço
                        vetor[i + 1] = vetor[i];
                    }
                    vetor[pos] = nome; // inserir novo valor
                    cont ++;
                    break;
                }
            }
        }
        return cont;
    }

    public static void exibir(String[] vet, int c) {
        int i;
        if (c == 0) {
            System.out.println("Lista de nomes vazia.");
        } else {
            for (i = 0; i < c; i++) {
                System.out.print(vet[i] + " ");
            }
            System.out.println();
        }
    }

}