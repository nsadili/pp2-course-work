import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i % 4  == 0) System.out.println("Leap Year");
        else
        System.out.println("No Leap");
    }
}