import java.util.Scanner;

public class Monthinfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        var monthNo = input.nextInt();
        switch(monthNo){
            case 1:
                System.out.println("Jan-31");
                break;
            case 2:
                System.out.println("Fed-28");
                break;
            case 3:
                System.out.println("Mar-31");
                break;
            case 4:
                System.out.println("Apr-30");
                break;
            default:
                System.out.println("Please enter a month number");
        }    
    }
}
