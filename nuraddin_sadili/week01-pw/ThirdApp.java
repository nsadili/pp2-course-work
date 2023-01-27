public class ThirdApp {
    public static void main(String[] args) {

        int a = 10;
        var b = 1L;
        var c = 3.14F;

        var sum = a + b + c;

        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Long.MAX_VALUE);

        System.out.printf("%d + %d + %.3f = %.3f\n", a, b, c, sum);
    }
}
