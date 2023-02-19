import java.util.Scanner;

public class SieveOfEratos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the number: ");
        var number = sc.nextInt();

        var res = findPrime(number);

        for (var i = 1; i < res.length; i++) {
            if (res[i] == 1) {
                System.out.println(i);
            }
        }
    }

    public static int[] findPrime(int n) {

        int[] arr = new int[n + 1];

        for (var i = 2; i <= n; i++) {
            arr[i] = 1;

        }

        for (var i = 2; i <= n; i++) {

            if (arr[i] == 1) {
                // System.out.println("In method: "+i);
                for (var j = i * 2; j <= n; j += i) {
                    arr[j] = 0;
                }

            }

        }

        return arr;

    }

}
