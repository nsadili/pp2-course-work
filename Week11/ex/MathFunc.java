interface MathFunc1 {
    int func(int n);

    MathFunc1 factorial = (n) -> {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact; // a must
    };

    public static void main(String[] args) {
        System.out.println("5! is " + factorial.func(5));

    }
}
