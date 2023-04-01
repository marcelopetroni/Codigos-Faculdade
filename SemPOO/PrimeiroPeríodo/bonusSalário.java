import java.util.Scanner;

public class bonusSalário {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double horasExtras, horasFaltas, total;

        System.out.println("Quantas horas extras você trabalhou?");
        horasExtras = in.nextDouble();

        System.out.println("Quantas horas você faltou de trabalho?");
        horasFaltas = in.nextDouble();

        total = horasExtras - (2/3 * horasFaltas);

        if(total > 40){
            System.out.println("O funcionário receberá R$200 de gratificação de Natal.");
        }
        else {
            if(total > 30 && total <= 40){
                System.out.println("O funcionário receberá R$175 de gratificação de Natal.");
            }
            else{
                if(total > 20 && total <= 30){
                    System.out.println("O funcionário receberá R$150 de gratificação de Natal.");
                }
                else{
                    if(total > 10 && total <= 20){
                        System.out.println("O funcionário receberá R$125 de gratificação de Natal.");
                    }
                    else{
                        if(total <= 10){
                            System.out.println("O funcionário receberá R$100 de gratificação de Natal.");
                        }
                    }
                }
            }
        }

        in.close();
    }
}