import java.util.Scanner;

public class Work{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        sc.close();

        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                isLeapYear = true;
            }
            else{
                isLeapYear = false;
            }
        }
        if(isLeapYear){
            System.out.println(year + "is a leapYear ");
        } else{
            System.out.println(year + "is not a leapYear ");
        }


    }
} 