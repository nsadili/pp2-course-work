import java.util.Scanner;

public class MonthInfo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    var number = scan.nextInt();

    switch (number) {
      default:
        System.out.println("Please, enter a valid month number");
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
      case 4:
        System.out.println("Apr - 30");
        break;
      case 5:
        System.out.println("May - 31");
        break;
      case 6:
        System.out.println("Jun - 30");
        break;
      case 7:
        System.out.println("Jul - 31");
        break;
      case 8:
        System.out.println("Aug - 30");
        break;
      case 9:
        System.out.println("Sep - 31");
        break;
      case 10:
        System.out.println("Oct - 30");
        break;
      case 11:
        System.out.println("Nov - 31");
        break;
      case 12:
        System.out.println("Dec - 3");
        break;
    }

  }
}
