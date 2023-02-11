public class digits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int number = Math.abs(n);
        int digit, sum = 0, product = 1, count = 0;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
            count++;
        }

        var average = n != 0 ? (double) sum / count : 0.0;
        product = n == 0 ? 0 : product;

        System.out.printf("Number: %d Sum: %d Product: %d Average: %.3f\n",
        n, sum, product, average);
    }
}
