import java.util.Scanner;

public class coordenadaVertices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int coordenadaX, coordenadaY, coordenada2X, coordenada2Y;
        int coordenada3X, coordenada3Y, coordenada4X, coordenada4Y, largura, altura;
        System.out.println("Qual a coordenada x do primeiro vértice? ");
        coordenadaX = entrada.nextInt();
        System.out.println("Qual a coordenada y do primeiro vértice? ");
        coordenadaY = entrada.nextInt();
        System.out.println("Qual a altura do retângulo? ");
        altura = entrada.nextInt();
        System.out.println("Qual é a largura do retângulo? ");
        largura = entrada.nextInt();

        coordenada2X = coordenadaX;
        coordenada2Y = altura + coordenadaY;
        coordenada3X = largura + coordenadaX;
        coordenada3Y = coordenadaY;
        coordenada4X = coordenada3X;
        coordenada4Y = coordenada2Y;

        System.out.println("o valor do primeiro vértice será de " + "(" + coordenada2X + "," + coordenada2Y + ")");
        System.out.println("o valor do segundo vértice será de " + "(" + coordenada3X + "," + coordenada3Y + ")");
        System.out.println("o valor do segundo vértice será de " + "(" + coordenada4X + "," + coordenada4Y + ")");
        entrada.close();
    }
}