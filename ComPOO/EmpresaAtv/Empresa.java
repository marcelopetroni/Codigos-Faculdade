public class Empresa {
    private String nome;
    private String cnpj;
    private Trabalhador trabalhadores[] = new Trabalhador[20];
    private String endereço;
    private int numFuncionarios;
    private String ceo;
    
    public Empresa(String nome, String cnpj, Trabalhador[] trabalhadores, String endereço, int numFuncionarios,
            String ceo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = trabalhadores;
        this.endereço = endereço;
        this.numFuncionarios = numFuncionarios;
        this.ceo = ceo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Trabalhador[] getTrabalhadores() {
        return trabalhadores;
    }
    public void setTrabalhadores(Trabalhador[] trabalhadores) {
        this.trabalhadores = trabalhadores;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public int getNumFuncionarios() {
        return numFuncionarios;
    }
    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    public String getCeo() {
        return ceo;
    }
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    public void contratar(Trabalhador novo) {
        this.numFuncionarios += 1;
        this.trabalhadores[numFuncionarios] = novo;
    }
    public void trabalhar() {
        for(int i = 0; i < this.numFuncionarios; i++) {
            if(trabalhadores[i] != null) {
                if(trabalhadores[i].getFerias() == false) {
                    // no setter da classe trabalhador, eu pûs para ir acumulando com o valor inicial.
                    trabalhadores[i].setHorasTrabalhadas(8);
                }
            }
        }
    }
    public void pagamento() {
        double gastoEmpresa = 0;
        String [] nomesFuncionarios = new String[20];
        double[] salarioFuncionarios = new double[20];

        for(int i = 0; i < numFuncionarios; i++) {
            nomesFuncionarios[i] = trabalhadores[i].getNome();

            // Aqui multiplicará todas as horas trabalhadas do funcionário pelo valor estabelecido da hora de trabalho.
            salarioFuncionarios[i] = trabalhadores[i].getHorasTrabalhadas() * trabalhadores[i].getValorDaHora();
            gastoEmpresa += salarioFuncionarios[i];
        }
        for(int i = 0; i < numFuncionarios; i++) {
            System.out.println("O funcionário " + nomesFuncionarios[i] + " recebeu " + salarioFuncionarios[i] + " reais.");
        }
        System.out.println("O gasto total da empresa no período estabelecido foi de + " + gastoEmpresa + " reais.");
    }
}
