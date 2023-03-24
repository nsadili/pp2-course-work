public class MyMathClass {
    public static void main(String[] args) {
        MathDemo math = new MathDemo();
        int min = math.min(5, 10);
        int max = math.max(5, 10);
        int sum = math.sum(new int[]{1, 2, 3});
        float mean = math.mean(new int[]{1, 2, 3});
        int factorial = math.factorial(5);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sum: " + sum);
        System.out.println("mean: " + mean);
        System.out.println("factorial: " + factorial);
    }
}
