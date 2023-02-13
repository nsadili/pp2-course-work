import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    
    public static void main(String[] args) {
        
        CustomDate date1 = new CustomDate(4, 9, 2004);
        CustomDate date2 = new CustomDate(10, 1, 1980);

        System.out.println("Date 1: ");
        date1.displayDate();
        System.out.println("Date 1 Formatted: ");
        date1.displayFormatted();

        System.out.println("Date 2: ");
        date2.displayDate();
        System.out.println("Date 2 Formatted: ");
        date2.displayFormatted();

        System.out.println("Difference between dates:" + date1.difference(date2) + "days");

        System.out.println("Comparison :" + CustomDate.compare(date1, date2));
    }
}
