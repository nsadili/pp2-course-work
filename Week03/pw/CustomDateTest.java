import pp2.w3.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(6, 12, 2022);
        CustomDate date2 = new CustomDate(9, 6, 2023);
        System.out.printf("date 1 ", date1);
        date1.displayFormatted();
        System.out.printf("date 2 ", date2);
        date2.displayFormatted();
        System.out.println("difference is " + date1.difference(date2));
    }
}
