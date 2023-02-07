import java.lang.Math;
import java.util.Scanner;

public class HwQuestion3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a = 1;

        int i;
        for (i = 0; i < n; i++) {

            System.out.println(a++);

            if (a == 8) {
                 a = 1;
            }
        }

         //System.out.print(java.lang.Math.sqrt(1024)); 

    }
}
