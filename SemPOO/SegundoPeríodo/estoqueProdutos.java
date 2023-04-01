import java.util.Scanner;
public class estoqueProdutos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] codigoProduto = new int[50];
        int[] quantidadeProduto = new int[50];
        int codigo, quantidade, escolha, cont = 0;
        
        // INSERINDO DADOS NOS VETORES:
        do {
            System.out.println("Você deseja registrar um novo produto?\n[1] Sim\n[2] Não");
            escolha = in.nextInt();

            if(cont == codigoProduto.length) {
                System.out.println("Foi atingido a quantidade máxima de produtos registrados.");
                break;
            }
            if(escolha == 1) {
                System.out.print("Informe o código do novo produto: ");
                codigo = in.nextInt();

                for(int i = 0; i < codigoProduto.length; i++) {
                    while(codigo == codigoProduto[i]) {
                        System.out.print("Código informado já registrado em outro produto. Reinforme: ");
                        codigo = in.nextInt();
                    }
                }
                codigoProduto[cont] = codigo;
            
                System.out.print("Informe a quantidade desejada para o produto: ");
                quantidade = in.nextInt();
                System.out.println();

                while(quantidade < 0) {
                    System.out.print("Valor informado inválido. Reinforme uma quantidade positiva: ");
                    quantidade = in.nextInt();
                    System.out.println();
                }
                quantidadeProduto[cont] = quantidade;
                cont ++;
            }
            else if(escolha == 2) {
                if(cont == 0) {
                    System.out.println("Informe pelo menos um produto.");
                    continue;
                }
                else {
                    break;
                }
            }
            else {
                System.out.println("Valor inválido. Reinforme:");
            }

        } while(true);

        // OPÇÕES DE CONTROLE DE MERCADORIAS:
        do {
            menu();
            escolha = in.nextInt();
            if(escolha == 1) {
                System.out.print("Informe o código do produto desejado: ");
                codigo = in.nextInt();
                int produto = procura(codigoProduto, codigo);

                while(produto == -1) {
                    System.out.print("Código inexistente. Reinforme: ");
                    codigo = in.nextInt();
                    produto = procura(codigoProduto, codigo);
                }
                System.out.print("Qual é a quantidade desejada do produto? ");
                quantidade = in.nextInt();
                venda(codigoProduto, quantidadeProduto, codigo, quantidade);        
            }
            else if(escolha == 2) {
                System.out.print("Informe o código do produto desejado: ");
                codigo = in.nextInt();
                estoque(codigo, codigoProduto, quantidadeProduto);
            }
            else if(escolha == 3) {
                System.out.print("Informe o código do produto que deseja atualizar o estoque: ");
                codigo = in.nextInt();
                System.out.print("Informe a quantidade que deseja acrescentar ao estoque: ");
                quantidade = in.nextInt();

                while(quantidade < 0) {
                    System.out.print("Valor informado inválido. Reinforme uma quantidade positiva: ");
                    quantidade = in.nextInt();
                }
                atualizarEstoque(codigoProduto, quantidadeProduto, codigo, quantidade);   
            }
            else if(escolha == 4) {
                System.out.println("Até mais!");
                break;  
            }
            else {
                System.out.println("Opção inválida. Reinforme: ");
            }
        } while(escolha != 4);
        in.close();
    }
    // MÉTODOS: 
    public static void menu(){
        System.out.println("\nOpções:\n1 - Venda de produto\n2 - Consulta de estoque\n3 - Atualização de estoque");
        System.out.print("4 - Encerrar programa\nInforme a opção desejada: ");
        
    }
    public static void venda(int[] codigoProduto, int[] quantidadeProduto, int codigo, int quantidade) {
        int produto = procura(codigoProduto, codigo);

        if(quantidade <= quantidadeProduto[produto]) {
            quantidadeProduto[produto] -= quantidade;
            System.out.println("Pedido atendido.");

            if(quantidadeProduto[produto] == 0) {
                System.out.println("Estoque zerado. Favor, entrar em contato com o fornecedor do produto.");
            }
        }
        else {
            System.out.println("Não temos estoque suficiente desta mercadoria. Favor consultar estoque.");
        }  
    }
    public static int procura(int[] codigoProduto, int codigo){
        for(int i = 0; i < codigoProduto.length; i++) {
            if(codigo == codigoProduto[i]) {
                return i;
            }
        }
        return -1;

    }
    public static void estoque(int codigo, int[] codigoProduto, int[] quantidadeProduto) {
        int produto = procura(codigoProduto, codigo);
        if(produto != -1) {
            System.out.print("Estoque do produto informado: ");
            System.out.print(quantidadeProduto[produto]);
        }
        else {
            System.out.println("Código inexistente.");
        }
    }
    public static void atualizarEstoque(int[] codigoProduto, int[] quantidadeProduto, int codigo, int quantidade) {
        int produto = procura(codigoProduto, codigo);
        if(produto != -1) {
            quantidadeProduto[produto] += quantidade;
        }
        else {
            System.out.println("Código inexistente.");
        }
    }
}