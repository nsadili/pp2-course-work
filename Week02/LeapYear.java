import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
     
        
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if(num % 4 == 0 ) {
System.out.println("The year is leap.");
 }

 else{
    System.out.println("The year is not leap");
 }


        
    }
}
