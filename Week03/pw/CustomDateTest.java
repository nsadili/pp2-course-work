public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(3, 1, 2004);
        CustomDate date2 = new CustomDate(7, 24, 2008);

        System.out.println("Date 1: ");
        date1.displayDate();
        System.out.println("Formatted: ");
        date1.displayFormatted();

        System.out.println("\nDate 2: ");
        date2.displayDate();
        System.out.println("Formatted: ");
        date2.displayFormatted();

        System.out.println("\nDifference between two dates: " + date1.difference(date2) + " days");

        int result = CustomDate.compare(date1, date2);
        if (result == 1) {
            System.out.println("Date 1 is earlier.");
        } else if (result == -1) {
            System.out.println("Date 2 is earlier.");
        } else {
            System.out.println("Dates are the same.");
        }
    }

}
