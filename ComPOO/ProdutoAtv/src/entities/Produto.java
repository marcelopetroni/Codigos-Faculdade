package entities;
public class Produto {
    private Integer codigo;
    private String descricao;
    private String fornecedor; 
    private Double preco; 
    private Integer quantidade;

    public Produto(Integer codigo, String descricao, String fornecedor, Double preco, Integer quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void aplicarDesconto(double desconto) {
        this.preco = this.preco - (this.preco * 0.01 * desconto);
    }
    public void aplicarAumento(double aumento) {
        this.preco *= (1 + (0.01 * aumento));
    }
    public void atualizarEstoque(int atualizar){
        this.quantidade += atualizar;
    }
    public void venderProduto(int venda) {
        this.quantidade -= venda;

    }
    public String toString() {
        return "Código = " + codigo + "\nDescriçao = " + descricao + "\nFornecedor = " + fornecedor + "\nPreço = "
                + preco + "\nQuantidade = " + quantidade;
    }
}
