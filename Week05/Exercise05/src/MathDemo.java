public class MathDemo {
    public static void main(String args[]) {
        int a = 5;
        int b = 7;
        int m[] = {5, 7, 6, 8, -2,  3};
        System.out.println(min(a, b));
        System.out.println(max(a, b));
        System.out.println(sum(m));
        System.out.println(mean(m));
        System.out.println(factorial(a));
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] a) {
        int s  = 0;
        for (int i: a) {
            s += i;
        }
        return s;
    }

    public static float mean(int[] a) {
        if (a.length % 2 == 0)
            return avg(sort(a)[a.length / 2 - 1], sort(a)[a.length / 2]);
        return sort(a)[a.length / 2];
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
        return a;
    }

    public static float avg(int a, int b) {
        return (float)((a + b) / 2.0);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}