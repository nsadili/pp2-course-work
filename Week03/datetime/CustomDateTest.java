package Week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(31, 12, 2022);
        CustomDate date2 = new CustomDate(1, 1, 2023);

        System.out.println("The Date1 is: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println();

        System.out.println("The Date2 is: ");
        date2.displayDate();
        date2.displayFormatted();

        System.out.println();

        System.out.println(CustomDate.compare(date1, date2));
    }
}
