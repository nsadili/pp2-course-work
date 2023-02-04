public class Fact
{
    public static void main(String[] args)
    {
        if(args.length < 1)
        {
            System.out.println("Please, enter a variable");
            System.exit(1);
        }
        
        var n = Integer.parseInt(args[0]);

        if(n < 0)
        {
            System.out.println("Please, enter a non-negative variable");
            System.exit(1);
        }

        var f = 1;
        var c = 1;

        while(c <= n)
        {
            f *= c;
            c++;

        }
        System.out.printf("%d!= %d\n", n, f);
    }
}
