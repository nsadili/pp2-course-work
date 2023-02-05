import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        input.close();
        switch(m){
            case 1:
               System.out.print("January, 31 days");
               break;
            case 2:
               System.out.println("February, 28 or 29 days");
            case 3:
               System.out.println("March, 31 days");
            case 4:
               System.out.println("April, 30 days");
            case 5:
               System.out.print("May, 31 days");
               break;
            case 6:
               System.out.println("June, 30 days");
            case 7:
               System.out.println("July, 31 days");
            case 8:
               System.out.println("August, 30 days"); 
            case 9:
               System.out.print("September, 31 days");
               break;
            case 10:
               System.out.println("October, 30 days");
            case 11:
               System.out.println("November, 31 days");
            case 12:
               System.out.println("December, 30 days");           
        }
    }
}
