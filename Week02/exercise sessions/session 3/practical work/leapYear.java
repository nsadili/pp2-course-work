public class leapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        
        if (year % 4 != 0) System.out.println("This is not a leap year.");
        else System.out.println("This is a leap year.");
    }
}
