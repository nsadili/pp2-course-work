import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        if (n%4==0) System.out.println("Yes, it is.");
        else System.out.println("No, it's not.");

    }

}
