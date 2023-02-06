import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var a = sc.nextInt();
        int i;
        for (i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("not prime");
                break;
            }
        }

        if (i > Math.sqrt(a))
            System.out.println("prime");
    }

}
