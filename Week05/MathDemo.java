public class MathDemo
{
    public static int min(int a, int b)
    {
        return Math.min(a, b);
    }

    public static int max(int a, int b)
    {
        return Math.max(a, b);
    }

    public static int sum(int[] args)
    {
        int sum = 0;
        for(int arg : args)
        {
            sum += arg;
        }
        return sum;
    }

    public static float mean(float[] args)
    {
        int sum = 0;
        for(float arg : args)
        {
            sum += arg;
        }        
        float mean = sum / args.length;
        return mean;
    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            int res = 1;
            for(int i = 1; i <= n; i++)
            {                
                res *= i;
            }
            return res;
        }


        // if(n==0)
        // {
        //     return 1;
        // }
        // else 
        // {
        //     return n* factorial(n-1);
        // }
    }

    public static void main(String[] args)
    {
        System
    }
}

// Defining these methods as static would allow them to be called without needing to create an instance of the MathDemo class.
// For example, if the methods were static, you could call MathDemo.min(3, 5)
// instead of needing to first create a MathDemo object and then calling mathDemo.min(3, 5). 
// This can be useful in situations where you only need to call a method once or where creating an object would be unnecessary overhead.  
// Additionally,static methods can be used in other classes without needing to create an instance of the MathDemo class, 
// which can be helpful in organizing code and reducing redundancy.