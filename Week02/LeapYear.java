package Week2;
import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0 && year%1000!=0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Sorry, it is not leap year");
        }
        sc.close();
    }
}
