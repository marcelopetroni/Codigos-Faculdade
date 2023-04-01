import java.util.Scanner;

public class recomendação {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double cr;

        System.out.println("Qual é seu coeficiente de rendimento?");
        cr = in.nextDouble();

        if(cr >= 9){
           System.out.println("Este aluno é altamente recomendado.");
        }
        else {
            if(cr >= 8) {
                System.out.println("Este aluno é fortemente recomendado.");
            }
            else{
                if(cr >= 7){
                    System.out.println("Este aluno é recomendado.");
                }
                else{
                    if(cr < 7){
                        System.out.println("Este aluno não é recomendado.");
                    }
                }
            }
        }

        in.close();
    }
}