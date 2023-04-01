import java.util.Scanner;

public class centroCírculo {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pontoX, pontoY, pontoX2, pontoY2, pontoXCirculo, pontoYCirculo, raio;
        
        System.out.println("Qual é o valor de X do canto superior esquerdo?");
        pontoX = in.nextInt();
        System.out.println("Qual é o valor de y do canto superior esquerdo?");
        pontoY = in.nextInt();
        System.out.println("Qual é o valor de X do canto inferior direito?");
        pontoX2 = in.nextInt();
        System.out.println("Qual é o valor de y do canto inferior direito?");
        pontoY2 = in.nextInt();
        
        pontoXCirculo = pontoX + (pontoX2 - pontoX)/2;
        pontoYCirculo = pontoY2 + (pontoY - pontoY2)/2;
        raio = pontoYCirculo - pontoY2;
        
        System.out.println("As coordenadas do centro do círculo será: " + "(" + pontoXCirculo + "," + pontoYCirculo + ")");
        System.out.println("O raio do círculo será de " + raio + "cm");
        in.close();
    }
}