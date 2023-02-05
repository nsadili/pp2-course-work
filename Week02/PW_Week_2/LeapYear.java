import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) throws Exception {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a year:");
     int year= sc.nextInt();
     boolean LeapYear= false;

     if(year%4==0){
        if(year%100==0){
          if(year%400==0){
            LeapYear=true;
          }
        }
        else{
             LeapYear=true;
        }
     }
     if(LeapYear){
        System.out.println(year + " is a leap year");

     }
     else{
        System.out.println(year + " is not a leap year");
     }
    
    }
}
