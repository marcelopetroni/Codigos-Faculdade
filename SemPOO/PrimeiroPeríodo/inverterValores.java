import java.util.Scanner;
import java.text.DecimalFormat;

public class inverterValores {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int valor, resultado, milhar, dezena, centena;
        int quociente, quociente2, quociente3;
        System.out.println("Qual é valor que você deseja inverter? (número de até 4 dígitos)");
        valor = in.nextInt();

        // Realoquei a devida casa decimal de cada algarismo para seu devido local em ordem invertida
        quociente = valor/1000;
        milhar = quociente * 1000;
        valor = valor - milhar;
        milhar = milhar/1000;

        quociente2 = valor/100;
        centena = quociente2 * 100;
        valor = valor - centena;
        centena = centena/10;

        quociente3 = valor/10;
        dezena = quociente3 * 10;
        valor = valor - dezena;
        dezena = dezena * 10;

        resultado = (valor * 1000) + milhar + centena + dezena;
  
        if (valor == 0 && dezena == 0 && centena == 0 || valor == 0 && dezena == 0 || valor == 0) {
            System.out.println(new DecimalFormat("#,##0000").format(resultado));
        }
        else {
            System.out.println(resultado);
        }
        // Considerei essas condicionais caso o número tenha os últimos algarismos terminados por 0 (ex: 2000 ou 2300)
        in.close();
    }
}