// package Week05.pw;

public class PW7 {
    public static void main(String[] args) {
        // Defining these methods as static will let us to use them
        // without creating a new object
    }
}

class MathDemo {
    int min(int a, int b) {
        return a <= b ? a : b;
    }

    int max(int a, int b) {
        return a >= b ? a : b;
    }

    int sum(int args[]) {
        int s = 0;
        for (int i = 0; i < args.length; i ++) {
            s += args[i];
        }
        return s;
    }

    float mean(int args[]) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s += args[i];
        }
        return s / args.length;
    }

    int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}