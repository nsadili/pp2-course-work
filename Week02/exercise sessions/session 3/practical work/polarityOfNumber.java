public class polarityOfNumber {
    public static void main(String[] args) {
        double number = Double.parseDouble(args[0]);

        if (number < 0) {
            System.out.println("The number is negative.");
            System.exit(0);
        }
        if (number > 0) {
            System.out.println("The number is positive.");
            System.exit(0);
        }
        else System.out.println("The number is neutral.");
    }
}
