public class Average {
    public static void main(String[] args) {

        int sum = 0;
        for (String token : args) {
            // sum += Integer.parseInt(token);
            sum += Integer.valueOf(token);
            // count++;
        }

        float avg = (float) sum / args.length;

        if (args.length == 0) {
            System.out.println("You did not provide any value at all!");
        } else {
            System.out.printf("Sum: %d and Avg: %.3f\n", sum, avg);
        }

    }
}
