package math;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("Min function: "+ MathDemo.min(10, 100));

        System.out.println("Max function: "+ MathDemo.max(10, 100));

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        int i=0;

        for (i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        System.out.println("Sum function: "+ MathDemo.sum(arr));
        
        System.out.println("Mean value function: "+ MathDemo.mean(arr));
        
        System.out.println("Factorial function: "+ MathDemo.factorial(5));
    }
}
