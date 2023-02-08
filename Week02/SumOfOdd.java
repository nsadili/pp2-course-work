package Week2;
import java.util.*;
public class SumOfOdd{
    public static void main(String aegs[]){
       Scanner sc = new Scanner(System.in); 
       int a = sc.nextInt();
       int b = sc.nextInt();
       long sum = 0;
       //a=3 b=7 3,5,7
       if(a<b){
       for(int i=a; i<=b; i++){
        if(a%2!=0){
            sum+=a;
        }
       }
    }else{
        for(int i=b; i<=a; i++){
        if(b%2!=0){
            sum+=b;
        }
       }
    }

    System.out.println(sum);
    sc.close();

    }
}