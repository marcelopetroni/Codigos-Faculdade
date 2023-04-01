import java.util.Scanner;
public class numeroDeVogais {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = in.nextLine();
		frase.toLowerCase();
		char vogal = 'a';
		char vogal2 = 'e';
		char vogal3 = 'i';
		char vogal4 = 'o';
		char vogal5 = 'u';
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++) 		{
			if(vogal == frase.charAt(i)) {
				cont ++;
			}
			else if(vogal2 == frase.charAt(i)) {
				cont++;
			}
			else if(vogal3 == frase.charAt(i)) {
				cont++;
			}
			else if(vogal4 == frase.charAt(i)) {
				cont++;
			}
			else if(vogal5 == frase.charAt(i)) {
				cont++;
			}
		}
		System.out.println("há " + cont + " vogais na frase informada");
		in.close();
	}
}