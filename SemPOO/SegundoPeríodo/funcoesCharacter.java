import java.util.Scanner;
public class funcoesCharacter {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = in.nextLine();
		
		int letras = 0;
		int numeros = 0;
		int espacos = 0;
		int simbolos = 0;
		
		for(int i = 0; i < frase.length(); i++) 		{
		if(Character.isLetter(frase.charAt(i)) == true){
			letras ++;
			}
		else if(Character.isDigit(frase.charAt(i)) == true) {
			numeros ++;
		}
		else if(Character.isSpaceChar(frase.charAt(i)) == true) {
			espacos ++;
		}
		else if(!Character.isLetterOrDigit(frase.charAt(i)) == true) {
			simbolos++;
		}
}
		System.out.println("N° letras: " + letras + "\nN° de números: " + numeros);
		System.out.println("N° de espaços em branco: " + espacos + "\nN° de símbolos: " + simbolos);
        in.close();
	}
}