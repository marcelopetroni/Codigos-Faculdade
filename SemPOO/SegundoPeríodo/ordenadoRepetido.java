import java.util.Scanner;
public class ordenadoRepetido {

    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int cont = 0, valor;
		int[] vet = new int[100];
		char resp;
		do {
		System.out.println("Escolha uma opção abaixo:");
		System.out.println("1 - Inserir novo valor.");
		System.out.println("2 - Remover um valor do vetor\n3 - Exibir valores preenchidos do vetor.");
		int escolha = in.nextInt();

		while(escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {
			System.out.print("Número inválido. Reinforme: ");
			escolha = in.nextInt();
		}

        if(escolha == 1) {
			int opcoes;
			System.out.print("Informe um número para inserir no vetor: ");
			valor = in.nextInt();	
			opcoes = insercao(vet, cont, valor);
			if(opcoes == -1) {
				System.out.println("O vetor está cheio!");
			}
			else {
				System.out.println("Inserção realizada com sucesso.");
				cont ++;
			}
			
		}
		else if(escolha == 2) {
			System.out.print("Informe um número para remover no vetor: ");
			valor = in.nextInt();
			int opcoes = removerValor(vet, cont, valor);
			if(opcoes == -1) {
				System.out.println("Valor não encontrado no vetor.");
			}
			else {
				System.out.println("Removido com sucesso!");
                cont --;
			}
		}
		else {
			exibirValor(vet, cont);
		}

		System.out.println("\nDeseja continuar? (s/n)");
		resp = in.next().charAt(0);
		resp = Character.toLowerCase(resp);

		while(resp != 's' && resp != 'n') {
			System.out.println("Resposta inválida. Informe 's' para Sim e 'n' para Não:");
			resp = in.next().charAt(0);
			Character.toLowerCase(resp);
		}

		}while(resp == 's');
		in.close();
	}
	public static int insercao(int[] vet, int cont, int valor) {
        int[] guardar = new int[vet.length];
		if(cont == vet.length){
			return -1;
		}
		else if(cont == 0) {
			// o vetor está vazio
	    	vet[cont] = valor;
			return cont;
		}
		else {
			int pos, i;
			for(pos = 0; pos < cont; pos++) {
				if(valor < vet[pos]) {
					break;
				}
			}
            for(i = pos; i < cont; i++) { 
                guardar[i] = vet[i];
            }

            for (i = pos; i < cont; i++) { 
                vet[i + 1] = guardar[i];
            }
			vet[pos] = valor;
			return cont;
		}
	}
	public static int busca(int[]vet, int cont, int valor) {
        int[] procura = new int[2];
		boolean checagem = false;
		int i, cont2 = 0;
		for(i = 0; i < cont; i++) {
			if(vet[i] == valor) {
				checagem = true;
                procura[0] = i;
				break;
			}
			else if (vet[i] > valor) {
				break;
			}
		}
        for(i = 0; i < cont; i++) {
            if(vet[i] == valor) {
				cont2 ++;
			}
        }
        procura[1] = cont2;
		if(checagem == true) {
			return procura[0];
		}
		else {
			return -1;
		}
	}
	public static int removerValor(int[] vet, int cont, int valor) {
		int x, procura = busca(vet, cont, valor);
		if(cont == 0) {
			return -2;
		}
		else if(procura != -1) {
			for(x = 0; x < cont; x++){
				if(vet[x] == valor) {
					break;
				}
			}
			cont --;
			for(int i = x; i < cont; i++) {
				vet[i] = vet[i+1];
			}
			return cont;
		}
		else {
			return -1;
		}
	}
	public static void exibirValor(int[] vet, int cont) {
		if(cont == 0) {
			System.out.println("O vetor está vazio.");
		}
		else {
			System.out.println("VALORES DO VETOR:");
	
			for(int i = 0; i < cont; i ++) {
				System.out.print(vet[i] + " ");
		    	}
	    }
    }
}