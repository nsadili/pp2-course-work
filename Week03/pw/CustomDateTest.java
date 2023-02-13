import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate d1 = new CustomDate (5,31,2019);
        CustomDate d2 = new CustomDate (2,28,2012);

        System.out.println("date 1: " + d1.displayDate());
        System.out.println("date 2: " + d2.displayDate());

        System.out.println("Difference between date 1 and date 2: " + d2.difference(d1));

        System.out.println("Comparison of date 1 and date 2: "+ d1.compare(d1, d2));

        System.out.println("Formatted date 1: " + d1.displayFormatted());
        System.out.println("Formatted date 2: " + d2.displayFormatted());
    }
}
