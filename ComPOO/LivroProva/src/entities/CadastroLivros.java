package entities;
import java.util.Scanner;
public class CadastroLivros {
    private Livro[] livros;
    private int cont = 0;    
    public CadastroLivros(Integer tamanho) {
        livros = new Livro[tamanho];
    }
    public void CadastrarLivro(Livro livro) {
        if (this.cont == this.livros.length) {
            System.out.println("Limite atingido de livros registrados. inserção não realizada.");
        }
        else {
            this.livros[this.cont] = livro;
            this.cont++;
            System.out.println("Livro registrado.");
        }
    }
    public void ExibirLivros() {
        int i;
        System.out.println("\nTODOS OS LIVROS:\n------------------");
        for (i = 0; i <= this.cont - 1; i++) {
            System.out.println(this.livros[i]);           
        }
    }
    private int busca(String nome) {
        int i;
        for (i = 0; i <= this.cont - 1; i++) {
            if (nome.compareTo (this.livros[i].ISBN)== 0) {
                return i;
            }
        }    
        return -1;
    }
    public void ExibirLivro(String nome) {
        int procura = this.busca(nome);
        if (procura == -1) {
            System.out.println("Livro não encontrado.");
        }
        else {
            System.out.println("Dados do livro informado:\n------------------");
            System.out.println(this.livros[procura]);
        }
    }
    public void AlterarPreco(String nome) {
        Scanner in = new Scanner (System.in);
        int procura = this.busca(nome);
        if (procura == -1) {
            System.out.println("Livro não encontrado.");
        }
        else {
            System.out.print("Informe o novo preço: ");
            Double NovoPreco = in.nextDouble();
            this.livros[procura].setPreco(NovoPreco);
            System.out.println("Preço atualizado");
            // somei a quantidade nova a antiga no objeto livro.
        }
    }
    public void AlterarEstoque(String nome) {
        Scanner in = new Scanner (System.in);
        int procura = this.busca(nome);
        if (procura == -1) {
            System.out.println("Livro não encontrado.");
        }
        else {
            System.out.print("Informe uma quantidade a ser acrescentada ao estoque: ");
            Integer NovaQuantidade = in.nextInt();
            this.livros[procura].setQuantidade(NovaQuantidade);
            System.out.println("Estoque atualizado");
            // somei a quantidade nova a antiga no objeto livro.
        }
    }
    public void RemoverLivro(String nome) {
        int i, procura = this.busca(nome);
        if (procura == -1) {
            System.out.println("Livro não encontrado.");
        }
        else {
            for (i = procura; i < this.cont-1; i++) {
                this.livros[i] = this.livros[i+1];
            }
            this.livros[i] = null;
            this.cont--;
            System.out.println("Livro removido.");
        }
    }
}
