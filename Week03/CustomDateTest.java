import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date = new CustomDate(9, 15, 2005);
        CustomDate date2 = new CustomDate(2, 13, 2023);

        System.out.println(CustomDate.compare(date, date2));
        System.out.println(date.DIFF(date2));
    }
}