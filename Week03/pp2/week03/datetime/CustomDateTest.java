package pp2.week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 12, 2020);
        CustomDate date2 = new CustomDate(2, 14, 2021);

        System.out.println("Date 1: " + date1.displayDate());
        System.out.println("Date 2: " + date2.displayDate());

        System.out.println("Date 1 (formatted): " + date1.displayFormatted());
        System.out.println("Date 2 (formatted): " + date2.displayFormatted());

        System.out.println("Difference in days between Date 1 and Date 2: " + date1.difference(date2) + " days");

        int comparison = CustomDate.compare(date1, date2);
        if (comparison == 1) {
            System.out.println("Date 1 is earlier than Date 2");
        } else if (comparison == -1) {
            System.out.println("Date 2 is earlier than Date 1");
        } else {
            System.out.println("Date 1 and Date 2 are the same");
        }
    }
}
