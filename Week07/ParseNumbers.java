public class ParseNumbers {
    public static void main(String[] args) {
        String input = "123 456 abc 789 xyz";
        String[] tokens = input.split("\\s+");

        int sum = 0;
        int count = 0;

        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                // Ignore non-number inputs
            }
        }

        double average = count > 0 ? (double) sum / count : 0.0;

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
    }
}
