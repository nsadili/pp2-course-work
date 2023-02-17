import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        int [] a = new int [10];
        double sum = 0;
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
            sum+=a[i];
        }
        System.out.println(sum/a.length);
    }
}
