import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        var monthNo = scan.nextInt();

        switch(monthNo){
            case 1:
                System.out.println("Jan - 31");
                break;
            case 2:
                System.out.println("Feb - 28");
                break;
            case 3:
                System.out.println("Mar - 28");
                break;
            case 4:
                System.out.println("Apr - 28");
                break;
            default:
                System.out.println("please, enter a month no [1-12]");

        }
}
    
}
