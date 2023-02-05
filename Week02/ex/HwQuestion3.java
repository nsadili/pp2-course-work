import java.util.Scanner;

public class HwQuestion3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a = 1;

        int i;
        for (i = 0; i < n; i++) {

            System.out.print(a++);

            if (a == 8) {
                 a = 1;
            }
        }


    }
}
