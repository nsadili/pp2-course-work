package Week2;
import java.util.*;
public class ArmstrongNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n=371 ->armstrong number
        int x = n;
        long sum = 0;
        while(n%10!=0){
            sum += Math.pow(n%10, 3);
            n=n/10;
        }

        if(sum==x){
            System.out.println(x+" is Armstrong number.");
        }else{
            System.out.println(x+" is not Armstrong number.");
        }
        sc.close();
    }
}