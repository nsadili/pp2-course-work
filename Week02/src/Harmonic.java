import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float res = 0;
        for(int i= 1; i<=n; i++){
            res += 1.0/i;
        }
        System.out.println(res);
    }
}
