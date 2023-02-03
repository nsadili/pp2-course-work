import java.util.Scanner;

public class TimePrc {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of seconds :");

        int Seconds = scan.nextInt();

        int Hours = Seconds / 3600;
        int Minutes = (Seconds % 3600) / 60;
        int RemainingSeconds = Seconds % 60;

        System.out.println(Hours + " Hours, " + Minutes + " Minutes, and " + RemainingSeconds + " RemainingSeconds. ");

    }
}
