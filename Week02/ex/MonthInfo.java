import java.util.Scanner;

public class MonthInfo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number->");

        var monthNo=sc.nextInt();

        switch(monthNo){
            case 1:
            System.out.println("Jan - 31");
            break;
            case 2:
            System.out.println("February - 28");
            break;
            case 3:
            System.out.println("MArch - 31");
            break;
            case 4:
            System.out.println("Apr-30");
            break; 
            default:
            System.out.println("Please enter between 1-12");
        }




        
    }
}