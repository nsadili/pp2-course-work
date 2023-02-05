import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		int sec = input.nextInt();
        input.close();
        int min = sec / 60;
        int hour = sec / 3600;
		System.out.printf("seconds: %d\nminutes: %d\nhours: %d", sec, min, hour);
    }   
}
