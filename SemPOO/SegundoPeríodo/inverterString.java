import java.util.Scanner;
public class inverterString {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Informe um frase para criptografar e inverter: ");
		String frase = in.nextLine();
		String newString = "";
        String invertida = "";
		char vogal = 'a';
		char vogal2 = 'e';
		char vogal3 = 'i';
		char vogal4 = 'o';
		char vogal5 = 'u';

        for(int i = frase.length() - 1; i >= 0; i--) {
            char posicao = frase.charAt(i);
            newString += posicao;
        }
		for(int i = 0; i < newString.length(); i++) {
			char posicao = newString.charAt(i);
			char ch = Character.toLowerCase(posicao);
			char CH = Character.toUpperCase(posicao);
			if(ch == vogal || CH == vogal) {
				invertida += "@";
				continue;
			}
			else if(ch == vogal2 || CH == vogal2) {
				invertida += "$";
				continue;
			}
			else if(ch == vogal3 || CH == vogal3) {
				invertida += "&";
				continue;
			}
			else if(ch == vogal4 || CH == vogal4) {
				invertida += "*";
				continue;
			}
			else if(ch == vogal5 || CH == vogal5) {
				invertida += "#";
				continue;
			}
            invertida += posicao;
		}
        System.out.println("Saída: " + invertida);
        in.close();
	}
}