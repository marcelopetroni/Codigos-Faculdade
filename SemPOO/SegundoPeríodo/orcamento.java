import java.util.Scanner;
public class orcamento {
    public static void main(String[] args) {
        double []vetGanhos = new double[12];
        double []vetGastos = new double[12];
        double []vetLucros = new double[12];

        System.out.println("Informe os ganhos dos meses do ano:");
        preencherVetor(vetGanhos);

        System.out.println("Informe os gastos dos meses do ano:");
        preencherVetor(vetGastos);

        System.out.println("______________________\nLUCRO MENSAL:");
        lucros(vetGanhos, vetGastos, vetLucros);
        exibirVetor(vetLucros);

        System.out.println("______________________\nGASTO MENSAL:");
        exibirVetor(vetGastos);

        System.out.println("______________________\nGANHO MENSAL:");
        exibirVetor(vetGanhos);

        System.out.println("______________________\nTOTAL DOS MESES DO ANO:");
        System.out.println("Ganhos:");
        total(vetGanhos);
        System.out.println("\nGastos:");
        total(vetGastos);
        System.out.println("\nLucros:");
        total(vetLucros);

    }
    public static void preencherVetor(double []vetor) {
        Scanner in = new Scanner(System.in);
        int z = 1;
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(z + "º mês: ");
            vetor[i] = in.nextDouble();
            z++;
        }
    }
    public static double[] lucros(double []vetGanhos, double []vetGastos, double []vetLucros) {
        for(int i = 0 ; i < vetLucros.length; i++) {
            vetLucros[i] = vetGanhos[i] - vetGastos[i];
        }
        return vetLucros;
    }
    public static void exibirVetor(double []vetor) {
        int z = 1;
        for(int i = 0 ; i < vetor.length; i++) {
            System.out.println(z + "º mês: " + vetor[i]);
            z++;
        }
    }
    public static void total(double [] vetor) {
        double total = 0;
        for(int i = 0 ; i < vetor.length; i++) {
            total += vetor[i];
        }
        System.out.print("Total acumulado dos meses do ano: R$" + total);
    }
}
