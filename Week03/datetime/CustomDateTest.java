package Week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(13, 100, -4);
        CustomDate date2 = new CustomDate(11, 9, 2004);
        CustomDate date3 = new CustomDate(2, 29, 2020);
        date3.displayFormatted();
        date1.displayDate();
        System.out.println(date2.difference(date3));
        System.out.println(CustomDate.compare(date2, date3));
        date2.displayFormatted();
        date2.displayDate();
    }
}
