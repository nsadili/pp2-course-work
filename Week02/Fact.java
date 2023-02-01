public class Fact {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Please provide some input!");
            System.exit(1);
        }

        var n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Please provide a non-negative integer!");
            System.exit(1);
        }
        //var c = 1;
        var f = 1L;

        /*while (c < n) {
            f *= c;
            c++;
        }*/

        for (int c = 1; c <= n; c++) 
            f *= c;

        System.out.printf("%d! = %d\n", n, f);
    }
}
