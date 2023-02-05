import java.util.Scanner;


public class TaylorSin {
    public static long MathFac(int a){
        int f=1;
        int cnt=1;
        while(cnt<=a)
        {
            f*=cnt;
            cnt++;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add x!");
        var x = sc.nextFloat();
        System.out.println("Add n!");
        var n = sc.nextInt();
        var res = 0.0;
        var SIN1 = 0.0;
        double SIN2 = Math.sin(x);

        for (int i=0;i<=n;i++)
        {
            SIN1 = Math.pow(-1,i) * (Math.pow(x, 2*i+1) / MathFac(2*i+1));// need to create a factorial function
            res+=SIN1;
        }
        System.out.printf("If we compare Taylor Series and SIN Function, Taylor Series is %f, SIN Function is %f.", res, SIN2);
    }

}
