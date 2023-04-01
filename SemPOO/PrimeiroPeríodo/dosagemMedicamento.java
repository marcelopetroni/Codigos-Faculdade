import java.util.Scanner;

public class dosagemMedicamento {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double idade, peso, gotas, dosagem = 0;

        System.out.println("Qual é sua idade?");
        idade = in.nextDouble();

        System.out.println("Qual é seu peso?");
        peso = in.nextDouble();

        if(idade >= 12){
            if(peso >= 60) {
                dosagem = 1000;
            }
            else {
                dosagem = 875;
            }
        }
        if(idade < 12) {
            if(peso < 5) {
                System.out.println("Essa criança não pode tomar o meciamento devido a seu baixo peso.");
            }
            else {
                if(peso <= 9){
                    dosagem = 125;
                }
                else{
                    if(peso <= 16){
                        dosagem = 250;
                    }
                    else {
                        if(peso <= 24){
                            dosagem = 375;
                        }
                        else {
                            if(peso <= 30){
                                dosagem = 500;
                            }
                            else{
                                if(peso > 30){
                                    dosagem = 750;
                                }
                            }
                        }
                    }
                }
            }
        }

        gotas = (20 * dosagem)/500;
        System.out.println("Será necessário uma quantidade de " + gotas + " gotas a ser tomado do medicamento.");

        in.close();
    }
}