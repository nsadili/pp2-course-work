package Week03.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(13, 100, -4);
        CustomDate date2 = new CustomDate(11, 9, 2004);
        CustomDate date3 = new CustomDate(2, 29, 2020);
        CustomDate date4 = new CustomDate(5, 7, 1598);
        date3.displayFormatted();
        date1.displayDate();
        System.out.println(date2.difference(date3));
        System.out.println(CustomDate.compare(date2, date3));
        date2.displayFormatted();
        date2.displayDate();
        date4.displayDate();
        System.out.println(CustomDate.toDays(date3));
        System.out.println(CustomDate.toDays(date4));
        System.out.println(date4.difference(date3));
    }
}
