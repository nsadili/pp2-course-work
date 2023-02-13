package Week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 1, 2000);
        CustomDate date2 = new CustomDate(2, 29, 2000);
        
        System.out.println("Dateone: ");
        dateone.displayDate();
        dateone.displayFormatted();
        System.out.println();
        
        System.out.println("Datetwo: ");
        datetwo.displayDate();
        datetwo.displayFormatted();
        System.out.println();
        
        System.out.println("Difference between dateone and datetwo: " + date1.difference(date2) + " days");
        System.out.println("Difference between datetwo and dateone: " + date2.difference(date1) + " days");
        System.out.println();
        
        System.out.println("Comparison between dateone and datetwo: " + CustomDate.compare(date1, date2));
        System.out.println("Comparison between datetwo and dateone: " + CustomDate.compare(date2, date1));
    }
}