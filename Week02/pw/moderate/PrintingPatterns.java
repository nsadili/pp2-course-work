import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0, j = 0;
        boolean flag = true;
        for (; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print((flag ? "*" : "#") + " ");
                flag = !flag;
            }
            System.out.println();
            flag = (i % 2 > 0);
        }
    }
}
