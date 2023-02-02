 import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;
public class MonthInfo {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
var  monthNo = scan.nextInt();
switch(monthNo){
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
    System.out.println("August -30");
    break;
    case 8:
    System.out.println("September -31");
    break;


}
    }
}
