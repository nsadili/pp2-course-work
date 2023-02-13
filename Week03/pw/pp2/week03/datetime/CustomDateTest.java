package pp2.week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate dateone = new CustomDate(1, 1, 2023);
        CustomDate datetwo = new CustomDate(2, 29, 2012);
        System.out.println("Displaying detaone : ");
        dateone.displayDate();
        dateone.displayFormatted();
        System.out.println();
        
        System.out.println("Displaying datetwo : ");
        datetwo.displayDate();
        datetwo.displayFormatted();
        System.out.println();
        
        System.out.println("Difference between dateone and datetwo: " + dateone.difference(datetwo) + " days");
        System.out.println("Difference between datetwo and dateone: " + datetwo.difference(dateone) + " days");
        System.out.println();
        System.out.println("Comparison of dateone and datetwo: " + CustomDate.compare(dateone, datetwo));
        System.out.println("Comparison of datetwo and dateone: " + CustomDate.compare(datetwo, dateone));
    }
}