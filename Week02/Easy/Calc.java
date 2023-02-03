package Easy;
public class Calc {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
    
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Integer division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
      }
}
