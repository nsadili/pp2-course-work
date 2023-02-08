package Week2;
import java.util.*;
public class ArmstrongNumbers2 {
    public static void main(String args[]){
        //I could not get right answer, since i became zero after while loop finsihed. How can I solve the problem?
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 0;

        for(int i=a; i<=b; i++){
            while(i%10!=0){
            sum += Math.pow(i%10, 3);
            i=i/10;
        }

        if(sum==i){
            System.out.println(i+" is Armstrong number.");
        }else{
            System.out.println(i+" is not Armstrong number.");
        }
        }
        sc.close();
    }
}
