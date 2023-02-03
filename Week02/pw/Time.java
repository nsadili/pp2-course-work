import java.util.Scanner;

class Time {
    public static void main(String[] ards) {
        System.out.print("Seconds-->");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int hour = a/3600;
        int min=(a%3600)/60;
        int sec=(a%3600)%60;
        System.out.printf("%02d:%02d:%02d",hour,min,sec);
        
    }
 }