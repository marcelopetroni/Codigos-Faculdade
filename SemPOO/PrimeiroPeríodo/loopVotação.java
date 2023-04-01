import java.util.Scanner;

public class loopVotação {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double i = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, porcento, porcento2, porcento3;
        int voto;
        char condicao = 0;

        do {
            System.out.println("Em quem você deseja votar?");
            System.out.println("['1'] para Maria.\n['2'] para Pedro.\n['3'] para Luís.");
            System.out.println("['4'] para Paula\n['5'] para Francisco.\n['6'] para voto em branco.");
            voto = in.nextInt();
            i ++;
            switch(voto) {
                case 1:
                a ++;
                break;
                case 2:
                b++;
                break;
                case 3:
                c++;
                break;
                case 4:
                d++;
                break;
                case 5:
                e++;
                break;
                case 6:
                f++;
                break;
                default:
                g++;
            }
            System.out.println("Existe outro eleitor que deseja votar? ('s' para sim e 'n' para não)");
            condicao = in.next().charAt(0);

            while(condicao != 's' && condicao != 'S' && condicao != 'n' && condicao != 'N' ) {
                System.out.println("Por favor informe 's' para sim ou 'n' para não.");
                condicao = in.next().charAt(0);
            }

        } while(condicao == 's' || condicao == 'S');

        porcento = (g/i) * 100;
        porcento2 = (f/i) * 100;
        porcento3 = ((a + b + c + d + e + f)/i) * 100;

        System.out.println("A candidata Maria obteve " + a + " votos.");
        System.out.println("O candidato Pedro obteve " + b + " votos.");
        System.out.println("O candidato Luís obteve " + c + " votos.");
        System.out.println("A candidata Paula obteve " + d + " votos.");
        System.out.println("O candidato Francisco obteve " + e + " votos.");
        System.out.println("Foi computado " + f + " votos em branco.");
        System.out.println("Foi computado " + g + " votos nulos.");
        System.out.println("\n" + porcento + "% dos votos foram nulos.");
        System.out.println(porcento2 + "% dos votos foram brancos.");
        System.out.println(porcento3 + "% dos votos foram válidos sobre algum candidato.");

        in.close();
    }
}