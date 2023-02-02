import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var n = Integer.parseInt(args[0]);

        if(n == 366) 
        System.out.println("366 days --> Leap Year!");
        
       if(n == 365)
        System.out.println("365 days --> Not Leap Year!");

        
    }
}
