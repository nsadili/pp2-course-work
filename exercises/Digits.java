import java.util.Scanner;
public class Digits {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        
        sc.close();
        
        int sum=0;
        int product=1;
        double avg=0;
        int cnt=0;

        while (n>0){
            int d=n%10;
            n/=10;
            sum+=d;
            product*=d;
            cnt++;
        }

        avg=sum*1.0/cnt;

        System.out.printf("%d %d %f\n", sum, product, avg );

        

    }
}
