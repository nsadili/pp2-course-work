import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            var a = scan.nextInt();
            if ( a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
                System.out.println("It is a leap year");
            }
            else{
                System.out.println("It is not a leap year");
            }
    }
}
}
