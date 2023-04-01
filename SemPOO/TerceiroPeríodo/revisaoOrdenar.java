import java.util.Scanner;
public class revisaoOrdenar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] num = new double[3];

        for(int i = 0; i < num.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            num[i] = in.nextDouble();
        }
        for(int z = 0; z < num.length - 1; z++) {
            if(num[z] > num[z + 1]) {
                double guardar = num[z];
                num[z] = num[z + 1];
                num[z + 1] = guardar;
            }
            if(z > 0) {
                if(num[z] < num[z - 1]) {
                    double guardar = num[z];
                    num[z] = num[z - 1];
                    num[z - 1] = guardar;
                }
            }
        }
        System.out.print("Os números ordenados: ");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        in.close();
    }
}
