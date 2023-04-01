import java.util.Scanner;
public class vetoresSoma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] A = new double[20];
        double [] B = new double[20];
        double [] C = new double[20];

        System.out.println("Informe os valores de A e B:");
        for(int i = 0; i< A.length; i++) {
            System.out.print("A["+ i + "] = ");
            A[i] = in.nextDouble();
            System.out.print("B["+ i + "] = ");
            B[i] = in.nextDouble();
            C[i] = A[i] + B[i];
        }
        System.out.println("\nValores de C:");
        for(int i = 0; i< A.length; i++) {
            System.out.println(C[i]);
        }
        in.close();
    }
}
