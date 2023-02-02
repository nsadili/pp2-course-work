import java.util.Scanner;
public class Time {
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
	    	int seconds = in.nextInt();
        int second = seconds % 60;
        int hour = seconds / 60;
        int minute = hour % 60;
        hour = hour / 60;
        System.out.print( hour + ":" + minute + ":" + second);
		System.out.print("\n");
    }
 }