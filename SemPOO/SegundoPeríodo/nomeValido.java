import java.util.Scanner;
public class nomeValido {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        String nome = in.nextLine();
        boolean certo = false;

        for(int i = 0; i < nome.length(); i++) {
            char posicao = nome.charAt(i);
            if(Character.isLetter(posicao) ==  false && Character.isSpaceChar(nome.charAt(i)) == false) {
                certo = false;
                System.out.println("Nome inválido. Informe apenas letras e espaços.");
                break;
            }
            else {
                certo = true;
            }
        }
        if(certo == true) {
            System.out.println("Olá, " + nome + ", prazer em te conhecer!");
        }
        in.close();
    }
}
