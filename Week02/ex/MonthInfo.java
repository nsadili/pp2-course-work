import java.util.Scanner;

public class MonthInfo {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
       int x = sc.nextInt();
       switch(x){
        case 1: 
        System.out.println("Jan-31");
        break;
        case 2:
        System.out.println("Feb-28");
        break;
        case 3:
        System.out.println("March-31");
        break;
        default:
        System.out.println("Please enter valid number:");
       }
    }
}
//Why doesn not it give any answer when I apply second number??