import java.util.Scanner;

public class MonthInfo{
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        var monthNo = input.nextInt();

        switch(monthNo){
            case 1:
            System.out.println("Jan-31");
            break;
            case 2:
            System.out.println("Feb-28");
            break;
            case 3:
            System.out.println("Mar-31");
            break;
            case 4:
            System.out.println("Apr-30");
            break;
            case 5:
            System.out.println("May-31");
            break; 
            case 6:
            System.out.println("June-30");
            break; 
            case 7:
            System.out.println("July-31");
            break; 
            case 8:
            System.out.println("Avg-31");
            break; 
            case 9:
            System.out.println("Sept-30");
            break; 
            case 10:
            System.out.println("Oct-31");
            break; 
            case 11:
            System.out.println("Nov-30");
            break; 
            case 12:
            System.out.println("Dec-31");
            break; 
            default:
            System.out.println("Please, enter number between (1-12)");
        }  
    }
}