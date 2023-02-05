import java.util.Scanner;

public class TaylorSin {

    public static long fac(int m){
        int fact=1;
        
        for (int j=1; j<=m; j++){
            fact=fact*j;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        double res=0;
        double sum=0;

        for (int i=0; i<n; i++){

            res=Math.pow((-1),i)*(Math.pow(x,(2*i+1))/fac(2*i+1));
            sum+=res;
        }
        // System.out.printf("x is: %d n is: %d", x, n);
        System.out.println(sum);
        
    }
    
}
