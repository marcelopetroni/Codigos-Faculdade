import entities.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um dia: ");
        Integer dia = in.nextInt();

        System.out.print("Informe um mês: ");
        Integer mes = in.nextInt();

        System.out.print("Informe um ano: ");
        Integer ano = in.nextInt();
        Data data = new Data(dia, mes, ano);

        System.out.print("\nInforme outro dia: ");
        dia = in.nextInt();

        System.out.print("Informe outro mês: ");
        mes = in.nextInt();

        System.out.print("Informe outro ano: ");
        ano = in.nextInt();
        Data data2 = new Data(dia, mes, ano);

        System.out.println("\nCOMPARAÇÃO DAS DATAS:\n----------------------");
        int resultado = data.compareTo(data2);

        if(resultado == 0) {
            System.out.println("As datas são iguais ou inválidas.");
        }
        else if(resultado == -1) {
            System.out.println("A primeira data" + "(" + data.exibePorExtenso() + ")" + " é maior.");
        }
        else {
            System.out.println("A segunda data" + "(" + data2.exibePorExtenso() + ")" + "é maior.");
        }
        in.close();
    }
}
