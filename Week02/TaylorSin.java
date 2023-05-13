import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        if(args.length < 2)
        {
            System.out.println("Send 2 variables");
            System.exit(1);   
        }

        double x = Double.parseDouble(args[0]);
        int n = Integer.valueOf(args[1]);

        var res = 0.0;
        var i = 0;

        for( ; i<n ; i++)
        {            
            var a = Math.pow(-1, i) * (Math.pow(x, 2*i+1) / fact(2*i+1));
            res+ = a;
        }

        System.out.println("Taylor series Result: " + res);
        System.out.println("Math function result: "+ Math.sin(x));        
    }

    public static long fact(int num)
    {
        long res=1;
        int c=1;

        while(c<=num)
        {
            res*=c;
            c++;
        }

        return res;
    }
}