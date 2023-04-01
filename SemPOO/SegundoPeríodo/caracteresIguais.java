import java.util.Scanner;
public class caracteresIguais {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a 1º sequência de caracteres: ");
		String caractere = in.nextLine();
		
		System.out.print("Digite a 2º sequência de caracteres: ");
		String caractere2 = in.nextLine();
        boolean resultado = StringsIguais(caractere, caractere2);

        if(resultado == false) {
            System.out.println("As strings informadas não são iguais.");
        }
        else {
            System.out.println("As strings informadas são iguais.");
        }
        in.close();
	}
    public static boolean StringsIguais(String caractere, String caractere2) {
        boolean tudoOk = false;
        if(caractere.length() == caractere2.length()) {
            for(int i = 0; i < caractere.length(); i++) {
                char pos = caractere.charAt(i), pos2 = caractere2.charAt(i);
                char ch = Character.toLowerCase(pos);
                char CH = Character.toUpperCase(pos);
                char ch2 = Character.toLowerCase(pos2);
                char CH2 = Character.toUpperCase(pos2);

                if(ch == ch2 || ch == CH2 || CH == ch2 || CH == CH2) {
                    tudoOk = true;
                }
                else {
                    tudoOk = false;
                }
            }
        }
        else {
            return false;
        }
        if(tudoOk == true) {
            return true;
        }
        else {
            return false;
        }
    }
}