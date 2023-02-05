import java.util.*;
import java.lang.Math;
public class TaylorSin {

    public static int factorial(double number) {
        int fact = 1;
        while (number >= 1) {
            fact *= number;
            number--;
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print n and then x");
        double n=sc.nextDouble();
        double x=sc.nextDouble();
        double ans=0;
        double calc=0;
        for (int i = 0; i <= n; i++) {
            ans = calc + ans;
            calc = (Math.pow(-1, i)*Math.pow(x, 2*i+1))/factorial(2*i+1);

        }
        System.out.println("My sin: "+ans+"\nActual sin: "+ Math.sin(x));
    }


}

