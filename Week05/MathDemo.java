package Week05;

public class MathDemo {

    // advantage: we would be able to use those methods from another classes without
    // creating an object.
    // because static methods are both intance and class variable an are accessible
    // without creating an object.

    int min(int a, int b) {
        return (a < b) ? a : b;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

    }
}
