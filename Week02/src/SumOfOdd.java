import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int sum = 0;
        for(int i = n ; i <= m ; i++){
           if (i % 2 != 0) sum += i;
        }
        System.out.println(sum);
    }
}
