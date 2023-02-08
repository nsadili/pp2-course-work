package Week2;
import java.util.*;
public class TaylorSin {
    public static long fact(int i){
        if(i==0) return 1;
        else return fact(2*i)*(2*i+1);        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        int i;
        double sum = 0.0;
        for(i=0; i<n; i++){
            sum+=Math.pow(-1, i)*Math.pow(x, (2*i+1))/fact(i);

        }
        System.out.println(sum);
        System.out.println(Math.sin(x));
        sc.close();
    }
}
