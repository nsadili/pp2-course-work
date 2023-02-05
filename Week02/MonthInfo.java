import java.util.Scanner;
public class MonthInfo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            default:
                System.out.println("Please, enter a valid month number");
                break;
            case 1:
                System.out.println("Jan - 31 days");
                break;
            case 2:
                System.out.println("Feb - 28/29 days");
                break;
            case 3:
                System.out.println("Mar - 31 days");
                break;
        }
    }
}
