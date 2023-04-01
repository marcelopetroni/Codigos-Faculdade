import java.util.Scanner;
public class poltronasOnibus {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean[] A = new boolean[12];
    boolean[] B = new boolean[12];
    boolean[] C = new boolean[12];
    boolean[] D = new boolean[12];
    int cont = 0, cont2 = 0;
    char resp;

    do {
        if(cont == A.length + D.length && cont2 == B.length + C.length) {
            System.out.println("Sinto muito, nenhuma poltrona está disponível. Até a próxima!");
            break;
        }
        System.out.println("Você prefere sentar na janela ou no corredor? ");
        System.out.println("[1]Janela\n[2]Corredor");
        int escolha = in.nextInt();

        while(escolha != 1 && escolha != 2) {
            System.out.println("Opção inválida. Informe:\n[1] para janela\n[2] para corredor");
            escolha = in.nextInt();
        }

        if(escolha == 1) {
            if(cont != A.length + D.length) {
                disponivelJanela(A, D);
                cont ++;
                }
            else {
                System.out.println("Sinto muito, não há cadeiras na janela disponíveis.");
                System.out.println("Nessa condição, você deseja uma poltrona no corredor?\n[1] Sim\n[2] Não");
                int desejo = in.nextInt();

                while(desejo != 1 && desejo != 2) {
                    System.out.println("Opção Inválida. Informe:\n[1] Sim\n[2] Não");
                    desejo = in.nextInt();
                }
                if(desejo == 1) {
                    disponivelCorredor(B, C);
                }
                else {
                    System.out.println("Até a próxima!");
                    break;
                }
            }
        }
        else {
            if(cont2 != B.length + C.length) {
                disponivelCorredor(B, C);
                cont2 ++;
            }
            else {
                System.out.println("Sinto muito, não há cadeiras na janela disponíveis.");
                System.out.println("Nessa condição, você deseja uma poltrona no corredor?\n[1] Sim\n[2] Não");
                int desejo2 = in.nextInt();

                while(desejo2 != 1 && desejo2 != 2) {
                    System.out.println("Opção Inválida. Informe:\n[1] Sim\n[2] Não");
                    desejo2 = in.nextInt();
                }
                if(desejo2 == 1) {
                    disponivelJanela(A, D);
                }
                else {
                    System.out.println("Até a próxima!");
                    break;
                }
            }
        }
            System.out.println("\nTem mais alguém que deseja uma passagem? ('N' para não e 'S' para sim)");
            resp = in.next().charAt(0);

        } while(resp != 'N' && resp != 'n');
    }

    public static void disponivelJanela (boolean []A, boolean []D) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cadeiras disponíveis:");
        for(int i = 0; i < 12; i ++) {
            if(!A[i]) {
                System.out.print("A" + i + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < 12; i ++) {
            if(!D[i]) {
                System.out.print("D" + i + " ");
            }
        }
        System.out.println("\nEscolha uma cadeira disponível pela sua fileira e número: ");
        System.out.print("Fileira 'A' ou 'D'? ");
        char opcao = in.next().charAt(0);
        opcao = Character.toUpperCase(opcao);

        while(opcao != 'A'&& opcao != 'D') {
            System.out.print("Opção inválida. Informe A ou D: ");
            opcao = in.next().charAt(0);
            opcao = Character.toUpperCase(opcao);
        }

        System.out.print("Escolha o número da poltrona: ");
        int poltrona = in.nextInt();

        while(poltrona < 0 || poltrona > 11) {
            System.out.print("Opção inválida. Informe uma numeração entre 0 e 11: ");
            poltrona = in.nextInt();
        }
        if(opcao == 'A') {
            while(A[poltrona]) {
                System.out.print("Poltrona ocupada. Reinforme uma numeração disponível: ");
                poltrona = in.nextInt();
            }
        }
        if(opcao == 'D') {
            while(D[poltrona]) {
                System.out.print("Poltrona ocupada. Reinforme uma numeração disponível: ");
                poltrona = in.nextInt();
            }
        }
        preencherJanelas(opcao, poltrona, A, D);
    }

    public static void disponivelCorredor(boolean []B, boolean []C) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cadeiras disponíveis:");
        for(int i = 0; i < 12; i ++) {
            if(!B[i]) {
                System.out.print("B" + i + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < 12; i ++) {
            if(!C[i]) {
                System.out.print("C" + i + " ");
            }
        }
        System.out.println("\nEscolha uma cadeira disponível pela sua fileira e número: ");
        System.out.print("Fileira 'B' ou 'C'? ");
        char opcao2 = in.next().charAt(0);
        opcao2 = Character.toUpperCase(opcao2);

        while(opcao2 != 'B' && opcao2!= 'C') {
            System.out.print("Opção inválida. Informe B ou C: ");
            opcao2 = in.next().charAt(0);
            opcao2 = Character.toUpperCase(opcao2);
        }

        System.out.print("Escolha o número da poltrona: ");
        int poltrona2 = in.nextInt();

        while(poltrona2 < 0 || poltrona2 > 11) {
            System.out.print("Opção inválida. Informe uma numeração entre 0 e 11: ");
            poltrona2 = in.nextInt();
        }
        if(opcao2 == 'B') {
            if(B[poltrona2]) {
                System.out.print("Poltrona ocupada. Reinforme uma numeração disponível: ");
                poltrona2 = in.nextInt();
            }
        }
        if(opcao2 == 'C') {
            if(C[poltrona2]) {
                System.out.print("Poltrona ocupada. Reinforme uma numeração disponível: ");
                poltrona2 = in.nextInt();
            }
        }
        preencherCorredor(opcao2, poltrona2, B, C);
    }
    public static void preencherJanelas(char opcao, int poltrona, boolean []A, boolean []D) {
        if(opcao == 'A') {
            A[poltrona] = true;
        }
        else {
            D[poltrona] = true;
        }
    }
    public static void preencherCorredor(char opcao2, int poltrona2, boolean []B, boolean []C) {
        if(opcao2 == 'B') {
            B[poltrona2] = true;
        }
        else {
            C[poltrona2] = true;
        }
    }
}