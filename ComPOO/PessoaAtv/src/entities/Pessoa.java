package entities;
public class Pessoa {
    private String nome;
    private char genero;
    private Integer idade;
    private Double peso, altura, pesoIdeal;
    
    public Pessoa(String nome, char genero, Integer idade, Double peso, Double altura, Double pesoIdeal) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pesoIdeal = peso/ (altura * altura);
    }
    public void atualizarAltura(double altura) {
        if(altura >= 0.5 && altura <= 2) {
            this.altura = altura;
            this.pesoIdeal = this.peso/ (this.altura * this.altura);
        }
        else {
            System.out.println("Altura inválida.");
        }
    }
    public void atualizarPeso(Double peso) {
        if(peso >= 3 && peso <= 200) {
            this.peso = peso;
            this.pesoIdeal = this.peso/ (this.altura * this.altura);
        }
        else {
            System.out.println("Peso inválido.");
        }
    }
    public void atualizarIdade(int idade) {
        this.idade += idade;
    }
    public String toString() {
        return "Nome = " + nome + "\nGênero = " + genero + "\nIdade = " + idade + "\nPeso = " + peso + "\nAltura = "
                + altura + "\nPeso ideal = " + pesoIdeal;
    }
}