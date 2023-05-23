package Week02;

import java.util.Scanner;

public class Calc {
    public static int main(String args[]) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        if (n==1) {
            System.out.println("Not prime");
        }
        Object math;
        for (int i=2; i<((Object) math).sqrt(n); i++)
        {
            if (n%i==0) {
                System.out.println("Not prime");
                return 0;
            }
        }

    }
    
    System.out.println("Prime");
}
