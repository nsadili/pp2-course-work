public class LeapYear {
    public static void main(String[] args) {
        if (args.length < 1) {

            System.out.println("Please enter a year");

            System.exit(0);
        }
        var year = Integer.parseInt(args[0]);
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

