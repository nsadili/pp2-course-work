public class Main2 {
    public static void main(String[] args) {
        String input1 = "123 456 abc 789 xyz";
        parseNumbers(input1);

        System.out.println();

        String input2 = "abc def ghi";
        parseNumbers(input2);

        System.out.println();

        String input3 = "";
        parseNumbers(input3);
    }

    private static void parseNumbers(String input) {
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

        System.out.println("Input: " + input);
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
    }
}
