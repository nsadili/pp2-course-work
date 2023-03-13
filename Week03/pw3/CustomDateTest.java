package Week03.pw3;
import Week03.pw3.objects.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(5, 10, 2005);
        CustomDate date2 = new CustomDate(1, 1, 1990);
        System.out.printf("\nDate 1: ") ;
        date1.displayDate();
        System.out.printf("\nDate 2: ");
        date2.displayDate();
        System.out.printf("\nFormatted date 1: ");
        date1.displayFormatted();
        System.out.printf("\nFormatted date 2: ");
        date2.displayFormatted();
        System.out.printf("\nDifference in days: %d", date1.difference(date2));
        System.out.printf("\nComparing the dates: %d\n\n", CustomDate.compare(date1, date2));
    }
}
