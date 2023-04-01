import java.util.Scanner;

public class gasolinaGasta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double tempo, consumo, velocidade, distancia, gasto;
        System.out.println ("Em quanto tempo é realizado o percurso? (em horas)");
        tempo = entrada.nextDouble();
        System.out.println ("Qual é o consumo médio? ");
        consumo = entrada.nextDouble();
        System.out.println ("Qual é a velocidade média? ");
        velocidade = entrada.nextDouble();

        distancia = velocidade * tempo;
        gasto = distancia / consumo;

        System.out.print("O gasto de gasolina será de " + gasto + " litros");
        entrada.close();
    }
}
