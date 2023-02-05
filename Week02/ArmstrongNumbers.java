import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int sum=0,i=0,ii=0;

        for (i=n; i<m; i++){
            ii=i;
            sum=0;
            while (ii>0){
                int d=ii%10;
                sum+=d*d*d;
                ii/=10;
            }
            if (sum==i) System.out.println(i);
            
        }
        
    }
}
