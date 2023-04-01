import java.util.Scanner;
public class verificarDigitoCpf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um cpf: ");
        String cpf = in.nextLine();
        boolean certo = false;

        if(cpf.length() == 11) {
            for(int i = 0; i < cpf.length(); i++) {
                char posicao = cpf.charAt(i);

                if(Character.isDigit(posicao) == true) {
                    certo = true;
                }
                else {
                    certo = false;
                    break;
                }
            }
        }
        if(certo == true) {
            System.out.println("XXX.XXX.XXX-XX");
        }
        else {
            System.out.println("Valor incoerente. Digite um cpf válido de 11 dígitos numéricos.");
        }
        in.close();
    }
}
