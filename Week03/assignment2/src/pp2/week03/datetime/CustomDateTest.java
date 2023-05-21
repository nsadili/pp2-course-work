package pp2.week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(5, 10, 2022);
        CustomDate date2 = new CustomDate(5, 10, 2023);

        date1.displayDate();
        date2.displayDate();

        System.out.println("Difference in days: " + date1.difference(date2));

        int comparison = CustomDate.compare(date1, date2);
        if (comparison == 1) {
            System.out.println("Date 1 is earlier");
        } else if (comparison == -1) {
            System.out.println("Date 2 is earlier");
        } else {
            System.out.println("Dates are the same");
        }

        date1.displayFormatted();
        date2.displayFormatted();
    }
}
