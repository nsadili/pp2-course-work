public class Primes
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Please enter a  number");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);

        var count = 0;

        for(int i=1; i <= n; i++)
        {
            if(n % i == 0) count++;
        }

        if(count == 2) 
        System.out.println("The number is prime");
        else
        System.out.println("The number is not prime");


    }
}