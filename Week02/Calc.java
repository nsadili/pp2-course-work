package Week02;

public class Calc {
        public static void main(String[] args) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("The sum is: " + (num1 + num2));
            System.out.println("The subtraction is: " + (num1 - num2));
            System.out.println("The multiplication is: " + (num1 * num2));
            System.out.println("The integer division number1 over number2 is: " + (num1 / num2));
            System.out.println("The integer division number2 over number1 is: " + (num2 / num1));
            System.out.println("The integer remainder of number2 over number1 is: " + (num2 % num1));
            System.out.println("The integer remainder of number1 over number2 is: " + (num1 % num2));
        }
    }


