public class Calc {
    public static void main(String[] args) {
       // check if two integers are provided as command-line arguments
       if(args.length != 2) {
          System.out.println("Please provide two integers as command-line arguments.");
          return;
       }
       
       // parse the command-line arguments into integers
       int num1 = Integer.parseInt(args[0]);
       int num2 = Integer.parseInt(args[1]);
       
       // calculate the sum, subtraction, multiplication, integer division and remainder of the division
       int sum = num1 + num2;
       int sub = num1 - num2;
       int mul = num1 * num2;
       int div = num1 / num2;
       int rem = num1 % num2;
       
       // print the results
       System.out.println("Sum: " + sum);
       System.out.println("Subtraction: " + sub);
       System.out.println("Multiplication: " + mul);
       System.out.println("Integer division: " + div);
       System.out.println("Remainder of division: " + rem);
    }
 }
 