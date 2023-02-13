package Week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 10, 2021);
        CustomDate date2 = new CustomDate(2, 20, 2022);
        CustomDate date3 = new CustomDate(3, 30, 2023);

        System.out.println("Date 1: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println("Date 2: ");
        date2.displayDate();
        date2.displayFormatted();

        System.out.println("Date 3: ");
        date3.displayDate();
        date3.displayFormatted();

        System.out.println("Difference between date1 and date2 is: " + date1.difference(date2) + " days");
        System.out.println("Difference between date2 and date1 is: " + date2.difference(date1) + " days");

        int result = CustomDate.compare(date1, date2);
        if (result == 1) {
            System.out.println("Date 1 is earlier");
        } else if (result == -1) {
            System.out.println("Date 2 is earlier");
        } else {
            System.out.println("Dates are the same");
        }
    }
}
