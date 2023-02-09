package Week02.ex;

public class Calc {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Please provide some input");
            System.exit(1);
        }
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println("Addition is " + (n1+n2));
        System.out.println("Subtraction is " + (n1-n2));
        System.out.println("Multiplication is " + (n1*n2));
        System.out.println("Division is " + (n1/n2));
        System.out.println("Remainder of division is " + (n1%n2));


    }
}