import entities.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        int z = 1;

        for(int i = 0; i < 4; i++) {
            System.out.println("\n(" + z + "º produto)");
            System.out.print("Qual é o código do produto? ");
            Integer codigo = in.nextInt();
    
            System.out.print("Descrição do produto? ");
            in.nextLine();
            String descricao = in.nextLine();
    
            System.out.print("Fornecedor do produto? ");
            String fornecedor = in.nextLine();
    
            System.out.print("Qual é o preço do produto? ");
            Double preco = in.nextDouble();
    
            System.out.print("Qual é a quantidade do produto? ");
            Integer quantidade = in.nextInt();
            Produto pd = new Produto(codigo, descricao, fornecedor, preco, quantidade);
            list.add(pd);
            z++;
        }
        System.out.println();
        z = 1;
        // aplicando desconto nos 2 primeiros produtos da lista
        for(int i = 0; i < 2; i++) {
            System.out.println("Informe a porcentagem (0 - 100) de desconto do #" + z + " produto: ");
            double desconto = in.nextDouble();
            list.get(i).aplicarDesconto(desconto);
            z++;
        }
        z = 3;
        // aplicando aumento nos 2 últimos produtos da lista
        for(int i = 2; i < 4; i++) {
            System.out.println("Informe a porcentagem (0 - 100) de aumento do #" + z + " produto: ");
            double aumento = in.nextDouble();
            list.get(i).aplicarAumento(aumento);
            z++;
        }
        z = 1;
        // acrescenta estoque aos 2 primeiros objetos da lista
        for(int i = 0; i < 2; i++) {
            System.out.println("Informe a quantidade que deseja acrescentar ao estoque do #" + z + " produto: ");
            int atualizar = in.nextInt();
            list.get(i).atualizarEstoque(atualizar);;
            z++;
        }
        z = 3;
        // diminui o estoque aos 2 últimos objetos da lista
        for(int i = 2; i < 4; i++) {
            System.out.println("Informe a quantidade que deseja retirar ao estoque do #" + z + " produto: ");
            int venda = in.nextInt();
            list.get(i).venderProduto(venda);;
            z++;
        }
        z = 1;
        // exibir
        for(int i = 0; i < 4; i ++) {
            System.out.println();
            System.out.println("\n(" + z + "º produto)");
            System.out.print(list.get(i).toString());
            z++;
        }
        in.close();
    }
}
