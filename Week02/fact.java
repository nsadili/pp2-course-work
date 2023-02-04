class fact {
    static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Please provide an integer as an argument.");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            int result = factorial(n);
            if (result == -1) {
                System.out.println("Error: Factorial of negative numbers is not defined.");
            } else {
                System.out.println("Factorial of " + n + " is " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer as an argument.");
        }
    }
}
