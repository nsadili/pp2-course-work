package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
   try {
       while (scan.hasNextInt()) {
           num = scan.nextInt();
           System.out.printf("%d! is %d\n", num, factorial(num));
       }
   }catch(Exception s){
       System.out.println("Error happened : " + s.toString());
   }

        scan.close();
    }

    static int factorial(int n) {
   if(n < 0){
       throw new IllegalArgumentException("The number can not be negative!");
   }
        if (n == 0 || n == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }
}