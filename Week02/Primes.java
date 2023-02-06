import java.util.*;
public class Primes {public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int cnt = 0, i;
    if (n <= 1) {
        System.out.print("not a prime number");
        return;
    }
    for (i = 1; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            cnt++;
        }
        if (cnt > 1) {
            System.out.print("not a prime number");
        } else {
            System.out.print("a prime number");
            return;
        }
    }
}}