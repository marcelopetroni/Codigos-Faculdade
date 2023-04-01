import entities.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        int z = 1;
        for(int i = 0; i < 4; i++) {
            System.out.println("\n(" + z + "º pessoa)\n -----------------------");
            System.out.print("Informe o nome da pessoa: ");
            String nome = in.nextLine();
    
            System.out.print("Informe o gênero da pessoa: ");
            char genero = in.next().charAt(0);
    
            System.out.print("Informe a idade da pessoa: ");
            Integer idade = in.nextInt();
    
            System.out.print("Informe o peso da pessoa: ");
            Double peso = in.nextDouble();
    
            System.out.print("Informe a altura da pessoa: ");
            Double altura = in.nextDouble();
            in.nextLine();
            Pessoa p1 = new Pessoa(nome, genero, idade, peso, altura, peso);
            list.add(p1);
            z++;
        }
        // Mudança de alguns dados:
        System.out.println("\nAtualização dos dados:\n--------------------------");
        System.out.print("Atualize a altura da primeira pessoa: ");
        double altura = in.nextDouble();
        list.get(0).atualizarAltura(altura);

        System.out.print("Atualize o peso da segunda pessoa: ");
        double peso = in.nextDouble();
        list.get(1).atualizarPeso(peso);

        System.out.print("Acrescente a idade da terceira pessoa: ");
        int idade = in.nextInt();
        list.get(2).atualizarIdade(idade);
        
        // Exibir dados das pessoas:
        z = 1;
        for(int i = 0; i < 4; i ++) {
            System.out.println();
            System.out.println("\n(" + z + "º pessoa)");
            System.out.print(list.get(i).toString());
            z++;
        }
        in.close();
    }
}
