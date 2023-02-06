public class Calc {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Please provide some input");
            System.exit(1);
        }
        
        System.out.println(args[0]);
        System.out.println(args[1]);
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Difference: " + (number1 - number2));
        System.out.println("Product: " + (number1 * number2));
        System.out.println("Quotient: " + (number1 / number2));
        System.out.println("Remainder: " + (number1 % number2));


    }
}
