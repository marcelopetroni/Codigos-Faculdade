import java.util.Scanner;

public class hipotenusa {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Double hip, cat, cat2;
        
        System.out.println("Qual é o valor do primeiro cateto?");
        cat = in.nextDouble();

        System.out.println("Qual é o valor do segundo cateto?");
        cat2 = in.nextDouble();

        hip = Math.sqrt(Math.pow(cat,2) + Math.pow(cat2,2));
        System.out.println("A hipotenusa do triângulo é " + hip);

        in.close(); 
    }
}