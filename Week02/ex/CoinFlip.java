//package rufiz_bayramov.week1;
//import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args){
       double res;
       int a = 0 ;int b = 0;
       var n = Integer.parseInt(args[0]);
       for(int i = 0; i < n ; i++){
            res = Math.random();
            if(res < 0.5){
                System.out.println("Head");
                a++;
            }
            else{
                System.out.println("Tail");
                b++;
            }
        }
        System.out.printf("Head %d Tail %d" , a , b);
        
        
    }
}