import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();
            try {
                System.out.printf("%d! is %d\n", num, factorial(num));

            } catch (Exception e){
            
               e.printStackTrace();
            }
        }

        scan.close();
    }

    static int factorial(int a) throws Exception {

        if (a < 0)
            throw new IllegalArgumentException(String.format("%d! is undefined", a));

        if (a == 0 || a == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= a; i++)
            f *= i;

        return f;
    }
}