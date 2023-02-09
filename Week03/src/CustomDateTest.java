import datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date = new CustomDate(9, 9, 2005);
        CustomDate date2 = new CustomDate(4, 2, 2008);

        System.out.println(CustomDate.compare(date, date2));
        System.out.println(date.difference(date2));
    }
}
