import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a= input.nextInt();

        System.out.printf("%02d:%02d:%02d",a/3600,(a-3600*(a/3600))/60,(a-60*(a/60)));
    }
}