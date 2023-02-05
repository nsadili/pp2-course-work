public class LeapYear {
    public static void main(String[] args) {
        
        int year = Integer.parseInt(args[0]);

        System.out.println("Is it a leap year?");

        if (year % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
