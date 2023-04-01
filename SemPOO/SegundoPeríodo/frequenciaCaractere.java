import java.util.Scanner;
public class frequenciaCaractere {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = in.nextLine();
		
		System.out.print("Informe um caractere para contar sua frequência: ");
		char caractere = in.next().charAt(0);
        char ch = Character.toLowerCase(caractere);
        char CH = Character.toUpperCase(caractere);
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++) 		{
			if(ch == frase.charAt(i) || CH == frase.charAt(i)) {
				cont ++;
			}
		}
		System.out.println("há uma frequência de " + cont + " vezes no qual '" + caractere + "' aparece na frase informada.");
        in.close();
	}
}