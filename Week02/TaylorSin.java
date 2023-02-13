package Week02;

public class TaylorSin {
    public static void main(String[] args) {
        double a = 5;
        int b = 15;
        double sum = 0;
        for (int i = 0; i < b; i++) {

            long fact = 1;
            for (int c = 2; c <= 2 * i + 1; c++) fact *= c;
            System.out.println("Fact: " + fact);

            sum += Math.pow(-1, i) * Math.pow(a, 2*i + 1) / fact;
        }
        System.out.println("By sin function: " + Math.sin(a));
        System.out.println("Calculated: " + sum);
    }
}