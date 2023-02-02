import java.util.Scanner;

public class Monthinfo {
    public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
var monthNo = scan.nextInt();
switch(monthNo){
    case 1:
    System.out.println("Jan - 31");
    break;
    case 2:
    System.out.println("Feb - 31");
    break;
    case 3:
    System.out.println("Mar - 31");
    break;
    case 4:
    System.out.println("Apr - 30");
    break;
    default:
    System.out.println("Please, enter number around 1-4");


}
}    
}
