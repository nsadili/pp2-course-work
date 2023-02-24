package pp2.week04.pw;

import java.util.Scanner;

public class MathDemo {
    
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    public static int max(int a, int b){
        if(a >= b) return a;
        else return b;
    }
    public static int min(int a, int b){
        if(a <= b) return a;
        else return b;
       
    }
    public static int sum(int[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
           sum += args[i];
        }
        sc.close();
        return sum;
    }
    public static float mean(int[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        for(int i = 0; i < n; i++){
           sum += args[i];
        }
        sc.close();
        return sum / n;
    }
    public static int factorial(int n){
        return n * factorial(n-1);
    }

    /*  The advantages of using static is that the methods are accessible 
        from anywhere without having to create an instance of the class.
        Static methods are also more efficient than non-static methods since 
        the compiler can inline the code of a static method into the caller.  */

}

