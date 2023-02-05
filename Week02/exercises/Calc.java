public class Calc {
    public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Please, provide two numbers!");
            System.exit(1);
        }
        int a=Integer.valueOf(args[0]);
        int b=Integer.valueOf(args[1]);

        System.out.println("Sum of them = "+(a+b));
        System.out.println("Substraction of them = "+(a-b));
        System.out.println("Multiplication of them = "+(a*b));
        System.out.println("Division of them = "+(a/b));
        System.out.println("Remainder of them = "+(a%b));
    }
}