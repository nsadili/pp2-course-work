package Week03.PW_3;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(10, 9, 2005);
        CustomDate date2 = new CustomDate(10, 9, 2000);
        System.out.printf("\nDate 1: %s\nDate 2: %s\nFormatted date 1: %s\nFormatted date 2: %s\nDifference in days: %d\nComparing the dates: %d\n\n",
        date1.displayDate(date1), date2.displayDate(date2), date1.displayFormatted(date1), date2.displayFormatted(date2), date1.difference(date2), date1.compare(date1, date2));
    }
}