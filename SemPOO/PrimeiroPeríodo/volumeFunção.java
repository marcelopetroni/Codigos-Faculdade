import java.util.Scanner;

public class volumeFunção {
    public static double volumeCubo(double volume, double lado) {
        volume = lado * lado * lado;
        return volume;
    }
    public static double volumePara(double base, double h, double comp) {
        double volume;
        volume = base * h * comp;
        return volume;
    }
    public static double volumeEsfera(double volume, double raio) {
        volume = (4 * Math.PI * Math.pow(raio,3))/3;
        return volume;
    }
    public static double volumeCilindro(double raio, double h) {
        double volume;
        volume = Math.PI * Math.pow(raio, 2) * h;
        return volume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int solido;
        char z, resp;

        do {
        System.out.print("Que sólido geométrico você deseja saber o volume?\n['1'] para Cubo.");
        System.out.println("\n['2'] para Paralelepípedo.\n['3'] para Esfera\n['4'] para Cilindro.");
        solido = in.nextInt();

        while(solido != 1 && solido != 2 && solido != 3 && solido != 4) {
            System.out.print("Número inválido. Informe:\n['1'] para Cubo.\n['2'] para Paralelepípedo.");
            System.out.println("\n['3'] para Esfera\n['4'] para Cilindro.");
            solido = in.nextInt();
        }

        if(solido == 1) {
            double x = 1, y;
            System.out.print("Qual é o tamnho do lado do cubo? ");
            y = in.nextDouble();
            System.out.println("O volume do cubo é de " + volumeCubo(x, y) + "cm3");
        }
        else if(solido == 2) {
            double x, y, l;
            System.out.println("Qual é o comprimento do paralelepípedo?");
            x = in.nextDouble();
            System.out.println("Qual é a largura do paralelepípedo?");
            l = in.nextDouble();
            System.out.println("Qual é a altura do paralelepípedo?");
            y = in.nextDouble();
            System.out.println("O volume do paralelepípedo é de " + volumePara(x, y, l) + "cm3");
        }
        else if(solido == 3) {
            double x = 1, y;
            System.out.println("Qual é o raio da esfera?");
            y = in.nextDouble();
            System.out.println("O volume da esfera é de " + String.format("%.2f",volumeEsfera(x, y)) + "cm3");
        }
        else {
            double x, y;
            System.out.println("Qual é o raio do cilindro?");
            x = in.nextDouble();
            System.out.println("Qual é a altura do cilindro?");
            y = in.nextDouble();
            System.out.println("O volume do paralelepípedo é de " + String.format("%.2f",volumeCilindro(x, y)) + "cm3");

        }

        System.out.println("\nVocê deseja continuar?\n['S'] para sim.\n['N'] para não."); 
        z = in.next().charAt(0);
        resp = Character.toUpperCase(z);

        while(resp != 'S' && resp != 'N') {
            System.out.println("Valor inválido. Informe:\n['S'] para sim.\n['N'] para não.");
            z = in.next().charAt(0);
            resp = Character.toUpperCase(z);
        }

    } while(resp == 'S');

    in.close();
    }
}