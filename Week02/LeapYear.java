import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        var a=sc.nextInt();
       sc.close();
       boolean isLeapYear=false;
       if(a%4==0) {
        if(a%100==0){
            if(a%400==0){
                isLeapYear=true;
            }
        }else isLeapYear=true;
       }
       if(isLeapYear) System.out.println(a+ "is a leap year");
       else System.out.println(a+ "is not a leap year");
       
}
}