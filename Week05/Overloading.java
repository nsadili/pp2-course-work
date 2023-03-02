public class Overloading {

    static int min(int a, int b) {
        System.out.println("Method 1 was evoked");
        return (a > b) ? b : a;
    }

    static double min(double a, double b) {
        System.out.println("Method 2 was evoked");
        return (a > b) ? b : a;
    }

    static float min(float a, float b) {
        System.out.println("Method 3 was evoked");
        return (a > b) ? b : a;
    }

    public static void main(String[] args) {
        System.out.println(min(2.4, 5.6));
    }

}
