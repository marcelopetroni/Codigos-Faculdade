import java.util.Scanner;
public class votacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] votos = new int[9];
        char resp;
        int escolha;
        int nulo = 0;
        int total = 0;
        for(int i = 0; i < votos.length; i++) {
            votos[i] = 0;
        }
        do {
            System.out.println("Em quem você deseja votar?");
            System.out.println("[0] para branco.\n[1] para João.\n[2] para Maria.\n[3] para Pedro.\n[4] para Luís.");
            System.out.println("[5] para Ana.\n[6] para Luiza.\n[7] para Silvia.\n[8] para André.");
            escolha = in.nextInt();
            if(escolha < 0 || escolha > 8) {
                nulo ++;
            }
            else {
                preencherVetor(votos, escolha);
            }
            System.out.print("Tem mais algum eleitor que deseja votar? ");
            resp = in.next().charAt(0);
            total ++;
        } while(resp != 'N' && resp != 'n');

        exibirVetor(votos, total, nulo);
        in.close();
    }
    public static void preencherVetor(int [] vetor, int escolha) {
        vetor[escolha] = vetor[escolha] + 1;
    }
    public static void exibirVetor(int [] votos, int total, int nulo) {
        double percentual;

        for(int i = 0; i < votos.length; i++) {
            percentual = (votos[i] * 1.0/total * 1.0) * 100;
            if(i == 0) {
                System.out.println("O total de votos brancos foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 1) {
                System.out.println("O total de João foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 2) {
                System.out.println("O total de votos de Maria foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 3) {
                System.out.println("O total de votos de Pedro foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 4) {
                System.out.println("O total de votos de Luís foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 5) {
                System.out.println("O total de votos de Ana foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 6) {
                System.out.println("O total de votos de Luiza foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else if(i == 7) {
                System.out.println("O total de votos de Silvia foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
            else {
                System.out.println("O total de votos de André foi de " 
                + String.format("%.2f", percentual) + "%.");
            }
        }
        double nulos = (nulo * 1.0/ total * 1.0) * 100;
        System.out.println("O total de votos nulos foi de " 
        + String.format("%.2f", nulos) + "%.");
    }
}
