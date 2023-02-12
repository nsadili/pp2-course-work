public class Fact {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x < 0) System.out.println("Factorial of a negative number is not defined!");
        else {
            int result = 1;
            for (int i = 1; i <= x; i++)
                result *= i;
            System.out.println(result);
        }
    }
}