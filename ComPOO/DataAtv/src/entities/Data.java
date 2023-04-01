package entities;
public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        if(validar(dia, mes, ano) == true) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else {
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
    }
    private boolean validar(Integer dia, Integer mes, Integer ano) {
        if(mes >= 1 && mes  <= 12 || mes % 3 == 0 || mes == 8) {
            if(dia < 1 || dia > 31) {
                return false;
            }
        }
        else {
            if(dia < 1 || dia > 30) {
                return false;
            }
        }
        if(ano < 0 || ano > 2022) {
            return false;
        }
        return true;
    }
    public int compareTo(Data data) {
        if(this.exibePorExtenso().compareTo(data.exibePorExtenso()) == 0) {
            return 0;
        }
        else if(this.exibePorExtenso().compareTo(data.exibePorExtenso()) > 0) {
            return -1;
        }
       return 1;
    }
    public String exibePorExtenso() {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int z = 0;
        for(int i = 0; i < 12; i++) {
            if(mes == z) {
                break;
            }
            z++;
        }
        return dia + " de " + meses[0] + " de " + ano;
    }
}