package pp2.week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate x = new CustomDate(2, 10, 2004);
        System.out.println(x.getDay());
        System.out.println(x.getMonth());
        System.out.println(x.getYear());
        System.out.println(x.displayDate());

        //System.out.println(x.difference(16, 7, 2006));
    }
}
