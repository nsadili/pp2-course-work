import java.util.Scanner;

public class SumOfOdd {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;

        for (int i=m; i<n; i++){
            if (i%2==1) {
                sum+=i;
                //System.out.println(i);
            }
        }
    System.out.println(sum);
    }
}
