import java.util.Scanner;
public class cifraCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("O que você deseja realizar?");
            System.out.println("1 - Criptografar\n2 - Descriptografar\n3 - Finalizar programa");
            escolha = in.nextInt();
            if(escolha == 3) {
                break;
            }
            System.out.println("Quantas posições você deseja deslocar para a direita? ");
            int deslocamento = in.nextInt();

            while(deslocamento < 0) {
                System.out.print("Valor inválido. Informe um número positivo: ");
                deslocamento = in.nextInt();
            }

            if(escolha == 1) {
                System.out.println("Escreva uma mensagem para criptografar: ");
                in.nextLine();
                String mensagem = in.nextLine();
                boolean validacao = validar(mensagem);

                if(validacao == true) {
                    System.out.println("Mensagem criptografada: " + criptografar(mensagem, deslocamento));
                }
                else {
                    System.out.print("Mensagem inválida. ");
                    System.out.println("Informe apenas letras e espaços em branco no conteúdo da mensagem.");
                }
            }
            else if(escolha == 2){
                System.out.println("Escreva uma mensagem para descriptografar: ");
                in.nextLine();
                String mensagem = in.nextLine();
                boolean validacao = validar(mensagem);

                if(validacao == true) {
                    System.out.println("Mensagem descriptografada: " + descriptografar(mensagem, deslocamento));
                }
                else {
                    System.out.println("Mensagem inválida. Informe apenas letras no conteúdo da mensagem.");
                }
            }
        } while(escolha != 0);

        in.close();
    }
    public static boolean validar(String mensagem) {
        for(int i = 0; i < mensagem.length(); i++) {
            char posicao = mensagem.charAt(i);
            if(Character.isLetter(posicao) == false && Character.isSpaceChar(posicao) == false) {
                return false;
            }
        }
        return true;

    }
    public static String criptografar(String mensagem, int deslocamento) {
        int x = 0, conta;
        char [] alfabeto = new char[26];
        String resultado = "";

        for(char c = 'a'; c <= 'z'; c++) {
            alfabeto[x] = c;
            x++;
        }
        for(int i = 0; i < mensagem.length(); i++) {
            char posicao = Character.toLowerCase(mensagem.charAt(i));
            if(Character.isSpaceChar(posicao) == true) {
                resultado += " ";
            }
            else {
                if(posicao + deslocamento <= 122) {
                    conta = posicao + deslocamento;
    
                    for(int z = 0; z < alfabeto.length; z++) {
                        if(conta == alfabeto[z]) {
                            resultado += Character.toUpperCase(alfabeto[z]);
                        }  
                    }
                }
                else {
                    conta = 'a' + ((posicao + deslocamento) % 26);
                    for(int z = 0; z < alfabeto.length; z++) {
                        if(conta == alfabeto[z]) {
                            resultado += Character.toUpperCase(alfabeto[z]);
                        }
                    }
                }
            }
        }
        return resultado;
    }
    public static String descriptografar(String mensagem, int deslocamento) {
        int x = 0, conta;
        char [] alfabeto = new char[26];
        String resultado = "";

        for(char c = 'a'; c <= 'z'; c++) {
            alfabeto[x] = c;
            x++;
        }
        for(int i = 0; i < mensagem.length(); i++) {
            char posicao = Character.toLowerCase(mensagem.charAt(i));
            if(Character.isSpaceChar(posicao) == true) {
                resultado += " ";
            }
            else {
                conta = posicao - deslocamento;
                for(int z = 0; z < alfabeto.length; z++) {
                    if(conta == alfabeto[z]) {
                        resultado += Character.toLowerCase(alfabeto[z]);
                    }  
                }
            }
        }
        return resultado;
    }
}