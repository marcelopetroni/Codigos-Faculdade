import java.util.Scanner;

public class loopMaternidade {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double dias = 0, i = 0, p = 0, f = 0, m = 0, soma = 0, maior = Double.MIN_VALUE;
        double porcento, porcento2, porcento3, media;
        char genero, prematuro, condicao;

        do {
            i ++;
            System.out.println("Qual é o genêro do bebê? (Informe 'F' para feminino ou 'M' para masculino)");
            genero = in.next().charAt(0);

            while(genero != 'F' && genero != 'f' && genero != 'm' && genero != 'M') {
                System.out.println("Genêro inválido. Informe 'F' para feminino e 'M' para masculino.");
                genero = in.next().charAt(0);
            }

            System.out.println("O bebê é prematuro? (Informe 'S' para sim ou 'N' para não)");
            prematuro = in.next().charAt(0);

            while(prematuro != 'S' && prematuro != 's' && prematuro != 'N' && prematuro != 'n') {
                System.out.println("Por favor informe 'S' para sim ou 'N' para não.");
                prematuro = in.next().charAt(0);
            }

            if(prematuro == 'S' || prematuro == 's') {
                p ++;
                System.out.println("Quantos dias o bebê passou na incubadora?");
                dias = in.nextDouble();

                while(dias < 1) {
                    System.out.println("Valor incoerente. Por favor informe um valor positivo de dias.");
                    dias = in.nextDouble();
                }
                soma = soma + dias;
            }

            if((genero == 'm' || genero == 'M') && (prematuro == 's' || prematuro == 'S')) {
                m ++;
            }
            if((genero == 'f' || genero == 'F') && (prematuro == 's' || prematuro == 'S')) {
                f ++;
            }
            if(dias > maior) {
                maior = dias;
            }
            System.out.println("Deseja informar os dados de mais algum bebê?");
            condicao = in.next().charAt(0);

            while(condicao != 's' && condicao != 'S' && condicao != 'n' && condicao != 'N' ) {
                System.out.println("Por favor informe 's' para sim ou 'n' para não.");
                condicao = in.next().charAt(0);
            }

        } while(condicao == 's' || condicao == 'S');

        porcento = (p/i) * 100;
        porcento2 = (m/p) * 100;
        porcento3 = (f/p) * 100;
        media = soma/p;

        System.out.println("A porcentagem de recém nascidos prematuros é de " + porcento + "%");
        System.out.println("A porcentagem de recém nascidos prematuros do sexo masculino é de " + porcento2 + "%");
        System.out.println("A porcentagem de recém nascidos  prematuros do sexo feminino é de " + porcento3 + "%");
        System.out.println("A média de dias de permanência dos recém-nascidos prematuros é de " + media + " dias.");
        System.out.println("O maior número de dias que um bebê prematuro permaneceu na incubadora foi " + maior + " dias");

        in.close();
    }
}