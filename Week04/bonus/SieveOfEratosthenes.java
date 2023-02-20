import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();

        int[] a = prime(N);
        System.out.print("Prime Numbers: ");
        for (var i = 1; i < a.length; i++) {
            if (a[i] == 1) {
                System.out.print(i+" ");
            }
        }
    }

    public static int[] prime(int n) {

        int[] A = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            A[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            if (A[i] == 1) {
                for (int j=i*2; j<=n; j+=i) {
                    A[j] = 0;
                }
            }
        }
        return A;
    }
}