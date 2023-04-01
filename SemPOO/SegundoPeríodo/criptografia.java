import java.util.Scanner;
public class criptografia {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Informe um frase para criptografar: ");
		String frase = in.nextLine();
		String newString = "";
		char vogal = 'a';
		char vogal2 = 'e';
		char vogal3 = 'i';
		char vogal4 = 'o';
		char vogal5 = 'u';
		for(int i = 0; i < frase.length(); i++) {
			char posicao = frase.charAt(i);
			char ch = Character.toLowerCase(posicao);
			char CH = Character.toUpperCase(posicao);
			if(ch == vogal || CH == vogal) {
				newString += "@";
				continue;
			}
			else if(ch == vogal2 || CH == vogal2) {
				newString += "$";
				continue;
			}
			else if(ch == vogal3 || CH == vogal3) {
				newString += "&";
				continue;
			}
			else if(ch == vogal4 || CH == vogal4) {
				newString += "*";
				continue;
			}
			else if(ch == vogal5 || CH == vogal5) {
				newString += "#";
				continue;
			}
			newString += posicao;
		}
        System.out.println("Sáida: " + newString);
        in.close();
	}
}