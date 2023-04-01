import java.util.Scanner;
public class manipulacaoString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codigo;
        System.out.print("Informe o código do produto: ");
        codigo = in.nextLine();
        codigo = codigo.toLowerCase();
        int verificar = verificacao(codigo);
        if(verificar == 1) {
            System.out.println("O código " + codigo + " é válido.");
        }
        else if(verificar == 2) {
            System.out.println("O código " + codigo + " não é válido: quantidade inválida de caracteres.");
        }
        else {
            System.out.println("O código " + codigo + " não é válido: formato incorreto.");
        }

        in.close();
    }
    public static int verificacao(String codigo) {
        boolean certo = false, certo2 = false, certo3 = false;
        char vogal = 'a';

        if(codigo.length() == 9) {
            for(int i = 0; i < 4; i++) {
                char posicao = codigo.charAt(i);
               
                if(Character.isLetter(posicao) ==  true) {
                    if(vogal == codigo.charAt(0)) {
                        certo = true;
                    }
                    certo2 = true;
                }
            }
            for(int i = 4; i < 9; i++) {
                char posicao = codigo.charAt(i);
                if(Character.isDigit(posicao) ==  true) {
                    certo3 = true;
                }
            }
        }
        else {
            return 2;
        }
        if(certo && certo2 && certo3) {
            return 1;
        }
        else {
            return 3;
        }
    }
}