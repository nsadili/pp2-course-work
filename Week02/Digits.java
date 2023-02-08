package Week2;
import java.util.*;
public class Digits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long multip = 1;
        double avg;
        int i = 0;
        //123 
        // 123%10=3 sum=3;  n=12
        //12%10=2 sum=5 n=1

        if(n<0){
            n=-1*n;
        }
        
        while(n%10!=0){
            sum+=n%10; 
            multip*=n%10;
            n=n/10;
            i++;
        }
        avg = (double)sum/i;
        System.out.println("Sum: "+sum);
        System.out.println("Multiplication: "+multip);
        System.out.println("Average: "+avg);
        sc.close();
    }
}
