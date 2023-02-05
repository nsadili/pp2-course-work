public class Fact {
    public static void main(String[] args) {
        
        if (args.length < 1)
        {
            System.out.println("Please, provide a number!");
            System.exit(1);
        }
        
        var n = Integer.valueOf(args[0]);

        if (n<0) 
        {
            System.out.println("Please enter a positive number!");
            System.exit(1);
        }

        long F=1;

        for (int i=1; i<=n;i++)
        {
            F*=i;
        }
        System.out.printf("%d! = %d", n, F);
    }
}