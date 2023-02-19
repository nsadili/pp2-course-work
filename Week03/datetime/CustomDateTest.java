package pp2.week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(13, 1, 2005);
        CustomDate date2 = new CustomDate(29, 9, 2004);
        CustomDate date3 = new CustomDate(14, 1, 2006);

        // Test displayDate method
        System.out.print("Date 1: ");
        date1.displayDate();
        System.out.print("Date 2: ");
        date2.displayDate();

        // Test difference method
        int diff = date2.difference(date1);
        System.out.println("Difference between date2 and date1: " + diff + " days");

        // Test compare method
        int result = CustomDate.compare(date1, date2);
        if (result < 0) {
            System.out.println("Date 1 is earlier than Date 2");
        } else if (result > 0) {
            System.out.println("Date 2 is earlier than Date 1");
        } else {
            System.out.println("Date 1 and Date 2 are the same");
        }

        result = CustomDate.compare(date1, date3);
        if (result < 0) {
            System.out.println("Date 1 is earlier than Date 3");
        } else if (result > 0) {
            System.out.println("Date 3 is earlier than Date 1");
        } else {
            System.out.println("Date 1 and Date 3 are the same");
        }

        // Test displayFormatted method
        System.out.print("Date 1 (formatted): ");
        date1.displayFormatted();
    }
}
