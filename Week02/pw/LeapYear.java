import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        if (year%4==0) {  //Can we just use &&  ?
        if (year%100==0) {
        if (year%400==0) {
      System.out.println("leap year");
        }
      else 
      System.out.println("not leap year");
    }
}
       


    }
}
