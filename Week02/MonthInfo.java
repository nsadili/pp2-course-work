import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        var no=scan.nextInt();
        switch (no) {
            case 1:
                System.out.println("Jan - 31");
                break;
            case 2:
                System.out.println("Feb - 28");
                break;
            case 3:
                System.out.println("Mar - 31");
                break;
            case 4:
                System.out.println("Apr - 30");
                break;
            case 5:
                System.out.println("May - 31");
                break;
            case 6:
                System.out.println("Jun - 30");
                break;
            default:
                System.out.println("Enter the valid month number");
                break;
        }
    }
    
}
