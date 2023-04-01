import java.util.Scanner;
import java.text.DecimalFormat;

public class areaTriangulo {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double s1, s2, s3, area, t;
        System.out.println("Qual é o valor do primeiro lado do triângulo? ");
        s1 = in.nextDouble();
        System.out.println("Qual é o valor do segundo lado do triângulo? ");
        s2 = in.nextDouble();
        System.out.println("Qual é o valor do terceiro lado do triângulo? ");
        s3 = in.nextDouble();

        t = (s1 + s2 + s3)/2;
        area = Math.sqrt(t * (t - s1) * (t - s2) * (t - s3));
        
        System.out.println("a área do triângulo vale " + new DecimalFormat("#,##0.00").format(area) + "cm2");
        in.close();
    }
}