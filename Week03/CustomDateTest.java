package Ex03;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 1, 2000);
        CustomDate date2 = new CustomDate(2, 29, 2000);
        
        System.out.println("Date1: ");
        date1.displayDate();
        date1.displayFormatted();
        System.out.println();
        
        System.out.println("Date2: ");
        date2.displayDate();
        date2.displayFormatted();
        System.out.println();
        
        System.out.println("Difference between date1 and date2: " + date1.difference(date2) + " days");
        System.out.println("Difference between date2 and date1: " + date2.difference(date1) + " days");
        System.out.println();
        
        System.out.println("Comparison between date1 and date2: " + CustomDate.compare(date1, date2));
        System.out.println("Comparison between date2 and date1: " + CustomDate.compare(date2, date1));
    }
}
