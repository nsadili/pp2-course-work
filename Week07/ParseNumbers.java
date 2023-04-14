public class ParseNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide at least one number as input.");
            return;
        }
        int sum = 0;
        boolean anyValidInput = false;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
                anyValidInput = true;
            } catch (NumberFormatException e) {
                // ignore non-numeric input
            }
        }
        if (anyValidInput) {
            System.out.println("Sum of numbers: " + sum);
        } else {
            System.out.println("No valid input provided.");
        }
    }
}

