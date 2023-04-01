import java.util.Scanner;
public class placaDeCarro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe uma placa de carro: ");
        String placa = in.nextLine();
        boolean verificar = verificacao(placa);
        if(verificar == true) {
            System.out.println("A placa " + placa + " é válida.");
        }
        else {
            System.out.println("A placa " + placa + " não é válida.");
        }

        in.close();
    }
    public static boolean verificacao(String placa) {
        boolean certo = false, certo2 = false;

        if(placa.length() == 7) {
            for(int i = 0; i < 3; i++) {
                char posicao = placa.charAt(i);
               
                if(Character.isLetter(posicao) ==  true) {
                    certo = true;
                }
                else {
                    certo = false;
                    break;
                }
            }
            for(int i = 3; i < 7; i++) {
                char posicao = placa.charAt(i);
                if(Character.isDigit(posicao) ==  true) {
                    certo2 = true;
                }
                else {
                    certo2 = false;
                    break;
                }
            }
        }
        else {
            return false;
        }
        if(certo && certo2) {
            return true;
        }
        else {
            return false;
        }
    }
}