package entities;

public class Livro implements Comparable <Livro>{
    protected String ISBN;
    private String titulo;
    private Double preco;
    private Integer quantidade;

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade += quantidade;
    }
    public Livro(String ISBN, String titulo, Double preco, Integer quantidade) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Livro(String ISBN) {
        this.ISBN = ISBN;
    }
    @Override
    public int compareTo(Livro o) {
        return 0;
    }
    @Override
    public String toString() {
        return titulo.toUpperCase() + "\nISBN: " + ISBN + "\nPreco: " + preco + "\nQuantidade: " + quantidade + "\n";
    }
}