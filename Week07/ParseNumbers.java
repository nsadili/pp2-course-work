package Week07;

public class ParseNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided.");
            return;
        }
        int sum = 0;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                // Ignore non-number input
            }
        }
        System.out.println("Sum of input numbers: " + sum);
    }
}
