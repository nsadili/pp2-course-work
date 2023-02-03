public class Fact
{
    public static void main(String[] args)
    {
        if(n < 0)
        {
            System.out.println("Please, enter a variable");
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