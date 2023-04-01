import java.util.Scanner;

public class diasEmAnosMeses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dias, anos, meses, variavelControle = 0;

        System.out.println("Quantos dias a fábrica não apresenta acidentes? ");
        dias = in.nextInt();

        variavelControle = dias;
        anos = dias/365;
        dias = dias - (anos * 365);

        meses = dias/30;
        dias = dias - (meses * 30);

        System.out.println(variavelControle + " dias correspondem a " + anos + " anos " + meses + " mês(es) e " + dias + " dia(s).");

        in.close();
    }
}