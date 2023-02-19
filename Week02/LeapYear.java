import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Year is leap.");
        }
        else{
            System.out.println("Year is not leap.");
        }
    }
}
