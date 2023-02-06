package taghi_mammadov.week_02;
import java.util.*;
public class Time {
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input seconds: ");
            int seconds = in.nextInt();
            int sec = seconds % 60;
            int hor = seconds / 60;
            int months = hor % 60;
            hor = hor / 60;
            System.out.print( hor + ":" + months + ":" + sec);
        }
        System.out.print("\n");
    }
}
