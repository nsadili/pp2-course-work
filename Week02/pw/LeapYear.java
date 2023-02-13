import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please give me two integers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s = 0;
        int a, b;
        if (n1 < n2) {
            a = n1;
            b = n2;
        } else {
            a = n2;
            b = n1;
        }


        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                s += i;
            }
        }

        System.out.println(s);
    }
}