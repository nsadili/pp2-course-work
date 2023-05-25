public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        } else {
            System.out.println(factorial(n));
        }

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }


}