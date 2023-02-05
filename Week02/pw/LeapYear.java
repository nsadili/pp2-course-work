import java.util.Scanner;



public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a%4==0||a%400==0){
            
            if(a%400==0){
                System.out.println("It is a leap year");

            }
            else if(a%4==0){
                if(a%100==0){
                    System.out.println("Not a leap year");
                }
                else System.out.println("It is a leap year");
            }
           
        }
        else System.out.println("Not a leap year");
    }
}
