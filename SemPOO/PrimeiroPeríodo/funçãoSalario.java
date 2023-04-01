import java.util.Scanner;

public class funçãoSalario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char tipo, turno;
        double base, horas, veredito;

        System.out.println("Você é operário ou gerente?\n['O'] para operário.\n['G'] para gerente.");
        tipo = in.next().charAt(0);
        tipo = Character.toUpperCase(tipo);

        while(tipo != 'O' && tipo != 'G') {
            System.out.println("Resposta inválida. Informe:\n['O'] para operário.\n['G'] para gerente.");
            tipo = in.next().charAt(0);
            tipo = Character.toUpperCase(tipo);
        }
        System.out.println("Você trabalhga em que turno?");
        System.out.println("['M'] para matutuino\n['V'] para vespertino\n['N'] para noturno.");
        turno = in.next().charAt(0);
        turno = Character.toUpperCase(turno);

        while(turno != 'M' && turno != 'V' && turno != 'N') {
            System.out.println("Resposta inválida. Informe:");
            System.out.println("['M'] para matutuino\n['V'] para vespertino\n['N'] para noturno.");
            turno = in.next().charAt(0);
            turno = Character.toUpperCase(turno);

        }
        System.out.println("Qual é seu salário base?");
        base = in.nextDouble();

        while(base <= 0) {
            System.out.println("Valor incoerente. Informe um valor positivo de salário.");
            base = in.nextDouble();
        }

        System.out.println("Quantas horas você trabalha por mês?");
        horas = in.nextDouble();

        while(horas <= 0) {
            System.out.println("Valor incoerente. Informe um valor positivo de jornada de trabalho.");
            horas = in.nextDouble();
        }
        veredito = remuneracao(tipo, turno, base, horas);

        if(veredito  == 1) {
            System.out.println("De acordo com o salário informado. Você é mal remunerado");
        }
        else if(veredito == 2) {
            System.out.println("De acordo com o salário informado. Você tem uma remuneração regular.");
        }
        else {
            System.out.println("De acordo com o salário informado. Você é bem remunerado.");
        }


        in.close();
    }

    public static double coeficiente(char turno) {
        if(turno == 'M') {
            return 0.1;
        }
        else if(turno == 'V') {
            return 0.15;
        }
        else {
            return 0.2;
        }
    }
    public static double salarioBruto(char turno, double base, double horas) {
        double coeficiente, bruto;
        coeficiente = coeficiente(turno);

        bruto = base + (coeficiente * horas) ;
        return bruto;

    }
    public static double imposto(char tipo, char turno, double base, double horas) {
        double bruto, result;
        bruto = salarioBruto(turno, base, horas);

        if(tipo == 'O') {
            if(bruto >= 300) {
                result = 0.05 * bruto;
                return result;
            }
            else {
                result = 0.03 * bruto;
                return result;
            }
        }
        else  {
            if(bruto >= 400) {
                result = 0.06 * bruto;
                return result;
            }
            else {
                result = 0.04 * bruto;
                return result;
            }
        }

    }
    public static double gratificação(double horas, char turno) {
        double bonus;
        if(turno == 'N') {
            if(horas > 80) {
                bonus = 50;
                return bonus;
            }
            else {
                bonus = 30;
                return bonus;
            }
        }
        else {
            bonus = 30;
            return bonus;
        }
    }
    public static double alimentacao(char tipo, char turno, double base, double horas) {
        double bonus, bruto, coeficiente;
        coeficiente = coeficiente(turno);
        bruto = salarioBruto(turno, base, horas);

        if(tipo == 'O' || coeficiente <= 0.25) {
            bonus = bruto * 1/3;
            return bonus;
        }
        else {
            bonus = bruto * 1/2;
            return bonus;
        }
        
    }
    public static double salarioLiquido(char tipo, char turno, double base, double horas) {
        double bruto, alimentacao, imposto, result;
        bruto = salarioBruto(turno, base, horas);
        alimentacao = alimentacao(tipo, turno, base, horas);
        imposto = imposto(tipo, turno, base, horas);

        result = (bruto - imposto) + alimentacao;
        return result;
    }
    public static double remuneracao(char tipo, char turno, double base, double horas) {
        double liquido;
        liquido = salarioLiquido(tipo, turno, base, horas) + gratificação(horas, turno);

        if(liquido < 500) {
            return 1;
        }
        else if(liquido < 1000) {
            return 2;
        }
        else {
            return 3;
        }

    }
}