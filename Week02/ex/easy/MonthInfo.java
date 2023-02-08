import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch(input) {
            case 1:
                System.out.println("January\n31");
                break;
            case 2:
                System.out.println("February\n28");
                break;
            case 3:
                System.out.println("March\n31");
                break;
            case 4:
                System.out.println("April\n30");
                break;
            case 5:
                System.out.println("May\n31");
                break;
            case 6:
                System.out.println("June\n30");
                break;
            case 7:
                System.out.println("July\n31");
                break;
            case 8:
                System.out.println("August\n31");
                break;
            case 9:
                System.out.println("September\n30");
                break;
            case 10:
                System.out.println("October\n31");
                break;
            case 11:
                System.out.println("November\n30");
                break;
            case 12:
                System.out.println("December\n31");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
