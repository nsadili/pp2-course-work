import java.util.Scanner;

public class class {
    public static void main(String args[]) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        if (n==1) {
            System.out.println("Not prime");
        }
        for (int i=2; i<math.sqrt(n); i++)
        {
            if (n%i==0) {
                System.out.println("Not prime");
                return 0;
            }
        }

    }
    
    System.out.println("Prime");
}
