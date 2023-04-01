import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int i = 0, x = 1, y = 0;

        while(i < 40) {
           
            x = x + y;
            y = y + x;
            System.out.println(x);
            System.out.println(y);
            
            i ++;
        }

        in.close();
    }
}