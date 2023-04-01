public class Trabalhador {
    private String nome;
    private int idade;
    private double valorDaHora;
    private int horasTrabalhadas = 0;
    private boolean ferias;

    public Trabalhador(String nome, int idade, double valorDaHora, int horasTrabalhadas, boolean ferias) {
        this.nome = nome;
        this.idade = idade;
        this.valorDaHora = valorDaHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.ferias = ferias;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getValorDaHora() {
        return valorDaHora;
    }
    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    // Aqui irá acumular o número de horas trabalhadas durante o período.
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }
    public boolean getFerias() {
        return ferias;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
    public boolean ferias() {
        if(this.ferias == true) {
            return false;
        }
        return true;
    }
}
