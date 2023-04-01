import java.util.Scanner;

public class conversãoHoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int condicao;
        double minutos, horas, resultado;
        System.out.println("Você deseja:\n['1'] Converter horas para minutos.\n['2'] Minutos para horas.");
        condicao = in.nextInt();

        while(condicao != 1 && condicao != 2) {
            System.out.println("Valor inválido. Informe:");
            System.out.println("['1'] Converter horas para minutos.\n['2'] Minutos para horas.");
            condicao = in.nextInt();
        }
        if(condicao == 1) {
            System.out.print("Informe quantas horas: ");
            horas = in.nextDouble();
            System.out.print("Informe quantos minutos: ");
            minutos = in.nextDouble();

            resultado = horasMinutos(horas, minutos);
            System.out.println(horas + "h " + minutos + "minutos = " + resultado + " minutos.");
        }
        else {
            System.out.print("Informe quantos minutos: ");
            minutos = in.nextDouble();
            minutosHoras(minutos);
        }
        in.close();
    }
    public static double horasMinutos(double horas, double minutos) {
        double resp;
        resp = (horas * 60) + minutos;
        return resp;
    }
    public static void minutosHoras(double minutos) {
        double resp;
        resp = minutos/60;
        System.out.println(minutos +  "minutos = " + resp + " horas");
    }
}