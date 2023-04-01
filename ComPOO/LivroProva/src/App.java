import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe quantos livros será cadastrado: ");
        Integer tamanho = in.nextInt();

        while(tamanho < 0) {
            System.out.print("Reinforme um valor positivo para o nº de cadastros a ser realizado: ");
            tamanho = in.nextInt();
        }

        CadastroLivros cadastro = new CadastroLivros(tamanho);
        int escolha;
        do {
            opcoes();
            System.out.print("Escolha uma opção: ");
            escolha = in.nextInt();

            while(escolha < 1 || escolha > 7) {
                System.out.print("Número inválido. Escolha uma opção entre 1-7: ");
                escolha = in.nextInt();
            }

            in.nextLine();
            if(escolha == 1) {
                System.out.println("\nCADASTRO:\n-----------------");
                System.out.print("Informe o ISBN do livro: ");
                String ISBN = in.nextLine();
                System.out.print("Informe o título do livro: ");
                String titulo = in.nextLine();
                System.out.print("Informe o preço do livro: ");
                Double preco = in.nextDouble();
                System.out.print("Informe a quantidade em estoque do livro: ");
                Integer quantidade = in.nextInt();
                in.nextLine();

                Livro livro = new Livro(ISBN, titulo, preco, quantidade);
                cadastro.CadastrarLivro(livro);
            }
            else if(escolha == 2) {
                cadastro.ExibirLivros();
            }
            else if(escolha == 3) {
                System.out.println("\nCHECAGEM:\n----------------");
                System.out.print("Informe o ISBN do livro: ");
                String ISBN = in.nextLine();
                cadastro.ExibirLivro(ISBN);
            }
            else if(escolha == 4) {
                System.out.println("\nALTERAR PREÇO:\n----------------");
                System.out.print("Informe o ISBN do livro: ");
                String ISBN = in.nextLine();
                cadastro.AlterarPreco(ISBN);
                System.out.println();
            }
            else if(escolha == 5) {
                System.out.println("\nALTERAR ESTOQUE:\n----------------");
                System.out.print("Informe o ISBN do livro: ");
                String ISBN = in.nextLine();
                cadastro.AlterarEstoque(ISBN);
                System.out.println();
            }
            else if(escolha == 6) {
                System.out.println("\nREMOÇÃO:\n----------------");
                System.out.print("Informe o ISBN do livro: ");
                String ISBN = in.nextLine();
                cadastro.RemoverLivro(ISBN);
                System.out.println();
            }

        } while(escolha != 7);

        in.close();
    }
    public static void opcoes() {
        System.out.println("1 - Cadastrar um livro.\n2 - Exibir livros cadastrados.");
        System.out.println("3 - Exibir os dados de um livro.\n4 - Alterar preço de um livro.");
        System.out.println("5 - Alterar quantidade em estoque de um livro.\n6 - Remover um livro\n7 - Finalizar.");
    }
}
