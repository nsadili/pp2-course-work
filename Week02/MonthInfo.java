import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        var no = scan.nextInt();

        switch(no) {
            default:
                System.out.println("Please enter a valid month number");
                break;
            case 1:
                System.out.println("Jan - 31");
                break;
            case 2:
                System.out.println("Feb - 28");
                break;
            case 3:
                System.out.println("Mar - 31");
                break;
            
        }
    }
}
