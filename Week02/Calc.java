public class Calc {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("The sum is: " + (x + y));
        System.out.println("The subtraction is: " + (x - y));
        System.out.println("The multiplication is: " + (x * y));
        System.out.println("The integer division number1 over number2 is: " + (x / y));
        System.out.println("The integer division number2 over number1 is: " + (y / x));
        System.out.println("The integer remainder of number2 over number1 is: " + (y % x));
        System.out.println("The integer remainder of number1 over number2 is: " + (x % y));
    }
}