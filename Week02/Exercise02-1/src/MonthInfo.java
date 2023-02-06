import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        switch(a) {
            case 1: System.out.print("January: 31");
            break;
            case 2: System.out.print("February: 28");
            break;
            case 3: System.out.print("March: 31");
            break;
            case 4: System.out.print("April: 30");
            break;
            case 5: System.out.print("May: 31");
            break;
            case 6: System.out.print("June: 30");
            break;
            case 7: System.out.print("July: 31");
            break;
            case 8: System.out.print("August: 31");
            break;
            case 9: System.out.print("September: 30");
            break;
            case 10: System.out.print("October: 31");
            break;
            case 11: System.out.print("November: 30");
            break;
            case 12: System.out.print("December: 31");
            break;
        }

        switch(a) {
            case 12, 1, 2: System.out.print(", Winter"); break;
            case 3, 4, 5: System.out.print(", Spring"); break;
            case 6, 7, 8: System.out.print(", Summer"); break;
            case 9, 10, 11: System.out.print(", Fall"); break;
        }
    }
}
