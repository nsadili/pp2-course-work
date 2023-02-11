package Week02;

public class Calc {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        System.out.println("The sum is: " + (number1 + number2));
        System.out.println("The subtraction is: " + (number1 - number2));
        System.out.println("The multiplication is: " + (number1 * number2));
        System.out.println("The integer division of number1 over number2 is: " + (number1 / number2));
        System.out.println("The integer division of number2 over number1 is: " + (number2 / number1));
        System.out.println("The integer remainder of number2 over number1 is: " + (number2 % number1));
        System.out.println("The integer remainder of number1 over number2 is: " + (number1 % number2));
    }
}