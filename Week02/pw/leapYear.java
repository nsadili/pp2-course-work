import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int year = obj.nextInt();
        if(year%4 == 0){
            System.out.println("its a leap year");
        }else{
            System.out.println("its not a leap year");
        }
    }
    
}
