package Week02;
public class Calc {
        public static void main(String[] args) {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int sum = n1 + n2;
            int subt = n1 - n2;
            int multipl = n1 * n2;
            int intDiv = n1 / n2;
            int rem = n1 % n2;

            System.out.println("Sum: " + sum);
            System.out.println("Subtraction: " + subt);
            System.out.println("Multiplication: " + multipl);
            System.out.println("Integer Division: " + intDiv);
            System.out.println("Remainder: " + rem);
        }
}