import java.util.Scanner;

public class parImpar {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] par = new int[4];
	    int[] impar = new int[4];
	    int valor, cont = 0, cont2 = 0;
        
        while(true){
	        System.out.println("O que você deseja realizar?");
	        System.out.println("1 - Armazenar número\n2 - Procurar por um número\n3 - Exibir números pares");
            System.out.println("4 - Exibir números ímpares\n5 - Encerrar programa");
	        int escolha = in.nextInt();
            
            while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {
                System.out.println("Valor Inválido. Reinforme: ");
                System.out.println("1 - Armazenar número\n2 - Procurar por um número\n3 - Exibir números pares");
                System.out.println("4 - Exibir números ímpares\n5 - Encerrar programa");
                escolha = in.nextInt();
            }

	        if(escolha == 1) {
	 	        System.out.print("Informe o valor que deseja armazenar: ");
		        valor = in.nextInt();
		        if(valor % 2 == 0){
		 	        if(inserirValores(par, cont, valor) == 1) {
                        System.out.println("Inserção realizada com sucesso.\n");
                        cont ++;
                    }
                    else {
                        System.out.println("O vetor está cheio, inserção não realizada.\n");
                    }
		        }
		        else {
		 	        if(inserirValores(impar, cont2, valor) == 1) {
                        System.out.println("Inserção realizada com sucesso.\n");
                        cont2 ++;
                    }
                    else {
                        System.out.print("O vetor está cheio, inserção não realizada.\n");
                    }
		        }
	        }
	        else if(escolha == 2) {
	 	        System.out.print("Informe o número que deseja pocurar: ");
		        valor = in.nextInt();
		        if(valor % 2 == 0){
		 	        if(busca(par, cont, valor) == - 1) {
                        System.out.println("O vetor não foi encontrado.");
                    }
                    else {
                        System.out.println("O vetor se encontra na posição " + busca(par, cont, valor) + ".");
                    }
		        }
		        else {
                    if(busca(impar, cont2, valor) == - 1) {
                        System.out.println("O vetor não foi encontrado.");
                    }
                    else {
                        System.out.println("O vetor se encontra na posição " + busca(impar, cont2, valor) + ".");
                    }
		        }
            }
	        else if(escolha == 3) {
                System.out.println("Os números pares: ");
                exibirVetor(par, cont);
	        }
	        else if(escolha == 4){
                System.out.println("Os números ímpares: ");
                exibirVetor(impar, cont2);
	        }
	        else {
                System.out.print("Até mais!");
                break;
	        }
        }
        in.close();
    }
	public static int inserirValores(int[] vetor, int cont, int valor){
        if(cont != vetor.length){
            vetor[cont] = valor;
            return 1;
        }
	    else {
            return 0;
        }
	}
	public static void exibirVetor (int[] vetor, int cont) {
	    for(int i = 0; i < cont; i++) {
		    System.out.print(vetor[i] + " ");
	    }
        System.out.println("");
	}
	public static int busca(int[] vetor, int cont, int valor) {
        int x = 0;
	    for(int i = 0; i < cont; i++) {
		    if(vetor[i] == valor){
			    x = i;
                break;
		    }
		    else {
			    x = -1;
		    }
	    }
        return x;
	}
}