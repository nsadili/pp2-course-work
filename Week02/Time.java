import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total seconds: ");
        int givenSeconds = sc.nextInt();
        int hour = givenSeconds / 3600;
        int minutes = (givenSeconds % 3600) / 60;
        int seconds = givenSeconds % 60;
        System.out.println(hour + " : " + minutes + " : " + seconds);
    sc.close();
}
}