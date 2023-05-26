import java.util.Scanner;


public class MonthInfo {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      var monthNo = scan.nextInt();
      switch (monthNo) {
        default:
          System.out.println("Please enter month number: ");
          break;
        case 1:
          System.out.println("January-31");
          break;
        case 2:
          System.out.println("Febubary-28");
          break;
        case 3:
          System.out.println("March -31");
          break;
        case 4:
          System.out.println("April -30");
          break;
        case 5:
          System.out.println("May -31");
          break;
        case 6:
          System.out.println("June -30");
          break;
        case 7:
          System.out.println("July -31");
          break;
          case 8:
          System.out.println("August -31");
          break;
        case 9:
          System.out.println("September -30");
          break;
        case 10:
          System.out.println("October -31");
          break;
        case 11:
          System.out.println("November -30");
          break;
        case 12:
          System.out.println("December -31");
          break;

      }
    }
  }
}
