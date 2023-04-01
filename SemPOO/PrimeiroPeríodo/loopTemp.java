import java.util.Scanner;

public class loopTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0, percentual, media;
        double temperatura = 0, x = 0, i = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        char condicao = 0;

        while(condicao != 's' || condicao != 'S') {
        System.out.println("Informe uma temperatura no intervalo de -40° e 60°.");
        temperatura = in.nextDouble();
        
        while(temperatura < -40 || temperatura > 60) {
            System.out.println("Temperatura inválida. Informe um valor entre -40° e 60°.");
            temperatura = in.nextDouble();
        }
        if(temperatura > 30) {
            x = x + 1;
        }
        i = i + 1;
        soma = soma + temperatura;

        // Obriga o usuário a informar no mínimo 5 valores para os seguintes serem opcionais.
        if(i > 4) {
        System.out.println("Quer continuar o programa? Digite 's' para sim e 'n' para não.");
        condicao = in.next().charAt(0);

        if(condicao == 'n' || condicao == 'N') {
            break;
        } else {
            if(condicao == 's' || condicao == 'S') {
                continue;
            }
            else {
                while(true) {
                    System.out.println("Valor irreconhecível, Informe 's' para continuar o programa e 'n' para parar.");
                    condicao = in.next().charAt(0);

                    if(condicao == 's' || condicao == 'S' || condicao == 'n' || condicao == 'N') {
                        break;
                    }
                }
                if(condicao == 'n' || condicao == 'N') {
                    break;
                }
            }
        }
        }
        if(temperatura > maior) {
            maior = temperatura;
        }
        if(temperatura < menor) {
            menor = temperatura;
        }
        }
        media = soma/i;
        System.out.println("A temperatura média diária é de " + media + "°");
        percentual = (x/i) * 100;
        System.out.println("O percentual de temperaturas acima de 30 graus é de " + percentual + "%");

        in.close();
    }
}