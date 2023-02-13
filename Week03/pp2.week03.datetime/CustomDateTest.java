package Week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(02, 07, 2022);
        CustomDate date2 = new CustomDate(14, 02, 2023);

        System.out.println("The Date 1 is: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println();

        System.out.println("The Date 2 is: ");
        date2.displayDate();
        date2.displayFormatted();

        System.out.println();

        System.out.println(CustomDate.compare(date1, date2));
    }
}