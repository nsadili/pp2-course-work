import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(5, 15, 2004);
        CustomDate date2 = new CustomDate(3, 15, 2004);

        System.out.println(date1.compare(date1, date2));
        date1.displayDate();
        date2.displayFormatted();

    }

}
